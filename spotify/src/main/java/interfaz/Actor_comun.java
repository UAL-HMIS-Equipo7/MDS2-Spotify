package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

import vistas.VistaActor_comun;

//import basededatos.iActor_comun;

public class Actor_comun extends VistaActor_comun {
//	private Button _verEstadisticasB;
//	public iActor_comun _iActor_comun;
	public Ultimas_canciones_reproducidas _ultimas_canciones_reproducidas;
	public Canciones_favoritas _canciones_favoritas;
	public Reproductor__No_Cibernauta_ _reproductor__No_Cibernauta_;
	public Recomendaciones _recomendaciones;
	public Ver_estadisticas _ver_estadisticas;
	
	public Actor_comun() {
		_ultimas_canciones_reproducidas = new Ultimas_canciones_reproducidas();
		_canciones_favoritas = new Canciones_favoritas();
		_recomendaciones = new Recomendaciones();
		_recomendaciones.getElement().setAttribute("height", "30%");
		
		_ver_estadisticas = new Ver_estadisticas();
		
		VerticalLayout vIzq = this.getContenedorIzquierdo().as(VerticalLayout.class);
		vIzq.add(_ultimas_canciones_reproducidas);
		vIzq.add(_canciones_favoritas);
		
		VerticalLayout vDer = this.getContenedorDerecho().as(VerticalLayout.class);
		vDer.addComponentAsFirst(_recomendaciones);
		
		getMenuAdministracionB().setVisible(false);
	}
	
	public void Inicializar() {

	}
}