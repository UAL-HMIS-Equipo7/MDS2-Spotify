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
 * A Designer generated component for the vista-ver_evento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_evento")
@JsModule("./src/vistas/vista-ver_evento.ts")
public class VistaVer_evento extends LitTemplate {

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

	public Image getFotoEventoImg() {
		return fotoEventoImg;
	}

	public void setFotoEventoImg(Image fotoEventoImg) {
		this.fotoEventoImg = fotoEventoImg;
	}

	public Label getFechaHoraL() {
		return fechaHoraL;
	}

	public void setFechaHoraL(Label fechaHoraL) {
		this.fechaHoraL = fechaHoraL;
	}

	public Label getDescripcionTItuloL() {
		return descripcionTItuloL;
	}

	public void setDescripcionTItuloL(Label descripcionTItuloL) {
		this.descripcionTItuloL = descripcionTItuloL;
	}

	public TextField getDescripcionTF() {
		return descripcionTF;
	}

	public void setDescripcionTF(TextField descripcionTF) {
		this.descripcionTF = descripcionTF;
	}

	public Label getPrecioL() {
		return precioL;
	}

	public void setPrecioL(Label precioL) {
		this.precioL = precioL;
	}


	@Id("tituloL")
	private Label tituloL;
	@Id("fotoEventoImg")
	private Image fotoEventoImg;
	@Id("fechaHoraL")
	private Label fechaHoraL;
	@Id("descripcionTItuloL")
	private Label descripcionTItuloL;
	@Id("descripcionTF")
	private TextField descripcionTF;
	@Id("precioL")
	private Label precioL;
	@Id("atrasB")
	private Button atrasB;

	/**
     * Creates a new VistaVer_evento.
     */
    public VistaVer_evento() {
        // You can initialise any data required for the connected UI components here.
    }

}
