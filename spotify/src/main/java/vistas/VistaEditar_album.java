package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-editar_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_album")
@JsModule("./src/vistas/vista-editar_album.ts")
public class VistaEditar_album extends LitTemplate {

    public Element getVistaEdicion_y_creacion_album() {
		return vistaEdicion_y_creacion_album;
	}

	public void setVistaEdicion_y_creacion_album(Element vistaEdicion_y_creacion_album) {
		this.vistaEdicion_y_creacion_album = vistaEdicion_y_creacion_album;
	}

	public Element getVistaCanciones_en_album() {
		return vistaCanciones_en_album;
	}

	public void setVistaCanciones_en_album(Element vistaCanciones_en_album) {
		this.vistaCanciones_en_album = vistaCanciones_en_album;
	}

	@Id("vistaEdicion_y_creacion_album")
	private Element vistaEdicion_y_creacion_album;
	@Id("vistaCanciones_en_album")
	private Element vistaCanciones_en_album;

	/**
     * Creates a new VistaEditar_album.
     */
    public VistaEditar_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
