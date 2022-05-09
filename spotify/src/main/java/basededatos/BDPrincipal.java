package basededatos;

import interfaz.Administrador;
import interfaz.Actor_comun;
import interfaz.Usuario_Registrado;
import interfaz.Cibernauta;
import interfaz.Artista;
import interfaz.Servicio_de_autenticacion_externo;
import interfaz.Servicio_de_Correo_Electronico;

public class BDPrincipal implements iAdministrador, iUsuario_Registrado, iCibernauta, iArtista, iActor_comun, iServicio_de_autenticacion_externo, iServicio_de_Correo_Electronico {
	public BD_Usuarios_Registrados _bD_Usuarios_Registrados;
	public BD_Administradores _bD_Administradores;
	public BD_Estadisticas _bD_Estadisticas;
	public BD_Artistas _bD_Artistas;
	public BD_Albumes _bD_Albumes;
	public BD_Eventos _bD_Eventos;
	public BD_Estilos _bD_Estilos;
	public BD_Canciones _bD_Canciones;
	public BD_Lista_de_reproduccion _bD_Lista_de_reproduccion;
	public BD_Datos_Acceso _bD_Datos_Acceso;

	public Album[] Realizar_Busqueda_Albumes(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public void Borrar_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Usuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Usuario(Usuario_Registrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Crear_Cancion(Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Cancion(Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public void Crear_Artista(Artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Artista(Artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void Crear_Estilo(Estilo aEstilo) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Cancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public int Crear_Album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Perfil(int aIdAdministrador, String aNuevoEmail, String aNuevoNick) {
		throw new UnsupportedOperationException();
	}

	public Album[] Cargar_Albumes_Artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Album[] Cargar_Albumes_Recomendados(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_lista_de_reproduccion(int aIdUsuarioGenerico, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void Marcar_cancion_favorita(int aIdUsuarioGenerico, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void Aniadir_cancion_a_lista(int aIdCancion, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Ultimas_Canciones_Reproducidas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] Realizar_Busqueda_Listas_Ajenas(String aParametrosBusqueda, int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Realizar_Busqueda_Canciones(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public Evento[] Cargar_Notificaciones(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Marcar_Notificacion_Recibida(int aIdUsuarioGenerico, int aIdEvento) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] Cargar_Listas_Recomendadas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] Cargar_Listas_Perfil(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Evento[] Cargar_Eventos_Artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Estilo[] Cargar_Estilos_Mas_Escuchados(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public int Crear_Lista_de_Reproduccion(int aIdUsuarioGenericoAutor, String aTitulo) {
		throw new UnsupportedOperationException();
	}

	public String[] Cargar_Autores_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Lista(int aIdListaReproduccion) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion Cargar_Canciones_Favoritas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Recomendadas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Exitosas(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void Aniadir_Cancion_Reproducida(int aIdCancion, int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Artista(int aIdUsuarioGenerico, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Usuario(int aIdSeguidor, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}

	public int Registrar_Usuario(String aEmail, String aNick, String aContrasenia, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Contrasenia(String aEmail, String aNuevaContrasenia) {
		throw new UnsupportedOperationException();
	}

	public Usuario_generico Iniciar_Sesion(String aEmail, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void Crear_Evento(int aIdArtista, Evento aEvento) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Foto_Perfil(int aIdArtista, String aNuevaFoto) {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Actor_comun get_Actor_comun() {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado get_Usuario_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta get_Cibernauta() {
		throw new UnsupportedOperationException();
	}

	public Artista get_Artista() {
		throw new UnsupportedOperationException();
	}

	public Servicio_de_autenticacion_externo get_Servicio_de_autenticacion_externo() {
		throw new UnsupportedOperationException();
	}

	public Servicio_de_Correo_Electronico get_Servicio_de_Correo_Electronico() {
		throw new UnsupportedOperationException();
	}

	@Override
	public basededatos.Artista[] Realizar_Busqueda_Artistas(String aParametrosBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Mas_Escuchados(int aIdUsuarioGenerico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Lista_Seguidores(int aIdUsuarioGenerico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Lista_Seguidos(int aIdUsuarioGenerico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public basededatos.Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidores(int aIdUsuarioGenerico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public basededatos.Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidos(int aIdUsuarioGenerico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Similares(int aIdArtista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public basededatos.Usuario_Registrado[] Realizar_Busqueda_Usuarios(String aParametrosBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Actualizar_Usuario(basededatos.Usuario_Registrado aUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Crear_Artista(basededatos.Artista aArtista) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Actualizar_Artista(basededatos.Artista aArtista) {
		// TODO Auto-generated method stub
		
	}
}