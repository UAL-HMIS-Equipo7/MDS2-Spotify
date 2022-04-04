package interfaz;

public class Ver_perfil_propio__Usuario_Registrado_ extends Ver_perfil_propio {
//	private Button _darseBajaB;
//	private Button _modificarInformacionB;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Darse_de_baja _darse_de_baja;
	public Editar_informacion_del_perfil_no_artista _editar_informacion_del_perfil_no_artista;
	
	public Ver_perfil_propio__Usuario_Registrado_() {
		super();
		this.getAniadirInformacionEventosB().setVisible(false);
	}
}