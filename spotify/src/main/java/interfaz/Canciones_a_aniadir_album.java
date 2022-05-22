package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Cancion_album;
import vistas.VistaCanciones_a_aniadir_album;

public class Canciones_a_aniadir_album extends VistaCanciones_a_aniadir_album {
//	private event _aniadir_cancion_album;
//	private TextField _aniadirCancionTF;
//	private Button _anteriorB;
//	private Button _posteriorB;

	public Vector<Cancion_album> _list_Cancion_album = new Vector<Cancion_album>();
	
	private iAdministrador bd = new BDPrincipal();
	
	private int _index = 0;
	
	private VerticalLayout _vl;
	
	public Canciones_a_aniadir_album() {
		
		_vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		this.getAniadirCancionTF().addKeyPressListener(Key.ENTER, e -> {
			Aniadir_cancion_album();
	    });
		
		this.getAnteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_index - 1 >= 0 && _list_Cancion_album.size() > 0) {
					_vl.replace(_list_Cancion_album.elementAt(_index), _list_Cancion_album.elementAt(_index + 1));
					_index--;
				}
			}
		});
		
		this.getPosteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_index + 1 < _list_Cancion_album.size() && _list_Cancion_album.size() > 0) {
					_vl.replace(_list_Cancion_album.elementAt(_index), _list_Cancion_album.elementAt(_index + 1));
					_index++;
				}
			}
		});

	}

	public void Aniadir_cancion_album() {
		basededatos.Cancion[] resultados = bd.Cargar_Canciones_Administrador(getAniadirCancionTF().getValue());
		
		if (resultados.length > 0) {
			Cancion_album cancion = new Cancion_album(resultados[0]);
			
			if (_list_Cancion_album.isEmpty()) {
				_vl.add(cancion);
			}
			else {
				_vl.replace(_list_Cancion_album.elementAt(_index), cancion);
			}
			
			_list_Cancion_album.add(cancion);
			_index = _list_Cancion_album.size() - 1;
		}
	}
}