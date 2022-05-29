package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_perfil")
@JsModule("./src/vistas/vista-listas_de_reproduccion_perfil.ts")
public class VistaListas_de_reproduccion_perfil extends LitTemplate {

    public HorizontalLayout getContenedor() {
		return contenedor;
	}

	public void setContenedor(HorizontalLayout contenedor) {
		this.contenedor = contenedor;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Button getAnteriorB() {
		return anteriorB;
	}

	public void setAnteriorB(Button anteriorB) {
		this.anteriorB = anteriorB;
	}

	public Button getSiguienteB() {
		return siguienteB;
	}

	public void setSiguienteB(Button siguienteB) {
		this.siguienteB = siguienteB;
	}

	public Button getCrearListaB() {
		return crearListaB;
	}

	public void setCrearListaB(Button crearListaB) {
		this.crearListaB = crearListaB;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("anteriorB")
	private Button anteriorB;
	@Id("siguienteB")
	private Button siguienteB;
	@Id("crearListaB")
	private Button crearListaB;
	@Id("contenedor")
	private HorizontalLayout contenedor;
	/**
     * Creates a new VistaListas_de_reproduccion_perfil.
     */
    public VistaListas_de_reproduccion_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
