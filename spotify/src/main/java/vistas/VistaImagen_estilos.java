package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-imagen_estilos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-imagen_estilos")
@JsModule("./src/vistas/vista-imagen_estilos.ts")
public class VistaImagen_estilos extends LitTemplate {

    public Image getEstiloImg() {
		return estiloImg;
	}

	public void setEstiloImg(Image estiloImg) {
		this.estiloImg = estiloImg;
	}

	@Id("estiloImg")
	private Image estiloImg;

	/**
     * Creates a new VistaImagen_estilos.
     */
    public VistaImagen_estilos() {
        // You can initialise any data required for the connected UI components here.
    }

}
