package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-canciones_a_modificar_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_a_modificar_lista")
@JsModule("./src/vistas/vista-canciones_a_modificar_lista.ts")
public class VistaCanciones_a_modificar_lista extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getAnteriorB() {
		return anteriorB;
	}

	public void setAnteriorB(Button anteriorB) {
		this.anteriorB = anteriorB;
	}

	public Button getPosteriorB() {
		return posteriorB;
	}

	public void setPosteriorB(Button posteriorB) {
		this.posteriorB = posteriorB;
	}

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

	@Id("aniadirCancionTF")
	private TextField aniadirCancionTF;
	@Id("aniadirCancionB")
	private Button aniadirCancionB;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("anteriorB")
	private Button anteriorB;
	@Id("posteriorB")
	private Button posteriorB;
	@Id("tituloL")
	private Label tituloL;
	/**
     * Creates a new VistaCanciones_a_modificar_lista.
     */
    public VistaCanciones_a_modificar_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
