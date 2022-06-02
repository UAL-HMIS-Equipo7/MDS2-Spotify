package basededatos;

public interface iUsuario_Registrado extends iActor_comun {

	public void Eliminar_Usuario(int aIdUsuario);

	public void Actualizar_Perfil(int aIdUsuario, String aNuevoEmail, String aNuevoNick);
	
	public Usuario_Registrado Obtener_Usuario(int aIdUsuario);
}