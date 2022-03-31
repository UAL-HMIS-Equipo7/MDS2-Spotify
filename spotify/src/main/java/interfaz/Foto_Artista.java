package interfaz;

import vistas.VistaFoto_artista;

public class Foto_Artista extends VistaFoto_artista {
//	private Button _fotoB;

	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	
	public Foto_Artista() {
		_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista();
		
		this.getNickB().setVisible(false);
	}
}