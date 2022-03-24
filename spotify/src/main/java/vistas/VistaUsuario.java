package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario")
@JsModule("./src/vistas/vista-usuario.ts")
public class VistaUsuario extends LitTemplate {

    public Image getFotoB() {
		return fotoB;
	}

	public void setFotoB(Image fotoB) {
		this.fotoB = fotoB;
	}

	public Element getNickB() {
		return nickB;
	}

	public void setNickB(Element nickB) {
		this.nickB = nickB;
	}

	@Id("fotoB")
	private Image fotoB;
	@Id("nickB")
	private Element nickB;

	/**
     * Creates a new VistaUsuario.
     */
    public VistaUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
