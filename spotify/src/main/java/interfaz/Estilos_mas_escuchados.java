package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import interfaz.Imagen_estilos;
import vistas.VistaEstilos_mas_escuchados;

@CssImport("./styles/shared-styles.css")
public class Estilos_mas_escuchados extends VistaEstilos_mas_escuchados {
//	private Label _tituloL;

	public Vector<Imagen_estilos> _list_Imagen_estilos = new Vector<Imagen_estilos>();
	
	public Estilos_mas_escuchados() {
		
		CargarImagenesEstilos();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 3 && i < _list_Imagen_estilos.size(); i++) {
			hlSup.add(_list_Imagen_estilos.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 3; i < 6 && i < _list_Imagen_estilos.size(); i++) {
			hlInf.add(_list_Imagen_estilos.get(i));
		}
	}
	
	public void CargarImagenesEstilos() {
		Imagen_estilos temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Imagen_estilos();
			temp.setClassName("imagenEstilo");
			
			_list_Imagen_estilos.add(temp);
		}
	}
}