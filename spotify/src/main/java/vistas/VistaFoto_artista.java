package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-foto_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-foto_artista")
@JsModule("./src/vistas/vista-foto_artista.ts")
public class VistaFoto_artista extends LitTemplate {

	public HorizontalLayout getFotoImgLayout() {
		return fotoImgLayout;
	}

	public void setFotoImgLayout(HorizontalLayout fotoImgLayout) {
		this.fotoImgLayout = fotoImgLayout;
	}

	public Button getNickB() {
		return nickB;
	}

	public void setNickB(Button nickB) {
		this.nickB = nickB;
	}

	@Id("nickB")
	private Button nickB;
	@Id("fotoImgLayout")
	private HorizontalLayout fotoImgLayout;
	/**
     * Creates a new VistaFoto_artista.
     */
    public VistaFoto_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
