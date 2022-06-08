package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion")
@JsModule("./src/vistas/vista-cancion.ts")
public class VistaCancion extends LitTemplate {

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public HorizontalLayout getCancionImgLayout() {
		return cancionImgLayout;
	}

	public void setCancionImgLayout(HorizontalLayout cancionImgLayout) {
		this.cancionImgLayout = cancionImgLayout;
	}

	public Button getTituloB() {
		return tituloB;
	}

	public void setTituloB(Button tituloB) {
		this.tituloB = tituloB;
	}

	@Id("tituloB")
	private Button tituloB;
	@Id("cancionImgLayout")
	private HorizontalLayout cancionImgLayout;
	@Id("tituloL")
	private Label tituloL;

	/**
     * Creates a new VistaCancion.
     */
    public VistaCancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
