package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-modificar_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar_lista_de_reproduccion")
@JsModule("./src/vistas/vista-modificar_lista_de_reproduccion.ts")
public class VistaModificar_lista_de_reproduccion extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Button getEliminarB2() {
		return eliminarB2;
	}
	public void setEliminarB2(Button eliminarB2) {
		this.eliminarB2 = eliminarB2;
	}
	@Id("eliminarB2")
	private Button eliminarB2;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	/**
     * Creates a new VistaModificar_lista_de_reproduccion.
     */
    public VistaModificar_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
