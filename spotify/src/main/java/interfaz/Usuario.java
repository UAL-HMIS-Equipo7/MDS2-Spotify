package interfaz;

import vistas.VistaUsuario;

public class Usuario extends VistaUsuario {
//	private Button _fotoB;
//	private Button _nickB;
	public Usuarios _usuarios;
	public Ver_perfil_ajeno_de_no_artista _ver_perfil_ajeno_de_no_artista;
	
	public Usuario() {
		
		_usuarios =  new Usuarios();
		_ver_perfil_ajeno_de_no_artista = new Ver_perfil_ajeno_de_no_artista();
	}
}