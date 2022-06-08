package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import vistas.VistaCanciones_a_modificar_lista;

@CssImport("./styles/shared-styles.css")
public class Canciones_a_modificar_lista extends VistaCanciones_a_modificar_lista {

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	
	private Vector<VerticalLayout> _cancionesConEliminar = new Vector<VerticalLayout>();
	
	private basededatos.Lista_de_reproduccion _lista;
	
	private int _index = 0;
	private VerticalLayout _vl;
	private iActor_comun bd = new BDPrincipal();
	
	public Canciones_a_modificar_lista(basededatos.Lista_de_reproduccion lista) {
		
		_lista = lista;
		
		basededatos.Cancion[] incluidas = _lista.canciones_incluidas.toArray();
		
		for (int i = 0; i < incluidas.length; i++) {
			Cancion cancion = new Cancion(incluidas[i]);
			
			VerticalLayout eliminarConCancion = new VerticalLayout();
			Button eliminar = new Button("Eliminar");
			eliminar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					Eliminar_cancion_lista();
				}
			});
			eliminarConCancion.add(cancion);
			eliminarConCancion.add(eliminar);
			eliminarConCancion.setClassName("hlCancionesLista");
			
			_list_Cancion.add(cancion);
			_cancionesConEliminar.add(eliminarConCancion);
		}
		
		_vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		_index = _list_Cancion.size() - 1;
		
		if (_index >= 0)
			_vl.add(_cancionesConEliminar.elementAt(_index));
		
		this.getAnteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_index - 1 >= 0 && _cancionesConEliminar.size() > 0) {
					_vl.replace(_cancionesConEliminar.elementAt(_index), _cancionesConEliminar.elementAt(_index - 1));
					_index--;
				}
			}
		});
		
		this.getPosteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_index + 1 < _cancionesConEliminar.size() && _cancionesConEliminar.size() > 0) {
					_vl.replace(_cancionesConEliminar.elementAt(_index), _cancionesConEliminar.elementAt(_index + 1));
					_index++;
				}
			}
		});
		
		this.getAniadirCancionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Aniadir_cancion_lista();
			}
		});
		
		this.getAniadirCancionTF().addKeyPressListener(Key.ENTER, e -> {
			Aniadir_cancion_lista();
	    });
	}
	
	public void Aniadir_cancion_lista() {
		
		if (_list_Cancion.size() >= 1000) {
			Notification.show("Ha superado el nº máximo de canciones permitidas por lista");
			return;
		}
		
		if (getAniadirCancionTF().getValue().isBlank()) {
			Notification.show("Debe introducir un parámetro de búsqueda");
			return;
		}
		
		basededatos.Cancion[] resultados = bd.Realizar_Busqueda_Canciones(getAniadirCancionTF().getValue());
		
		if (resultados.length <= 0) {
			Notification.show("Sin resultados");
			return;
		}
		
		for (int i = 0; i < _list_Cancion.size(); i++) {
			if (_list_Cancion.elementAt(i)._cancion.getTitulo().equalsIgnoreCase(resultados[0].getTitulo())) {
				Notification.show("La cancion ya se encuentra en la lista");
				return;
			}
		}
			
		Cancion cancion = new Cancion(resultados[0]);
		
		VerticalLayout eliminarConCancion = new VerticalLayout();
		Button eliminar = new Button("Eliminar");
		eliminar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Eliminar_cancion_lista();
			}
		});
		eliminarConCancion.add(cancion);
		eliminarConCancion.add(eliminar);
		eliminarConCancion.setClassName("hlCancionesLista");
		
		if (_cancionesConEliminar.isEmpty()) {
			_vl.add(eliminarConCancion);
		}
		else {
			_vl.replace(_cancionesConEliminar.elementAt(_index), eliminarConCancion);
		}
		
		_list_Cancion.add(cancion);
		_cancionesConEliminar.add(eliminarConCancion);
		
		_index = _cancionesConEliminar.size() - 1;
	}
	
	public void Eliminar_cancion_lista() {
		if (_index + 1 < _cancionesConEliminar.size() && _cancionesConEliminar.size() > 0) {	
			_vl.replace(_cancionesConEliminar.elementAt(_index), _cancionesConEliminar.elementAt(_index + 1));
			
			_cancionesConEliminar.remove(_index);
			_list_Cancion.remove(_index);
		}
		else if (_index - 1 >= 0 && _cancionesConEliminar.size() > 0) {
			_vl.replace(_cancionesConEliminar.elementAt(_index), _cancionesConEliminar.elementAt(_index - 1));
			
			_cancionesConEliminar.remove(_index);
			_list_Cancion.remove(_index);
			
			_index--;
		}
		else {
			_vl.remove(_cancionesConEliminar.elementAt(_index));
			
			_cancionesConEliminar.remove(_index);
			_list_Cancion.remove(_index);
			
			_index--;
		}
	}
}
