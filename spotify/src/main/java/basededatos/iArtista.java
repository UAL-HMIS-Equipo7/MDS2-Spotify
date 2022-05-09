package basededatos;

public interface iArtista extends iActor_comun {

	public void Crear_Evento(int aIdArtista, Evento aEvento);

	public void Actualizar_Foto_Perfil(int aIdArtista, String aNuevaFoto);

	public void Eliminar_Artista(int aIdArtista);

	public Artista[] Cargar_Artistas_Similares(int aIdArtista);
}