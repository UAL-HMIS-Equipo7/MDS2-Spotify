package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
import vistas.VistaUsuario_administrador;

public class Usuario_administrador extends VistaUsuario_administrador {
//	private Label _usuarioL;
//	private Image _usuarioImg;
//	private Button _editarUsuarioB;
//	private Button _eliminarUsuarioB;
	public Editar_usuario _editar_usuario;
	public Confirmacion_eliminacion _confirmacion_eliminacion;
	
	private basededatos.Usuario_Registrado _usuario;
	private iAdministrador bd = new BDPrincipal();
	
	public Usuario_administrador(basededatos.Usuario_Registrado usuario) {
		
		_usuario = usuario;
		
		this.getUsuarioL().setText(_usuario.getNick());
		this.getUsuarioImg().setSrc(_usuario.getFotoRuta());
		
		this.getEditarUsuarioB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
			
				_editar_usuario = new Editar_usuario(_usuario);
				GestorVentana.CambiarVentana(_editar_usuario);
			}
		});
		
		this.getEliminarUsuarioB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();

				_confirmacion_eliminacion = new Confirmacion_eliminacion(ventanaModal) {
					@Override
					public void Eliminar_elemento() {
						bd.Eliminar_Usuario(_usuario.getORMID());
					}
					
				};

				ventanaModal.add(_confirmacion_eliminacion);
				ventanaModal.open();
				
			}
		});
	}
}