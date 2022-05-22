package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import interfaz.Cancion__Cibernauta_;
import vistas.VistaCanciones_ultimos_exitos;

@CssImport("./styles/shared-styles.css")
public class Canciones_ultimos_exitos extends VistaCanciones_ultimos_exitos {
	
	iCibernauta bd = new BDPrincipal();

	public Vector<Cancion__Cibernauta_> _list_Cancion__Cibernauta_ = new Vector<Cancion__Cibernauta_>();
	
	public Canciones_ultimos_exitos() {
		
		CargarCancionesCibernauta();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 4 && i < _list_Cancion__Cibernauta_.size(); i++) {
			hlSup.add(_list_Cancion__Cibernauta_.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 4; i < 8 && i < _list_Cancion__Cibernauta_.size(); i++) {
			hlInf.add(_list_Cancion__Cibernauta_.get(i));
		}
	}
	
	public void CargarCancionesCibernauta() {
		
		int numCancionesMostrada = bd.Cargar_Numero_Canciones_Mostradas();
		basededatos.Cancion[] canciones = bd.Cargar_Canciones_Aleatorias(numCancionesMostrada);
		
		Cancion__Cibernauta_ temp;
		
		for (int i = 0; i < canciones.length; i++) {
			temp = new Cancion__Cibernauta_(canciones[i]);
			temp.setClassName("cancionCiber");
			
			_list_Cancion__Cibernauta_.add(temp);
		}
		
	}
	
	
}