package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Cancion;
import vistas.VistaUltimas_canciones_reproducidas;

@CssImport("./styles/shared-styles.css")
public class Ultimas_canciones_reproducidas extends VistaUltimas_canciones_reproducidas {
//	private Label _tituloL;
	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	
	private Usuario_generico _usuario;
	private iActor_comun bd = new BDPrincipal();
	
	public Ultimas_canciones_reproducidas(Usuario_generico usuario) {
		
		_usuario = usuario;
		
		CargarUltimasCancionesReproducidas();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 5 && i < _list_Cancion.size(); i++) {
			hlSup.add(_list_Cancion.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 5; i < 10 && i < _list_Cancion.size(); i++) {
			hlInf.add(_list_Cancion.get(i));
		}
	}
	
	public void CargarUltimasCancionesReproducidas() {
		
		basededatos.Cancion canciones[] = bd.Cargar_Ultimas_Canciones_Reproducidas(_usuario.getORMID());
		
		Cancion temp;
		
		for (int i = 0; i < 10 && i < canciones.length; i++) {
			temp = new Cancion(canciones[i]);
			temp.setClassName("max250");
			
			_list_Cancion.add(temp);
		}
	}
}