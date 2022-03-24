package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-menu_administracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_administracion")
@JsModule("./src/vistas/vista-menu_administracion.ts")
public class VistaMenu_administracion extends LitTemplate {

    public Button getBusquedaB() {
		return busquedaB;
	}

	public void setBusquedaB(Button busquedaB) {
		this.busquedaB = busquedaB;
	}

	public TextField getBusquedaTF() {
		return busquedaTF;
	}

	public void setBusquedaTF(TextField busquedaTF) {
		this.busquedaTF = busquedaTF;
	}

	public Button getDarAltaB() {
		return darAltaB;
	}

	public void setDarAltaB(Button darAltaB) {
		this.darAltaB = darAltaB;
	}

	public Label getNumCancionesMostradasL() {
		return numCancionesMostradasL;
	}

	public void setNumCancionesMostradasL(Label numCancionesMostradasL) {
		this.numCancionesMostradasL = numCancionesMostradasL;
	}

	public TextField getNumCancionesMostradasTF() {
		return numCancionesMostradasTF;
	}

	public void setNumCancionesMostradasTF(TextField numCancionesMostradasTF) {
		this.numCancionesMostradasTF = numCancionesMostradasTF;
	}

	public Label getLimiteCancionesReproduciblesL() {
		return limiteCancionesReproduciblesL;
	}

	public void setLimiteCancionesReproduciblesL(Label limiteCancionesReproduciblesL) {
		this.limiteCancionesReproduciblesL = limiteCancionesReproduciblesL;
	}

	public TextField getLimiteCancionesReproduciblesTF() {
		return limiteCancionesReproduciblesTF;
	}

	public void setLimiteCancionesReproduciblesTF(TextField limiteCancionesReproduciblesTF) {
		this.limiteCancionesReproduciblesTF = limiteCancionesReproduciblesTF;
	}

	@Id("busquedaB")
	private Button busquedaB;
	@Id("busquedaTF")
	private TextField busquedaTF;
	@Id("darAltaB")
	private Button darAltaB;
	@Id("numCancionesMostradasL")
	private Label numCancionesMostradasL;
	@Id("numCancionesMostradasTF")
	private TextField numCancionesMostradasTF;
	@Id("limiteCancionesReproduciblesL")
	private Label limiteCancionesReproduciblesL;
	@Id("limiteCancionesReproduciblesTF")
	private TextField limiteCancionesReproduciblesTF;

	/**
     * Creates a new VistaMenu_administracion.
     */
    public VistaMenu_administracion() {
        // You can initialise any data required for the connected UI components here.
    }

}
