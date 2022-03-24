package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-confirmacion_eliminacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-confirmacion_eliminacion")
@JsModule("./src/vistas/vista-confirmacion_eliminacion.ts")
public class VistaConfirmacion_eliminacion extends LitTemplate {

    public Label getMensajeL() {
		return mensajeL;
	}

	public void setMensajeL(Label mensajeL) {
		this.mensajeL = mensajeL;
	}

	public Label getNombreElementoL() {
		return nombreElementoL;
	}

	public void setNombreElementoL(Label nombreElementoL) {
		this.nombreElementoL = nombreElementoL;
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
	@Id("nombreElementoL")
	private Label nombreElementoL;
	@Id("confirmarB")
	private Button confirmarB;
	@Id("cancelarB")
	private Button cancelarB;

	/**
     * Creates a new VistaConfirmacion_eliminacion.
     */
    public VistaConfirmacion_eliminacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
