package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-ver_lista_seguidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_lista_seguidos")
@JsModule("./src/vistas/vista-ver_lista_seguidos.ts")
public class VistaVer_lista_seguidos extends LitTemplate {

    public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Scroller getNavegacionSB() {
		return navegacionSB;
	}

	public void setNavegacionSB(Scroller navegacionSB) {
		this.navegacionSB = navegacionSB;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("navegacionSB")
	private Scroller navegacionSB;

	/**
     * Creates a new VistaVer_lista_seguidos.
     */
    public VistaVer_lista_seguidos() {
        // You can initialise any data required for the connected UI components here.
    }

}
