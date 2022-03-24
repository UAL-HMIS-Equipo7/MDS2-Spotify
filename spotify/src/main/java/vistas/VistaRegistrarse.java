package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vistas/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

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

	public Image getNickImg() {
		return nickImg;
	}

	public void setNickImg(Image nickImg) {
		this.nickImg = nickImg;
	}

	public TextField getNickTF() {
		return nickTF;
	}

	public void setNickTF(TextField nickTF) {
		this.nickTF = nickTF;
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

	public Image getFotoImg() {
		return fotoImg;
	}

	public void setFotoImg(Image fotoImg) {
		this.fotoImg = fotoImg;
	}

	public Button getFotoFC() {
		return fotoFC;
	}

	public void setFotoFC(Button fotoFC) {
		this.fotoFC = fotoFC;
	}

	public Label getOpcionalL() {
		return opcionalL;
	}

	public void setOpcionalL(Label opcionalL) {
		this.opcionalL = opcionalL;
	}

	public Element getIniciarSesionB() {
		return iniciarSesionB;
	}

	public void setIniciarSesionB(Element iniciarSesionB) {
		this.iniciarSesionB = iniciarSesionB;
	}

	public Label getErrorL() {
		return errorL;
	}

	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}

	public Button getRegistrarseB() {
		return registrarseB;
	}

	public void setRegistrarseB(Button registrarseB) {
		this.registrarseB = registrarseB;
	}

	@Id("atrasB")
	private Button atrasB;
	@Id("tituloL")
	private Label tituloL;
	@Id("emailImg")
	private Image emailImg;
	@Id("emailTF")
	private TextField emailTF;
	@Id("nickImg")
	private Image nickImg;
	@Id("nickTF")
	private TextField nickTF;
	@Id("contraseniaImg")
	private Image contraseniaImg;
	@Id("contraseniaTF")
	private TextField contraseniaTF;
	@Id("repiteContraseniaTF")
	private TextField repiteContraseniaTF;
	@Id("fotoImg")
	private Image fotoImg;
	@Id("fotoFC")
	private Button fotoFC;
	@Id("opcionalL")
	private Label opcionalL;
	@Id("iniciarSesionB")
	private Element iniciarSesionB;
	@Id("errorL")
	private Label errorL;
	@Id("RegistrarseB")
	private Button registrarseB;

	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

}
