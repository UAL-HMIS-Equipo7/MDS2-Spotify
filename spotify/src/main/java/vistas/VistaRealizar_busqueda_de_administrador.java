package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-realizar_busqueda_de_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-realizar_busqueda_de_administrador")
@JsModule("./src/vistas/vista-realizar_busqueda_de_administrador.ts")
public class VistaRealizar_busqueda_de_administrador extends LitTemplate {

    public HorizontalLayout getContenedorSuperior() {
		return contenedorSuperior;
	}

	public void setContenedorSuperior(HorizontalLayout contenedorSuperior) {
		this.contenedorSuperior = contenedorSuperior;
	}

	public HorizontalLayout getContenedorInferior() {
		return contenedorInferior;
	}

	public void setContenedorInferior(HorizontalLayout contenedorInferior) {
		this.contenedorInferior = contenedorInferior;
	}

	public Button getAtrasB() {
		return atrasB;
	}

	public void setAtrasB(Button atrasB) {
		this.atrasB = atrasB;
	}

	public Label getErrorL() {
		return errorL;
	}

	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}

	@Id("atrasB")
	private Button atrasB;
	@Id("errorL")
	private Label errorL;
	@Id("contenedorSuperior")
	private HorizontalLayout contenedorSuperior;
	@Id("contenedorInferior")
	private HorizontalLayout contenedorInferior;

	/**
     * Creates a new VistaRealizar_busqueda_de_administrador.
     */
    public VistaRealizar_busqueda_de_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
