package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-canciones_en_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_en_album")
@JsModule("./src/vistas/vista-canciones_en_album.ts")
public class VistaCanciones_en_album extends LitTemplate {

    public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public TextField getAniadirCancionTF() {
		return aniadirCancionTF;
	}

	public void setAniadirCancionTF(TextField aniadirCancionTF) {
		this.aniadirCancionTF = aniadirCancionTF;
	}

	public Button getAniadirCancionB() {
		return aniadirCancionB;
	}

	public void setAniadirCancionB(Button aniadirCancionB) {
		this.aniadirCancionB = aniadirCancionB;
	}

	public Button getAnteriorB() {
		return anteriorB;
	}

	public void setAnteriorB(Button anteriorB) {
		this.anteriorB = anteriorB;
	}

	public Element getVistaCancion_album() {
		return vistaCancion_album;
	}

	public void setVistaCancion_album(Element vistaCancion_album) {
		this.vistaCancion_album = vistaCancion_album;
	}

	public Button getPosteriorB() {
		return posteriorB;
	}

	public void setPosteriorB(Button posteriorB) {
		this.posteriorB = posteriorB;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("aniadirCancionTF")
	private TextField aniadirCancionTF;
	@Id("aniadirCancionB")
	private Button aniadirCancionB;
	@Id("anteriorB")
	private Button anteriorB;
	@Id("vistaCancion_album")
	private Element vistaCancion_album;
	@Id("posteriorB")
	private Button posteriorB;

	/**
     * Creates a new VistaCanciones_en_album.
     */
    public VistaCanciones_en_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
