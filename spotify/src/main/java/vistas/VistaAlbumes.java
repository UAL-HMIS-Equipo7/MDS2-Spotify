package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-albumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-albumes")
@JsModule("./src/vistas/vista-albumes.ts")
public class VistaAlbumes extends LitTemplate {

    @Id("tituloL")
	private Label tituloL;
	@Id("vaadinScroller")
	private Scroller vaadinScroller;
	public Label getTituloL() {
		return tituloL;
	}
	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}
	public Scroller getVaadinScroller() {
		return vaadinScroller;
	}
	public void setVaadinScroller(Scroller vaadinScroller) {
		this.vaadinScroller = vaadinScroller;
	}
	/**
     * Creates a new VistaAlbumes.
     */
    public VistaAlbumes() {
        // You can initialise any data required for the connected UI components here.
    }

}
