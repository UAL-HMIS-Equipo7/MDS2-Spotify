package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-resultados_artistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-resultados_artistas")
@JsModule("./src/vistas/vista-resultados_artistas.ts")
public class VistaResultados_artistas extends LitTemplate {

    public HorizontalLayout getContenedorInferior() {
		return contenedorInferior;
	}

	public void setContenedorInferior(HorizontalLayout contenedorInferior) {
		this.contenedorInferior = contenedorInferior;
	}

	public HorizontalLayout getContenedorSuperior() {
		return contenedorSuperior;
	}

	public void setContenedorSuperior(HorizontalLayout contenedorSuperior) {
		this.contenedorSuperior = contenedorSuperior;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	

	@Id("tituloL")
	private Label tituloL;
	@Id("contenedorInferior")
	private HorizontalLayout contenedorInferior;
	@Id("contenedorSuperior")
	private HorizontalLayout contenedorSuperior;

	/**
     * Creates a new VistaResultados_artistas.
     */
    public VistaResultados_artistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
