package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-editar_informacion_del_perfil_no_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_informacion_del_perfil_no_artista")
@JsModule("./src/vistas/vista-editar_informacion_del_perfil_no_artista.ts")
public class VistaEditar_informacion_del_perfil_no_artista extends LitTemplate {

    public TextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(TextField emailTF) {
		this.emailTF = emailTF;
	}

	public TextField getNickTF() {
		return nickTF;
	}

	public void setNickTF(TextField nickTF) {
		this.nickTF = nickTF;
	}

	public Button getGuardarB() {
		return guardarB;
	}

	public void setGuardarB(Button guardarB) {
		this.guardarB = guardarB;
	}

	@Id("emailTF")
	private TextField emailTF;
	@Id("nickTF")
	private TextField nickTF;
	@Id("guardarB")
	private Button guardarB;

	/**
     * Creates a new VistaEditar_informacion_del_perfil_no_artista.
     */
    public VistaEditar_informacion_del_perfil_no_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
