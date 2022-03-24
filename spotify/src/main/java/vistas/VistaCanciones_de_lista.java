package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-canciones_de_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_de_lista")
@JsModule("./src/vistas/vista-canciones_de_lista.ts")
public class VistaCanciones_de_lista extends LitTemplate {

    public Label getTituloPanelL() {
		return tituloPanelL;
	}

	public void setTituloPanelL(Label tituloPanelL) {
		this.tituloPanelL = tituloPanelL;
	}

	@Id("tituloPanelL")
	private Label tituloPanelL;

	/**
     * Creates a new VistaCanciones_de_lista.
     */
    public VistaCanciones_de_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
