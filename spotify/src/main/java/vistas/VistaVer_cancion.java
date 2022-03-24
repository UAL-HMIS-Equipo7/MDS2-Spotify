package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-ver_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_cancion")
@JsModule("./src/vistas/vista-ver_cancion.ts")
public class VistaVer_cancion extends LitTemplate {

    public Image getFotoCancionImg() {
		return fotoCancionImg;
	}

	public void setFotoCancionImg(Image fotoCancionImg) {
		this.fotoCancionImg = fotoCancionImg;
	}

	public Label getTituloL() {
		return tituloL;
	}

	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}

	public Button getAniadirFavoritosB() {
		return aniadirFavoritosB;
	}

	public void setAniadirFavoritosB(Button aniadirFavoritosB) {
		this.aniadirFavoritosB = aniadirFavoritosB;
	}

	public Label getAniadirListaL() {
		return aniadirListaL;
	}

	public void setAniadirListaL(Label aniadirListaL) {
		this.aniadirListaL = aniadirListaL;
	}

	public ComboBox<String> getAniadirListaB() {
		return aniadirListaB;
	}

	public void setAniadirListaB(ComboBox<String> aniadirListaB) {
		this.aniadirListaB = aniadirListaB;
	}

	public Label getCreditosTituloL() {
		return creditosTituloL;
	}

	public void setCreditosTituloL(Label creditosTituloL) {
		this.creditosTituloL = creditosTituloL;
	}

	public Label getCreditosTituloCancionL() {
		return creditosTituloCancionL;
	}

	public void setCreditosTituloCancionL(Label creditosTituloCancionL) {
		this.creditosTituloCancionL = creditosTituloCancionL;
	}

	public Label getCreditosTituloAlbumL() {
		return creditosTituloAlbumL;
	}

	public void setCreditosTituloAlbumL(Label creditosTituloAlbumL) {
		this.creditosTituloAlbumL = creditosTituloAlbumL;
	}

	public Label getCreditosCompositorL() {
		return creditosCompositorL;
	}

	public void setCreditosCompositorL(Label creditosCompositorL) {
		this.creditosCompositorL = creditosCompositorL;
	}

	public Label getCreditosProductorL() {
		return creditosProductorL;
	}

	public void setCreditosProductorL(Label creditosProductorL) {
		this.creditosProductorL = creditosProductorL;
	}

	public Label getCreditosInterpreteL() {
		return creditosInterpreteL;
	}

	public void setCreditosInterpreteL(Label creditosInterpreteL) {
		this.creditosInterpreteL = creditosInterpreteL;
	}

	public Label getCreditosFicheroL() {
		return creditosFicheroL;
	}

	public void setCreditosFicheroL(Label creditosFicheroL) {
		this.creditosFicheroL = creditosFicheroL;
	}

	public Label getCreditoEstiloL() {
		return creditoEstiloL;
	}

	public void setCreditoEstiloL(Label creditoEstiloL) {
		this.creditoEstiloL = creditoEstiloL;
	}

	@Id("fotoCancionImg")
	private Image fotoCancionImg;
	@Id("tituloL")
	private Label tituloL;
	@Id("aniadirFavoritosB")
	private Button aniadirFavoritosB;
	@Id("aniadirListaL")
	private Label aniadirListaL;
	@Id("aniadirListaB")
	private ComboBox<String> aniadirListaB;
	@Id("creditosTituloL")
	private Label creditosTituloL;
	@Id("creditosTituloCancionL")
	private Label creditosTituloCancionL;
	@Id("creditosTituloAlbumL")
	private Label creditosTituloAlbumL;
	@Id("creditosCompositorL")
	private Label creditosCompositorL;
	@Id("creditosProductorL")
	private Label creditosProductorL;
	@Id("creditosInterpreteL")
	private Label creditosInterpreteL;
	@Id("creditosFicheroL")
	private Label creditosFicheroL;
	@Id("creditoEstiloL")
	private Label creditoEstiloL;

	/**
     * Creates a new VistaVer_cancion.
     */
    public VistaVer_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
