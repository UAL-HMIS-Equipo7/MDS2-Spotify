package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-ultimas_canciones_reproducidas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimas_canciones_reproducidas")
@JsModule("./src/vistas/vista-ultimas_canciones_reproducidas.ts")
public class VistaUltimas_canciones_reproducidas extends LitTemplate {

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
     * Creates a new VistaUltimas_canciones_reproducidas.
     */
    public VistaUltimas_canciones_reproducidas() {
        // You can initialise any data required for the connected UI components here.
    }

}
