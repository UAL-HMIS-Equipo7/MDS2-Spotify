package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_propia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_propia")
@JsModule("./src/vistas/vista-lista_de_reproduccion_propia.ts")
public class VistaLista_de_reproduccion_propia extends LitTemplate {

    public Element getContenedor() {
		return contenedor;
	}

	public void setContenedor(Element contenedor) {
		this.contenedor = contenedor;
	}

	@Id("contenedor")
	private Element contenedor;

	/**
     * Creates a new VistaLista_de_reproduccion_propia.
     */
    public VistaLista_de_reproduccion_propia() {
        // You can initialise any data required for the connected UI components here.
    }

}
