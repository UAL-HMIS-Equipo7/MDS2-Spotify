package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import spotify.GestorActor;
import spotify.GestorVentana;
import vistas.VistaUltimas_canciones_reproducidas;
import vistas.VistaVer_lista_de_reproduccion;
import vistas.VistaVer_lista_de_reproduccion_propia;
@CssImport("./styles/shared-styles.css")

public class Ver_lista_de_reproduccion extends VistaVer_lista_de_reproduccion {
//	private event _compartir_lista_de_reproduccion;
//	private event _seguir_lista_de_reproduccion;
//	private Button _compartirB;
//	private Button _seguirB;
//	private Label _informacionL;
//	private Label _tituloL;
//	private Button _autorB;
	
	public Ver_perfil_ajeno_de_no_artista _ver_perfil_ajeno_de_no_artista;
	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	public Canciones_de_lista _canciones_de_lista;
	
	basededatos.Lista_de_reproduccion _lista;
	iActor_comun bd = new BDPrincipal();
	
	private boolean _yaSeguido = false;

	public Ver_lista_de_reproduccion(basededatos.Lista_de_reproduccion lista) {
		
		_lista = lista;
		
		Comprobar_lista_seguida();
		
		this.getTituloL().setText(_lista.getTitulo());
		this.getAutorB().setText(_lista.getAutor().getNick());
		
		_canciones_de_lista = new Canciones_de_lista(lista);
		_canciones_de_lista.setClassName("fullSize");
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		
		hl.add(_canciones_de_lista);
		
		this.getAutorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Usuario_generico autor = _lista.getAutor();
				
				if (autor instanceof basededatos.Artista) {
					_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista((basededatos.Artista) autor);
					GestorVentana.CambiarVentana(_ver_perfil_ajeno_de_artista);
				}
				else {
					_ver_perfil_ajeno_de_no_artista = new Ver_perfil_ajeno_de_no_artista(autor);
					GestorVentana.CambiarVentana(_ver_perfil_ajeno_de_no_artista);
				}
			}
		});
		
		if (_yaSeguido) {
			this.getSeguirB().setText("Dejar de seguir");
		}
		else {
			this.getSeguirB().setText("Seguir");
		}
		
		this.getSeguirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if (_yaSeguido) {
					Dejar_de_seguir_lista_de_reproduccion();
				}
				else {
					Seguir_lista_de_reproduccion();
				}
			}
		});
		
		this.getCompartirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>(){
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Compartir_lista_de_reproduccion();
			}
		});
	}

	public void Compartir_lista_de_reproduccion() {
		Notification.show("Se ha compartido la lista con sus contactos");
	}

	public void Seguir_lista_de_reproduccion() {
		bd.Seguir_lista_de_reproduccion(GestorActor.getIdUsuario(), _lista.getORMID());
		_yaSeguido = true;
		this.getSeguirB().setText("Dejar de seguir");
	}
	
	public void Dejar_de_seguir_lista_de_reproduccion() {
		bd.Dejar_de_seguir_lista_de_reproduccion(GestorActor.getIdUsuario(), _lista.getORMID());
		_yaSeguido = false;
		this.getSeguirB().setText("Seguir");
	}
	
	public void Comprobar_lista_seguida() {
		_yaSeguido = bd.Comprobar_Lista_Seguida(GestorActor.getIdUsuario(), _lista.getORMID());
	}
}