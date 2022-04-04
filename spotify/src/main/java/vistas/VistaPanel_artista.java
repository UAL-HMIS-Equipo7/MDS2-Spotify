package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-panel_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-panel_artista")
@JsModule("./src/vistas/vista-panel_artista.ts")
public class VistaPanel_artista extends LitTemplate {

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

	public Label getEstiloL() {
		return estiloL;
	}

	public void setEstiloL(Label estiloL) {
		this.estiloL = estiloL;
	}

	

	@Id("estiloL")
	private Label estiloL;
	@Id("contenedorSuperior")
	private HorizontalLayout contenedorSuperior;
	@Id("contenedorInferior")
	private HorizontalLayout contenedorInferior;

	/**
     * Creates a new VistaPanel_artista.
     */
    public VistaPanel_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
