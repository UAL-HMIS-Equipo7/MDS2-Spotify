package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-dar_de_alta_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar_de_alta_album")
@JsModule("./src/vistas/vista-dar_de_alta_album.ts")
public class VistaDar_de_alta_album extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaDar_de_alta_album.
     */
    public VistaDar_de_alta_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
