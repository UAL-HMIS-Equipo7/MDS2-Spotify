package basededatos;

import interfaz.Administrador;

import org.orm.PersistentException;

import interfaz.Actor_comun;
import interfaz.Usuario_Registrado;
import interfaz.Cibernauta;
import interfaz.Artista;
import interfaz.Servicio_de_autenticacion_externo;
import interfaz.Servicio_de_Correo_Electronico;

public class BDPrincipal implements iAdministrador, iUsuario_Registrado, iCibernauta, iArtista, iActor_comun, iServicio_de_autenticacion_externo, iServicio_de_Correo_Electronico {
	public BD_Usuarios_Registrados _bD_Usuarios_Registrados = new BD_Usuarios_Registrados();
	public BD_Administradores _bD_Administradores = new BD_Administradores();
	public BD_Estadisticas _bD_Estadisticas = new BD_Estadisticas();
	public BD_Artistas _bD_Artistas = new BD_Artistas();
	public BD_Albumes _bD_Albumes = new BD_Albumes();
	public BD_Eventos _bD_Eventos = new BD_Eventos();
	public BD_Estilos _bD_Estilos = new BD_Estilos();
	public BD_Canciones _bD_Canciones = new BD_Canciones();
	public BD_Lista_de_reproduccion _bD_Lista_de_reproduccion = new BD_Lista_de_reproduccion();
	public BD_Datos_Acceso _bD_Datos_Acceso = new BD_Datos_Acceso();

