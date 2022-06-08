package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-aniadir_informacion_de_eventos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-aniadir_informacion_de_eventos")
@JsModule("./src/vistas/vista-aniadir_informacion_de_eventos.ts")
public class VistaAniadir_informacion_de_eventos extends LitTemplate {

    public HorizontalLayout getImagenImgLayout() {
		return imagenImgLayout;
	}

	public void setImagenImgLayout(HorizontalLayout imagenImgLayout) {
		this.imagenImgLayout = imagenImgLayout;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("elegirImagenFC")
	private Button elegirImagenFC;
	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Button getElegirImagenFC() {
		return elegirImagenFC;
	}

	public void setElegirImagenFC(Button elegirImagenFC) {
		this.elegirImagenFC = elegirImagenFC;
	}

	public TextField getFechaHoraTF() {
		return fechaHoraTF;
	}

	public void setFechaHoraTF(TextField fechaHoraTF) {
		this.fechaHoraTF = fechaHoraTF;
	}

	public Label getDescripcionL() {
		return descripcionL;
	}

	public void setDescripcionL(Label descripcionL) {
		this.descripcionL = descripcionL;
	}

	public TextArea getVaadinTextArea() {
		return vaadinTextArea;
	}

	public void setVaadinTextArea(TextArea vaadinTextArea) {
		this.vaadinTextArea = vaadinTextArea;
	}

	public Label getPrecioL() {
		return precioL;
	}

	public void setPrecioL(Label precioL) {
		this.precioL = precioL;
	}

	public TextField getPrecioTF() {
		return precioTF;
	}

	public void setPrecioTF(TextField precioTF) {
		this.precioTF = precioTF;
	}

	public Button getConfirmarB() {
		return confirmarB;
	}

	public void setConfirmarB(Button confirmarB) {
		this.confirmarB = confirmarB;
	}

	public Button getCancelarB() {
		return cancelarB;
	}

	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}

	@Id("fechaHoraTF")
	private TextField fechaHoraTF;
	@Id("descripcionL")
	private Label descripcionL;
	@Id("vaadinTextArea")
	private TextArea vaadinTextArea;
	@Id("precioL")
	private Label precioL;
	@Id("precioTF")
	private TextField precioTF;
	@Id("confirmarB")
	private Button confirmarB;
	@Id("cancelarB")
	private Button cancelarB;
	@Id("imagenImgLayout")
	private HorizontalLayout imagenImgLayout;

	/**
     * Creates a new VistaAniadir_informacion_de_eventos.
     */
    public VistaAniadir_informacion_de_eventos() {
        // You can initialise any data required for the connected UI components here.
    }

}
