package interfaz;

import java.util.stream.Stream;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

import spotify.GestorReproductor;
import spotify.GestorVentana;
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
	private basededatos.Usuario_generico _usuario;
	
	private Button menuAdministracionB;
	
	public Button getMenuAdministracionB() {
		return menuAdministracionB;
	}

	public void setMenuAdministracionB(Button menuAdministracionB) {
		this.menuAdministracionB = menuAdministracionB;
	}
	
	public Actor_comun(basededatos.Usuario_generico usuario, boolean menuAdministracionVisible) {
		
		_usuario = usuario;
		
		Inicializar(menuAdministracionVisible);
		
		VerticalLayout vl = getLayoutReproductor().as(VerticalLayout.class);
		
		Reproductor reproActual = GestorReproductor.getReproductor();
		
		if (reproActual == null || reproActual instanceof Reproductor__Cibernauta_) {
			_reproductor__No_Cibernauta_ = new Reproductor__No_Cibernauta_();
			
			if (GestorReproductor.setReproductor(_reproductor__No_Cibernauta_)) {
				vl.add(_reproductor__No_Cibernauta_);
			}
		}
		else {
			vl.removeAll();
			vl.add(reproActual);
		}
	}
	
	public void Inicializar(boolean menuAdministracionVisible) {
		
		VerticalLayout vl = getLayoutPrincipal().as(VerticalLayout.class);
		
		GestorVentana.setLayoutPrincipal(vl);
		
		vl.removeAll();
		
		Button verEstadisticasB = new Button("Estadísticas de uso");
		verEstadisticasB.getStyle().set("align-self", "flex-end");
		verEstadisticasB.getStyle().set("margin", "var(--lumo-space-s)");
		
		HorizontalLayout hl = new HorizontalLayout();
		hl.getStyle().set("width", "100%");
		
		VerticalLayout contenedorIzquierdo = new VerticalLayout();
		contenedorIzquierdo.getStyle().set("width", "70%");
		
		VerticalLayout contenedorDerecho = new VerticalLayout();
		contenedorDerecho.getStyle().set("width", "30%");
		contenedorDerecho.getStyle().set("height", "100%");
		contenedorDerecho.getStyle().set("align-items", "center");
		
		menuAdministracionB = new Button("Menú Administración");
		menuAdministracionB.setVisible(menuAdministracionVisible);
		
		contenedorDerecho.add(menuAdministracionB);
		
		hl.add(contenedorIzquierdo);
		hl.add(contenedorDerecho);
		
		vl.add(verEstadisticasB);
		vl.add(hl);
		
		_ultimas_canciones_reproducidas = new Ultimas_canciones_reproducidas(_usuario);
		_canciones_favoritas = new Canciones_favoritas(_usuario);
		_recomendaciones = new Recomendaciones(_usuario);
		_recomendaciones.getStyle().set("height", "30%");
		
		contenedorIzquierdo.add(_ultimas_canciones_reproducidas);
		contenedorIzquierdo.add(_canciones_favoritas);
		
		contenedorDerecho.add(_recomendaciones);
		
		verEstadisticasB.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vl.removeAll();
				
				_ver_estadisticas = new Ver_estadisticas(_usuario);
				
				vl.add(_ver_estadisticas);
			}
		});
	}
}