package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Estilo;

public class BD_Estilos {
	public BDPrincipal _bDPrincipal_estilos;
	public Vector<Estilo> _contiene_eventos = new Vector<Estilo>();

	public void Crear_Estilo(String nombre) throws PersistentException {
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			Estilo estilo = EstiloDAO.createEstilo();
			
			estilo.setNombre(nombre);
			
			EstiloDAO.save(estilo);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public Estilo[] Cargar_Estilos() throws PersistentException {
		Estilo[] estilos = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			estilos = EstiloDAO.listEstiloByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return estilos;
	}
}