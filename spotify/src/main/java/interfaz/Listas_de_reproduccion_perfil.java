package interfaz;

import vistas.VistaListas_de_reproduccion_perfil;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion_ajena;
import interfaz.Lista_de_reproduccion_propia;

public class Listas_de_reproduccion_perfil extends VistaListas_de_reproduccion_perfil {
//	private event _cambiar_listas_por_pagina;
//	private Label _tituloL;
//	private TextField _listasPorPaginaTF;
//	private Button _anteriorB;
//	private Button _posteriorB;
//	private Label _numPaginaL;

	public Vector<Lista_de_reproduccion_ajena> _list_Lista_de_reproduccion_ajena = new Vector<Lista_de_reproduccion_ajena>();
	public Vector<Lista_de_reproduccion_propia> _list_Lista_de_reproduccion_propia = new Vector<Lista_de_reproduccion_propia>();
	
	

	public Listas_de_reproduccion_perfil() {
		
		
		
		this.getCrearListaB().setVisible(false);
		
		CargarListas();
		
		HorizontalLayout hl = this.getContenedor();
		
		hl.add(_list_Lista_de_reproduccion_ajena.firstElement());
		hl.add(_list_Lista_de_reproduccion_propia.firstElement());
		
		//Usar replace cuando le demos a anterior o siguiente
	}
	
	public void CargarListas(){
		Lista_de_reproduccion_ajena temp;
		
		for (int i = 0; i < 2; i++) {
			temp = new Lista_de_reproduccion_ajena();
			
			_list_Lista_de_reproduccion_ajena.add(temp);
		}
		
		Lista_de_reproduccion_propia temp2;
		
		for (int i = 0; i < 2; i++) {
			temp2 = new Lista_de_reproduccion_propia();
			
			_list_Lista_de_reproduccion_propia.add(temp2);
		}
	}
	
	public void Cambiar_listas_por_pagina() {
		throw new UnsupportedOperationException();
	}
}