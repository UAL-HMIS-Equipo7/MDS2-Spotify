package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-ver_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_lista_de_reproduccion")
@JsModule("./src/vistas/vista-ver_lista_de_reproduccion.ts")
public class VistaVer_lista_de_reproduccion extends LitTemplate {

    public Button getCompartirB() {
		return compartirB;
	}

	public void setCompartirB(Button compartirB) {
		this.compartirB = compartirB;
	}

	public Button getSeguirB() {
		return seguirB;
	}

	public void setSeguirB(Button seguirB) {
		this.seguirB = seguirB;
	}

	public Label getInformacionL() {
		return informacionL;
	}

	public void setInformacionL(Label informacionL) {
		this.informacionL = informacionL;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Element getAutorB() {
		return autorB;
	}

	public void setAutorB(Element autorB) {
		this.autorB = autorB;
	}

	@Id("compartirB")
	private Button compartirB;
	@Id("seguirB")
	private Button seguirB;
	@Id("informacionL")
	private Label informacionL;
	@Id("tituloL")
	private Label tituloL;
	@Id("autorB")
	private Element autorB;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaVer_lista_de_reproduccion.
     */
    public VistaVer_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
