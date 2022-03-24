package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver_lista_de_reproduccion_propia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_lista_de_reproduccion_propia")
@JsModule("./src/vistas/vista-ver_lista_de_reproduccion_propia.ts")
public class VistaVer_lista_de_reproduccion_propia extends LitTemplate {

    public Label getEditarL() {
		return editarL;
	}

	public void setEditarL(Label editarL) {
		this.editarL = editarL;
	}

	public Button getEditarB() {
		return editarB;
	}

	public void setEditarB(Button editarB) {
		this.editarB = editarB;
	}

	@Id("editarL")
	private Label editarL;
	@Id("editarB")
	private Button editarB;

	/**
     * Creates a new VistaVer_lista_de_reproduccion_propia.
     */
    public VistaVer_lista_de_reproduccion_propia() {
        // You can initialise any data required for the connected UI components here.
    }

}
