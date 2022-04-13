package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public Cabecera_superior(VerticalLayout layoutPadre) {
		
		this.getVerPerfilAdministradorB().setVisible(false);
		this.getVerPerfilArtistaB().setVisible(false);
		this.getVerPerfilUsuarioB().setVisible(false);
		
		this.getContactoB().addEventListener("click", e -> {
			_contactar_con_la_empresa = new Contactar_con_la_empresa(layoutPadre);
			
			layoutPadre.removeAll();
			layoutPadre.add(_contactar_con_la_empresa);
		});
		
		this.getBuscarB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				//Sacar el contenido del TF y pasarlo por parámetro
				_realizar_busqueda = new Realizar_busqueda(layoutPadre);
				
				layoutPadre.removeAll();
				layoutPadre.add(_realizar_busqueda);
			}
		});
		
		this.getCerrarSesionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//Esto tiene que cambiar el actor que está usando la aplicación, desde el MainView, como lo hacemos, pasamos el MainView por parametro?
				
			}
		});
	}

	public void Cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
}