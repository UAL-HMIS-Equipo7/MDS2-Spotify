package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-contactar_con_la_empresa template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contactar_con_la_empresa")
@JsModule("./src/vistas/vista-contactar_con_la_empresa.ts")
public class VistaContactar_con_la_empresa extends LitTemplate {

    public Label getSoporteL() {
		return soporteL;
	}

	public void setSoporteL(Label soporteL) {
		this.soporteL = soporteL;
	}

	public Label getAsuntoL() {
		return asuntoL;
	}

	public void setAsuntoL(Label asuntoL) {
		this.asuntoL = asuntoL;
	}

	public TextField getAsuntoTF() {
		return asuntoTF;
	}

	public void setAsuntoTF(TextField asuntoTF) {
		this.asuntoTF = asuntoTF;
	}

	public Label getIncidenciaL() {
		return incidenciaL;
	}

	public void setIncidenciaL(Label incidenciaL) {
		this.incidenciaL = incidenciaL;
	}

	public TextField getIncidenciaTF() {
		return incidenciaTF;
	}

	public void setIncidenciaTF(TextField incidenciaTF) {
		this.incidenciaTF = incidenciaTF;
	}

	public Button getEnviarB() {
		return enviarB;
	}

	public void setEnviarB(Button enviarB) {
		this.enviarB = enviarB;
	}

	public Button getCancelarB() {
		return cancelarB;
	}

	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}

	@Id("soporteL")
	private Label soporteL;
	@Id("asuntoL")
	private Label asuntoL;
	@Id("asuntoTF")
	private TextField asuntoTF;
	@Id("incidenciaL")
	private Label incidenciaL;
	@Id("incidenciaTF")
	private TextField incidenciaTF;
	@Id("enviarB")
	private Button enviarB;
	@Id("cancelarB")
	private Button cancelarB;

	/**
     * Creates a new VistaContactar_con_la_empresa.
     */
    public VistaContactar_con_la_empresa() {
        // You can initialise any data required for the connected UI components here.
    }

}
