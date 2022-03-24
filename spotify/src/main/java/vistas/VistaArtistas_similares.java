package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-artistas_similares template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas_similares")
@JsModule("./src/vistas/vista-artistas_similares.ts")
public class VistaArtistas_similares extends LitTemplate {

    @Id("label")
	private Label label;
	@Id("navegacionSB")
	private Scroller navegacionSB;

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

	/**
     * Creates a new VistaArtistas_similares.
     */
    public VistaArtistas_similares() {
        // You can initialise any data required for the connected UI components here.
    }

}
