package spotify;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_generico;
import interfaz.*;

public class GestorActor {

	private static VerticalLayout _layoutMainView;
	private static Usuario_generico _usuario;
	
	public static void setLayout(VerticalLayout vl) {
		_layoutMainView = vl;
	}
	
	public static int getIdUsuario() {
		return _usuario.getORMID();
	}
	
	public static Usuario_generico getUsuario() {
		return _usuario;
	}
	
	public static void RecargarActorActual() {
		if (GestorActor._usuario instanceof basededatos.Administrador) {
			Administrador((basededatos.Administrador)_usuario);
		}
		else if (GestorActor._usuario instanceof basededatos.Usuario_Registrado) {
			Usuario_Registrado((basededatos.Usuario_Registrado)_usuario);
		}
		else if (GestorActor._usuario instanceof basededatos.Artista) {
			Artista((basededatos.Artista)_usuario);
		}
	}
	
	public static void Cibernauta() {
		GestorActor._usuario = null;
		
		Cibernauta cibernauta = new Cibernauta();
		cibernauta.getStyle().set("width", "100%");   
		cibernauta.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(cibernauta);
	}
	
	public static void Administrador(basededatos.Administrador usuario) {
		GestorActor._usuario = usuario;
		
		Administrador administrador = new Administrador(usuario);
		administrador.getStyle().set("width", "100%");   
		administrador.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(administrador);
	}
	
	public static void Usuario_Registrado(basededatos.Usuario_Registrado usuario) {
		GestorActor._usuario = usuario;
		
		Usuario_Registrado usuarioRegistrado = new Usuario_Registrado(usuario);
		usuarioRegistrado.getStyle().set("width", "100%");   
		usuarioRegistrado.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(usuarioRegistrado);
	}
	
	public static void Artista(basededatos.Artista usuario) {
		GestorActor._usuario = usuario;
		
		Artista artista = new Artista(usuario);
		artista.getStyle().set("width", "100%");   
		artista.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(artista);
	}
}
