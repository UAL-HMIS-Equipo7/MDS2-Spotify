package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-imagen_artistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-imagen_artistas")
@JsModule("./src/vistas/vista-imagen_artistas.ts")
public class VistaImagen_artistas extends LitTemplate {

    public Element getContenedor() {
		return contenedor;
	}

	public void setContenedor(Element contenedor) {
		this.contenedor = contenedor;
	}

	@Id("contenedor")
	private Element contenedor;

	/**
     * Creates a new VistaImagen_artistas.
     */
    public VistaImagen_artistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
