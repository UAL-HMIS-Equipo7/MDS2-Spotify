package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-iniciar_sesion_con_aplicacion_de_terceros template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion_con_aplicacion_de_terceros")
@JsModule("./src/vistas/vista-iniciar_sesion_con_aplicacion_de_terceros.ts")
public class VistaIniciar_sesion_con_aplicacion_de_terceros extends LitTemplate {

    public Button getAtrasB() {
		return atrasB;
	}

	public void setAtrasB(Button atrasB) {
		this.atrasB = atrasB;
	}

	@Id("atrasB")
	private Button atrasB;

	/**
     * Creates a new VistaIniciar_sesion_con_aplicacion_de_terceros.
     */
    public VistaIniciar_sesion_con_aplicacion_de_terceros() {
        // You can initialise any data required for the connected UI components here.
    }

}
