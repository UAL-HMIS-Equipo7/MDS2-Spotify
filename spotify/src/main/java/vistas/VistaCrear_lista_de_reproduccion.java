package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-crear_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_lista_de_reproduccion")
@JsModule("./src/vistas/vista-crear_lista_de_reproduccion.ts")
public class VistaCrear_lista_de_reproduccion extends LitTemplate {

    public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Label getTituloListaL() {
		return tituloListaL;
	}

	public void setTituloListaL(Label tituloListaL) {
		this.tituloListaL = tituloListaL;
	}

	public TextField getTituloListaTF() {
		return tituloListaTF;
	}

	public void setTituloListaTF(TextField tituloListaTF) {
		this.tituloListaTF = tituloListaTF;
	}

	public Label getAutorListaL() {
		return autorListaL;
	}

	public void setAutorListaL(Label autorListaL) {
		this.autorListaL = autorListaL;
	}

	public TextField getAutorListaTF() {
		return autorListaTF;
	}

	public void setAutorListaTF(TextField autorListaTF) {
		this.autorListaTF = autorListaTF;
	}

	public Button getGuardarB() {
		return guardarB;
	}

	public void setGuardarB(Button guardarB) {
		this.guardarB = guardarB;
	}

	public Button getCancelarB() {
		return cancelarB;
	}

	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("tituloListaL")
	private Label tituloListaL;
	@Id("tituloListaTF")
	private TextField tituloListaTF;
	@Id("autorListaL")
	private Label autorListaL;
	@Id("autorListaTF")
	private TextField autorListaTF;
	@Id("guardarB")
	private Button guardarB;
	@Id("cancelarB")
	private Button cancelarB;

	/**
     * Creates a new VistaCrear_lista_de_reproduccion.
     */
    public VistaCrear_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
