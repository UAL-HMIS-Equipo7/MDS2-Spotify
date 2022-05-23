package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_generico;
import vistas.VistaVer_perfil_ajeno;

public class Ver_perfil_ajeno extends VistaVer_perfil_ajeno {
//	private Label _seguidoresL;
//	private Label _seguidosL;
//	private Image _fotoImg;
//	private Label _emailL;
//	private Label _nickL;
//	private Button _seguirB;
	public Listas_de_reproduccion_perfil _listas_de_reproduccion_perfil;
	
	public  Ver_perfil_ajeno(Usuario_generico usuario) {
		
		this.getSeguidoresL().setText(Integer.toString(usuario.seguidor.size()));
		this.getSeguidosL().setText(Integer.toString(usuario.seguido.size()));
		this.getFotoImg().setSrc(usuario.getFotoRuta());
		this.getEmailL().setText(usuario.getDatos().getEmail());
		this.getNickL().setText(usuario.getNick());
		
		_listas_de_reproduccion_perfil = new Listas_de_reproduccion_perfil();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_listas_de_reproduccion_perfil);
		
		this._listas_de_reproduccion_perfil.getCrearListaB().setVisible(false);
	}
}