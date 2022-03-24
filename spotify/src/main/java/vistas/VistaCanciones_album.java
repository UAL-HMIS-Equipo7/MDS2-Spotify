package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-canciones_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_album")
@JsModule("./src/vistas/vista-canciones_album.ts")
public class VistaCanciones_album extends LitTemplate {

    public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Scroller getNavegacionSB() {
		return navegacionSB;
	}

	public void setNavegacionSB(Scroller navegacionSB) {
		this.navegacionSB = navegacionSB;
	}

	@Id("label")
	private Label label;
	@Id("navegacionSB")
	private Scroller navegacionSB;

	/**
     * Creates a new VistaCanciones_album.
     */
    public VistaCanciones_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
