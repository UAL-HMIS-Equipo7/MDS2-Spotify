package interfaz;

import vistas.VistaListas_de_reproduccion_perfil;

import java.util.Vector;
import interfaz.Lista_de_reproduccion_ajena;
import interfaz.Lista_de_reproduccion_propia;

public class Listas_de_reproduccion_perfil extends VistaListas_de_reproduccion_perfil {
//	private event _cambiar_listas_por_pagina;
//	private Label _tituloL;
//	private TextField _listasPorPaginaTF;
//	private Button _anteriorB;
//	private Button _posteriorB;
//	private Label _numPaginaL;
	public Ver_perfil_ajeno _ver_perfil_ajeno;
	public Vector<Lista_de_reproduccion_ajena> _list_Lista_de_reproduccion_ajena = new Vector<Lista_de_reproduccion_ajena>();
	public Vector<Lista_de_reproduccion_propia> _list_Lista_de_reproduccion_propia = new Vector<Lista_de_reproduccion_propia>();

	public void Cambiar_listas_por_pagina() {
		throw new UnsupportedOperationException();
	}
}