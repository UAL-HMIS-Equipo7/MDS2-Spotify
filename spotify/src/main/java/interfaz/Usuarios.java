package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Usuario;
import vistas.VistaUsuarios;

public class Usuarios extends VistaUsuarios {
	public Vector<Usuario> _list_Usuario = new Vector<Usuario>();
	
	private int _tipoLista;
	private Usuario_generico _usuario;
	private iActor_comun bd = new BDPrincipal();
	
	public Usuarios(int tipoLista, Usuario_generico usuario) {
		
		_usuario = usuario;
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
		
		basededatos.Usuario_Registrado[] usuarios = null;
		
		if (_tipoLista == 0) {
			usuarios = bd.Cargar_Usuarios_Lista_Seguidores(_usuario.getORMID());
		}
		else if (_tipoLista == 1) {
			usuarios = bd.Cargar_Usuarios_Lista_Seguidos(_usuario.getORMID());
		}
		
		if (usuarios != null) {
			Usuario temp;
			
			for(int i = 0; i < usuarios.length; i++) {
				temp = new Usuario(usuarios[i]);
				
				_list_Usuario.add(temp);
			}
		}	
	}
}
