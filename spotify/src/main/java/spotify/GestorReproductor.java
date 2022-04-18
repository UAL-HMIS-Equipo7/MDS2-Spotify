package spotify;

import interfaz.Reproductor;

public class GestorReproductor {
	private static Reproductor _reproductor;
	
	public static void setReproductor(Reproductor reproductor) {
		_reproductor = reproductor;
	}
	
	public static void setCancion(String src) {
		//TODO: Pasarle los datos que hagan falta de la cancion
		_reproductor._audioPlayer.setSource(src);
		
		//_reproductor.getTituloL().setText(src);
		//_reproductor.getTituloB().setText(src);
		//_reproductor.getTituloB().addClickListener(null);
	}
}
