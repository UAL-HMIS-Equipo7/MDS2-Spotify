package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-darse_de_baja template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-darse_de_baja")
@JsModule("./src/vistas/vista-darse_de_baja.ts")
public class VistaDarse_de_baja extends LitTemplate {

    public Label getMensajeL() {
		return mensajeL;
	}

	public void setMensajeL(Label mensajeL) {
		this.mensajeL = mensajeL;
	}

	public Button getConfirmarB() {
		return confirmarB;
	}

	public void setConfirmarB(Button confirmarB) {
		this.confirmarB = confirmarB;
	}

	public Button getCancelarB() {
		return cancelarB;
	}

	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}

	@Id("mensajeL")
	private Label mensajeL;
	@Id("confirmarB")
	private Button confirmarB;
	@Id("cancelarB")
	private Button cancelarB;

	/**
     * Creates a new VistaDarse_de_baja.
     */
    public VistaDarse_de_baja() {
        // You can initialise any data required for the connected UI components here.
    }

}
