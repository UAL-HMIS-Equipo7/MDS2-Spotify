package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver_menu_de_altas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_menu_de_altas")
@JsModule("./src/vistas/vista-ver_menu_de_altas.ts")
public class VistaVer_menu_de_altas extends LitTemplate {

    public Button getCerrarB() {
		return cerrarB;
	}

	public void setCerrarB(Button cerrarB) {
		this.cerrarB = cerrarB;
	}

	public Image getCancionB() {
		return cancionB;
	}

	public void setCancionB(Image cancionB) {
		this.cancionB = cancionB;
	}

	public Label getCancionL() {
		return cancionL;
	}

	public void setCancionL(Label cancionL) {
		this.cancionL = cancionL;
	}

	public Image getEstiloB() {
		return estiloB;
	}

	public void setEstiloB(Image estiloB) {
		this.estiloB = estiloB;
	}

	public Label getEstiloL() {
		return estiloL;
	}

	public void setEstiloL(Label estiloL) {
		this.estiloL = estiloL;
	}

	public Image getAlbumB() {
		return albumB;
	}

	public void setAlbumB(Image albumB) {
		this.albumB = albumB;
	}

	public Label getAlbumL() {
		return albumL;
	}

	public void setAlbumL(Label albumL) {
		this.albumL = albumL;
	}

	public Label getArtistaL() {
		return artistaL;
	}

	public void setArtistaL(Label artistaL) {
		this.artistaL = artistaL;
	}

	public Image getArtistaB() {
		return artistaB;
	}

	public void setArtistaB(Image artistaB) {
		this.artistaB = artistaB;
	}

	@Id("cerrarB")
	private Button cerrarB;
	@Id("cancionB")
	private Image cancionB;
	@Id("cancionL")
	private Label cancionL;
	@Id("estiloB")
	private Image estiloB;
	@Id("estiloL")
	private Label estiloL;
	@Id("albumB")
	private Image albumB;
	@Id("albumL")
	private Label albumL;
	@Id("artistaL")
	private Label artistaL;
	@Id("artistaB")
	private Image artistaB;

	/**
     * Creates a new VistaVer_menu_de_altas.
     */
    public VistaVer_menu_de_altas() {
        // You can initialise any data required for the connected UI components here.
    }

}
