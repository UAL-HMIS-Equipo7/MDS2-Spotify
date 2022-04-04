package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-realizar_busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-realizar_busqueda")
@JsModule("./src/vistas/vista-realizar_busqueda.ts")
public class VistaRealizar_busqueda extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getMensajeL() {
		return mensajeL;
	}

	public void setMensajeL(Label mensajeL) {
		this.mensajeL = mensajeL;
	}

	public Label getErrorL() {
		return errorL;
	}

	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	@Id("mensajeL")
	private Label mensajeL;
	@Id("errorL")
	private Label errorL;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaRealizar_busqueda.
     */
    public VistaRealizar_busqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}
