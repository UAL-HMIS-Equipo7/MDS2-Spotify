package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-canciones_favoritas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_favoritas")
@JsModule("./src/vistas/vista-canciones_favoritas.ts")
public class VistaCanciones_favoritas extends LitTemplate {

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

	public Button getVerMasB() {
		return verMasB;
	}

	public void setVerMasB(Button verMasB) {
		this.verMasB = verMasB;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("contenedorSuperior")
	private HorizontalLayout contenedorSuperior;
	@Id("contenedorInferior")
	private HorizontalLayout contenedorInferior;
	@Id("verMasB")
	private Button verMasB;

	/**
     * Creates a new VistaCanciones_favoritas.
     */
    public VistaCanciones_favoritas() {
        // You can initialise any data required for the connected UI components here.
    }

}
