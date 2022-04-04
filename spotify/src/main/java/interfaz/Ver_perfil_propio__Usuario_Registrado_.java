package interfaz;

public class Ver_perfil_propio__Usuario_Registrado_ extends Ver_perfil_propio {
//	private Button _darseBajaB;
//	private Button _modificarInformacionB;
	public Darse_de_baja _darse_de_baja;
	public Editar_informacion_del_perfil_no_artista _editar_informacion_del_perfil_no_artista;
	
	public Ver_perfil_propio__Usuario_Registrado_() {
		super();
		_darse_de_baja = new Darse_de_baja();
		_editar_informacion_del_perfil_no_artista = new Editar_informacion_del_perfil_no_artista();
		this.getAniadirInformacionEventosB().setVisible(false);
	}
}