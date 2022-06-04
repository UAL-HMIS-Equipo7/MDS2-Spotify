package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Cancion_a_eliminar_album;
import vistas.VistaCanciones_en_album;

public class Canciones_en_album extends VistaCanciones_en_album {
//	private event _aniadir_cancion_album;
//	private Label _tituloL;
//	private TextField _aniadirCancionTF;
//	private Button _aniadirCancionB;
//	private Button _anteriorB;
//	private Button _posteriorB;

	public Vector<Cancion_a_eliminar_album> _list_Cancion_a_eliminar_album = new Vector<Cancion_a_eliminar_album>();
	
	private iAdministrador bd = new BDPrincipal();
	private int _index = 0;
	private VerticalLayout _vl;
	
	public Canciones_en_album(basededatos.Album album) {
		
		basededatos.Cancion[] incluidas = album.incluye_a.toArray();
		
		for (int i = 0; i < incluidas.length; i++) {
			Cancion_a_eliminar_album cancion = new Cancion_a_eliminar_album(incluidas[i]);
			cancion.getEliminarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					Eliminar_cancion_album();
				}
			});
			_list_Cancion_a_eliminar_album.add(cancion);
		}
		
		_vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		_index = _list_Cancion_a_eliminar_album.size() - 1;
		
		if (_index >= 0)
			_vl.add(_list_Cancion_a_eliminar_album.elementAt(_index));
		
		this.getAnteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_index - 1 >= 0 && _list_Cancion_a_eliminar_album.size() > 0) {
					_vl.replace(_list_Cancion_a_eliminar_album.elementAt(_index), _list_Cancion_a_eliminar_album.elementAt(_index - 1));
					_index--;
				}
			}
		});
		
		this.getPosteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_index + 1 < _list_Cancion_a_eliminar_album.size() && _list_Cancion_a_eliminar_album.size() > 0) {
					_vl.replace(_list_Cancion_a_eliminar_album.elementAt(_index), _list_Cancion_a_eliminar_album.elementAt(_index + 1));
					_index++;
				}
			}
		});
		
		this.getAniadirCancionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Aniadir_cancion_album();
			}
		});
	}

	public void Aniadir_cancion_album() {
		
		if (getAniadirCancionTF().getValue().isBlank()) {
			Notification.show("Debe introducir un parámetro de búsqueda");
			return;
		}
		
		basededatos.Cancion[] resultados = bd.Cargar_Canciones_Administrador(getAniadirCancionTF().getValue());
		
		if (resultados.length <= 0) {
			Notification.show("Sin resultados");
			return;
		}
		
		for (int i = 0; i < _list_Cancion_a_eliminar_album.size(); i++) {
			if (_list_Cancion_a_eliminar_album.elementAt(i).cancion.getTitulo().equalsIgnoreCase(resultados[0].getTitulo())) {
				Notification.show("La cancion ya se encuentra en el album");
				return;
			}
		}
			
		Cancion_a_eliminar_album cancion = new Cancion_a_eliminar_album(resultados[0]);
		
		cancion.getEliminarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Eliminar_cancion_album();
			}
		});
		
		
		if (_list_Cancion_a_eliminar_album.isEmpty()) {
			_vl.add(cancion);
		}
		else {
			_vl.replace(_list_Cancion_a_eliminar_album.elementAt(_index), cancion);
		}
		
		_list_Cancion_a_eliminar_album.add(cancion);
		_index = _list_Cancion_a_eliminar_album.size() - 1;
	}
	
	public void Eliminar_cancion_album() {
		if (_index + 1 < _list_Cancion_a_eliminar_album.size() && _list_Cancion_a_eliminar_album.size() > 0) {	
			_vl.replace(_list_Cancion_a_eliminar_album.elementAt(_index), _list_Cancion_a_eliminar_album.elementAt(_index + 1));
			
			_list_Cancion_a_eliminar_album.remove(_index);
		}
		else if (_index - 1 >= 0 && _list_Cancion_a_eliminar_album.size() > 0) {
			_vl.replace(_list_Cancion_a_eliminar_album.elementAt(_index), _list_Cancion_a_eliminar_album.elementAt(_index - 1));
			
			_list_Cancion_a_eliminar_album.remove(_index);
			
			_index--;
		}
		else {
			_vl.remove(_list_Cancion_a_eliminar_album.elementAt(_index));
			
			_list_Cancion_a_eliminar_album.remove(_index);
			
			_index--;
		}
	}
}