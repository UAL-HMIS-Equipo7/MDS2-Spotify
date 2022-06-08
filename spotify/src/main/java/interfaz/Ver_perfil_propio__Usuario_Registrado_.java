package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
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
						int codigo = bd.Comprobar_Datos_Usuario(usuario.getORMID(), getEmailTF().getValue(), getNickTF().getValue());
						
						if (codigo == 1) {
							Notification.show("El email introducido ya existe");
							return;
						}
						
						if (codigo == 2) {
							Notification.show("El nick introducido ya existe");
							return;
						}
						
						bd.Actualizar_Perfil_Usuario(usuario.getORMID(), getEmailTF().getValue(), getNickTF().getValue());
						
						contenedor.remove(_editar_informacion_del_perfil_no_artista);
						usuario.setNick(_editar_informacion_del_perfil_no_artista.getNickTF().getValue());
						getNickL().setText(_editar_informacion_del_perfil_no_artista.getNickTF().getValue());
						getNickL().setVisible(true);
						usuario.getDatos().setEmail(_editar_informacion_del_perfil_no_artista.getEmailTF().getValue());
						getEmailL().setText(_editar_informacion_del_perfil_no_artista.getEmailTF().getValue());
						getEmailL().setVisible(true);
					}
				};
				
				_editar_informacion_del_perfil_no_artista.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						
						if (_editar_informacion_del_perfil_no_artista.Validar_datos_de_perfil() == false) {
							Notification.show("Debe rellenar todos los campos");
						}
						
						_editar_informacion_del_perfil_no_artista.ActualizarPerfil();
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