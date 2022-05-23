package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.Imagen_estilos;
import vistas.VistaEstilos_mas_escuchados;

@CssImport("./styles/shared-styles.css")
public class Estilos_mas_escuchados extends VistaEstilos_mas_escuchados {
//	private Label _tituloL;

	public Vector<Imagen_estilos> _list_Imagen_estilos = new Vector<Imagen_estilos>();
	private iActor_comun bd = new BDPrincipal();
	private basededatos.Usuario_generico _usuario;
	
	public Estilos_mas_escuchados(basededatos.Usuario_generico usuario) {
		
		_usuario = usuario;
		
		CargarEstilosMasEscuchados();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 3 && i < _list_Imagen_estilos.size(); i++) {
			hlSup.add(_list_Imagen_estilos.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 3; i < 6 && i < _list_Imagen_estilos.size(); i++) {
			hlInf.add(_list_Imagen_estilos.get(i));
		}
	}
	
	public void CargarEstilosMasEscuchados() {
		basededatos.Estilo[] estilos = bd.Cargar_Estilos_Mas_Escuchados(_usuario.getORMID());
		
		Imagen_estilos temp;
		
		for (int i = 0; i < 10 && i < estilos.length; i++) {
			temp = new Imagen_estilos(estilos[i]);
			temp.setClassName("imagenEstilo");
			
			_list_Imagen_estilos.add(temp);
		}
	}
}