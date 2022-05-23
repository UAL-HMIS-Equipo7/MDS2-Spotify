package interfaz;

import org.apache.commons.lang3.NotImplementedException;

import basededatos.Usuario_generico;
import vistas.VistaEditar_informacion_del_perfil_no_artista;

public class Editar_informacion_del_perfil_no_artista extends VistaEditar_informacion_del_perfil_no_artista {
//	private TextField _emailTF;
//	private TextField _nickTF;
//	private Button _guardarB;
	
	public Editar_informacion_del_perfil_no_artista(Usuario_generico usuario) {
		this.getEmailTF().setValue(usuario.getDatos().getEmail());
		this.getNickTF().setValue(usuario.getNick());
	}

	public void Validar_datos_de_perfil() {
		//VALIDAR
	}
	
	public void ActualizarPerfil() {
		//Override
		throw new NotImplementedException();
	}
}