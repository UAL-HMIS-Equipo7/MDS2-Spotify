package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-ver_notificaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_notificaciones")
@JsModule("./src/vistas/vista-ver_notificaciones.ts")
public class VistaVer_notificaciones extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getCerrarB() {
		return cerrarB;
	}

	public void setCerrarB(Button cerrarB) {
		this.cerrarB = cerrarB;
	}

	public Label getNumeroNotificacionesL() {
		return numeroNotificacionesL;
	}

	public void setNumeroNotificacionesL(Label numeroNotificacionesL) {
		this.numeroNotificacionesL = numeroNotificacionesL;
	}

	@Id("cerrarB")
	private Button cerrarB;
	@Id("numeroNotificacionesL")
	private Label numeroNotificacionesL;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaVer_notificaciones.
     */
    public VistaVer_notificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
