package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-edicion_y_creacion_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-edicion_y_creacion_artista")
@JsModule("./src/vistas/vista-edicion_y_creacion_artista.ts")
public class VistaEdicion_y_creacion_artista extends LitTemplate {

    public HorizontalLayout getFotoImgLayout() {
		return fotoImgLayout;
	}

	public void setFotoImgLayout(HorizontalLayout fotoImgLayout) {
		this.fotoImgLayout = fotoImgLayout;
	}

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

	public TextField getContraseniaTF() {
		return contraseniaTF;
	}

	public void setContraseniaTF(TextField contraseniaTF) {
		this.contraseniaTF = contraseniaTF;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Label getEstiloL() {
		return estiloL;
	}

	public void setEstiloL(Label estiloL) {
		this.estiloL = estiloL;
	}

	public ComboBox<String> getEstiloCB() {
		return estiloCB;
	}

	public void setEstiloCB(ComboBox<String> estiloCB) {
		this.estiloCB = estiloCB;
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
	@Id("contraseniaTF")
	private TextField contraseniaTF;
	@Id("label")
	private Label label;
	@Id("estiloL")
	private Label estiloL;
	@Id("estiloCB")
	private ComboBox<String> estiloCB;
	@Id("guardarB")
	private Button guardarB;
	@Id("cancelarB")
	private Button cancelarB;
	@Id("fotoImgLayout")
	private HorizontalLayout fotoImgLayout;

	/**
     * Creates a new VistaEdicion_y_creacion_artista.
     */
    public VistaEdicion_y_creacion_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
