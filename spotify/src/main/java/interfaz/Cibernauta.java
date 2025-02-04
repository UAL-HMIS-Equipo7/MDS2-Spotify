package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import spotify.GestorReproductor;
import spotify.GestorVentana;
import vistas.VistaCibernauta;

//import basededatos.iCibernauta;

public class Cibernauta extends VistaCibernauta {
//	private Button _iniciarSesionB;
//	private Image _logoImg;
//	private Label _nombreAppL;
//	public iCibernauta _iCibernauta;
	public Iniciar_sesion _iniciar_sesion;
	public Canciones_ultimos_exitos _canciones_ultimos_exitos;
	public Reproductor__Cibernauta_ _reproductor__Cibernauta_;
	
	private int _limReproducibles = 0;
	private iCibernauta bd = new BDPrincipal();
	
	public Cibernauta() {
//		_canciones_ultimos_exitos = new Canciones_ultimos_exitos();
//		_canciones_ultimos_exitos.getElement().setAttribute("width", "100%");
//		_canciones_ultimos_exitos.getElement().setAttribute("height", "100%");
//		
//		this.getVaadinHorizontalLayout().add(_canciones_ultimos_exitos);
		
		Inicializar();
	}
	
	public void Inicializar() {
		
		Cargar_numero_canciones_reproducibles();
		
		VerticalLayout layoutPrincipal = this.getLayoutPrincipal().as(VerticalLayout.class);
		layoutPrincipal.removeAll();
		
		GestorVentana.setLayoutPrincipal(layoutPrincipal);
		
		HorizontalLayout hlSuperior = new HorizontalLayout();
		hlSuperior.getStyle().set("width", "100%");
		hlSuperior.getStyle().set("heigth", "20%");
		hlSuperior.getStyle().set("padding", "var(--lumo-space-l)");	
		
		Image fotoImg = new Image("https://play-lh.googleusercontent.com/UrY7BAZ-XfXGpfkeWg0zCCeo-7ras4DCoRalC_WXXWTK9q5b0Iw7B0YQMsVxZaNB7DM", "logo");
		fotoImg.getStyle().set("height", "100%");
		fotoImg.getStyle().set("width", "100%");
		fotoImg.getStyle().set("max-width", "125px");
		fotoImg.getStyle().set("max-height", "125px");
		
		Label nombreAppL = new Label("Spotify");
		nombreAppL.getStyle().set("width", "100%");
		nombreAppL.getStyle().set("margin", "var(--lumo-space-l)");
		nombreAppL.getStyle().set("text-align", "center");
		nombreAppL.getStyle().set("font-size", "large");
		nombreAppL.getStyle().set("font-weight", "bold");
		
		Button iniciarSesionB = new Button("Iniciar Sesión");
		iniciarSesionB.getStyle().set("width", "300px");
		iniciarSesionB.getStyle().set("max-width", "300px");
		
		hlSuperior.add(fotoImg);
		hlSuperior.add(nombreAppL);
		hlSuperior.add(iniciarSesionB);
		
		HorizontalLayout hlInferior = new HorizontalLayout();
		hlSuperior.getStyle().set("width", "100%");
		hlSuperior.getStyle().set("heigth", "80%");
		hlSuperior.getStyle().set("padding", "var(--lumo-space-m)");
		
		_canciones_ultimos_exitos = new Canciones_ultimos_exitos();
		_canciones_ultimos_exitos.getElement().setAttribute("width", "100%");
		_canciones_ultimos_exitos.getElement().setAttribute("height", "100%");
		
		hlInferior.add(_canciones_ultimos_exitos);
		
		layoutPrincipal.add(hlSuperior);
		layoutPrincipal.add(hlInferior);
		
		_reproductor__Cibernauta_ = new Reproductor__Cibernauta_(_limReproducibles);
		_reproductor__Cibernauta_.getStyle().set("margin", "var(--lumo-space-m)");
		
		GestorReproductor.setReproductorCibernauta(_reproductor__Cibernauta_);
		
		layoutPrincipal.add(_reproductor__Cibernauta_);
		
		iniciarSesionB.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_iniciar_sesion = new Iniciar_sesion();
				
				GestorVentana.CambiarVentana(_iniciar_sesion);
			}
		});
	}
	
	public void Cargar_numero_canciones_reproducibles() {
		_limReproducibles = bd.Cargar_Numero_Canciones_Reproducibles();
	}
}