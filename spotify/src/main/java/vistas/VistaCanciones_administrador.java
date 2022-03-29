package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-canciones_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_administrador")
@JsModule("./src/vistas/vista-canciones_administrador.ts")
public class VistaCanciones_administrador extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Scroller getNavegacionSB() {
		return navegacionSB;
	}

	public void setNavegacionSB(Scroller navegacionSB) {
		this.navegacionSB = navegacionSB;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("navegacionSB")
	private Scroller navegacionSB;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaCanciones_administrador.
     */
    public VistaCanciones_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
