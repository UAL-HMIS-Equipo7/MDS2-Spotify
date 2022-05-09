/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CancionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression incluida_en_albumesId;
	public final AssociationExpression incluida_en_albumes;
	public final StringExpression titulo;
	public final StringExpression productores;
	public final StringExpression ficheroMultimediaRuta;
	public final StringExpression compositores;
	public final StringExpression ficheroMultimediaAltaCalidadRuta;
	public final IntegerExpression numReproducciones;
	public final CollectionExpression usuario;
	public final CollectionExpression estilos;
	public final CollectionExpression incluida_en_listas;
	public final CollectionExpression intepretes;
	
	public CancionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		incluida_en_albumesId = new IntegerExpression("incluida_en_albumes.id", this);
		incluida_en_albumes = new AssociationExpression("incluida_en_albumes", this);
		titulo = new StringExpression("titulo", this);
		productores = new StringExpression("productores", this);
		ficheroMultimediaRuta = new StringExpression("ficheroMultimediaRuta", this);
		compositores = new StringExpression("compositores", this);
		ficheroMultimediaAltaCalidadRuta = new StringExpression("ficheroMultimediaAltaCalidadRuta", this);
		numReproducciones = new IntegerExpression("numReproducciones", this);
		usuario = new CollectionExpression("ORM_usuario", this);
		estilos = new CollectionExpression("ORM_estilos", this);
		incluida_en_listas = new CollectionExpression("ORM_incluida_en_listas", this);
		intepretes = new CollectionExpression("ORM_intepretes", this);
	}
	
	public CancionCriteria(PersistentSession session) {
		this(session.createCriteria(Cancion.class));
	}
	
	public CancionCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public AlbumCriteria createIncluida_en_albumesCriteria() {
		return new AlbumCriteria(createCriteria("incluida_en_albumes"));
	}
	
	public Usuario_genericoCriteria createUsuarioCriteria() {
		return new Usuario_genericoCriteria(createCriteria("ORM_usuario"));
	}
	
	public EstiloCriteria createEstilosCriteria() {
		return new EstiloCriteria(createCriteria("ORM_estilos"));
	}
	
	public Lista_de_reproduccionCriteria createIncluida_en_listasCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_incluida_en_listas"));
	}
	
	public ArtistaCriteria createIntepretesCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_intepretes"));
	}
	
	public Cancion uniqueCancion() {
		return (Cancion) super.uniqueResult();
	}
	
	public Cancion[] listCancion() {
		java.util.List list = super.list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

