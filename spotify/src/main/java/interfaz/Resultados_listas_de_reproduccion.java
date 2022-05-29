package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Lista_de_reproduccion_ajena;
import spotify.GestorActor;
import vistas.VistaResultados_listas_de_reproduccion;

public class Resultados_listas_de_reproduccion extends VistaResultados_listas_de_reproduccion {
//	private Label _tituloL;
	public Vector<Lista_de_reproduccion_ajena> _list_Lista_de_reproduccion_ajena = new Vector<Lista_de_reproduccion_ajena>();
	
	private String _params;
	private iActor_comun bd = new BDPrincipal();
	
	public Resultados_listas_de_reproduccion(String parametrosBusqueda) {
		
		_params = parametrosBusqueda;
		
		CargarListasDeReproduccionAjena();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 3 && i < _list_Lista_de_reproduccion_ajena.size(); i++) {
			hlSup.add(_list_Lista_de_reproduccion_ajena.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 0; i < 2 && i < _list_Lista_de_reproduccion_ajena.size(); i++) {
			hlInf.add(_list_Lista_de_reproduccion_ajena.get(i));
		}
	}
	
	public void CargarListasDeReproduccionAjena() {
		
		basededatos.Lista_de_reproduccion[] listas = bd.Realizar_Busqueda_Listas_Ajenas(_params, GestorActor.getIdUsuario());
		
		Lista_de_reproduccion_ajena temp;
		
		for (int i = 0; i < listas.length; i++) {
			if (listas[i].canciones_incluidas.size() == 0)
				continue;
			
			temp = new Lista_de_reproduccion_ajena(listas[i]);
			
			_list_Lista_de_reproduccion_ajena.add(temp);
		}
	}
	}
