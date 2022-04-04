package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-ver_estadisticas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */

@Tag("vista-ver_estadisticas")
@JsModule("./src/vistas/vista-ver_estadisticas.ts")
public class VistaVer_estadisticas extends LitTemplate {

    public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Label getTiempoTituloL() {
		return tiempoTituloL;
	}

	public void setTiempoTituloL(Label tiempoTituloL) {
		this.tiempoTituloL = tiempoTituloL;
	}

	public Label getTiempoL() {
		return tiempoL;
	}

	public void setTiempoL(Label tiempoL) {
		this.tiempoL = tiempoL;
	}

	public Label getNumCancionesTituloL() {
		return numCancionesTituloL;
	}

	public void setNumCancionesTituloL(Label numCancionesTituloL) {
		this.numCancionesTituloL = numCancionesTituloL;
	}

	public Label getNumCancionesL() {
		return numCancionesL;
	}

	public void setNumCancionesL(Label numCancionesL) {
		this.numCancionesL = numCancionesL;
	}

	public Label getNumArtistasTituloL() {
		return numArtistasTituloL;
	}

	public void setNumArtistasTituloL(Label numArtistasTituloL) {
		this.numArtistasTituloL = numArtistasTituloL;
	}

	public Label getNumArtistasL() {
		return numArtistasL;
	}

	public void setNumArtistasL(Label numArtistasL) {
		this.numArtistasL = numArtistasL;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("tiempoTituloL")
	private Label tiempoTituloL;
	@Id("tiempoL")
	private Label tiempoL;
	@Id("numCancionesTituloL")
	private Label numCancionesTituloL;
	@Id("numCancionesL")
	private Label numCancionesL;
	@Id("numArtistasTituloL")
	private Label numArtistasTituloL;
	@Id("numArtistasL")
	private Label numArtistasL;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaVer_estadisticas.
     */
    public VistaVer_estadisticas() {
        // You can initialise any data required for the connected UI components here.
    }

}
