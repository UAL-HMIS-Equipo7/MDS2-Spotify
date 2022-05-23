package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
import spotify.GestorVentana;
import vistas.VistaNombreartista;

public class NombreArtista extends VistaNombreartista {
//	private Label _nombreL;
	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	public Ver_perfil_propio__Artista_ _ver_perfil_propio__Artista_;
	
	public NombreArtista(basededatos.Artista artista) {
		
		this.getNombreL().setText(artista.getNick());
		
		this.getNombreL().getElement().addEventListener("click", e -> {
			
			//Comprobar si el artista so yo o no
			if (GestorActor.getIdUsuario() == artista.getORMID()) {
				_ver_perfil_propio__Artista_ = new Ver_perfil_propio__Artista_(artista);
				GestorVentana.CambiarVentana(_ver_perfil_propio__Artista_);
			}
			else {
				_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista(artista);
				GestorVentana.CambiarVentana(_ver_perfil_propio__Artista_);
			}
		});
	}
}