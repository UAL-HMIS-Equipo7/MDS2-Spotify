package interfaz;

import vistas.VistaAutores_album;

import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.NombreArtista;

public class Autores_album extends VistaAutores_album {
//	private ComboBox _artistasCB;

	public Vector<NombreArtista> _list_NombreArtista = new Vector<NombreArtista>();
	private iActor_comun bd = new BDPrincipal();
	private basededatos.Album album;
	
	public Autores_album(basededatos.Album album) {
		
	this.album = album;	
		
		CargarAutoresAlbum();
		
		ComboBox<NombreArtista> cb = this.getArtistasCB();
		
//		Vector<String> nombres = new Vector<String>();
//		
//		for (NombreArtista na : _list_NombreArtista) {
//			nombres.add(na.getNombreL().getText());
//		}
		
		//cb.setItems(nombres);
		cb.setItems(_list_NombreArtista);;
	}
	
	public void CargarAutoresAlbum() {
		basededatos.Artista[] autores = bd.Cargar_Autores_Album(this.album.getORMID());
		NombreArtista temp;
		
		for (int i = 0; i < 6 && i < autores.length; i++) {
			//TODO cambiar cargar autores album
			temp = new NombreArtista(autores[i]);
			
			_list_NombreArtista.add(temp);
		}
	}
}