package spotify;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
//@CssImport("./styles/shared-styles.css")
//@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView(@Autowired GreetService service) {

    	Cibernauta cibernauta = new Cibernauta();
    	cibernauta.getStyle().set("width", "100%");   
    	cibernauta.getStyle().set("height", "100%");
    	
    	Administrador administrador = new Administrador();
    	administrador.getStyle().set("width", "100%");   
    	administrador.getStyle().set("height", "100%");
    	
    	Artista artista = new Artista();
    	artista.getStyle().set("width", "100%");   
    	artista.getStyle().set("height", "100%");
    	
    	Usuario_Registrado usuario_registrado = new Usuario_Registrado();
    	usuario_registrado.getStyle().set("width", "100%");   
    	usuario_registrado.getStyle().set("height", "100%");
    	
    	cibernauta._iniciar_sesion.getIniciarSesionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String usuario = cibernauta._iniciar_sesion.getEmailTF().getValue();
				
				remove(cibernauta);
				 
				//Switch con el usuario
				if (usuario.contains("usuario")) {
					add(usuario_registrado);
				}
				else if (usuario.contains("artista")) {
					add(artista);
				}
				else {
					add(administrador);
				}
			}
		});
    	
    	administrador._cabecera_Administrador.getCerrarSesionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				remove(administrador);
				add(cibernauta);
			}
		});
    	
		artista._cabecera_Artista.getCerrarSesionB()
				.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {

						remove(artista);
						add(cibernauta);
					}
				});

		usuario_registrado._cabecera_Usuario_Registrado.getCerrarSesionB()
				.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {

						remove(usuario_registrado);
						add(cibernauta);
					}
				});
    	
		//Actor con el que se inicia la aplicacion
    	add(administrador);
    }

}
