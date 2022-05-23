package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iArtista;
import vistas.VistaAniadir_informacion_de_eventos;

public class Aniadir_informacion_de_eventos extends VistaAniadir_informacion_de_eventos {
//	private event _confirmar_evento;
	private iArtista bd = new BDPrincipal();
	private basededatos.Artista artista;
	
	public Aniadir_informacion_de_eventos(basededatos.Artista artista) {
		this.artista = artista;
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//Ver como mandarlo de vuelta al Ver_perfil_propio_Artista
				
			}
		});
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				// Ver como mandarlo de vuelta al Ver_perfil_propio_Artista

			}
		});
		this.getElegirImagenFC().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//obtener lo que se selecciona en el fc
				
				
			}
		});
	}

	public void Validar_informacion_evento() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_evento() {
		//falta ruta imagen
		bd.Crear_Evento(artista.getORMID(), "", this.getFechaHoraTF().getValue(), this.getVaadinTextArea().getValue(), Integer.parseInt(this.getPrecioTF().getValue()));
	}
}