	public Album[] Realizar_Busqueda_Albumes(String aParametrosBusqueda) {
		Album[] albumes = null;
		
		try {
			albumes = _bD_Albumes.Realizar_Busqueda_Albumes(aParametrosBusqueda);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return albumes;
	}

	public void Borrar_Album(int aIdAlbum) {
		try {
			_bD_Albumes.Borrar_Album(aIdAlbum);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Eliminar_Usuario(int aIdUsuario) {
		try {
			_bD_Usuarios_Registrados.Eliminar_usuario(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}


	public void Actualizar_Cancion(Cancion aCancion) {
		try {
			_bD_Canciones.Actualizar_Cancion(aCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}


	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda) {
		Cancion[] canciones = null;

		try {
			canciones = _bD_Canciones.Cargar_Canciones_Administrador(aParametrosBusqueda);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	public void Eliminar_Artista(int aIdArtista) {
		try {
			_bD_Artistas.Eliminar_Artista(aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Eliminar_Cancion(int aIdCancion) {
		try {
			_bD_Canciones.Eliminar_Cancion(aIdCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public int Crear_Album(String titulo, String imagenRuta, String fechaEdicion, Artista[] listaArtistas, Cancion[] listaCanciones) {
		int id_album = -1;
		try {
			id_album = _bD_Albumes.Crear_Album(titulo, imagenRuta, fechaEdicion, null, listaCanciones);
		}catch(PersistentException e) {
			e.printStackTrace();
		}
		return id_album;
	}

	public void Actualizar_Album(Album aAlbum) {
		try {
			 _bD_Albumes.Actualizar_Album(aAlbum);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Actualizar_Perfil(int aIdAdministrador, String aNuevoEmail, String aNuevoNick) {
		try {
			//TODO: Falta el actualizar perfil para usuario
			_bD_Administradores.Actualizar_Perfil(aIdAdministrador, aNuevoEmail, aNuevoNick);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Album[] Cargar_Albumes_Artista(int aIdArtista) {
		Album[] albumes = null;
		
		try {
			albumes = _bD_Albumes.Cargar_Albumes_Artistas(aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return albumes;
	}

	public Album[] Cargar_Albumes_Recomendados(int aIdUsuarioGenerico) {
		Album[] albumes = null;
		
		try {
			albumes = _bD_Albumes.Cargar_Albumes_Recomendados(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return albumes;
	}

	public void Seguir_lista_de_reproduccion(int aIdUsuarioGenerico, int aIdLista) {
		
		try {
			_bD_Lista_de_reproduccion.Seguir_lista_de_reproduccion(aIdUsuarioGenerico, aIdLista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

	public void Marcar_cancion_favorita(int aIdUsuarioGenerico, int aIdCancion) {
		try {
			_bD_Canciones.Marcar_cancion_favorita(aIdUsuarioGenerico, aIdCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Aniadir_cancion_a_lista(int aIdCancion, int aIdLista) {
		try {
			_bD_Canciones.Aniadir_cancion_a_lista(aIdCancion, aIdLista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Cancion[] Cargar_Ultimas_Canciones_Reproducidas(int aIdUsuarioGenerico) {
		Cancion[] canciones = null;

		try {
			canciones = _bD_Canciones.Cargar_Ultimas_Canciones_Reproducidas(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	public Lista_de_reproduccion[] Realizar_Busqueda_Listas_Ajenas(String aParametrosBusqueda, int aIdUsuarioGenerico) {
		Lista_de_reproduccion[] listas = null;

		try {
			listas = _bD_Lista_de_reproduccion.Realizar_Busqueda_Listas_Ajenas(aParametrosBusqueda, aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return listas;
	}

	public Cancion[] Realizar_Busqueda_Canciones(String aParametrosBusqueda) {
		Cancion[] canciones = null;

		try {
			canciones = _bD_Canciones.Realizar_Busqueda_Canciones(aParametrosBusqueda);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	public Evento[] Cargar_Notificaciones(int aIdUsuarioGenerico) {
		Evento[] notificaciones = null;

		try {
			notificaciones = _bD_Eventos.Cargar_Notificaciones(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return notificaciones;
	}

	public void Marcar_Notificacion_Recibida(int aIdUsuarioGenerico, int aIdEvento) {
		try {
			_bD_Eventos.Marcar_Notificacion_Recibida(aIdUsuarioGenerico, aIdEvento);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Lista_de_reproduccion[] Cargar_Listas_Recomendadas(int aIdUsuarioGenerico) {
		Lista_de_reproduccion[] listas = null;

		try {
			listas = _bD_Lista_de_reproduccion.Cargar_Listas_Recomendadas(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return listas;
	}

	public Lista_de_reproduccion[] Cargar_Listas_Perfil(int aIdUsuarioGenerico) {
		Lista_de_reproduccion[] listas = null;

		try {
			listas = _bD_Lista_de_reproduccion.Cargar_Listas_Perfil(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return listas;
	}

	public Evento[] Cargar_Eventos_Artista(int aIdArtista) {
		Evento[] eventos = null;

		try {
			eventos = _bD_Eventos.Cargar_Eventos_Artista(aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return eventos;
	}

	public Estilo[] Cargar_Estilos_Mas_Escuchados(int aIdUsuarioGenerico) {
		Estilo[] estilos = null;

		try {
			estilos = _bD_Estadisticas.Cargar_Estilos_Mas_Escuchados(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return estilos;
	}

	public int Crear_Lista_de_Reproduccion(int aIdUsuarioGenericoAutor, String aTitulo) {
		int id_lista = -1;
		try {
			id_lista = _bD_Lista_de_reproduccion.Crear_Lista_de_Reproduccion(aIdUsuarioGenericoAutor, aTitulo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return id_lista;
	}

	public String[] Cargar_Autores_Album(int aIdAlbum) {
		//TODO: String o Artista??
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Album(int aIdAlbum) {
		Cancion[] canciones = null;

		try {
			canciones = _bD_Canciones.Cargar_Canciones_Album(aIdAlbum);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	public Cancion[] Cargar_Canciones_Lista(int aIdListaReproduccion) {
		Cancion[] canciones = null;

		try {
			canciones = _bD_Canciones.Cargar_Canciones_Lista(aIdListaReproduccion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	public Lista_de_reproduccion Cargar_Canciones_Favoritas(int aIdUsuarioGenerico) {
		Lista_de_reproduccion lista = null;
		
		try {
			lista = _bD_Lista_de_reproduccion.Cargar_Canciones_Favoritas(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public Cancion[] Cargar_Canciones_Recomendadas(int aIdUsuarioGenerico) {
		Cancion[] canciones = null;

		try {
			canciones = _bD_Canciones.Cargar_Canciones_Recomendadas(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	public Cancion[] Cargar_Canciones_Exitosas(int aIdArtista) {
		Cancion[] canciones = null;

		try {
			canciones = _bD_Canciones.Cargar_Canciones_Exitosas(aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	public void Aniadir_Cancion_Reproducida(int aIdCancion, int aIdUsuarioGenerico) {
		try {
			_bD_Canciones.Aniadir_Cancion_Reproducida(aIdCancion, aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Seguir_Artista(int aIdUsuarioGenerico, int aIdArtista) {
		try {
			_bD_Artistas.Seguir_Artista(aIdUsuarioGenerico, aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Seguir_Usuario(int aIdSeguidor, int aIdSeguido) {
		try {
			_bD_Usuarios_Registrados.Seguir_Usuario(aIdSeguidor, aIdSeguido);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public int Registrar_Usuario(String aEmail, String aNick, String aContrasenia, String aFoto) {
		int id_usuario = -1;
		
		try {
			int id_datosAcceso = _bD_Datos_Acceso.Dar_De_Alta_Cuenta(aEmail, aContrasenia, "usuario");
			id_usuario = _bD_Usuarios_Registrados.Crear_Usuario(id_datosAcceso, aNick, aFoto);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return id_usuario;
	}

	public void Actualizar_Contrasenia(String aEmail, String aNuevaContrasenia) {
		try {
			_bD_Datos_Acceso.Actualizar_Contrasenia(aEmail, aNuevaContrasenia);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Usuario_generico Iniciar_Sesion(String aEmail, String aContrasenia) {
		Usuario_generico usuario = null;
		
		try {
			Datos_Acceso datos = _bD_Datos_Acceso.Realizar_Intento_Inicio_Sesion(aEmail, aContrasenia);
			
			//TODO
			//Hacemos un switch en funcion del tipo de usuario, o directamente cogemos la referencia que hay en datos acceso?
			usuario = datos.getUsuario();
			
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}

	public int Crear_Evento(int aIdArtista, String imagenRuta, String fechaYHora, String descripcion, int precio) {
		int id_evento = -1;
		try {
			id_evento = _bD_Eventos.Crear_Evento(aIdArtista, imagenRuta, fechaYHora, descripcion, precio);
		}catch(PersistentException e) {
			e.printStackTrace();
		}
		return id_evento;
	}

	public void Actualizar_Foto_Perfil(int aIdArtista, String aNuevaFoto) {
		try {
			 _bD_Artistas.Actualizar_Foto_Perfil(aIdArtista, aNuevaFoto);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
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
		basededatos.Artista[] artistas = null;
		
		try {
			artistas = _bD_Artistas.Realizar_Busqueda_Artistas(aParametrosBusqueda);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return artistas;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Mas_Escuchados(int aIdUsuarioGenerico) {
		basededatos.Artista[] artistas = null;
		
		try {
			artistas = _bD_Estadisticas.Cargar_Artistas_Mas_Escuchados(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return artistas;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Lista_Seguidores(int aIdUsuarioGenerico) {
		basededatos.Artista[] artistas = null;
		
		try {
			artistas = _bD_Artistas.Cargar_Artistas_Lista_Seguidores(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return artistas;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Lista_Seguidos(int aIdUsuarioGenerico) {
		basededatos.Artista[] artistas = null;
		
		try {
			artistas = _bD_Artistas.Cargar_Artistas_Lista_Seguidos(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return artistas;
	}

	@Override
	public basededatos.Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidores(int aIdUsuarioGenerico) {
		basededatos.Usuario_Registrado[] usuarios = null;
		
		try {
			usuarios = _bD_Usuarios_Registrados.Cargar_Usuarios_Lista_Seguidores(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}

	@Override
	public basededatos.Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidos(int aIdUsuarioGenerico) {
		basededatos.Usuario_Registrado[] usuarios = null;
		
		try {
			usuarios = _bD_Usuarios_Registrados.Cargar_Usuarios_Lista_Seguidos(aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}

	@Override
	public basededatos.Artista[] Cargar_Artistas_Similares(int aIdArtista) {
		basededatos.Artista[] artistas = null;
		
		try {
			artistas = _bD_Artistas.Cargar_Artistas_Similares(aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return artistas;
	}

	@Override
	public basededatos.Usuario_Registrado[] Realizar_Busqueda_Usuarios(String aParametrosBusqueda) {
		basededatos.Usuario_Registrado[] usuarios = null;
		
		try {
			usuarios = _bD_Usuarios_Registrados.Realizar_Busqueda_Usuarios(aParametrosBusqueda);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}

	@Override
	public void Actualizar_Usuario(basededatos.Usuario_Registrado aUsuario) {
		try {
			 _bD_Usuarios_Registrados.Actualizar_Usuario(aUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Actualizar_Artista(basededatos.Artista aArtista) {
		try {
			_bD_Artistas.Actualizar_Artista(aArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Actualizar_Estadisticas(int aIdCancion, int aIdUsuarioGenerico) {
		try {
			_bD_Estadisticas.Actualizar_Estadisticas(aIdCancion, aIdUsuarioGenerico);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int Crear_Artista(String aEmail, String aNick, String aContrasenia, String aImagenRuta, int aIdEstilo) {
		int id_artista = -1;
		try {
			int id_datosAcceso = _bD_Datos_Acceso.Dar_De_Alta_Cuenta(aEmail, aContrasenia, "artista");
			id_artista = _bD_Artistas.Crear_Artista(id_datosAcceso, aNick, aImagenRuta, aIdEstilo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return id_artista;
	}

	@Override
	public int Crear_Cancion(String titulo, int idEstilo, String tituloAlbum, String compositores, String productores,
			String ficheroMultimediaRuta, String ficheroMultimediaAltaCalidadRuta, String interpretes) {
		int id_cancion = -1;
		try {
			id_cancion = _bD_Canciones.Crear_Cancion(titulo, idEstilo, tituloAlbum, compositores, productores, ficheroMultimediaRuta, ficheroMultimediaAltaCalidadRuta, interpretes);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return id_cancion;
	}
	

	@Override
	public int Crear_Estilo(String nombre) {
		int id_estilo = -1;
		try {
			id_estilo =  _bD_Estilos.Crear_Estilo(nombre);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return id_estilo;
	}

	@Override
	public int Crear_Album(String titulo, String imagenRuta, String fechaEdicion, basededatos.Artista[] listaArtistas,
			Cancion[] listaCanciones) {
		int id_album = -1;
		try {
		id_album = _bD_Albumes.Crear_Album(titulo, imagenRuta, fechaEdicion, listaArtistas, listaCanciones);
		}catch (PersistentException e) {
			e.printStackTrace();
		}
		return id_album;
	}

	@Override
	public void Quitar_cancion_favoritos(int aIdUsuarioGenerico, int aIdCancion) {
		try {
			_bD_Canciones.Quitar_cancion_favoritos(aIdUsuarioGenerico, aIdCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Actualizar_Numero_Canciones_Mostradas(int aIdAdministrador, int aNuevoValor) {
		try {
			_bD_Administradores.Actualizar_Numero_Canciones_Mostradas(aIdAdministrador, aNuevoValor);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Actualizar_Numero_Canciones_Reproducibles(int aIdAdministrador, int aNuevoValor) {
		try {
			_bD_Administradores.Actualizar_Numero_Canciones_Reproducibles(aIdAdministrador, aNuevoValor);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Estilo[] Cargar_Estilos() {
		Estilo[] estilos = null;
		
		try {
			estilos = _bD_Estilos.Cargar_Estilos();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return estilos;
	}

	@Override
	public int Cargar_Numero_Canciones_Mostradas() {
		int num = -1;
		
		try {
			num = _bD_Administradores.Cargar_Numero_Canciones_Mostradas();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return num;
	}

	@Override
	public Cancion[] Cargar_Canciones_Aleatorias(int aNumCanciones) {
		Cancion[] canciones = null;
		
		try {
			canciones = _bD_Canciones.Cargar_Canciones_Aleatorias(aNumCanciones);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return canciones;
	}

	@Override
	public int Cargar_Numero_Canciones_Mostradas(int idAdministrador) {
		int num = -1;
		
		try {
			num = _bD_Administradores.Cargar_Numero_Canciones_Mostradas(idAdministrador);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return num;
	}

	@Override
	public int Cargar_Numero_Canciones_Reproducibles(int idAdministrador) {
		int num = -1;
		
		try {
			num = _bD_Administradores.Cargar_Numero_Canciones_Reproducibles(idAdministrador);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return num;
	}
}