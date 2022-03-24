package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-recuperar_contrasenia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperar_contrasenia")
@JsModule("./src/vistas/vista-recuperar_contrasenia.ts")
public class VistaRecuperar_contrasenia extends LitTemplate {

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

	public Label getCorreoL() {
		return correoL;
	}

	public void setCorreoL(Label correoL) {
		this.correoL = correoL;
	}

	public TextField getCorreoTF() {
		return correoTF;
	}

	public void setCorreoTF(TextField correoTF) {
		this.correoTF = correoTF;
	}

	public Button getConfirmarB() {
		return confirmarB;
	}

	public void setConfirmarB(Button confirmarB) {
		this.confirmarB = confirmarB;
	}

	@Id("atrasB")
	private Button atrasB;
	@Id("tituloL")
	private Label tituloL;
	@Id("correoL")
	private Label correoL;
	@Id("correoTF")
	private TextField correoTF;
	@Id("confirmarB")
	private Button confirmarB;

	/**
     * Creates a new VistaRecuperar_contrasenia.
     */
    public VistaRecuperar_contrasenia() {
        // You can initialise any data required for the connected UI components here.
    }

}
