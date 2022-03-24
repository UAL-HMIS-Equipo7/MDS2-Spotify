package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion")
@JsModule("./src/vistas/vista-iniciar_sesion.ts")
public class VistaIniciar_sesion extends LitTemplate {

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

	public Image getEmailImg() {
		return emailImg;
	}

	public void setEmailImg(Image emailImg) {
		this.emailImg = emailImg;
	}

	public TextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(TextField emailTF) {
		this.emailTF = emailTF;
	}

	public PasswordField getVaadinPasswordField() {
		return vaadinPasswordField;
	}

	public void setVaadinPasswordField(PasswordField vaadinPasswordField) {
		this.vaadinPasswordField = vaadinPasswordField;
	}

	public Image getContraseniaImg() {
		return contraseniaImg;
	}

	public void setContraseniaImg(Image contraseniaImg) {
		this.contraseniaImg = contraseniaImg;
	}

	public Button getGoogleB() {
		return googleB;
	}

	public void setGoogleB(Button googleB) {
		this.googleB = googleB;
	}

	public Button getMicrosoftB() {
		return microsoftB;
	}

	public void setMicrosoftB(Button microsoftB) {
		this.microsoftB = microsoftB;
	}

	public Button getFacebookB() {
		return facebookB;
	}

	public void setFacebookB(Button facebookB) {
		this.facebookB = facebookB;
	}

	public Label getErrorL() {
		return errorL;
	}

	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}

	public Element getRecuperarContraseniaB() {
		return recuperarContraseniaB;
	}

	public void setRecuperarContraseniaB(Element recuperarContraseniaB) {
		this.recuperarContraseniaB = recuperarContraseniaB;
	}

	public Element getRegistrarseB() {
		return registrarseB;
	}

	public void setRegistrarseB(Element registrarseB) {
		this.registrarseB = registrarseB;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	@Id("atrasB")
	private Button atrasB;
	@Id("tituloL")
	private Label tituloL;
	@Id("emailImg")
	private Image emailImg;
	@Id("emailTF")
	private TextField emailTF;
	@Id("vaadinPasswordField")
	private PasswordField vaadinPasswordField;
	@Id("contraseniaImg")
	private Image contraseniaImg;
	@Id("googleB")
	private Button googleB;
	@Id("microsoftB")
	private Button microsoftB;
	@Id("facebookB")
	private Button facebookB;
	@Id("errorL")
	private Label errorL;
	@Id("recuperarContraseniaB")
	private Element recuperarContraseniaB;
	@Id("registrarseB")
	private Element registrarseB;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaIniciar_sesion.
     */
    public VistaIniciar_sesion() {
        // You can initialise any data required for the connected UI components here.
    }

}
