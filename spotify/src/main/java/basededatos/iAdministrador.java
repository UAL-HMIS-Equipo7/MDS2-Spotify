package basededatos;

public interface iAdministrador extends iActor_comun {

	public Album[] Realizar_Busqueda_Albumes(String aParametrosBusqueda);

	public void Borrar_Album(int aIdAlbum);

	public void Eliminar_Usuario(int aIdUsuario);

	public Usuario_Registrado[] Realizar_Busqueda_Usuarios(String aParametrosBusqueda);

	public void Actualizar_Usuario(Usuario_Registrado aUsuario);

	public int Crear_Cancion(String titulo, int idEstilo, String tituloAlbum, String compositores, String productores, String ficheroMultimediaRuta, String ficheroMultimediaAltaCalidadRuta, String interpretes);

	public void Actualizar_Cancion(Cancion aCancion);

	public int Crear_Artista(String aEmail, String aNick, String aContrasenia, String aImagenRuta, int aIdEstilo);

	public void Actualizar_Artista(Artista aArtista);

	public int Crear_Estilo(String nombre);

	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda);

	public void Eliminar_Artista(int aIdArtista);

	public void Eliminar_Cancion(int aIdCancion);

	public int Crear_Album(String titulo, String imagenRuta, String fechaEdicion, String[] listaArtistas, Cancion[] listaCanciones);

	public void Actualizar_Album(Album aAlbum);

	public void Actualizar_Perfil(int aIdAdministrador, String aNuevoEmail, String aNuevoNick);
	
	public void Actualizar_Numero_Canciones_Mostradas(int aIdAdministrador, int aNuevoValor);
	
	public void Actualizar_Numero_Canciones_Reproducibles(int aIdAdministrador, int aNuevoValor);
	
	public int Cargar_Numero_Canciones_Mostradas(int idAdministrador);
	
	public int Cargar_Numero_Canciones_Reproducibles(int idAdministrador);
}