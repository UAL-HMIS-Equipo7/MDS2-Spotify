package interfaz;

public class Cancion_a_eliminar_album extends Cancion_album {
//	private Button _eliminarB;
	
	public Cancion_a_eliminar_album(basededatos.Cancion cancion) {
		super(cancion);
		
		this.getEliminarB().setVisible(true);
	}
}