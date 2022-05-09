package basededatos;

import java.util.Vector;
import basededatos.Estadistica;

public class BD_Estadisticas {
	public Vector<Estadistica> _contiene_estadisticas = new Vector<Estadistica>();
	public BDPrincipal _bDPrincipal_estadisticas;

	public Estilo[] Cargar_Estilos_Mas_Escuchados(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Artista[] Cargar_Artistas_Mas_Escuchados(int aIdUsuarioiGenerico) {
		throw new UnsupportedOperationException();
	}
}