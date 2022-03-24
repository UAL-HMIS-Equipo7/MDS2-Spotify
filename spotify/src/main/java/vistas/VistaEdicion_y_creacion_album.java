package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-edicion_y_creacion_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-edicion_y_creacion_album")
@JsModule("./src/vistas/vista-edicion_y_creacion_album.ts")
public class VistaEdicion_y_creacion_album extends LitTemplate {

    public Label getTituloL() {
		return tituloL;
	}
	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}
	public Label getErrorL() {
		return errorL;
	}
	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}
	public Image getFotoImg() {
		return fotoImg;
	}
	public void setFotoImg(Image fotoImg) {
		this.fotoImg = fotoImg;
	}
	public Button getElegirFotoB() {
		return elegirFotoB;
	}
	public void setElegirFotoB(Button elegirFotoB) {
		this.elegirFotoB = elegirFotoB;
	}
	public Label getTituloAlbumL() {
		return tituloAlbumL;
	}
	public void setTituloAlbumL(Label tituloAlbumL) {
		this.tituloAlbumL = tituloAlbumL;
	}
	public TextField getTituloAlbumTF() {
		return tituloAlbumTF;
	}
	public void setTituloAlbumTF(TextField tituloAlbumTF) {
		this.tituloAlbumTF = tituloAlbumTF;
	}
	public Label getArtistaL() {
		return artistaL;
	}
	public void setArtistaL(Label artistaL) {
		this.artistaL = artistaL;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public TextField getArtistaTF() {
		return artistaTF;
	}
	public void setArtistaTF(TextField artistaTF) {
		this.artistaTF = artistaTF;
	}
	public TextField getFechaEdicionTF() {
		return fechaEdicionTF;
	}
	public void setFechaEdicionTF(TextField fechaEdicionTF) {
		this.fechaEdicionTF = fechaEdicionTF;
	}
	public Button getGuardarB() {
		return guardarB;
	}
	public void setGuardarB(Button guardarB) {
		this.guardarB = guardarB;
	}
	public Button getCancelarB() {
		return cancelarB;
	}
	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}
	@Id("tituloL")
	private Label tituloL;
	@Id("errorL")
	private Label errorL;
	@Id("fotoImg")
	private Image fotoImg;
	@Id("elegirFotoB")
	private Button elegirFotoB;
	@Id("tituloAlbumL")
	private Label tituloAlbumL;
	@Id("tituloAlbumTF")
	private TextField tituloAlbumTF;
	@Id("artistaL")
	private Label artistaL;
	@Id("label")
	private Label label;
	@Id("artistaTF")
	private TextField artistaTF;
	@Id("fechaEdicionTF")
	private TextField fechaEdicionTF;
	@Id("guardarB")
	private Button guardarB;
	@Id("cancelarB")
	private Button cancelarB;
	/**
     * Creates a new VistaEdicion_y_creacion_album.
     */
    public VistaEdicion_y_creacion_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
