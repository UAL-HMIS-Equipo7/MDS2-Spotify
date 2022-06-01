package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import spotify.GestorVentana;
import vistas.VistaCrear_lista_de_reproduccion;

public class Crear_lista_de_reproduccion extends VistaCrear_lista_de_reproduccion {
//	private event _guardar_cambios_lista;
	
	Usuario_generico _usuario;
	iActor_comun bd = new BDPrincipal();
	
	public Crear_lista_de_reproduccion(Usuario_generico usuario) {
		
		_usuario = usuario;
		
		this.getAutorListaTF().setValue(_usuario.getNick());
		this.getAutorListaTF().setEnabled(false);
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(Validar_datos_lista() == false) {
					Notification.show("Hay algun error en los campos introducidos");
					return;
				}
				Guardar_cambios_lista();
				
				GestorVentana.Atras();
			}
		});
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				GestorVentana.Atras();
			}
		});
		
	}

	public boolean Validar_datos_lista() {
		boolean correcto = true;
		if(this.getTituloListaTF().getValue().isBlank()) {
			correcto = false;
		}
		return correcto;
	}

	public void Guardar_cambios_lista() {
		bd.Crear_Lista_de_Reproduccion(_usuario.getORMID(), getTituloListaTF().getValue());
	}
}