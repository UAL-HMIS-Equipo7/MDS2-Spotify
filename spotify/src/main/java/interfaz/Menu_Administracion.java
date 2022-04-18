package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public Menu_Administracion() {
		
		this.getBusquedaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				
				
				//Pasar los datos del TF
				_realizar_busqueda_de_administrador = new Realizar_busqueda_de_administrador();
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
	}
	
	public void Editar_canciones_que_puede_escuchar_un_cibernauta() {
		throw new UnsupportedOperationException();
	}

	public void Editar_numero_de_canciones_que_puede_escuchar_un_cibernauta() {
		throw new UnsupportedOperationException();
	}
}