package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-ver_perfil_ajeno template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_perfil_ajeno")
@JsModule("./src/vistas/vista-ver_perfil_ajeno.ts")
public class VistaVer_perfil_ajeno extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getFotoImg() {
		return fotoImg;
	}

	public void setFotoImg(Image fotoImg) {
		this.fotoImg = fotoImg;
	}

	public Label getEmailL() {
		return emailL;
	}

	public void setEmailL(Label emailL) {
		this.emailL = emailL;
	}

	public Label getNickL() {
		return nickL;
	}

	public void setNickL(Label nickL) {
		this.nickL = nickL;
	}

	public Button getSeguirB() {
		return seguirB;
	}

	public void setSeguirB(Button seguirB) {
		this.seguirB = seguirB;
	}

	public Label getSeguidoresL() {
		return seguidoresL;
	}

	public void setSeguidoresL(Label seguidoresL) {
		this.seguidoresL = seguidoresL;
	}

	public Label getSeguidosL() {
		return seguidosL;
	}

	public void setSeguidosL(Label seguidosL) {
		this.seguidosL = seguidosL;
	}

	@Id("fotoImg")
	private Image fotoImg;
	@Id("emailL")
	private Label emailL;
	@Id("nickL")
	private Label nickL;
	@Id("seguirB")
	private Button seguirB;
	@Id("seguidoresL")
	private Label seguidoresL;
	@Id("seguidosL")
	private Label seguidosL;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaVer_perfil_ajeno.
     */
    public VistaVer_perfil_ajeno() {
        // You can initialise any data required for the connected UI components here.
    }

}
