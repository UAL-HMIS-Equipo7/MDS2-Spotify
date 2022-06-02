package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import spotify.GestorActor;

@CssImport("./styles/shared-styles.css")
public class Ver_perfil_ajeno_de_artista extends Ver_perfil_ajeno {
//	private event _seguir_artista;
	public Panel_artista _panel_artista;
	private basededatos.Artista _artista;
	private iActor_comun bd = new BDPrincipal();

	public Ver_perfil_ajeno_de_artista(basededatos.Artista artista) {
		super((basededatos.Usuario_generico) artista);
		
		_artista = artista;
		
		Comprobar_artista_seguido();
		
		if (_yaSeguido) {
			this.getSeguirB().setText("Dejar de seguir");
		}
		else {
			this.getSeguirB().setText("Seguir");
		}

		_panel_artista = new Panel_artista(artista);
		_panel_artista.setClassName("fullSize");
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_panel_artista);

		this.getSeguirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (_yaSeguido) {
					Dejar_de_seguir_artista();
				}
				else {
					Seguir_artista();
				}
				
			}
		});

	}
	
	public void Comprobar_artista_seguido() {
		_yaSeguido = bd.Comprobar_Artista_Seguido(GestorActor.getIdUsuario(), _artista.getORMID());
	}

	public void Seguir_artista() {
		bd.Seguir_Artista(GestorActor.getIdUsuario(), _artista.getORMID());
		_yaSeguido = true;
		this.getSeguirB().setText("Dejar de seguir");
	}
	
	public void Dejar_de_seguir_artista() {
		bd.Dejar_De_Seguir_Artista(GestorActor.getIdUsuario(), _artista.getORMID());
		_yaSeguido = false;
		this.getSeguirB().setText("Seguir");
	}
}