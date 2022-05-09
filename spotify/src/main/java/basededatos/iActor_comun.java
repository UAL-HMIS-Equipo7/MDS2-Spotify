package basededatos;

public interface iActor_comun {

	public Album[] Cargar_Albumes_Artista(int aIdArtista);

	public Album[] Cargar_Albumes_Recomendados(int aIdUsuarioGenerico);

	public void Seguir_lista_de_reproduccion(int aIdUsuarioGenerico, int aIdLista);

	public void Marcar_cancion_favorita(int aIdUsuarioGenerico, int aIdCancion);

	public void Aniadir_cancion_a_lista(int aIdCancion, int aIdLista);

	public Cancion[] Cargar_Ultimas_Canciones_Reproducidas(int aIdUsuarioGenerico);

	public Lista_de_reproduccion[] Realizar_Busqueda_Listas_Ajenas(String aParametrosBusqueda, int aIdUsuarioGenerico);

	public Cancion[] Realizar_Busqueda_Canciones(String aParametrosBusqueda);

	public Artista[] Realizar_Busqueda_Artistas(String aParametrosBusqueda);

	public Evento[] Cargar_Notificaciones(int aIdUsuarioGenerico);

	public void Marcar_Notificacion_Recibida(int aIdUsuarioGenerico, int aIdEvento);

	public Lista_de_reproduccion[] Cargar_Listas_Recomendadas(int aIdUsuarioGenerico);

	public Lista_de_reproduccion[] Cargar_Listas_Perfil(int aIdUsuarioGenerico);

	public Evento[] Cargar_Eventos_Artista(int aIdArtista);

	public Estilo[] Cargar_Estilos_Mas_Escuchados(int aIdUsuarioGenerico);

	public int Crear_Lista_de_Reproduccion(int aIdUsuarioGenericoAutor, String aTitulo);

	public Artista[] Cargar_Artistas_Mas_Escuchados(int aIdUsuarioGenerico);

	public String[] Cargar_Autores_Album(int aIdAlbum);

	public Cancion[] Cargar_Canciones_Album(int aIdAlbum);

	public Cancion[] Cargar_Canciones_Lista(int aIdListaReproduccion);

	public Lista_de_reproduccion Cargar_Canciones_Favoritas(int aIdUsuarioGenerico);

	public Cancion[] Cargar_Canciones_Recomendadas(int aIdUsuarioGenerico);

	public Cancion[] Cargar_Canciones_Exitosas(int aIdArtista);

	public Artista[] Cargar_Artistas_Lista_Seguidores(int aIdUsuarioGenerico);

	public Artista[] Cargar_Artistas_Lista_Seguidos(int aIdUsuarioGenerico);

	public Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidores(int aIdUsuarioGenerico);

	public Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidos(int aIdUsuarioGenerico);

	public void Aniadir_Cancion_Reproducida(int aIdCancion, int aIdUsuarioGenerico);

	public void Seguir_Artista(int aIdUsuarioGenerico, int aIdArtista);

	public void Seguir_Usuario(int aIdSeguidor, int aIdSeguido);
}