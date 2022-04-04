package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-usuarios_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuarios_administrador")
@JsModule("./src/vistas/vista-usuarios_administrador.ts")
public class VistaUsuarios_administrador extends LitTemplate {

    public Scroller getNavegacionSB() {
		return navegacionSB;
	}

	public void setNavegacionSB(Scroller navegacionSB) {
		this.navegacionSB = navegacionSB;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("navegacionSB")
	private Scroller navegacionSB;
	/**
     * Creates a new VistaUsuarios_administrador.
     */
    public VistaUsuarios_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
