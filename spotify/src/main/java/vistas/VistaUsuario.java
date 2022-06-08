package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario")
@JsModule("./src/vistas/vista-usuario.ts")
public class VistaUsuario extends LitTemplate {

	public HorizontalLayout getFotoImgLayout() {
		return fotoImgLayout;
	}

	public void setFotoImgLayout(HorizontalLayout fotoImgLayout) {
		this.fotoImgLayout = fotoImgLayout;
	}

	public Button getNickB() {
		return nickB;
	}

	public void setNickB(Button nickB) {
		this.nickB = nickB;
	}

	@Id("fotoImgLayout")
	private HorizontalLayout fotoImgLayout;
	@Id("nickB")
	private Button nickB;

	/**
     * Creates a new VistaUsuario.
     */
    public VistaUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
