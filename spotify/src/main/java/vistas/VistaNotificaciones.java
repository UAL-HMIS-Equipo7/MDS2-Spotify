package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-notificaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones")
@JsModule("./src/vistas/vista-notificaciones.ts")
public class VistaNotificaciones extends LitTemplate {

    

	public Scroller getNavegacionSB() {
		return navegacionSB;
	}

	public void setNavegacionSB(Scroller navegacionSB) {
		this.navegacionSB = navegacionSB;
	}

	@Id("navegacionSB")
	private Scroller navegacionSB;

	/**
     * Creates a new VistaNotificaciones.
     */
    public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
