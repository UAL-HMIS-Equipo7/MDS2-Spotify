package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-reproductor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reproductor")
@JsModule("./src/vistas/vista-reproductor.ts")
public class VistaReproductor extends LitTemplate {

    public Button getCreditosB() {
		return creditosB;
	}

	public void setCreditosB(Button creditosB) {
		this.creditosB = creditosB;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	@Id("creditosB")
	private Button creditosB;
	@Id("tituloL")
	private Label tituloL;

	/**
     * Creates a new VistaReproductor.
     */
    public VistaReproductor() {
        // You can initialise any data required for the connected UI components here.
    }

}
