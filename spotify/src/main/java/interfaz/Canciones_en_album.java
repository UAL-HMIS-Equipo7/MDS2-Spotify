package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
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
			_list_Cancion_a_eliminar_album.add(new Cancion_a_eliminar_album(incluidas[i]));
		}
		
		_vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		_index = _list_Cancion_a_eliminar_album.size() - 1;
		_vl.add(_list_Cancion_a_eliminar_album.elementAt(_index));
		
		this.getAnteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_index - 1 >= 0 && _list_Cancion_a_eliminar_album.size() > 0) {
					_vl.replace(_list_Cancion_a_eliminar_album.elementAt(_index), _list_Cancion_a_eliminar_album.elementAt(_index + 1));
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
	}

	public void Aniadir_cancion_album() {
		basededatos.Cancion[] resultados = bd.Cargar_Canciones_Administrador(getAniadirCancionTF().getValue());
		
		if (resultados.length > 0) {
			Cancion_a_eliminar_album cancion = new Cancion_a_eliminar_album(resultados[0]);
			cancion.getEliminarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					// TODO
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
	}
}