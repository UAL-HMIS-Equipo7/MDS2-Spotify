package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iArtista;
import spotify.GestorActor;
import spotify.GestorVentana;

public class Cabecera_Artista extends Cabecera_superior {
//	private Button _verPerfilArtistaB;

	public Ver_perfil_propio__Artista_ _ver_perfil_propio__Artista_;
	
	private iArtista bd = new BDPrincipal();
	
	public Cabecera_Artista() {

		super();
		
		this.getVerPerfilArtistaB().setVisible(true);
		
		this.getVerPerfilArtistaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Ver_perfil();
			}
		});
	}
	
	@Override
	public void Ver_perfil() {
		
		basededatos.Artista artista = bd.Obtener_Artista(GestorActor.getIdUsuario());
		
		_ver_perfil_propio__Artista_ = new Ver_perfil_propio__Artista_(artista);
		
		GestorVentana.CambiarVentana(_ver_perfil_propio__Artista_);
	}
}