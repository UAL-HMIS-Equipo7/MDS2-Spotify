package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaVer_evento;

public class Ver_evento extends VistaVer_evento {
//	private Label _tituloL;
//	private Image _fotoEventoImg;
//	private Label _fechaHoraL;
//	private Label _descripcionTituloL;
//	private TextField _descripcionTF;
//	private Label _precioL;
	
	public Ver_evento(basededatos.Evento evento) {
		
		this.getDescripcionTF().setValue(evento.getDescripcion());
		this.getFechaHoraL().setText(evento.getFechaYHora());
		this.getFotoEventoImg().setSrc(GestorArchivos.CargarImagen(evento.getImagenRuta()));
		this.getPrecioL().setText(Integer.toString(evento.getPrecio()));
		this.getTituloL().setText(evento.getPublicado_por().getNick());
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				 
				GestorVentana.Atras();
			}
		});

	}
}