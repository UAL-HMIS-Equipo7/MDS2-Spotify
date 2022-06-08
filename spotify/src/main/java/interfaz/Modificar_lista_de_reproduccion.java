package interfaz;

import java.time.LocalDateTime;

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
	public Canciones_a_modificar_lista _canciones_a_modificar_lista;
	
	private VerticalLayout vl;
	
	iActor_comun bd = new BDPrincipal();
	
	basededatos.Lista_de_reproduccion _lista;
	
	public Modificar_lista_de_reproduccion(basededatos.Lista_de_reproduccion lista) {
		
		_lista = lista;
		
		vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_crear_lista_de_reproduccion = new Crear_lista_de_reproduccion(GestorActor.getUsuario()){
			@Override
			public void Guardar_cambios_lista() {
				
				_lista.canciones_incluidas.clear();
				
				for(int i = 0; i< _canciones_a_modificar_lista._list_Cancion.size();i++) {
					_lista.canciones_incluidas.add(_canciones_a_modificar_lista._list_Cancion.get(i)._cancion);
				}
				
				_lista.setTitulo(this.getTituloListaTF().getValue());

				bd.Actualizar_Lista(lista);
			}
		};
		_crear_lista_de_reproduccion.getTituloListaTF().setValue(_lista.getTitulo());
		_crear_lista_de_reproduccion.getAutorListaTF().setValue(_lista.getAutor().getNick());
		vl.add(_crear_lista_de_reproduccion);
		
		_canciones_a_modificar_lista = new Canciones_a_modificar_lista(lista);
		vl.add(_canciones_a_modificar_lista);
		
		this.getEliminarB2().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Eliminar_lista_de_reproduccion();
				
				GestorActor.RecargarActorActual();
			}
		});
	}

	public void Eliminar_lista_de_reproduccion() {
		bd.Eliminar_Lista_De_Reproduccion(_lista.getORMID());
	}
}