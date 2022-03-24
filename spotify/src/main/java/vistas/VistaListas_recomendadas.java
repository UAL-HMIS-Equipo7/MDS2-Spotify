package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-listas_recomendadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_recomendadas")
@JsModule("./src/vistas/vista-listas_recomendadas.ts")
public class VistaListas_recomendadas extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaListas_recomendadas.
     */
    public VistaListas_recomendadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
