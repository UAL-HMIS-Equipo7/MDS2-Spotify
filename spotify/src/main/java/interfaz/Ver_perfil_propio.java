package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_perfil_propio;

public class Ver_perfil_propio extends VistaVer_perfil_propio {
//	private Button _notificacionesB;
//	private Button _seguidoresB;
//	private Button _seguidosB;
//	private Image _fotoImg;
//	private Label _emailL;
//	private Label _nickL;
	public Ver_lista_seguidos _ver_lista_seguidos;
	public Ver_lista_seguidores _ver_lista_seguidores;
	public Ver_notificaciones _ver_notificaciones;
	public Listas_de_reproduccion_perfil_propio _listas_de_reproduccion_perfil_propio;
	
	public Ver_perfil_propio(VerticalLayout layoutPadre) {
		_listas_de_reproduccion_perfil_propio = new Listas_de_reproduccion_perfil_propio();
//		_ver_lista_seguidos = new Ver_lista_seguidos();
//		_ver_lista_seguidores = new Ver_lista_seguidores();
//		_ver_notificaciones = new Ver_notificaciones();
		VerticalLayout vl = this.getContenedorDerecho().as(VerticalLayout.class);
		
		vl.add(_listas_de_reproduccion_perfil_propio);
	}
}