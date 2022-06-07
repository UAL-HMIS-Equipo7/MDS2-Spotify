package interfaz;

import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import spotify.GestorActor;
import spotify.GestorArchivos;
import vistas.VistaVer_cancion;

@CssImport("./styles/shared-styles.css")
public class Ver_cancion extends VistaVer_cancion {
//	private event _marcar_cancion_como_favorita;
//	private event _aniadir_cancion_a_lista_de_reproduccion;
//	private Label _tituloL;
//	private Button _aniadirFavoritosB;
//	private Label _aniadirListaL;
//	private Button _aniadirListaB;
//	private Label _creditosTituloL;
//	private Label _creditosTituloCancionL;
//	private Label _creditosTituloAlbumL;
//	private Label _creditosCompositorL;
//	private Label _creditosProductorL;
//	private Label _creditosInterpreteL;
//	private Label _creditosFicheroL;
//	private Label _creditoEstiloL;
//	private Image _fotoCancionImg;
	
	iActor_comun bd = new BDPrincipal();
	basededatos.Cancion _cancion;
	basededatos.Lista_de_reproduccion[] _listas;
	List<String> _nombresListas;
	List<String> _listasSeleccionadas;
	
	boolean _esFavorita = false;
	
	int _idLista;
	
	public Ver_cancion(basededatos.Cancion cancion) {
		
		_cancion = cancion;
		
		Cargar_cancion();
		
		Comprobar_si_favorita();
		
		Cargar_Listas();
		
		Image img = new Image(GestorArchivos.CargarImagen(_cancion.getFicheroMultimediaAltaCalidadRuta()),
				_cancion.getFicheroMultimediaAltaCalidadRuta());
		img.setClassName("max500");
		getFotoCancionImgLayout().add(img);
		
		this.getTituloL().setText(_cancion.getTitulo());
		this.getCreditosTituloCancionL().setText("Título Canción: " + _cancion.getTitulo());
		if (_cancion.getIncluida_en_albumes() != null) {
			this.getCreditosTituloAlbumL().setText("Título Álbum: " + _cancion.getIncluida_en_albumes().getTitulo());
		}
		else {
			this.getCreditosTituloAlbumL().setText("Título Álbum: --");
		}
		this.getCreditosCompositorL().setText("Compositores: " + _cancion.getCompositores());
		this.getCreditosProductorL().setText("Productores: " + _cancion.getProductores());
		
		StringBuilder intepretes = new StringBuilder();
		basededatos.Artista[] artistas = _cancion.intepretes.toArray();
		
		for (int i = 0; i < artistas.length; i++) {
			intepretes.append(artistas[i].getNick() + ", ");
		}
		
		this.getCreditosInterpreteL().setText("Intérpretes: " + intepretes.toString());
		
		basededatos.Estilo[] estilo = _cancion.estilos.toArray();
		
		if (estilo.length > 0) {
			this.getCreditoEstiloL().setText("Estilo: " + estilo[0].getNombre());
		}
		else {
			this.getCreditoEstiloL().setText("Estilo: --");
		}
		
		this.getCreditosFicheroL().setText("Fichero: " + _cancion.getFicheroMultimediaRuta());
		
		if (_esFavorita) {
			this.getAniadirFavoritosB().setText("Eliminar de favoritos");
		}
		else {
			this.getAniadirFavoritosB().setText("Añadir a favoritos");
		}
		
		this.getAniadirFavoritosB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if (_esFavorita) {
					Quitar_cancion_favoritos();
				}
				else {
					Marcar_cancion_como_favorita();
				}
				
			}
		});
		
		CheckboxGroup<String> listasCheckbox = this.getListasCB();
		listasCheckbox.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
		
		_nombresListas = new Vector<String>(_listas.length);
		_listasSeleccionadas = new Vector<String>();
		
		for (basededatos.Lista_de_reproduccion lista : _listas) {
			if (lista.getPropietario_favorito() != null) {
				continue;
			}
			
			_nombresListas.add(lista.getTitulo());
			
			if (lista.canciones_incluidas.contains(_cancion)) {
				_listasSeleccionadas.add(lista.getTitulo());
			}
		}
		
		listasCheckbox.setItems(_nombresListas);
		listasCheckbox.select(_listasSeleccionadas);

		listasCheckbox.addValueChangeListener(event -> 
			Procesar_Evento_Lista(event.getValue(), event.getOldValue())
		);
	}
	
	private void Procesar_Evento_Lista(Set<String> actual, Set<String> old) {
		
		String[] arrActual = new String[actual.size()];
		arrActual = actual.toArray(arrActual);
		
		boolean hayAniadida = false;
		
		for (int i = 0; i < arrActual.length; i++) {
			if (_listasSeleccionadas.contains(arrActual[i])) {
				continue;
			}
			else {
				_idLista = _listas[_nombresListas.indexOf(arrActual[i])].getORMID();
				Aniadir_cancion_a_lista_de_reproduccion();
				_listasSeleccionadas.add(arrActual[i]);
				hayAniadida = true;
				
				break;
			}
		}
		
		if (hayAniadida) {
			return;
		}
		
		int indexEliminado = -1;
		
		for (int i = 0; i < _listasSeleccionadas.size(); i++) {
			if (actual.contains(_listasSeleccionadas.get(i))) {
				continue;
			}
			else {
				_idLista = _listas[_nombresListas.indexOf(_listasSeleccionadas.get(i))].getORMID();
				Quitar_cancion_de_lista_de_reproduccion();
				indexEliminado = i;
				break;
			}
		}
		
		if (indexEliminado != -1) {
			_listasSeleccionadas.remove(indexEliminado);
		}
	}
	
	public void Cargar_cancion() {
		_cancion = bd.Obtener_Cancion(_cancion.getORMID());
	}
	
	public void Cargar_Listas() {
		_listas = bd.Cargar_Listas_Usuario(GestorActor.getIdUsuario());
	}
	
	public void Comprobar_si_favorita() {
		_esFavorita = bd.Comprobar_Cancion_Favorita(GestorActor.getIdUsuario(), _cancion.getORMID());
	}

	public void Marcar_cancion_como_favorita() {
		bd.Marcar_cancion_favorita(GestorActor.getIdUsuario(), _cancion.getORMID());
		_esFavorita = true;
		this.getAniadirFavoritosB().setText("Eliminar de favoritos");
	}
	
	public void Quitar_cancion_favoritos() {
		bd.Quitar_cancion_favoritos(GestorActor.getIdUsuario(), _cancion.getORMID());
		_esFavorita = false;
		this.getAniadirFavoritosB().setText("Añadir a favoritos");
	}

	public void Aniadir_cancion_a_lista_de_reproduccion() {
		
		for(int i = 0; i < _listas.length ; i++) {
			if(!(_listas[i].getORMID() == _idLista)) {
				continue;
			}else {
				if(_listas[i].canciones_incluidas.size() > 1000) {
					Notification.show("Se ha superado el limite de canciones en esta lista");
					return;
				}
			}
		}
		
		bd.Aniadir_cancion_a_lista(_cancion.getORMID(), _idLista);
	}
	
	public void Quitar_cancion_de_lista_de_reproduccion() {
		bd.Quitar_Cancion_Lista(_cancion.getORMID(), _idLista);
	}
}