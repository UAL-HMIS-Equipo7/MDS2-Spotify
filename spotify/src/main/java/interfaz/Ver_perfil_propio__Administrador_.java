package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_propio__Administrador_ extends Ver_perfil_propio {
//	private Button _modificarInformacionB;
	public Editar_informacion_del_perfil_no_artista _editar_informacion_del_perfil_no_artista;
	
	public Ver_perfil_propio__Administrador_(VerticalLayout layoutPadre) {
		// TODO Auto-generated constructor stub
		super(layoutPadre);

		this.getDarseBajaB().setVisible(false);
		this.getAniadirInformacionEventosB().setVisible(false);
		
		
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
						getModificarInformacionB().setVisible(true);
					}
				});
				
				contenedor.add(_editar_informacion_del_perfil_no_artista);
				getNickL().setVisible(false);
				getEmailL().setVisible(false);
				getModificarInformacionB().setVisible(false);
			}
		});

	}
}