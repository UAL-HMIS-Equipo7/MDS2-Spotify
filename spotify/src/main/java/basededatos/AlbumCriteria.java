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

public class AlbumCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression titulo;
	public final StringExpression fechaEdicion;
	public final StringExpression imagenRuta;
	public final CollectionExpression autores;
	public final CollectionExpression incluye_a;
	
	public AlbumCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		titulo = new StringExpression("titulo", this);
		fechaEdicion = new StringExpression("fechaEdicion", this);
		imagenRuta = new StringExpression("imagenRuta", this);
		autores = new CollectionExpression("ORM_autores", this);
		incluye_a = new CollectionExpression("ORM_incluye_a", this);
	}
	
	public AlbumCriteria(PersistentSession session) {
		this(session.createCriteria(Album.class));
	}
	
	public AlbumCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createAutoresCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_autores"));
	}
	
	public CancionCriteria createIncluye_aCriteria() {
		return new CancionCriteria(createCriteria("ORM_incluye_a"));
	}
	
	public Album uniqueAlbum() {
		return (Album) super.uniqueResult();
	}
	
	public Album[] listAlbum() {
		java.util.List list = super.list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

