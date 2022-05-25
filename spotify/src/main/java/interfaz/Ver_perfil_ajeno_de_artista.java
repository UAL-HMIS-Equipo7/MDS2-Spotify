package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import spotify.GestorActor;

public class Ver_perfil_ajeno_de_artista extends Ver_perfil_ajeno {
//	private event _seguir_artista;
	public Panel_artista _panel_artista;
	private basededatos.Artista _artista;
	private iActor_comun bd = new BDPrincipal();

	public Ver_perfil_ajeno_de_artista(basededatos.Artista artista) {
		super((basededatos.Usuario_generico) artista);
		
		_artista = artista;

		_panel_artista = new Panel_artista(artista);
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

	public void Seguir_artista() {
		bd.Seguir_Artista(GestorActor.getIdUsuario(), _artista.getORMID());
		_yaSeguido = true;
	}
	
	public void Dejar_de_seguir_artista() {
		bd.Dejar_De_Seguir_Artista(GestorActor.getIdUsuario(), _artista.getORMID());
		_yaSeguido = false;
	}
}