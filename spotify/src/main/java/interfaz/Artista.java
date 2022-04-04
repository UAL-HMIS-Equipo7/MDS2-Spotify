package interfaz;

//import basededatos.iArtista;

public class Artista extends Actor_comun {
//	public iArtista _iArtista;
	public Cabecera_Artista _cabecera_Artista;
	
	public Artista() {
		// TODO Auto-generated constructor stub
		super();
		
		_cabecera_Artista = new Cabecera_Artista();
	}
}