package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-dar_de_alta_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar_de_alta_album")
@JsModule("./src/vistas/vista-dar_de_alta_album.ts")
public class VistaDar_de_alta_album extends LitTemplate {

    public Element getVistaEdicion_y_creacion_album() {
		return vistaEdicion_y_creacion_album;
	}

	public void setVistaEdicion_y_creacion_album(Element vistaEdicion_y_creacion_album) {
		this.vistaEdicion_y_creacion_album = vistaEdicion_y_creacion_album;
	}

	public Element getVistaCanciones_a_aniadir_album() {
		return vistaCanciones_a_aniadir_album;
	}

	public void setVistaCanciones_a_aniadir_album(Element vistaCanciones_a_aniadir_album) {
		this.vistaCanciones_a_aniadir_album = vistaCanciones_a_aniadir_album;
	}

	@Id("vistaEdicion_y_creacion_album")
	private Element vistaEdicion_y_creacion_album;
	@Id("vistaCanciones_a_aniadir_album")
	private Element vistaCanciones_a_aniadir_album;

	/**
     * Creates a new VistaDar_de_alta_album.
     */
    public VistaDar_de_alta_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
