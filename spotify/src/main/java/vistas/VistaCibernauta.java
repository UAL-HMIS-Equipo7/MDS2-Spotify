package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta")
@JsModule("./src/vistas/vista-cibernauta.ts")
public class VistaCibernauta extends LitTemplate {

    public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

//	public HorizontalLayout getVaadinHorizontalLayout() {
//		return vaadinHorizontalLayout;
//	}
//
//	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
//		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
//	}
//
//	public Image getFotoImg() {
//		return fotoImg;
//	}
//
//	public void setFotoImg(Image fotoImg) {
//		this.fotoImg = fotoImg;
//	}
//
//	public Label getNombreAppL() {
//		return nombreAppL;
//	}
//
//	public void setNombreAppL(Label nombreAppL) {
//		this.nombreAppL = nombreAppL;
//	}
//
//	public Button getIniciarSesionB() {
//		return iniciarSesionB;
//	}
//
//	public void setIniciarSesionB(Button iniciarSesionB) {
//		this.iniciarSesionB = iniciarSesionB;
//	}
//
//	@Id("fotoImg")
//	private Image fotoImg;
//	@Id("nombreAppL")
//	private Label nombreAppL;
//	@Id("iniciarSesionB")
//	private Button iniciarSesionB;
//	@Id("vaadinHorizontalLayout")
//	private HorizontalLayout vaadinHorizontalLayout;
	@Id("LayoutPrincipal")
	private Element layoutPrincipal;
	/**
     * Creates a new VistaCibernauta.
     */
    public VistaCibernauta() {
        // You can initialise any data required for the connected UI components here.
    }

}
