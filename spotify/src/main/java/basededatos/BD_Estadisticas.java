package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Estadistica;

public class BD_Estadisticas {
	public Vector<Estadistica> _contiene_estadisticas = new Vector<Estadistica>();
	public BDPrincipal _bDPrincipal_estadisticas;

	public Estilo[] Cargar_Estilos_Mas_Escuchados(int aIdUsuarioGenerico) throws PersistentException {
		Estilo[] estilos = new Estilo[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Estadistica estadistica = usuario.getEstadistica();
			
			//Ordenar por nº reproducciones??
			estilos = estadistica.estilos_mas_escuchados.toArray();

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return estilos;
	}

	public Artista[] Cargar_Artistas_Mas_Escuchados(int aIdUsuarioGenerico) throws PersistentException {
		Artista[] artistas = new Artista[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Estadistica estadistica = usuario.getEstadistica();
			
			//Ordenar por nº reproducciones??
			artistas = estadistica.artistas_mas_escuchados.toArray();

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return artistas;
	}
	
	public void Actualizar_Estadisticas(int aIdCancion, int aIdUsuarioGenerico) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Estadistica estadistica = usuario.getEstadistica();
			
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			
			Estilo[] estilosCancion = cancion.estilos.toArray();
			Artista[] artistasCancion = cancion.intepretes.toArray();
			
			for (int i = 0; i < estilosCancion.length; i++) {
				if (!estadistica.estilos_mas_escuchados.contains(estilosCancion[i])) {
					
					//Si estuviera, sumar 1 al numero de veces que se ha escuchado??
					estadistica.estilos_mas_escuchados.add(estilosCancion[i]);
				}
			}
			
			Artista temp;
			
			for (int i = 0; i < artistasCancion.length; i++) {
				temp = artistasCancion[i];
				
				if (!estadistica.artistas_mas_escuchados.contains(temp)) {
					
					//Si estuviera, sumar 1 al numero de veces que se ha escuchado??
					estadistica.artistas_mas_escuchados.add(temp);
				}
				
				if (!estadistica.estilos_mas_escuchados.contains(temp.getEstilo())) {
					
					//Si estuviera, sumar 1 al numero de veces que se ha escuchado??
					estadistica.estilos_mas_escuchados.add(temp.getEstilo());
				}
			}
			
			estadistica.setNumeroArtistas(estadistica.artistas_mas_escuchados.size());
			estadistica.setNumeroCanciones(usuario.ultimas_reproducidas.size());
			
			//Actualizar tiempo??
			//estadistica.setTiempoReproducido(-1);
			
			usuario.setEstadistica(estadistica);
			
			EstadisticaDAO.save(estadistica);
			Usuario_genericoDAO.save(usuario);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
}