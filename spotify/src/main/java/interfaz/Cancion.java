package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import spotify.GestorActor;
import spotify.GestorArchivos;
import spotify.GestorReproductor;
import vistas.VistaCancion;

public class Cancion extends VistaCancion {
//	private event _reproducir__No_Cibernauta_;
//	private Image _cancionImg;
	
	private basededatos.Cancion _cancion;
	private iActor_comun bd = new BDPrincipal();
	
	public Cancion(basededatos.Cancion cancion) {
		
		_cancion = cancion;
		
		this.getTituloB().setVisible(false);
		
		this.getTituloB().setText(_cancion.getTitulo());
		this.getCancionImg().setSrc(GestorArchivos.CargarImagen(_cancion.getFicheroMultimediaAltaCalidadRuta()));
		
		this.getCancionImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
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