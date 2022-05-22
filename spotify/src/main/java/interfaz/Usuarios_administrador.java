package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Usuario_administrador;
import vistas.VistaUsuarios_administrador;

public class Usuarios_administrador extends VistaUsuarios_administrador
{
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;
	public Vector<Usuario_administrador> _list_Usuario_administrador = new Vector<Usuario_administrador>();
	
	private String _paramsBusqueda;
	private iAdministrador bd = new BDPrincipal();
	
	public Usuarios_administrador(String paramsBusqueda) {
		
		_paramsBusqueda = paramsBusqueda;
		
		CargarUsuariosAdministrador();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		
		for (Usuario_administrador ua : _list_Usuario_administrador) {
			div.add(ua);
		}
		
		scroll.setContent(div);
	}
	
	public void CargarUsuariosAdministrador() {
		
		basededatos.Usuario_Registrado[] usuarios = bd.Realizar_Busqueda_Usuarios(_paramsBusqueda);
		
		Usuario_administrador temp;
		
		for (int i = 0; i < 5 && i < usuarios.length; i++) {
			temp = new Usuario_administrador(usuarios[i]);
			temp.setClassName("usuarioAdministrador");
			
			_list_Usuario_administrador.add(temp);
		}
	
	}
}