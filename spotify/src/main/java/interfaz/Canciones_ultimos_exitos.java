package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion__Cibernauta_;
import vistas.VistaCanciones_ultimos_exitos;

@CssImport("./styles/shared-styles.css")
public class Canciones_ultimos_exitos extends VistaCanciones_ultimos_exitos {

	public Vector<Cancion__Cibernauta_> _list_Cancion__Cibernauta_ = new Vector<Cancion__Cibernauta_>();
	private VerticalLayout layoutPadre;
	
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
	
	public Canciones_ultimos_exitos(VerticalLayout layoutPadre) {
		
		this.layoutPadre = layoutPadre;
		
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
		Cancion__Cibernauta_ temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Cancion__Cibernauta_(layoutPadre);
			temp.setClassName("cancionCiber");
			
			_list_Cancion__Cibernauta_.add(temp);
		}
		
	}
	
	
}