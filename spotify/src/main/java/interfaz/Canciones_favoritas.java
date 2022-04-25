package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion;
import interfaz.Ver_mas_canciones_favoritas;
import spotify.GestorVentana;
import vistas.VistaCanciones_favoritas;

public class Canciones_favoritas extends VistaCanciones_favoritas {
//	private Label _tituloL;
//	private Button _verMasB;

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	
	
	
	public Canciones_favoritas() {
		
		
		
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
				
				_ver_lista_de_reproduccion_propia = new Ver_lista_de_reproduccion_propia();
				
				
				GestorVentana.CambiarVentana(_ver_lista_de_reproduccion_propia);
			}
		});
	}
	
	public void CargarCancionesFavoritas() {
		Cancion temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Cancion();
			
			_list_Cancion.add(temp);
		}
	}
}