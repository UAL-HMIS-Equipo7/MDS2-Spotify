package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-album")
@JsModule("./src/vistas/vista-album.ts")
public class VistaAlbum extends LitTemplate {

    @Id("fotoB")
	private Image fotoB;

	public Image getFotoB() {
		return fotoB;
	}

	public void setFotoB(Image fotoB) {
		this.fotoB = fotoB;
	}

	/**
     * Creates a new VistaAlbum.
     */
    public VistaAlbum() {
        // You can initialise any data required for the connected UI components here.
    }

}
