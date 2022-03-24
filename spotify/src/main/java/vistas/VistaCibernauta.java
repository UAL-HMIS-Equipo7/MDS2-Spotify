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
 * A Designer generated component for the vista-cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta")
@JsModule("./src/vistas/vista-cibernauta.ts")
public class VistaCibernauta extends LitTemplate {

    public Image getFotoImg() {
		return fotoImg;
	}

	public void setFotoImg(Image fotoImg) {
		this.fotoImg = fotoImg;
	}

	public Label getNombreAppL() {
		return nombreAppL;
	}

	public void setNombreAppL(Label nombreAppL) {
		this.nombreAppL = nombreAppL;
	}

	public Button getIniciarSesionB() {
		return iniciarSesionB;
	}

	public void setIniciarSesionB(Button iniciarSesionB) {
		this.iniciarSesionB = iniciarSesionB;
	}

	public Element getVistaCanciones_ultimos_exitos() {
		return vistaCanciones_ultimos_exitos;
	}

	public void setVistaCanciones_ultimos_exitos(Element vistaCanciones_ultimos_exitos) {
		this.vistaCanciones_ultimos_exitos = vistaCanciones_ultimos_exitos;
	}

	@Id("fotoImg")
	private Image fotoImg;
	@Id("nombreAppL")
	private Label nombreAppL;
	@Id("iniciarSesionB")
	private Button iniciarSesionB;
	@Id("vistaCanciones_ultimos_exitos")
	private Element vistaCanciones_ultimos_exitos;

	/**
     * Creates a new VistaCibernauta.
     */
    public VistaCibernauta() {
        // You can initialise any data required for the connected UI components here.
    }

}
