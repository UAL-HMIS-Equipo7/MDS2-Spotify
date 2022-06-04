package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import spotify.GestorActor;
import vistas.VistaModificar_lista_de_reproduccion;

public class Modificar_lista_de_reproduccion extends VistaModificar_lista_de_reproduccion {
//	private event _eliminar_cancion;
//	private event _aniadir_cancion;
//	private event _eliminar_lista_de_reproduccion;
	public Crear_lista_de_reproduccion _crear_lista_de_reproduccion;
	
	private VerticalLayout vl;
	
	iActor_comun bd = new BDPrincipal();
	
	basededatos.Lista_de_reproduccion _lista;
	
	public Modificar_lista_de_reproduccion(basededatos.Lista_de_reproduccion lista) {
		
		_lista = lista;
		
		vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_crear_lista_de_reproduccion = new Crear_lista_de_reproduccion(GestorActor.getUsuario()){
			@Override
			public void Guardar_cambios_lista() {
				
				//Override para tener acceso a la lista de canciones
				
			}
		};
		vl.add(_crear_lista_de_reproduccion);
		
		this.getEliminarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Eliminar_cancion();
				
			}
		});
		
		this.getAniadirB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				Aniadir_cancion();
				
			}
		});
		
		this.getEliminarB2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Eliminar_lista_de_reproduccion();
				
				GestorActor.RecargarActorActual();
			}
		});
	}
	

	public void Eliminar_cancion() {
		throw new UnsupportedOperationException();
	}

	public void Aniadir_cancion() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_lista_de_reproduccion() {
		bd.Eliminar_Lista_De_Reproduccion(_lista.getORMID());
	}
}