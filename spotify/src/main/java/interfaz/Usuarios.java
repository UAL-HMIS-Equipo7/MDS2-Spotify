package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Usuario;
import vistas.VistaUsuarios;

public class Usuarios extends VistaUsuarios {
	public Vector<Usuario> _list_Usuario = new Vector<Usuario>();
	
	
	
	public Usuarios() {
		
		
		
		CargarUsuario();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		//TODO -> Añadir un scroller??
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getElement().setAttribute("justify-content", "space-evenly");
		
		for (int i = 0; i < _list_Usuario.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				vl.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.getElement().setAttribute("justify-content", "space-evenly");
			}
			
			tempHl.add(_list_Usuario.get(i));
		}
		
		vl.add(tempHl);
		
	}
	
	public void CargarUsuario() {
		Usuario temp;
		
		for(int i = 0; i < 6; i++) {
			temp = new Usuario();
			
			_list_Usuario.add(temp);
		}
	}
}
