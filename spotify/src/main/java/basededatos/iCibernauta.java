package basededatos;

public interface iCibernauta {

	public int Registrar_Usuario(String aEmail, String aNick, String aContrasenia, String aFoto);

	public void Actualizar_Contrasenia(String aEmail, String aNuevaContrasenia);

	public Usuario_generico Iniciar_Sesion(String aEmail, String aContrasenia);
}