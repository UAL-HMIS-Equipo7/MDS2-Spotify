package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaImagen_estilos;

public class Imagen_estilos extends VistaImagen_estilos {
//	private Image _estiloImg;

	public Imagen_estilos(basededatos.Estilo estilo) {
		
		VerticalLayout vl = this.getContenedor().as(VerticalLayout.class);
		
		Label nombre = new Label(estilo.getNombre());
		
		vl.add(nombre);
	}
}