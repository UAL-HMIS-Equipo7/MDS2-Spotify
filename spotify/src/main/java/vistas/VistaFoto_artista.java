package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-foto_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-foto_artista")
@JsModule("./src/vistas/vista-foto_artista.ts")
public class VistaFoto_artista extends LitTemplate {

    public Image getFotoB() {
		return fotoB;
	}

	public void setFotoB(Image fotoB) {
		this.fotoB = fotoB;
	}

	public Element getNickB() {
		return nickB;
	}

	public void setNickB(Element nickB) {
		this.nickB = nickB;
	}

	@Id("fotoB")
	private Image fotoB;
	@Id("nickB")
	private Element nickB;

	/**
     * Creates a new VistaFoto_artista.
     */
    public VistaFoto_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
