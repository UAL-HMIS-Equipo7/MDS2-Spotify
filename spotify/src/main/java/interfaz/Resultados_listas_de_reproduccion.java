package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion_ajena;
import vistas.VistaResultados_listas_de_reproduccion;

public class Resultados_listas_de_reproduccion extends VistaResultados_listas_de_reproduccion {
//	private Label _tituloL;
	public Vector<Lista_de_reproduccion_ajena> _list_Lista_de_reproduccion_ajena = new Vector<Lista_de_reproduccion_ajena>();
	
	
	
	public Resultados_listas_de_reproduccion() {
		
		
		
		CargarListaDeReproduccionAjena();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 3 && i < _list_Lista_de_reproduccion_ajena.size(); i++) {
			hlSup.add(_list_Lista_de_reproduccion_ajena.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 0; i < 2 && i < _list_Lista_de_reproduccion_ajena.size(); i++) {
			hlInf.add(_list_Lista_de_reproduccion_ajena.get(i));
		}
	}
	
	public void CargarListaDeReproduccionAjena() {
		Lista_de_reproduccion_ajena temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Lista_de_reproduccion_ajena();
			
			_list_Lista_de_reproduccion_ajena.add(temp);
		}
	}
	}
