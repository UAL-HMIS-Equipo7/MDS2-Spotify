package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Estilo;

public class BD_Estilos {
	public BDPrincipal _bDPrincipal_estilos;
	public Vector<Estilo> _contiene_eventos = new Vector<Estilo>();

	public int Crear_Estilo(String aNombre) throws PersistentException {
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		int idEstilo = -1;
		try {

			Estilo estilo = EstiloDAO.createEstilo();
			
			estilo.setNombre(aNombre.trim());
			
			EstiloDAO.save(estilo);
			idEstilo = estilo.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		return idEstilo;
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