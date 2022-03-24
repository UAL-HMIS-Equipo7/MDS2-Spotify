package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-canciones_a_aniadir_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_a_aniadir_album")
@JsModule("./src/vistas/vista-canciones_a_aniadir_album.ts")
public class VistaCanciones_a_aniadir_album extends LitTemplate {

    @Id("aniadirCancionTF")
	private TextField aniadirCancionTF;
	@Id("anteriorB")
	private Button anteriorB;
	@Id("vistaCancion_album")
	private Element vistaCancion_album;
	@Id("posteriorB")
	private Button posteriorB;

	/**
     * Creates a new VistaCanciones_a_aniadir_album.
     */
    public VistaCanciones_a_aniadir_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
