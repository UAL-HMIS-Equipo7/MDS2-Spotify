package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorActor;
import spotify.GestorVentana;
import vistas.VistaMenu_administracion;

public class Menu_Administracion extends VistaMenu_administracion {
//	private event _editar_canciones_que_puede_escuchar_un_cibernauta;
//	private event _editar_numero_de_canciones_que_puede_escuchar_un_cibernauta;
//	private Button _darAltaB;
//	private Label _numCancionesMostradasL;
//	private TextField _numCancionesMostradasTF;
//	private Label _limiteCancionesReproduciblesL;
//	private TextField _limiteCancionesReproduciblesTF;
//	private Button _busquedaB;
//	private TextField _busquedaTF;
	public Realizar_busqueda_de_administrador _realizar_busqueda_de_administrador;
	public Ver_menu_de_altas _ver_menu_de_altas;
	
	iAdministrador bd = new BDPrincipal();
	int numCancionesMostradas;
	int numCancionesReproducibles;
	basededatos.Administrador _administrador;
	
	public Menu_Administracion(basededatos.Administrador administrador) {
		
		_administrador = administrador;
		
		Cargar_Datos_Cibernauta();
		
		this.getBusquedaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				String params = getBusquedaTF().getValue();
				
				if (params.trim().isEmpty()) {
					Notification.show("Debe introducir una cadena de búsqueda");
					return;
				}
				
				_realizar_busqueda_de_administrador = new Realizar_busqueda_de_administrador(params);
				GestorVentana.CambiarVentana(_realizar_busqueda_de_administrador);
			}
		});
		
		this.getDarAltaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Dialog ventanaModal = new Dialog();

				_ver_menu_de_altas = new Ver_menu_de_altas(ventanaModal);

				ventanaModal.add(_ver_menu_de_altas);
				ventanaModal.open();

			}
		});
		
		this.getNumCancionesMostradasTF().addKeyPressListener(Key.ENTER, e -> {
			numCancionesMostradas = Integer.parseInt(this.getNumCancionesMostradasTF().getValue());
			
			Editar_canciones_que_puede_escuchar_un_cibernauta();
	    });
		
		this.getLimiteCancionesReproduciblesTF().addKeyPressListener(Key.ENTER, e -> {
			numCancionesReproducibles = Integer.parseInt(this.getLimiteCancionesReproduciblesTF().getValue());
			
	        Editar_numero_de_canciones_que_puede_escuchar_un_cibernauta();
	    });
	}
	
	public void Editar_canciones_que_puede_escuchar_un_cibernauta() {
		bd.Actualizar_Numero_Canciones_Mostradas(_administrador.getORMID(), numCancionesMostradas);
	}

	public void Editar_numero_de_canciones_que_puede_escuchar_un_cibernauta() {
		bd.Actualizar_Numero_Canciones_Reproducibles(_administrador.getORMID(), numCancionesReproducibles);
	}
	
	public void Cargar_Datos_Cibernauta() {
		numCancionesMostradas = bd.Cargar_Numero_Canciones_Mostradas(_administrador.getORMID());
		numCancionesReproducibles = bd.Cargar_Numero_Canciones_Reproducibles(_administrador.getORMID());
		
		this.getNumCancionesMostradasTF().setValue(Integer.toString(numCancionesMostradas));
		this.getLimiteCancionesReproduciblesTF().setValue(Integer.toString(numCancionesReproducibles));
	}
}