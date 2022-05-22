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
	
	public static void Cibernauta() {
		GestorActor._usuario = null;
		
		Cibernauta cibernauta = new Cibernauta();
		cibernauta.getStyle().set("width", "100%");   
		cibernauta.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(cibernauta);
	}
	
	public static void Administrador(Usuario_generico usuario) {
		GestorActor._usuario = usuario;
		
		Administrador administrador = new Administrador();
		administrador.getStyle().set("width", "100%");   
		administrador.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(administrador);
	}
	
	public static void Usuario_Registrado(Usuario_generico usuario) {
		GestorActor._usuario = usuario;
		
		Usuario_Registrado usuarioRegistrado = new Usuario_Registrado();
		usuarioRegistrado.getStyle().set("width", "100%");   
		usuarioRegistrado.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(usuarioRegistrado);
	}
	
	public static void Artista(Usuario_generico usuario) {
		GestorActor._usuario = usuario;
		
		Artista artista = new Artista();
		artista.getStyle().set("width", "100%");   
		artista.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(artista);
	}
}
