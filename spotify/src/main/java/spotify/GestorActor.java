package spotify;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.*;

public class GestorActor {

	private static VerticalLayout _layoutMainView;
	
	public static void setLayout(VerticalLayout vl) {
		_layoutMainView = vl;
	}
	
	public static void Cibernauta() {
		Cibernauta cibernauta = new Cibernauta();
		cibernauta.getStyle().set("width", "100%");   
		cibernauta.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(cibernauta);
	}
	
	public static void Administrador() {
		Administrador administrador = new Administrador();
		administrador.getStyle().set("width", "100%");   
		administrador.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(administrador);
	}
	
	public static void Usuario_Registrado() {
		Usuario_Registrado usuarioRegistrado = new Usuario_Registrado();
		usuarioRegistrado.getStyle().set("width", "100%");   
		usuarioRegistrado.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(usuarioRegistrado);
	}
	
	public static void Artista() {
		Artista artista = new Artista();
		artista.getStyle().set("width", "100%");   
		artista.getStyle().set("height", "100%");
    	
    	_layoutMainView.removeAll();
    	_layoutMainView.add(artista);
	}
}
