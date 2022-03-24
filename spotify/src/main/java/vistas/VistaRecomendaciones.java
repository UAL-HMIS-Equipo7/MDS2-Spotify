package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-recomendaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recomendaciones")
@JsModule("./src/vistas/vista-recomendaciones.ts")
public class VistaRecomendaciones extends LitTemplate {

    public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Element getVistaCanciones_recomendadas() {
		return vistaCanciones_recomendadas;
	}

	public void setVistaCanciones_recomendadas(Element vistaCanciones_recomendadas) {
		this.vistaCanciones_recomendadas = vistaCanciones_recomendadas;
	}

	public Element getVistaAlbumes_recomendados() {
		return vistaAlbumes_recomendados;
	}

	public void setVistaAlbumes_recomendados(Element vistaAlbumes_recomendados) {
		this.vistaAlbumes_recomendados = vistaAlbumes_recomendados;
	}

	public Element getVistaListas_recomendadas() {
		return vistaListas_recomendadas;
	}

	public void setVistaListas_recomendadas(Element vistaListas_recomendadas) {
		this.vistaListas_recomendadas = vistaListas_recomendadas;
	}

	public Element getContenedor() {
		return contenedor;
	}

	public void setContenedor(Element contenedor) {
		this.contenedor = contenedor;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("vistaCanciones_recomendadas")
	private Element vistaCanciones_recomendadas;
	@Id("vistaAlbumes_recomendados")
	private Element vistaAlbumes_recomendados;
	@Id("vistaListas_recomendadas")
	private Element vistaListas_recomendadas;
	@Id("contenedor")
	private Element contenedor;

	/**
     * Creates a new VistaRecomendaciones.
     */
    public VistaRecomendaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
