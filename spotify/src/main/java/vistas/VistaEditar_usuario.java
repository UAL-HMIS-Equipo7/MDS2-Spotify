package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-editar_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_usuario")
@JsModule("./src/vistas/vista-editar_usuario.ts")
public class VistaEditar_usuario extends LitTemplate {

    public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Label getErrorL() {
		return errorL;
	}

	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}

	public Image getFotoImg() {
		return fotoImg;
	}

	public void setFotoImg(Image fotoImg) {
		this.fotoImg = fotoImg;
	}

	public Button getElegirFotoB() {
		return elegirFotoB;
	}

	public void setElegirFotoB(Button elegirFotoB) {
		this.elegirFotoB = elegirFotoB;
	}

	public Label getEmailL() {
		return emailL;
	}

	public void setEmailL(Label emailL) {
		this.emailL = emailL;
	}

	public TextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(TextField emailTF) {
		this.emailTF = emailTF;
	}

	public Label getNickL() {
		return nickL;
	}

	public void setNickL(Label nickL) {
		this.nickL = nickL;
	}

	public TextField getNickTF() {
		return nickTF;
	}

	public void setNickTF(TextField nickTF) {
		this.nickTF = nickTF;
	}

	public Label getContraseniaL() {
		return contraseniaL;
	}

	public void setContraseniaL(Label contraseniaL) {
		this.contraseniaL = contraseniaL;
	}

	public TextField getContraseniaTF() {
		return contraseniaTF;
	}

	public void setContraseniaTF(TextField contraseniaTF) {
		this.contraseniaTF = contraseniaTF;
	}

	public Button getGuardarB() {
		return guardarB;
	}

	public void setGuardarB(Button guardarB) {
		this.guardarB = guardarB;
	}

	public Button getCancelarB() {
		return cancelarB;
	}

	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("errorL")
	private Label errorL;
	@Id("fotoImg")
	private Image fotoImg;
	@Id("elegirFotoB")
	private Button elegirFotoB;
	@Id("emailL")
	private Label emailL;
	@Id("emailTF")
	private TextField emailTF;
	@Id("nickL")
	private Label nickL;
	@Id("nickTF")
	private TextField nickTF;
	@Id("contraseniaL")
	private Label contraseniaL;
	@Id("contraseniaTF")
	private TextField contraseniaTF;
	@Id("guardarB")
	private Button guardarB;
	@Id("cancelarB")
	private Button cancelarB;

	/**
     * Creates a new VistaEditar_usuario.
     */
    public VistaEditar_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
