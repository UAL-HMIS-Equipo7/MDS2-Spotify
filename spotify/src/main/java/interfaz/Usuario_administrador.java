package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuario_administrador;

public class Usuario_administrador extends VistaUsuario_administrador {
//	private Label _usuarioL;
//	private Image _usuarioImg;
//	private Button _editarUsuarioB;
//	private Button _eliminarUsuarioB;
	public Editar_usuario _editar_usuario;
	public Confirmacion_eliminacion _confirmacion_eliminacion;
	
	public Usuario_administrador(VerticalLayout layoutPadre) {
		
		this.getEditarUsuarioB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
			
				layoutPadre.removeAll();
				
				_editar_usuario = new Editar_usuario(layoutPadre);
				layoutPadre.add(_editar_usuario);
			}
		});
		
		this.getEliminarUsuarioB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();

				_confirmacion_eliminacion = new Confirmacion_eliminacion(ventanaModal);

				ventanaModal.add(_confirmacion_eliminacion);
				ventanaModal.open();
				
			}
		});
	}
}