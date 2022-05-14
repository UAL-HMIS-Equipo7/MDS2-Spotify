package basededatos;

import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Lista_de_reproduccion;

public class BD_Lista_de_reproduccion {
	public BDPrincipal _bDPrincipal_lista_reproduccion;
	public Vector<Lista_de_reproduccion> _contiene_listas_de_reproduccion = new Vector<Lista_de_reproduccion>();

	public void Seguir_lista_de_reproduccion(int aIdUsuarioGenerico, int aIdLista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdLista);
			
			usuario.lista_seguida.add(lista);
			Usuario_genericoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Lista_de_reproduccion[] Realizar_Busqueda_Listas_Ajenas(String aParametrosBusqueda, int aIdUsuarioGenerico) throws PersistentException {
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];
		
		Lista_de_reproduccionCriteria criteria = new Lista_de_reproduccionCriteria();
		criteria.titulo.like("%" + aParametrosBusqueda.trim().toLowerCase() + "%");
		criteria.autorId.ne(aIdUsuarioGenerico);
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listas;
	}

	public Lista_de_reproduccion[] Cargar_Listas_Recomendadas(int aIdUsuarioGenerico) throws PersistentException {
		//Las recomendaciones se van a realizar de manera aleatoria
		
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
			
			Random generator = new Random();
			int randomIndex = generator.nextInt(listas.length);
			Lista_de_reproduccion randomAlbum = listas[randomIndex];
			listas = new Lista_de_reproduccion[] {randomAlbum};
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listas;
	}

	public Lista_de_reproduccion[] Cargar_Listas_Perfil(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public int Crear_Lista_de_Reproduccion(int aIdUsuarioGenericoAutor, String aTitulo) throws PersistentException {
		int id_lista = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenericoAutor);
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.createLista_de_reproduccion();
			lista.setTitulo(aTitulo);
			lista.setAutor(usuario);
			Lista_de_reproduccionDAO.save(lista);
			
			id_lista = lista.getORMID();
			t.commit();

		} catch (Exception e) {
			t.rollback();
		}
		
		return id_lista;
	}

	public Lista_de_reproduccion Cargar_Canciones_Favoritas(int aIdUsuarioGenerico) throws PersistentException {
		Lista_de_reproduccion lista = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			lista = usuario.getFavorita();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return lista;
	}
}