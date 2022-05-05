package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Usuario;
import vistas.VistaUsuarios;

public class Usuarios extends VistaUsuarios {
	public Vector<Usuario> _list_Usuario = new Vector<Usuario>();
	
	private int _tipoLista;
	
	public Usuarios(int tipoLista) {
		
		_tipoLista = tipoLista;
		
		CargarUsuarios();
		
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
	
	public void CargarUsuarios() {
		
		if (_tipoLista == 0) {
			//CargarUsuarioSeguidores
		}
		else if (_tipoLista == 1) {
			//CargarUsuariosSeguidos
		}
		
		Usuario temp;
		
		for(int i = 0; i < 6; i++) {
			temp = new Usuario();
			
			_list_Usuario.add(temp);
		}
	}
}
