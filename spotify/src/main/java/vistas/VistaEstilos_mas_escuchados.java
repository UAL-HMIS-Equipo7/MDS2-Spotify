package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-estilos_mas_escuchados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estilos_mas_escuchados")
@JsModule("./src/vistas/vista-estilos_mas_escuchados.ts")
public class VistaEstilos_mas_escuchados extends LitTemplate {

    public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

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

	@Id("tituloL")
	private Label tituloL;
	@Id("contenedorSuperior")
	private HorizontalLayout contenedorSuperior;
	@Id("contenedorInferior")
	private HorizontalLayout contenedorInferior;

	/**
     * Creates a new VistaEstilos_mas_escuchados.
     */
    public VistaEstilos_mas_escuchados() {
        // You can initialise any data required for the connected UI components here.
    }

}
