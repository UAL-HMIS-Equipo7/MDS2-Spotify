package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;

public class Reproductor__No_Cibernauta_ extends Reproductor {
//	private event _avanzar_10_segundos;
//	private event _retroceder_10_segundos;
//	private event _reproduccion_en_bucle;
//	private event _siguiente_cancion;
//	private event _cancion_anterior;
//	private Button _tituloB;
//	private Label _duracionL;
//	private Button _bucleB;
//	private Button _anterioB;
//	private Button _retrocederB;
//	private Button _avanzarB;
//	private Button _siguienteB;
//	private Slider _barraVolumenSD;
	public Ver_cancion _ver_cancion;
	
	public Reproductor__No_Cibernauta_() {
		
		super();
		
		this.getCreditosB().setVisible(false);
		this.getTituloL().setVisible(false);
		this.getTituloB().setVisible(true);
		
		CargarCancion();
	}
	
	@Override
	public void CargarCancion() {
		super.CargarCancion();

		if (_cancion == null) {
			this.getTituloB().setVisible(false);
		} else {
			this.getTituloB().setText(_cancion.getTitulo());
			this.getTituloB().setVisible(true);
			this.getTituloB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

				@Override
				public void onComponentEvent(ClickEvent<Button> event) {

					_ver_cancion = new Ver_cancion(_cancion);

					GestorVentana.CambiarVentana(_ver_cancion);
				}
			});
		}
	}

	public void Avanzar_10_segundos() {
		throw new UnsupportedOperationException();
	}

	public void Retroceder_10_segundos() {
		throw new UnsupportedOperationException();
	}

	public void Reproduccion_en_bucle() {
		throw new UnsupportedOperationException();
	}

	public void Siguiente_cancion() {
		throw new UnsupportedOperationException();
	}

	public void Cancion_anterior() {
		throw new UnsupportedOperationException();
	}
}