package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-actor_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-actor_comun")
@JsModule("./src/vistas/vista-actor_comun.ts")
public class VistaActor_comun extends LitTemplate {

    public Button getVerEstadisticasB() {
		return verEstadisticasB;
	}

	public void setVerEstadisticasB(Button verEstadisticasB) {
		this.verEstadisticasB = verEstadisticasB;
	}

	public Element getVistaUltimas_canciones_reproducidas() {
		return vistaUltimas_canciones_reproducidas;
	}

	public void setVistaUltimas_canciones_reproducidas(Element vistaUltimas_canciones_reproducidas) {
		this.vistaUltimas_canciones_reproducidas = vistaUltimas_canciones_reproducidas;
	}

	public Element getVistaCanciones_favoritas() {
		return vistaCanciones_favoritas;
	}

	public void setVistaCanciones_favoritas(Element vistaCanciones_favoritas) {
		this.vistaCanciones_favoritas = vistaCanciones_favoritas;
	}

	public Element getVistaRecomendaciones() {
		return vistaRecomendaciones;
	}

	public void setVistaRecomendaciones(Element vistaRecomendaciones) {
		this.vistaRecomendaciones = vistaRecomendaciones;
	}

	public Button getMenuAdministracionB() {
		return menuAdministracionB;
	}

	public void setMenuAdministracionB(Button menuAdministracionB) {
		this.menuAdministracionB = menuAdministracionB;
	}

	@Id("verEstadisticasB")
	private Button verEstadisticasB;
	@Id("vistaUltimas_canciones_reproducidas")
	private Element vistaUltimas_canciones_reproducidas;
	@Id("vistaCanciones_favoritas")
	private Element vistaCanciones_favoritas;
	@Id("vistaRecomendaciones")
	private Element vistaRecomendaciones;
	@Id("menuAdministracionB")
	private Button menuAdministracionB;

	/**
     * Creates a new VistaActor_comun.
     */
    public VistaActor_comun() {
        // You can initialise any data required for the connected UI components here.
    }

}
