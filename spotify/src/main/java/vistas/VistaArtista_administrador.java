package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-artista_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista_administrador")
@JsModule("./src/vistas/vista-artista_administrador.ts")
public class VistaArtista_administrador extends LitTemplate {

    public Label getArtistaL() {
		return artistaL;
	}

	public void setArtistaL(Label artistaL) {
		this.artistaL = artistaL;
	}

	public Image getArtistaImg() {
		return artistaImg;
	}

	public void setArtistaImg(Image artistaImg) {
		this.artistaImg = artistaImg;
	}

	public Button getEditarArtistaB() {
		return editarArtistaB;
	}

	public void setEditarArtistaB(Button editarArtistaB) {
		this.editarArtistaB = editarArtistaB;
	}

	public Button getEliminarArtistaB() {
		return eliminarArtistaB;
	}

	public void setEliminarArtistaB(Button eliminarArtistaB) {
		this.eliminarArtistaB = eliminarArtistaB;
	}

	@Id("artistaL")
	private Label artistaL;
	@Id("artistaImg")
	private Image artistaImg;
	@Id("editarArtistaB")
	private Button editarArtistaB;
	@Id("eliminarArtistaB")
	private Button eliminarArtistaB;

	/**
     * Creates a new VistaArtista_administrador.
     */
    public VistaArtista_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
