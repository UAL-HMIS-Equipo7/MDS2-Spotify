package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Cancion;
import spotify.GestorVentana;
import vistas.VistaCanciones_favoritas;

public class Canciones_favoritas extends VistaCanciones_favoritas {
//	private Label _tituloL;
//	private Button _verMasB;

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	
	private Usuario_generico _usuario;
	private basededatos.Lista_de_reproduccion _lista;
	private iActor_comun bd = new BDPrincipal();
	
	public Canciones_favoritas(Usuario_generico usuario) {
		
		_usuario = usuario;
		
		CargarCancionesFavoritas();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 5 && i < _list_Cancion.size(); i++) {
			hlSup.add(_list_Cancion.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 5; i < 10 && i < _list_Cancion.size(); i++) {
			hlInf.add(_list_Cancion.get(i));
		}
		
		this.getVerMasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_ver_lista_de_reproduccion_propia = new Ver_lista_de_reproduccion_propia(_lista);
				
				
				GestorVentana.CambiarVentana(_ver_lista_de_reproduccion_propia);
			}
		});
	}
	
	public void CargarCancionesFavoritas() {
		
		_lista = bd.Cargar_Canciones_Favoritas(_usuario.getORMID());
		
		if (_lista == null)
			return;
		
		if (_lista.canciones_incluidas == null)
			return;
		
		basededatos.Cancion canciones[] = _lista.canciones_incluidas.toArray();
		
		Cancion temp;
		
		for (int i = 0; i < 10 && i < canciones.length; i++) {
			temp = new Cancion(canciones[i]);
			
			_list_Cancion.add(temp);
		}
	}
}