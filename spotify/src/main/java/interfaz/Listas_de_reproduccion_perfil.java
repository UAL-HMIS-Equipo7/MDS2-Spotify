package interfaz;

import vistas.VistaListas_de_reproduccion_perfil;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Lista_de_reproduccion_ajena;
import interfaz.Lista_de_reproduccion_propia;
import spotify.GestorActor;

@CssImport("./styles/shared-styles.css")
public class Listas_de_reproduccion_perfil extends VistaListas_de_reproduccion_perfil {
//	private event _cambiar_listas_por_pagina;
//	private Label _tituloL;
//	private TextField _listasPorPaginaTF;
//	private Button _anteriorB;
//	private Button _posteriorB;
//	private Label _numPaginaL;

	public Vector<Lista_de_reproduccion_ajena> _list_Lista_de_reproduccion_ajena = new Vector<Lista_de_reproduccion_ajena>();
	public Vector<Lista_de_reproduccion_propia> _list_Lista_de_reproduccion_propia = new Vector<Lista_de_reproduccion_propia>();
	
	Usuario_generico _usuario;
	iActor_comun bd = new BDPrincipal();
	boolean _sonPropias;
	int _index;

	public Listas_de_reproduccion_perfil(Usuario_generico usuario) {
		
		_usuario = usuario;
		
		this.getCrearListaB().setVisible(false);
		
		CargarListas();
		
		HorizontalLayout hl = this.getContenedor();
		
		_index = 0;
		
		if (_sonPropias && _list_Lista_de_reproduccion_propia.size() >= 1) {
			hl.add(_list_Lista_de_reproduccion_propia.elementAt(_index));
			
			if (_list_Lista_de_reproduccion_propia.size() >= 2)
				hl.add(_list_Lista_de_reproduccion_propia.elementAt(_index + 1));
		}
		else if (!_sonPropias && _list_Lista_de_reproduccion_ajena.size() >= 1) {
			hl.add(_list_Lista_de_reproduccion_ajena.elementAt(_index));
			
			if (_list_Lista_de_reproduccion_ajena.size() >= 2)
				hl.add(_list_Lista_de_reproduccion_ajena.elementAt(_index + 1));
		}
		
		this.getAnteriorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if (_sonPropias && _list_Lista_de_reproduccion_propia.size() >= 2) {
					if (_index - 2 >= 0 ) {
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index), _list_Lista_de_reproduccion_propia.elementAt(_index - 2));
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index + 1), _list_Lista_de_reproduccion_propia.elementAt(_index - 1));
						
						_index -= 2;
					}
					else if (_index - 1 >= 0) {
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index), _list_Lista_de_reproduccion_propia.elementAt(_index - 1));
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index + 1), _list_Lista_de_reproduccion_propia.elementAt(_index));
						
						_index -= 1;
					}
				}
				else if (!_sonPropias && _list_Lista_de_reproduccion_ajena.size() >= 2) {
					if (_index - 2 >= 0) {
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index), _list_Lista_de_reproduccion_ajena.elementAt(_index - 2));
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index + 1), _list_Lista_de_reproduccion_ajena.elementAt(_index - 1));
						
						_index -= 2;
					}
					else if (_index - 1 >= 0) {
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index), _list_Lista_de_reproduccion_ajena.elementAt(_index - 1));
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index + 1), _list_Lista_de_reproduccion_ajena.elementAt(_index));
						
						_index -= 1;
					}
				}
			}
		});
		
		this.getSiguienteB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if (_sonPropias && _list_Lista_de_reproduccion_propia.size() >= 2) {

					if (_index + 3 < _list_Lista_de_reproduccion_propia.size()) {
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index), _list_Lista_de_reproduccion_propia.elementAt(_index + 2));
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index + 1), _list_Lista_de_reproduccion_propia.elementAt(_index + 3));
						
						_index += 2;
					}
					else if (_index + 2 < _list_Lista_de_reproduccion_propia.size()) {
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index), _list_Lista_de_reproduccion_propia.elementAt(_index + 1));
						hl.replace(_list_Lista_de_reproduccion_propia.elementAt(_index + 1), _list_Lista_de_reproduccion_propia.elementAt(_index + 2));
						
						_index += 1;
					}
				}
				else if (!_sonPropias && _list_Lista_de_reproduccion_ajena.size() >= 2) {
					if (_index + 3 < _list_Lista_de_reproduccion_ajena.size()) {
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index), _list_Lista_de_reproduccion_ajena.elementAt(_index + 2));
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index + 1), _list_Lista_de_reproduccion_ajena.elementAt(_index + 3));
						
						_index += 2;
					}
					else if (_index + 2 < _list_Lista_de_reproduccion_ajena.size()) {
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index), _list_Lista_de_reproduccion_ajena.elementAt(_index + 1));
						hl.replace(_list_Lista_de_reproduccion_ajena.elementAt(_index + 1), _list_Lista_de_reproduccion_ajena.elementAt(_index + 2));
						
						_index += 1;
					}
				}
			}
		});
	}
	
	public void CargarListas(){
		
		basededatos.Lista_de_reproduccion[] listas = bd.Cargar_Listas_Perfil(_usuario.getORMID());
		
		if (listas == null || listas.length == 0)
			return;
		
		if (GestorActor.getIdUsuario() == _usuario.getORMID()) {
			Lista_de_reproduccion_propia temp;
			
			for (int i = 0; i < listas.length; i++) {
				
				temp = new Lista_de_reproduccion_propia(listas[i]);
				temp.setClassName("max250");
				
				_list_Lista_de_reproduccion_propia.add(temp);
			}
			
			_sonPropias = true;
		}
		else {
			Lista_de_reproduccion_ajena temp;
			
			for (int i = 0; i < listas.length; i++) {
				if (listas[i].canciones_incluidas.size() == 0)
					continue;
				
				temp = new Lista_de_reproduccion_ajena(listas[i]);
				temp.setClassName("max250");
				
				_list_Lista_de_reproduccion_ajena.add(temp);
			}
			
			_sonPropias = false;
		}
	}
}