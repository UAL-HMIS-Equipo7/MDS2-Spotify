package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Lista_de_reproduccion_ajena;
import vistas.VistaListas_recomendadas;

@CssImport("./styles/shared-styles.css")
public class Listas_recomendadas extends VistaListas_recomendadas {

	public Vector<Lista_de_reproduccion_ajena> _list_Lista_de_reproduccion_ajena = new Vector<Lista_de_reproduccion_ajena>();
	
	private Usuario_generico _usuario;
	private iActor_comun bd = new BDPrincipal();
	
	public Listas_recomendadas(Usuario_generico usuario) {
		
		_usuario = usuario;
		
		CargarListasRecomendadas();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		if (!_list_Lista_de_reproduccion_ajena.isEmpty())
			vl.add(_list_Lista_de_reproduccion_ajena.firstElement());
	}
	
	public void CargarListasRecomendadas() {
		
		basededatos.Lista_de_reproduccion[] listas = bd.Cargar_Listas_Recomendadas(_usuario.getORMID());
		
		Lista_de_reproduccion_ajena temp;
		
		for (int i = 0; i < 2 && i < listas.length; i++) {
			if (listas[i].canciones_incluidas.size() == 0)
				continue;
			
			temp = new Lista_de_reproduccion_ajena(listas[i]);
			temp.setClassName("max250");
			
			_list_Lista_de_reproduccion_ajena.add(temp);
		}
	}
}