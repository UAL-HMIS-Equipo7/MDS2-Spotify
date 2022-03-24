package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-nombreartista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nombreartista")
@JsModule("./src/vistas/vista-nombreartista.ts")
public class VistaNombreartista extends LitTemplate {

    public Label getNombreL() {
		return nombreL;
	}

	public void setNombreL(Label nombreL) {
		this.nombreL = nombreL;
	}

	@Id("nombreL")
	private Label nombreL;

	/**
     * Creates a new VistaNombreartista.
     */
    public VistaNombreartista() {
        // You can initialise any data required for the connected UI components here.
    }

}
