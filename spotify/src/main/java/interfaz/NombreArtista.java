package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNombreartista;

public class NombreArtista extends VistaNombreartista {
//	private Label _nombreL;
	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	public Ver_perfil_propio__Artista_ _ver_perfil_propio__Artista_;
	
	public NombreArtista(basededatos.Artista artista) {
		
		this.getNombreL().getElement().addEventListener("click", e -> {
			
			//Comprobar si el artista so yo o no
			//_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista();
			_ver_perfil_propio__Artista_ = new Ver_perfil_propio__Artista_(artista);
		});
	}
}