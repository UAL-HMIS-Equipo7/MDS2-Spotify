package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-album_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-album_administrador")
@JsModule("./src/vistas/vista-album_administrador.ts")
public class VistaAlbum_administrador extends LitTemplate {

    public Label getAlbumL() {
		return albumL;
	}

	public void setAlbumL(Label albumL) {
		this.albumL = albumL;
	}

	public Image getAlbumImg() {
		return albumImg;
	}

	public void setAlbumImg(Image albumImg) {
		this.albumImg = albumImg;
	}

	public Button getEditarAlbumB() {
		return editarAlbumB;
	}

	public void setEditarAlbumB(Button editarAlbumB) {
		this.editarAlbumB = editarAlbumB;
	}

	public Button getEliminarAlbumB() {
		return eliminarAlbumB;
	}

	public void setEliminarAlbumB(Button eliminarAlbumB) {
		this.eliminarAlbumB = eliminarAlbumB;
	}

	@Id("albumL")
	private Label albumL;
	@Id("albumImg")
	private Image albumImg;
	@Id("editarAlbumB")
	private Button editarAlbumB;
	@Id("eliminarAlbumB")
	private Button eliminarAlbumB;

	/**
     * Creates a new VistaAlbum_administrador.
     */
    public VistaAlbum_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
