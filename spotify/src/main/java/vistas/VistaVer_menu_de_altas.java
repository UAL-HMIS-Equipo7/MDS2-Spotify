package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-ver_menu_de_altas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_menu_de_altas")
@JsModule("./src/vistas/vista-ver_menu_de_altas.ts")
public class VistaVer_menu_de_altas extends LitTemplate {

    public Element getContenedorArtista() {
		return contenedorArtista;
	}

	public void setContenedorArtista(Element contenedorArtista) {
		this.contenedorArtista = contenedorArtista;
	}

	public Element getContenedorAlbum() {
		return contenedorAlbum;
	}

	public void setContenedorAlbum(Element contenedorAlbum) {
		this.contenedorAlbum = contenedorAlbum;
	}

	public Element getContenedorEstilo() {
		return contenedorEstilo;
	}

	public void setContenedorEstilo(Element contenedorEstilo) {
		this.contenedorEstilo = contenedorEstilo;
	}

	public Element getContenedorCancion() {
		return contenedorCancion;
	}

	public void setContenedorCancion(Element contenedorCancion) {
		this.contenedorCancion = contenedorCancion;
	}

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Button getCerrarB() {
		return cerrarB;
	}

	public void setCerrarB(Button cerrarB) {
		this.cerrarB = cerrarB;
	}

	public Label getCancionL() {
		return cancionL;
	}

	public void setCancionL(Label cancionL) {
		this.cancionL = cancionL;
	}

	public Label getEstiloL() {
		return estiloL;
	}

	public void setEstiloL(Label estiloL) {
		this.estiloL = estiloL;
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

	@Id("cerrarB")
	private Button cerrarB;
	@Id("cancionL")
	private Label cancionL;
	@Id("estiloL")
	private Label estiloL;
	@Id("albumL")
	private Label albumL;
	@Id("artistaL")
	private Label artistaL;
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("contenedorArtista")
	private Element contenedorArtista;
	@Id("contenedorAlbum")
	private Element contenedorAlbum;
	@Id("contenedorEstilo")
	private Element contenedorEstilo;
	@Id("contenedorCancion")
	private Element contenedorCancion;

	/**
     * Creates a new VistaVer_menu_de_altas.
     */
    public VistaVer_menu_de_altas() {
        // You can initialise any data required for the connected UI components here.
    }

}
