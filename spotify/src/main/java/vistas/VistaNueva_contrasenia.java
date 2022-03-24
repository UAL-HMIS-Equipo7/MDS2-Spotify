package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-nueva_contrasenia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nueva_contrasenia")
@JsModule("./src/vistas/vista-nueva_contrasenia.ts")
public class VistaNueva_contrasenia extends LitTemplate {

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

	public Image getContraseniaImg() {
		return contraseniaImg;
	}

	public void setContraseniaImg(Image contraseniaImg) {
		this.contraseniaImg = contraseniaImg;
	}

	public TextField getContraseniaTF() {
		return contraseniaTF;
	}

	public void setContraseniaTF(TextField contraseniaTF) {
		this.contraseniaTF = contraseniaTF;
	}

	public TextField getRepiteContraseniaTF() {
		return repiteContraseniaTF;
	}

	public void setRepiteContraseniaTF(TextField repiteContraseniaTF) {
		this.repiteContraseniaTF = repiteContraseniaTF;
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

	@Id("atrasB")
	private Button atrasB;
	@Id("tituloL")
	private Label tituloL;
	@Id("contraseniaImg")
	private Image contraseniaImg;
	@Id("contraseniaTF")
	private TextField contraseniaTF;
	@Id("repiteContraseniaTF")
	private TextField repiteContraseniaTF;
	@Id("errorL")
	private Label errorL;
	@Id("confirmarB")
	private Button confirmarB;

	/**
     * Creates a new VistaNueva_contrasenia.
     */
    public VistaNueva_contrasenia() {
        // You can initialise any data required for the connected UI components here.
    }

}
