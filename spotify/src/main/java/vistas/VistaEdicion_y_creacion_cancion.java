package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-edicion_y_creacion_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-edicion_y_creacion_cancion")
@JsModule("./src/vistas/vista-edicion_y_creacion_cancion.ts")
public class VistaEdicion_y_creacion_cancion extends LitTemplate {

    public Label getTituloCancionL() {
		return tituloCancionL;
	}
	public void setTituloCancionL(Label tituloCancionL) {
		this.tituloCancionL = tituloCancionL;
	}
	public Label getErrorL() {
		return errorL;
	}
	public void setErrorL(Label errorL) {
		this.errorL = errorL;
	}
	public Label getFicheroL() {
		return ficheroL;
	}
	public void setFicheroL(Label ficheroL) {
		this.ficheroL = ficheroL;
	}
	public Button getElegirFicheroB() {
		return elegirFicheroB;
	}
	public void setElegirFicheroB(Button elegirFicheroB) {
		this.elegirFicheroB = elegirFicheroB;
	}
	public Label getTituloL() {
		return tituloL;
	}
	public void setTituloL(Label tituloL) {
		this.tituloL = tituloL;
	}
	public TextField getTituloTF() {
		return tituloTF;
	}
	public void setTituloTF(TextField tituloTF) {
		this.tituloTF = tituloTF;
	}
	public Label getEstiloL() {
		return estiloL;
	}
	public void setEstiloL(Label estiloL) {
		this.estiloL = estiloL;
	}
	public ComboBox<String> getEstiloCB() {
		return estiloCB;
	}
	public void setEstiloCB(ComboBox<String> estiloCB) {
		this.estiloCB = estiloCB;
	}
	public Label getCreditosL() {
		return creditosL;
	}
	public void setCreditosL(Label creditosL) {
		this.creditosL = creditosL;
	}
	public Label getCreditosTituloL() {
		return creditosTituloL;
	}
	public void setCreditosTituloL(Label creditosTituloL) {
		this.creditosTituloL = creditosTituloL;
	}
	public TextField getCreditosTituloTF() {
		return creditosTituloTF;
	}
	public void setCreditosTituloTF(TextField creditosTituloTF) {
		this.creditosTituloTF = creditosTituloTF;
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
	public Label getCompositorL() {
		return compositorL;
	}
	public void setCompositorL(Label compositorL) {
		this.compositorL = compositorL;
	}
	public TextField getCompositorTF() {
		return compositorTF;
	}
	public void setCompositorTF(TextField compositorTF) {
		this.compositorTF = compositorTF;
	}
	public Label getProductorL() {
		return productorL;
	}
	public void setProductorL(Label productorL) {
		this.productorL = productorL;
	}
	public TextField getProductorTF() {
		return productorTF;
	}
	public void setProductorTF(TextField productorTF) {
		this.productorTF = productorTF;
	}
	public Label getInterpreteL() {
		return interpreteL;
	}
	public void setInterpreteL(Label interpreteL) {
		this.interpreteL = interpreteL;
	}
	public TextField getInterpreteTF() {
		return interpreteTF;
	}
	public void setInterpreteTF(TextField interpreteTF) {
		this.interpreteTF = interpreteTF;
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
	@Id("tituloCancionL")
	private Label tituloCancionL;
	@Id("errorL")
	private Label errorL;
	@Id("ficheroL")
	private Label ficheroL;
	@Id("elegirFicheroB")
	private Button elegirFicheroB;
	@Id("tituloL")
	private Label tituloL;
	@Id("tituloTF")
	private TextField tituloTF;
	@Id("estiloL")
	private Label estiloL;
	@Id("estiloCB")
	private ComboBox<String> estiloCB;
	@Id("creditosL")
	private Label creditosL;
	@Id("creditosTituloL")
	private Label creditosTituloL;
	@Id("creditosTituloTF")
	private TextField creditosTituloTF;
	@Id("tituloAlbumL")
	private Label tituloAlbumL;
	@Id("tituloAlbumTF")
	private TextField tituloAlbumTF;
	@Id("compositorL")
	private Label compositorL;
	@Id("compositorTF")
	private TextField compositorTF;
	@Id("productorL")
	private Label productorL;
	@Id("productorTF")
	private TextField productorTF;
	@Id("interpreteL")
	private Label interpreteL;
	@Id("interpreteTF")
	private TextField interpreteTF;
	@Id("guardarB")
	private Button guardarB;
	@Id("cancelarB")
	private Button cancelarB;
	/**
     * Creates a new VistaEdicion_y_creacion_cancion.
     */
    public VistaEdicion_y_creacion_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
