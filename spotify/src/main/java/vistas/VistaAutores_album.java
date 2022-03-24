package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-autores_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-autores_album")
@JsModule("./src/vistas/vista-autores_album.ts")
public class VistaAutores_album extends LitTemplate {

    @Id("artistasCB")
	private ComboBox<String> artistasCB;

	public ComboBox<String> getArtistasCB() {
		return artistasCB;
	}

	public void setArtistasCB(ComboBox<String> artistasCB) {
		this.artistasCB = artistasCB;
	}

	/**
     * Creates a new VistaAutores_album.
     */
    public VistaAutores_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
