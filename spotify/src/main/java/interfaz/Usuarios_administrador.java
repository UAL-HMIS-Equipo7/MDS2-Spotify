package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;

import interfaz.Usuario_administrador;
import vistas.VistaUsuarios_administrador;

public class Usuarios_administrador extends VistaUsuarios_administrador
{
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;
	public Vector<Usuario_administrador> _list_Usuario_administrador = new Vector<Usuario_administrador>();
	
	public Usuarios_administrador() {
		
		CargarUsuariosAdministrador();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		
		for (Usuario_administrador ua : _list_Usuario_administrador) {
			div.add(ua);
		}
		
		scroll.setContent(div);
	}
	
public void CargarUsuariosAdministrador() {
		
		Usuario_administrador temp;
		
		for (int i = 0; i < 5; i++) {
			temp = new Usuario_administrador();
			temp.setClassName("usuarioAdministrador");
			
			_list_Usuario_administrador.add(temp);
		}
	
}
}