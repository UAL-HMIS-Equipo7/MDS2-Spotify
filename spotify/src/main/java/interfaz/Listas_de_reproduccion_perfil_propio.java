package interfaz;

import java.util.Vector;
import interfaz.Crear_lista_de_reproduccion;

public class Listas_de_reproduccion_perfil_propio extends Listas_de_reproduccion_perfil {
//	private Button _crearListaB;

	public Crear_lista_de_reproduccion _crear_lista_de_reproduccion = new Crear_lista_de_reproduccion();
	
	public Listas_de_reproduccion_perfil_propio() {
		super();
		
		_crear_lista_de_reproduccion = new Crear_lista_de_reproduccion();
		
		this.getCrearListaB().setVisible(true);
	}
}