package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_generico;
import spotify.GestorActor;
import spotify.GestorVentana;
import vistas.VistaCabecera_superior;

public class Cabecera_superior extends VistaCabecera_superior {
//	private Button _inicioB;
//	private Label _telefonoL;
//	private Button _contactoB;
//	private Button _buscarB;
//	private TextField _buscarTF;
//	private Image _perfilImg;
//	private Button _cerrarSesionB;
//	private event _cerrar_sesion;
//	private Button _volverAInicioB;

	public Contactar_con_la_empresa _contactar_con_la_empresa;
	public Realizar_busqueda _realizar_busqueda;
	
	public Cabecera_superior() {
		
		this.getVerPerfilAdministradorB().setVisible(false);
		this.getVerPerfilArtistaB().setVisible(false);
		this.getVerPerfilUsuarioB().setVisible(false);
		
		this.getContactoB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_contactar_con_la_empresa = new Contactar_con_la_empresa();
				
				
				GestorVentana.CambiarVentana(_contactar_con_la_empresa);
			}
		});
		
		this.getBuscarTF().addKeyPressListener(Key.ENTER, e -> {
			String paramsBusqueda = getBuscarTF().getValue();
			
			if (paramsBusqueda.trim().isEmpty()) {
				Notification.show("Debe introducir parámetros de búsqueda");
				return;
			}
			
			_realizar_busqueda = new Realizar_busqueda(paramsBusqueda);
			
			GestorVentana.CambiarVentana(_realizar_busqueda);
	    });
		
		this.getBuscarB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				String paramsBusqueda = getBuscarTF().getValue();
				
				if (paramsBusqueda.trim().isEmpty()) {
					Notification.show("Debe introducir parámetros de búsqueda");
					return;
				}
				
				_realizar_busqueda = new Realizar_busqueda(paramsBusqueda);
				
				GestorVentana.CambiarVentana(_realizar_busqueda);
			}
		});
		
		this.getCerrarSesionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Cerrar_sesion();
			}
		});
	}

	public void Cerrar_sesion() {
		GestorActor.Cibernauta();
	}
	
	public void Ver_perfil() {
		//Overrideado
		throw new UnsupportedOperationException();
	}
}