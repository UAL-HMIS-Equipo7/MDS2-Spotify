package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-evento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-evento")
@JsModule("./src/vistas/vista-evento.ts")
public class VistaEvento extends LitTemplate {

    public Image getFotoEventoImg() {
		return fotoEventoImg;
	}

	public void setFotoEventoImg(Image fotoEventoImg) {
		this.fotoEventoImg = fotoEventoImg;
	}

	public Label getNombreL() {
		return nombreL;
	}

	public void setNombreL(Label nombreL) {
		this.nombreL = nombreL;
	}

	@Id("fotoEventoImg")
	private Image fotoEventoImg;
	@Id("nombreL")
	private Label nombreL;

	/**
     * Creates a new VistaEvento.
     */
    public VistaEvento() {
        // You can initialise any data required for the connected UI components here.
    }

}
