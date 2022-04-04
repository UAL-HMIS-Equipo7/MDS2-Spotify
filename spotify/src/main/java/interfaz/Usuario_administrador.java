package interfaz;

import vistas.VistaUsuario_administrador;

public class Usuario_administrador extends VistaUsuario_administrador {
//	private Label _usuarioL;
//	private Image _usuarioImg;
//	private Button _editarUsuarioB;
//	private Button _eliminarUsuarioB;
	public Editar_usuario _editar_usuario;
	public Confirmacion_eliminacion _confirmacion_eliminacion;
	
	public Usuario_administrador() {
		_editar_usuario = new Editar_usuario();
		_confirmacion_eliminacion = new Confirmacion_eliminacion();
	}
}