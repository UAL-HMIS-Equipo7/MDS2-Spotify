package interfaz;

import vistas.VistaAutores_album;

import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;

import interfaz.NombreArtista;

public class Autores_album extends VistaAutores_album {
//	private ComboBox _artistasCB;

	public Vector<NombreArtista> _list_NombreArtista = new Vector<NombreArtista>();
	
	public Autores_album() {
		CargarNombresArtista();
		
		ComboBox<String> cb = this.getArtistasCB();
		
		Vector<String> nombres = new Vector<String>();
		
		for (NombreArtista na : _list_NombreArtista) {
			nombres.add(na.getNombreL().getText());
		}
		
		cb.setItems(nombres);
	}
	
	public void CargarNombresArtista() {
		NombreArtista temp;
		
		for (int i = 0; i < 6; i++) {
			temp = new NombreArtista();
			
			_list_NombreArtista.add(temp);
		}
	}
}