package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_propio__Usuario_Registrado_ extends Ver_perfil_propio {
//	private Button _darseBajaB;
//	private Button _modificarInformacionB;
	public Darse_de_baja _darse_de_baja;
	public Editar_informacion_del_perfil_no_artista _editar_informacion_del_perfil_no_artista;
	
	public Ver_perfil_propio__Usuario_Registrado_(VerticalLayout layoutPadre) {
		super(layoutPadre);
		
		this.getAniadirInformacionEventosB().setVisible(false);	
		
		this.getDarseBajaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();
				
				_darse_de_baja = new Darse_de_baja(ventanaModal);
				
				ventanaModal.add(_darse_de_baja);
				ventanaModal.open();
			}
		});
		
		this.getModificarInformacionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				VerticalLayout contenedor = getContenedorIzquierdo().as(VerticalLayout.class);
				
				_editar_informacion_del_perfil_no_artista = new Editar_informacion_del_perfil_no_artista();
				
				_editar_informacion_del_perfil_no_artista.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						
						//Llamar a _editar_informacion_del_perfil_no_artista.Validar_datos_de_perfil()
						
						contenedor.remove(_editar_informacion_del_perfil_no_artista);
						getNickL().setVisible(true);
						getEmailL().setVisible(true);
						getDarseBajaB().setVisible(true);
						getModificarInformacionB().setVisible(true);
					}
				});
				
				contenedor.add(_editar_informacion_del_perfil_no_artista);
				getNickL().setVisible(false);
				getEmailL().setVisible(false);
				getDarseBajaB().setVisible(false);
				getModificarInformacionB().setVisible(false);
			}
		});
	}
}