package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-ver_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_album")
@JsModule("./src/vistas/vista-ver_album.ts")
public class VistaVer_album extends LitTemplate {

    public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getInformacionL() {
		return informacionL;
	}

	public void setInformacionL(Label informacionL) {
		this.informacionL = informacionL;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Label getFechaEdicionL() {
		return fechaEdicionL;
	}

	public void setFechaEdicionL(Label fechaEdicionL) {
		this.fechaEdicionL = fechaEdicionL;
	}

	@Id("informacionL")
	private Label informacionL;
	@Id("tituloL")
	private Label tituloL;
	@Id("fechaEdicionL")
	private Label fechaEdicionL;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaVer_album.
     */
    public VistaVer_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
