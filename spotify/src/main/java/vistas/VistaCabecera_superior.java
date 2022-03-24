package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cabecera_superior template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_superior")
@JsModule("./src/vistas/vista-cabecera_superior.ts")
public class VistaCabecera_superior extends LitTemplate {

    @Id("inicioB")
	private Image inicioB;
	@Id("telefonoL")
	private Label telefonoL;
	@Id("contactoB")
	private Element contactoB;
	@Id("buscarB")
	private Image buscarB;
	@Id("buscarTF")
	private TextField buscarTF;
	@Id("perfilImg")
	private Image perfilImg;
	@Id("verPerfilUsuarioB")
	private Button verPerfilUsuarioB;
	@Id("verPerfilArtistaB")
	private Button verPerfilArtistaB;
	public Image getInicioB() {
		return inicioB;
	}

	public void setInicioB(Image inicioB) {
		this.inicioB = inicioB;
	}

	public Label getTelefonoL() {
		return telefonoL;
	}

	public void setTelefonoL(Label telefonoL) {
		this.telefonoL = telefonoL;
	}

	public Element getContactoB() {
		return contactoB;
	}

	public void setContactoB(Element contactoB) {
		this.contactoB = contactoB;
	}

	public Image getBuscarB() {
		return buscarB;
	}

	public void setBuscarB(Image buscarB) {
		this.buscarB = buscarB;
	}

	public TextField getBuscarTF() {
		return buscarTF;
	}

	public void setBuscarTF(TextField buscarTF) {
		this.buscarTF = buscarTF;
	}

	public Image getPerfilImg() {
		return perfilImg;
	}

	public void setPerfilImg(Image perfilImg) {
		this.perfilImg = perfilImg;
	}

	public Button getVerPerfilUsuarioB() {
		return verPerfilUsuarioB;
	}

	public void setVerPerfilUsuarioB(Button verPerfilUsuarioB) {
		this.verPerfilUsuarioB = verPerfilUsuarioB;
	}

	public Button getVerPerfilArtistaB() {
		return verPerfilArtistaB;
	}

	public void setVerPerfilArtistaB(Button verPerfilArtistaB) {
		this.verPerfilArtistaB = verPerfilArtistaB;
	}

	public Button getVerPerfilAdministradorB() {
		return verPerfilAdministradorB;
	}

	public void setVerPerfilAdministradorB(Button verPerfilAdministradorB) {
		this.verPerfilAdministradorB = verPerfilAdministradorB;
	}

	public Button getCerrarSesionB() {
		return cerrarSesionB;
	}

	public void setCerrarSesionB(Button cerrarSesionB) {
		this.cerrarSesionB = cerrarSesionB;
	}

	@Id("verPerfilAdministradorB")
	private Button verPerfilAdministradorB;
	@Id("cerrarSesionB")
	private Button cerrarSesionB;

	/**
     * Creates a new VistaCabecera_superior.
     */
    public VistaCabecera_superior() {
        // You can initialise any data required for the connected UI components here.
    }

}
