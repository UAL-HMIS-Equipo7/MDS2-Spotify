package basededatos;

public interface iAdministrador extends iActor_comun {

	public Album[] Realizar_Busqueda_Albumes(String aParametrosBusqueda);

	public void Borrar_Album(int aIdAlbum);

	public void Eliminar_Usuario(int aIdUsuario);

	public Usuario_Registrado[] Realizar_Busqueda_Usuarios(String aParametrosBusqueda);

	public void Actualizar_Usuario(Usuario_Registrado aUsuario);

	public void Crear_Cancion(Cancion aCancion);

	public void Actualizar_Cancion(Cancion aCancion);

	public void Crear_Artista(Artista aArtista);

	public void Actualizar_Artista(Artista aArtista);

	public void Crear_Estilo(Estilo aEstilo);

	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda);

	public void Eliminar_Artista(int aIdArtista);

	public void Eliminar_Cancion(int aIdCancion);

	public int Crear_Album(Album aAlbum);

	public void Actualizar_Album(Album aAlbum);

	public void Actualizar_Perfil(int aIdAdministrador, String aNuevoEmail, String aNuevoNick);
}