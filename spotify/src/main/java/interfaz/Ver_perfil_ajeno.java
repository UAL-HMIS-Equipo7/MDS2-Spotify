package interfaz;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_generico;
import spotify.GestorActor;
import spotify.GestorArchivos;
import vistas.VistaVer_perfil_ajeno;

@CssImport("./styles/shared-styles.css")
public class Ver_perfil_ajeno extends VistaVer_perfil_ajeno {
//	private Label _seguidoresL;
//	private Label _seguidosL;
//	private Image _fotoImg;
//	private Label _emailL;
//	private Label _nickL;
//	private Button _seguirB;
	public Listas_de_reproduccion_perfil _listas_de_reproduccion_perfil;
	protected boolean _yaSeguido = false;
	
	public  Ver_perfil_ajeno(Usuario_generico usuario) {
		
		Image img = new Image(GestorArchivos.CargarImagen(usuario.getFotoRuta()), usuario.getFotoRuta());
		img.setClassName("max500");
		getFotoImgLayout().add(img);
		
		this.getEmailL().setText(usuario.getDatos().getEmail());
		this.getNickL().setText(usuario.getNick());
		
		_listas_de_reproduccion_perfil = new Listas_de_reproduccion_perfil(usuario);
		_listas_de_reproduccion_perfil.setClassName("fullSize");
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_listas_de_reproduccion_perfil);
		
		this._listas_de_reproduccion_perfil.getCrearListaB().setVisible(false);
	}
}