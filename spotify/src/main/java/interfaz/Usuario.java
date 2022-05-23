package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_Registrado;
import spotify.GestorVentana;
import vistas.VistaUsuario;

public class Usuario extends VistaUsuario {
//	private Button _fotoB;
//	private Button _nickB;
	public Ver_perfil_ajeno_de_no_artista _ver_perfil_ajeno_de_no_artista;
	
	public Usuario(basededatos.Usuario_Registrado usuario) {
		
		this.getNickB().setText(usuario.getNick());
		this.getNickB().addEventListener("click", e ->{
			
			_ver_perfil_ajeno_de_no_artista = new Ver_perfil_ajeno_de_no_artista(usuario);
			
			GestorVentana.CambiarVentana(_ver_perfil_ajeno_de_no_artista);
			
		});
		
		this.getFotoB().setSrc(usuario.getFotoRuta());
		this.getFotoB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				_ver_perfil_ajeno_de_no_artista = new Ver_perfil_ajeno_de_no_artista(usuario);
				
				GestorVentana.CambiarVentana(_ver_perfil_ajeno_de_no_artista);
				
			}
		});
	}
}