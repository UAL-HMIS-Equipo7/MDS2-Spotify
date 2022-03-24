package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-dar_de_alta_estilo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar_de_alta_estilo")
@JsModule("./src/vistas/vista-dar_de_alta_estilo.ts")
public class VistaDar_de_alta_estilo extends LitTemplate {

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

	public TextField getNombreTF() {
		return nombreTF;
	}

	public void setNombreTF(TextField nombreTF) {
		this.nombreTF = nombreTF;
	}

	public Label getNombreL() {
		return nombreL;
	}

	public void setNombreL(Label nombreL) {
		this.nombreL = nombreL;
	}

	public Label getDescripcionL() {
		return descripcionL;
	}

	public void setDescripcionL(Label descripcionL) {
		this.descripcionL = descripcionL;
	}

	public TextArea getDescripcionTF() {
		return descripcionTF;
	}

	public void setDescripcionTF(TextArea descripcionTF) {
		this.descripcionTF = descripcionTF;
	}

	public Button getGuardarB() {
		return guardarB;
	}

	public void setGuardarB(Button guardarB) {
		this.guardarB = guardarB;
	}

	public Button getCancelarL() {
		return cancelarL;
	}

	public void setCancelarL(Button cancelarL) {
		this.cancelarL = cancelarL;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("errorL")
	private Label errorL;
	@Id("nombreTF")
	private TextField nombreTF;
	@Id("nombreL")
	private Label nombreL;
	@Id("descripcionL")
	private Label descripcionL;
	@Id("descripcionTF")
	private TextArea descripcionTF;
	@Id("guardarB")
	private Button guardarB;
	@Id("cancelarL")
	private Button cancelarL;

	/**
     * Creates a new VistaDar_de_alta_estilo.
     */
    public VistaDar_de_alta_estilo() {
        // You can initialise any data required for the connected UI components here.
    }

}
