package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUsuario_Registrado;

public class Ver_perfil_propio__Administrador_ extends Ver_perfil_propio {
//	private Button _modificarInformacionB;
	public Editar_informacion_del_perfil_no_artista _editar_informacion_del_perfil_no_artista;
	private iAdministrador bd = new BDPrincipal();
	
	public Ver_perfil_propio__Administrador_(basededatos.Administrador administrador) {
	
		super((basededatos.Usuario_generico) administrador);

		this.getDarseBajaB().setVisible(false);
		this.getAniadirInformacionEventosB().setVisible(false);
		
		
		this.getModificarInformacionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				VerticalLayout contenedor = getContenedorIzquierdo().as(VerticalLayout.class);

				_editar_informacion_del_perfil_no_artista = new Editar_informacion_del_perfil_no_artista(administrador) {
					@Override
					public void ActualizarPerfil() {
						bd.Actualizar_Perfil(administrador.getORMID(), getEmailTF().getValue(), getNickTF().getValue());
					}
				};

				_editar_informacion_del_perfil_no_artista.getGuardarB()
						.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

							@Override
							public void onComponentEvent(ClickEvent<Button> event) {

								if (!_editar_informacion_del_perfil_no_artista.Validar_datos_de_perfil()) {
									Notification.show("Debe rellenar todos los campos");
								}
								_editar_informacion_del_perfil_no_artista.ActualizarPerfil();

								contenedor.remove(_editar_informacion_del_perfil_no_artista);
								getNickL().setVisible(true);
								getEmailL().setVisible(true);
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