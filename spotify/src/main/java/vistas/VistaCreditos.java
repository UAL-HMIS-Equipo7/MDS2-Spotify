package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-creditos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-creditos")
@JsModule("./src/vistas/vista-creditos.ts")
public class VistaCreditos extends LitTemplate {

	public HorizontalLayout getCancionImgLayout() {
		return cancionImgLayout;
	}

	public void setCancionImgLayout(HorizontalLayout cancionImgLayout) {
		this.cancionImgLayout = cancionImgLayout;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Button getCerrarB() {
		return cerrarB;
	}

	public void setCerrarB(Button cerrarB) {
		this.cerrarB = cerrarB;
	}

	public Label getTituloAlbumL() {
		return tituloAlbumL;
	}

	public void setTituloAlbumL(Label tituloAlbumL) {
		this.tituloAlbumL = tituloAlbumL;
	}

	public Label getCompositorL() {
		return compositorL;
	}

	public void setCompositorL(Label compositorL) {
		this.compositorL = compositorL;
	}

	public Label getProductorL() {
		return productorL;
	}

	public void setProductorL(Label productorL) {
		this.productorL = productorL;
	}

	public Label getInterpreteL() {
		return interpreteL;
	}

	public void setInterpreteL(Label interpreteL) {
		this.interpreteL = interpreteL;
	}

	public Label getFicheroL() {
		return ficheroL;
	}

	public void setFicheroL(Label ficheroL) {
		this.ficheroL = ficheroL;
	}

	public Label getEstiloL() {
		return estiloL;
	}

	public void setEstiloL(Label estiloL) {
		this.estiloL = estiloL;
	}

	@Id("tituloL")
	private Label tituloL;
	@Id("cerrarB")
	private Button cerrarB;
	@Id("tituloAlbumL")
	private Label tituloAlbumL;
	@Id("compositorL")
	private Label compositorL;
	@Id("productorL")
	private Label productorL;
	@Id("interpreteL")
	private Label interpreteL;
	@Id("ficheroL")
	private Label ficheroL;
	@Id("estiloL")
	private Label estiloL;
	@Id("cancionImgLayout")
	private HorizontalLayout cancionImgLayout;

	/**
     * Creates a new VistaCreditos.
     */
    public VistaCreditos() {
        // You can initialise any data required for the connected UI components here.
    }

}
