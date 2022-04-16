package interfaz;

import java.util.stream.Collectors;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_cancion;

public class Ver_cancion extends VistaVer_cancion {
//	private event _marcar_cancion_como_favorita;
//	private event _aniadir_cancion_a_lista_de_reproduccion;
//	private Label _tituloL;
//	private Button _aniadirFavoritosB;
//	private Label _aniadirListaL;
//	private Button _aniadirListaB;
//	private Label _creditosTituloL;
//	private Label _creditosTituloCancionL;
//	private Label _creditosTituloAlbumL;
//	private Label _creditosCompositorL;
//	private Label _creditosProductorL;
//	private Label _creditosInterpreteL;
//	private Label _creditosFicheroL;
//	private Label _creditoEstiloL;
//	private Image _fotoCancionImg;
	
	public Ver_cancion(VerticalLayout layoutPadre) {
		
		this.getAniadirFavoritosB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Marcar_cancion_como_favorita();
				
			}
		});
		
		for(int i=0; i<this.getAniadirListaB().getPageSize(); i++) {
			this.getAniadirListaB().getElement().addEventListener("click", e ->{
				
				Aniadir_cancion_a_lista_de_reproduccion();
				
			});
			
		}

	}

	public void Marcar_cancion_como_favorita() {
		throw new UnsupportedOperationException();
	}

	public void Aniadir_cancion_a_lista_de_reproduccion() {
		throw new UnsupportedOperationException();
	}
}