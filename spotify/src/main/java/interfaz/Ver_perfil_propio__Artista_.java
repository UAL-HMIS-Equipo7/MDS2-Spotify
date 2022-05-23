package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
import spotify.GestorVentana;

public class Ver_perfil_propio__Artista_ extends Ver_perfil_propio {
//	private Button _darseBajaB;
//	private Button _aniadirInformacionEventos;
	public Aniadir_informacion_de_eventos _aniadir_informacion_de_eventos;
	public Darse_de_baja _darse_de_baja;
	public Editar_foto_de_perfil__Artista_ _editar_foto_de_perfil__Artista_;
	public Panel_artista _panel_artista;

	
	public Ver_perfil_propio__Artista_(basededatos.Artista artista) {
		super();
		
		 _editar_foto_de_perfil__Artista_ = new Editar_foto_de_perfil__Artista_();
		 _panel_artista = new Panel_artista();
		 
		 VerticalLayout vl = this.getContenedorDerecho().as(VerticalLayout.class);
		 vl.add(_panel_artista);
		 vl.add(_editar_foto_de_perfil__Artista_);
		
		this.getModificarInformacionB().setVisible(false);
		
		this.getDarseBajaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();
				
				_darse_de_baja = new Darse_de_baja(ventanaModal);
				
				ventanaModal.add(_darse_de_baja);
				ventanaModal.open();
			}
		});
		
		this.getAniadirInformacionEventosB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_aniadir_informacion_de_eventos = new Aniadir_informacion_de_eventos(artista);
				
				
				GestorVentana.CambiarVentana(_aniadir_informacion_de_eventos);
				
			}
		});
	}
}