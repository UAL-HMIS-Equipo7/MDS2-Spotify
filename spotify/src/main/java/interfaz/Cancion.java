package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import spotify.GestorActor;
import spotify.GestorArchivos;
import spotify.GestorReproductor;
import vistas.VistaCancion;

@CssImport("./styles/shared-styles.css")
public class Cancion extends VistaCancion {
//	private event _reproducir__No_Cibernauta_;
//	private Image _cancionImg;
	
	private basededatos.Cancion _cancion;
	private iActor_comun bd = new BDPrincipal();
	
	public Cancion(basededatos.Cancion cancion) {
		
		_cancion = cancion;
		
		this.getTituloB().setVisible(false);
		
		this.getTituloB().setText(_cancion.getTitulo());
		
		Image img = new Image(GestorArchivos.CargarImagen(_cancion.getFicheroMultimediaAltaCalidadRuta()),
				_cancion.getFicheroMultimediaAltaCalidadRuta());
		img.setClassName("cancion");
		getCancionImgLayout().add(img);
		
		this.getCancionImgLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				Reproducir__No_Cibernauta_();
			}
		});
	}
	
	
	public void Reproducir__No_Cibernauta_() {
		bd.Aniadir_Cancion_Reproducida(_cancion.getORMID(), GestorActor.getIdUsuario());
		bd.Actualizar_Estadisticas(_cancion.getORMID(), GestorActor.getIdUsuario());
		
		GestorReproductor.setCancion(_cancion);
	}
}