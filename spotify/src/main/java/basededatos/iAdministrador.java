package basededatos;

public interface iAdministrador extends iActor_comun {

	public Album[] Realizar_Busqueda_Albumes(String aParametrosBusqueda);

	public void Borrar_Album(int aIdAlbum);

	public void Eliminar_Usuario(int aIdUsuario);

	public Usuario_Registrado[] Realizar_Busqueda_Usuarios(String aParametrosBusqueda);

	public void Actualizar_Usuario(Usuario_Registrado aUsuario);

	public int Crear_Cancion(String aTitulo, int aIdEstilo, String aTituloAlbum, String aCompositores, String aProductores, String aFicheroMultimediaRuta, String aFicheroMultimediaAltaCalidadRuta, String interpretes);

	public void Actualizar_Cancion(Cancion aCancion, String aTituloAlbum, String[] aInterpretes);

	public int Crear_Artista(String aEmail, String aNick, String aContrasenia, String aImagenRuta, int aIdEstilo);

	public void Actualizar_Artista(Artista aArtista);

	public int Crear_Estilo(String aNombre);

	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda);

	public void Eliminar_Artista(int aIdArtista);

	public void Eliminar_Cancion(int aIdCancion);

	public int Crear_Album(String aTitulo, String aImagenRuta, String aFechaEdicion, String[] aListaArtistas, Cancion[] aListaCanciones);

	public void Actualizar_Album(Album aAlbum, String[] aAutores);

	public void Actualizar_Perfil(int aIdAdministrador, String aNuevoEmail, String aNuevoNick);
	
	public void Actualizar_Numero_Canciones_Mostradas(int aIdAdministrador, int aNuevoValor);
	
	public void Actualizar_Numero_Canciones_Reproducibles(int aIdAdministrador, int aNuevoValor);
	
	public int Cargar_Numero_Canciones_Mostradas(int aIdAdministrador);
	
	public int Cargar_Numero_Canciones_Reproducibles(int aIdAdministrador);
	
	public Administrador Obtener_Administrador(int aIdAdministrador);
	
	public boolean Comprobar_Email(String aEmail);
	
	public boolean Comprobar_Nick_Artista(String aNick);
}