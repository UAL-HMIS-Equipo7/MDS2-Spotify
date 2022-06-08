package basededatos;

public interface iUsuario_Registrado extends iActor_comun {

	public void Eliminar_Usuario(int aIdUsuario);

	public void Actualizar_Perfil_Usuario(int aIdUsuario, String aNuevoEmail, String aNuevoNick);
}