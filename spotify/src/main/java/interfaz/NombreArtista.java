package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
import spotify.GestorVentana;
import vistas.VistaNombreartista;

public class NombreArtista extends VistaNombreartista {
//	private Label _nombreL;
	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	public Ver_perfil_propio__Artista_ _ver_perfil_propio__Artista_;
	
	private basededatos.Artista _artista;
	
	public NombreArtista(basededatos.Artista artista) {
		
		_artista = artista;
		
		this.getNombreL().setText(_artista.getNick());
	}
	
	public void Ir_a_perfil() {
		if (GestorActor.getIdUsuario() == _artista.getORMID()) {
			_ver_perfil_propio__Artista_ = new Ver_perfil_propio__Artista_(_artista);
			GestorVentana.CambiarVentana(_ver_perfil_propio__Artista_);
		}
		else {
			_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista(_artista);
			GestorVentana.CambiarVentana(_ver_perfil_ajeno_de_artista);
		}
	}
}