package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_propio__Administrador_ extends Ver_perfil_propio {
//	private Button _modificarInformacionB;
	public Editar_informacion_del_perfil_no_artista _editar_informacion_del_perfil_no_artista;
	
	public Ver_perfil_propio__Administrador_() {
		// TODO Auto-generated constructor stub
		super();
		_editar_informacion_del_perfil_no_artista = new Editar_informacion_del_perfil_no_artista();
		this.getDarseBajaB().setVisible(false);
		this.getAniadirInformacionEventosB().setVisible(false);

	}
}