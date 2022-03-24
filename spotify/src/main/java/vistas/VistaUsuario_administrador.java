package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-usuario_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario_administrador")
@JsModule("./src/vistas/vista-usuario_administrador.ts")
public class VistaUsuario_administrador extends LitTemplate {

    public Label getUsuarioL() {
		return usuarioL;
	}

	public void setUsuarioL(Label usuarioL) {
		this.usuarioL = usuarioL;
	}

	public Image getUsuarioImg() {
		return usuarioImg;
	}

	public void setUsuarioImg(Image usuarioImg) {
		this.usuarioImg = usuarioImg;
	}

	public Button getEliminarUsuarioB() {
		return eliminarUsuarioB;
	}

	public void setEliminarUsuarioB(Button eliminarUsuarioB) {
		this.eliminarUsuarioB = eliminarUsuarioB;
	}

	public Button getEditarUsuarioB() {
		return editarUsuarioB;
	}

	public void setEditarUsuarioB(Button editarUsuarioB) {
		this.editarUsuarioB = editarUsuarioB;
	}

	@Id("usuarioL")
	private Label usuarioL;
	@Id("usuarioImg")
	private Image usuarioImg;
	@Id("eliminarUsuarioB")
	private Button eliminarUsuarioB;
	@Id("editarUsuarioB")
	private Button editarUsuarioB;

	/**
     * Creates a new VistaUsuario_administrador.
     */
    public VistaUsuario_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
