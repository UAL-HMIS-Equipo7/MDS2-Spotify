package basededatos;

public interface iCibernauta {

	public int Registrar_Usuario(String aEmail, String aNick, String aContrasenia, String aFoto);

	public void Actualizar_Contrasenia(String aEmail, String aNuevaContrasenia);

	public Usuario_generico Iniciar_Sesion(String aEmail, String aContrasenia);
	
	public int Cargar_Numero_Canciones_Mostradas();
	
	public Cancion[] Cargar_Canciones_Aleatorias(int aNumCanciones);
	
	public boolean Comprobar_Email(String aEmail);
	
	public boolean Comprobar_Nick(String aNick);
}