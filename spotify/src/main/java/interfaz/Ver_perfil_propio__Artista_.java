package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_propio__Artista_ extends Ver_perfil_propio {
//	private Button _darseBajaB;
//	private Button _aniadirInformacionEventos;
	public Aniadir_informacion_de_eventos _aniadir_informacion_de_eventos;
	public Darse_de_baja _darse_de_baja;
	public Editar_foto_de_perfil__Artista_ _editar_foto_de_perfil__Artista_;
	public Panel_artista _panel_artista;
	
	public Ver_perfil_propio__Artista_() {
		// TODO Auto-generated constructor stub
		super();
		 _aniadir_informacion_de_eventos = new Aniadir_informacion_de_eventos();
		 _darse_de_baja = new Darse_de_baja();
		 _editar_foto_de_perfil__Artista_ = new Editar_foto_de_perfil__Artista_();
		 _panel_artista = new Panel_artista();
		 
		 
		 VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.add(_panel_artista);
		 vl.add(_editar_foto_de_perfil__Artista_);
		
		this.getModificarInformacionB().setVisible(false);
		
	}
}