package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cancion_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_album")
@JsModule("./src/vistas/vista-cancion_album.ts")
public class VistaCancion_album extends LitTemplate {

    public Image getFotoImg() {
		return fotoImg;
	}

	public void setFotoImg(Image fotoImg) {
		this.fotoImg = fotoImg;
	}

	public Button getEliminarB() {
		return eliminarB;
	}

	public void setEliminarB(Button eliminarB) {
		this.eliminarB = eliminarB;
	}

	@Id("fotoImg")
	private Image fotoImg;
	@Id("eliminarB")
	private Button eliminarB;

	/**
     * Creates a new VistaCancion_album.
     */
    public VistaCancion_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
