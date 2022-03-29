package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import interfaz.Cancion;
import interfaz.Ver_mas_canciones_favoritas;
import vistas.VistaCanciones_favoritas;

public class Canciones_favoritas extends VistaCanciones_favoritas {
//	private Label _tituloL;
//	private Button _verMasB;

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	
	public Canciones_favoritas() {
		_ver_lista_de_reproduccion_propia = new Ver_lista_de_reproduccion_propia();
		
		CargarCanciones();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 5 && i < _list_Cancion.size(); i++) {
			hlSup.add(_list_Cancion.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 5; i < 10 && i < _list_Cancion.size(); i++) {
			hlInf.add(_list_Cancion.get(i));
		}
	}
	
	public void CargarCanciones() {
		Cancion temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Cancion();
			
			_list_Cancion.add(temp);
		}
	}
}