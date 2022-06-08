package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Datos_Acceso;
import basededatos.iUsuario_Registrado;

public class Ver_perfil_propio__Usuario_Registrado_ extends Ver_perfil_propio {
//	private Button _darseBajaB;
//	private Button _modificarInformacionB;
	public Darse_de_baja _darse_de_baja;
	public Editar_informacion_del_perfil_no_artista _editar_informacion_del_perfil_no_artista;
	private iUsuario_Registrado bd = new BDPrincipal();
	
	public Ver_perfil_propio__Usuario_Registrado_(basededatos.Usuario_Registrado usuario) {
		super((basededatos.Usuario_generico) usuario);
		
		this.getAniadirInformacionEventosB().setVisible(false);	
		
		this.getDarseBajaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();
				
				_darse_de_baja = new Darse_de_baja(ventanaModal) {
					
					@Override
					public void Dar_de_baja() {
						bd.Eliminar_Usuario(usuario.getORMID());
					}
				};
				
				ventanaModal.add(_darse_de_baja);
				ventanaModal.open();
			}
		});
		
		this.getModificarInformacionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				VerticalLayout contenedor = getContenedorIzquierdo().as(VerticalLayout.class);
				
				_editar_informacion_del_perfil_no_artista = new Editar_informacion_del_perfil_no_artista(usuario) {
					@Override
					public void ActualizarPerfil() {
						bd.Actualizar_Perfil_Usuario(usuario.getORMID(), getEmailTF().getValue(), getNickTF().getValue());
					}
				};
				
				_editar_informacion_del_perfil_no_artista.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						
						_editar_informacion_del_perfil_no_artista.Validar_datos_de_perfil(); //bool?
						_editar_informacion_del_perfil_no_artista.ActualizarPerfil();
						
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