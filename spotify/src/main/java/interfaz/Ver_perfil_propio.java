package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_generico;
import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaVer_perfil_propio;

@CssImport("./styles/shared-styles.css")
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
	protected Image _fotoImg;
	
	public Ver_perfil_propio(Usuario_generico usuario) {
		
		_fotoImg = new Image(GestorArchivos.CargarImagen(usuario.getFotoRuta()), usuario.getFotoRuta());
		_fotoImg.setClassName("max350");
		getFotoImgLayout().add(_fotoImg);
		
		this.getEmailL().setText(usuario.getDatos().getEmail());
		this.getNickL().setText(usuario.getNick());
		
		VerticalLayout vl = this.getContenedorDerecho().as(VerticalLayout.class);
		
		_listas_de_reproduccion_perfil_propio = new Listas_de_reproduccion_perfil_propio(usuario);
		vl.add(_listas_de_reproduccion_perfil_propio);
		
		this.getSeguidosB().setText("Seguidos: " + Integer.toString(usuario.seguido.size()));
		this.getSeguidosB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_ver_lista_seguidos = new Ver_lista_seguidos(usuario);
				
				GestorVentana.CambiarVentana(_ver_lista_seguidos);
			}
		});
		
		this.getSeguidoresB().setText("Seguidores: " + Integer.toString(usuario.seguidor.size()));
		this.getSeguidoresB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				_ver_lista_seguidores = new Ver_lista_seguidores(usuario);
				
				
				GestorVentana.CambiarVentana(_ver_lista_seguidores);
			}
		});
		
		this.getNotificacionesB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Dialog ventanaModal = new Dialog();
				
				_ver_notificaciones = new Ver_notificaciones(ventanaModal, usuario);
				ventanaModal.add(_ver_notificaciones);
				
				ventanaModal.open();
			}
		});
	}
}