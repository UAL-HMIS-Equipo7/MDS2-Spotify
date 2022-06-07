package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import spotify.GestorActor;

public class Ver_perfil_ajeno_de_no_artista extends Ver_perfil_ajeno {
//	private event _seguir_usuario;
	private basededatos.Usuario_generico _usuario;
	private iActor_comun bd = new BDPrincipal();
	
	public Ver_perfil_ajeno_de_no_artista(Usuario_generico usuario) {
		super(usuario);
		
		_usuario = usuario;
		
		Cargar_usuario();
		
		Comprobar_usuario_seguido();
		
		if (_yaSeguido) {
			this.getSeguirB().setText("Dejar de seguir");
		}
		else {
			this.getSeguirB().setText("Seguir");
		}
		
		this.getSeguirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_yaSeguido) {
					Dejar_De_Seguir_Usuario();
				}
				else {
					Seguir_usuario();
				}
			}
		});
		
		this.getSeguidoresL().setText("Seguidores: " + Integer.toString(_usuario.seguidor.size()));
		this.getSeguidosL().setText("Seguidos: " + Integer.toString(_usuario.seguido.size()));
	}
	
	public void Cargar_usuario() {
		
		int id = _usuario.getORMID();
		
		_usuario = bd.Obtener_Usuario(id);
		
		if (_usuario == null) {
			_usuario = bd.Obtener_Administrador(id);
		}
	}
	
	public void Comprobar_usuario_seguido() {
		_yaSeguido = bd.Comprobar_Usuario_Seguido(GestorActor.getIdUsuario(), _usuario.getORMID());
	}
	
	public void Seguir_usuario() {
		bd.Seguir_Usuario(GestorActor.getIdUsuario(), _usuario.getORMID());
		_yaSeguido = true;
		
		int seguidores = Integer.parseInt(this.getSeguidoresL().getText().split(": ")[1]);
		seguidores++;
		
		this.getSeguidoresL().setText("Seguidores: " + seguidores);
		
		this.getSeguirB().setText("Dejar de seguir");
	}
	
	public void Dejar_De_Seguir_Usuario() {
		bd.Dejar_De_Seguir_Usuario(GestorActor.getIdUsuario(), _usuario.getORMID());
		_yaSeguido = false;
		
		int seguidores = Integer.parseInt(this.getSeguidoresL().getText().split(": ")[1]);
		seguidores--;
		
		this.getSeguidoresL().setText("Seguidores: " + seguidores);
		
		this.getSeguirB().setText("Seguir");
	}
}