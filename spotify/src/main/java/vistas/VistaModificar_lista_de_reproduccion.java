package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-modificar_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar_lista_de_reproduccion")
@JsModule("./src/vistas/vista-modificar_lista_de_reproduccion.ts")
public class VistaModificar_lista_de_reproduccion extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Button getEliminarB2() {
		return eliminarB2;
	}
	public void setEliminarB2(Button eliminarB2) {
		this.eliminarB2 = eliminarB2;
	}
	public Button getEliminarB() {
		return eliminarB;
	}
	public void setEliminarB(Button eliminarB) {
		this.eliminarB = eliminarB;
	}
	public Label getListadoL() {
		return listadoL;
	}
	public void setListadoL(Label listadoL) {
		this.listadoL = listadoL;
	}
	public TextField getListadoTF() {
		return listadoTF;
	}
	public void setListadoTF(TextField listadoTF) {
		this.listadoTF = listadoTF;
	}
	public Image getAniadirB() {
		return aniadirB;
	}
	public void setAniadirB(Image aniadirB) {
		this.aniadirB = aniadirB;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Image getFlechaIzquierdaB() {
		return flechaIzquierdaB;
	}
	public void setFlechaIzquierdaB(Image flechaIzquierdaB) {
		this.flechaIzquierdaB = flechaIzquierdaB;
	}
	public Image getFlechaDerechaB() {
		return flechaDerechaB;
	}
	public void setFlechaDerechaB(Image flechaDerechaB) {
		this.flechaDerechaB = flechaDerechaB;
	}
	@Id("listadoL")
	private Label listadoL;
	@Id("listadoTF")
	private TextField listadoTF;
	@Id("aniadirB")
	private Image aniadirB;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("flechaIzquierdaB")
	private Image flechaIzquierdaB;
	@Id("flechaDerechaB")
	private Image flechaDerechaB;
	@Id("eliminarB2")
	private Button eliminarB2;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("eliminarB")
	private Button eliminarB;
	/**
     * Creates a new VistaModificar_lista_de_reproduccion.
     */
    public VistaModificar_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
