package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificar_lista_de_reproduccion;

public class Modificar_lista_de_reproduccion extends VistaModificar_lista_de_reproduccion {
//	private event _eliminar_cancion;
//	private event _aniadir_cancion;
//	private event _eliminar_lista_de_reproduccion;
	public Crear_lista_de_reproduccion _crear_lista_de_reproduccion;
	
	private VerticalLayout vl;
	
	public Modificar_lista_de_reproduccion() {
		
		vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_crear_lista_de_reproduccion = new Crear_lista_de_reproduccion();
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
				//Aqui devolver a la vista anterior
				
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
		throw new UnsupportedOperationException();
	}
}