package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-confirmacion_de_correo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-confirmacion_de_correo")
@JsModule("./src/vistas/vista-confirmacion_de_correo.ts")
public class VistaConfirmacion_de_correo extends LitTemplate {

    public Button getAtrasB() {
		return atrasB;
	}

	public void setAtrasB(Button atrasB) {
		this.atrasB = atrasB;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public TextField getCodigoTF() {
		return codigoTF;
	}

	public void setCodigoTF(TextField codigoTF) {
		this.codigoTF = codigoTF;
	}

	public Label getErrorL() {
		return errorL;
	}

	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}

	public Button getConfirmarB() {
		return confirmarB;
	}

	public void setConfirmarB(Button confirmarB) {
		this.confirmarB = confirmarB;
	}

	public Button getReenviarB() {
		return reenviarB;
	}

	public void setReenviarB(Button reenviarB) {
		this.reenviarB = reenviarB;
	}

	@Id("atrasB")
	private Button atrasB;
	@Id("tituloL")
	private Label tituloL;
	@Id("codigoTF")
	private TextField codigoTF;
	@Id("errorL")
	private Label errorL;
	@Id("confirmarB")
	private Button confirmarB;
	@Id("reenviarB")
	private Button reenviarB;

	/**
     * Creates a new VistaConfirmacion_de_correo.
     */
    public VistaConfirmacion_de_correo() {
        // You can initialise any data required for the connected UI components here.
    }

}
