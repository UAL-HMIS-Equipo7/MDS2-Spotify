package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-bloqueo_inicio_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-bloqueo_inicio_sesion")
@JsModule("./src/vistas/vista-bloqueo_inicio_sesion.ts")
public class VistaBloqueo_inicio_sesion extends LitTemplate {

    public Button getAtrasB() {
		return atrasB;
	}

	public void setAtrasB(Button atrasB) {
		this.atrasB = atrasB;
	}

	public Image getAlertaImg() {
		return alertaImg;
	}

	public void setAlertaImg(Image alertaImg) {
		this.alertaImg = alertaImg;
	}

	public Label getErrorL() {
		return errorL;
	}

	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}

	public Label getTiempoL() {
		return tiempoL;
	}

	public void setTiempoL(Label tiempoL) {
		this.tiempoL = tiempoL;
	}

	@Id("atrasB")
	private Button atrasB;
	@Id("alertaImg")
	private Image alertaImg;
	@Id("errorL")
	private Label errorL;
	@Id("tiempoL")
	private Label tiempoL;

	/**
     * Creates a new VistaBloqueo_inicio_sesion.
     */
    public VistaBloqueo_inicio_sesion() {
        // You can initialise any data required for the connected UI components here.
    }

}
