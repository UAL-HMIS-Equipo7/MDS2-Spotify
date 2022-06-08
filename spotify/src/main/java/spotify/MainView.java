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

import basededatos.Administrador;
import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import basededatos.iCibernauta;
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
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     */
    public MainView() {
    	
    	getThemeList().clear();
    	getStyle().clear();
    	getStyle().set("align-items", "center");
    	
    	VerticalLayout layoutPrincipal = new VerticalLayout();
    	
    	layoutPrincipal.getThemeList().clear();
    	layoutPrincipal.getStyle().clear();
    	layoutPrincipal.getStyle().set("align-items", "center");
    	layoutPrincipal.getStyle().set("width", "100%");   
    	layoutPrincipal.getStyle().set("height", "100%");
		
    	add(layoutPrincipal);
    	
    	GestorActor.setLayout(layoutPrincipal);
    	
    	GestorActor.Cibernauta();
    }
}
