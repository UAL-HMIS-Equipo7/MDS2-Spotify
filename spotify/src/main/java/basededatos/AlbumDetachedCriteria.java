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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AlbumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression titulo;
	public final StringExpression fechaEdicion;
	public final StringExpression imagenRuta;
	public final CollectionExpression autores;
	public final CollectionExpression incluye_a;
	
	public AlbumDetachedCriteria() {
		super(basededatos.Album.class, basededatos.AlbumCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		fechaEdicion = new StringExpression("fechaEdicion", this.getDetachedCriteria());
		imagenRuta = new StringExpression("imagenRuta", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_autores", this.getDetachedCriteria());
		incluye_a = new CollectionExpression("ORM_incluye_a", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AlbumCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		fechaEdicion = new StringExpression("fechaEdicion", this.getDetachedCriteria());
		imagenRuta = new StringExpression("imagenRuta", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_autores", this.getDetachedCriteria());
		incluye_a = new CollectionExpression("ORM_incluye_a", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createAutoresCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_autores"));
	}
	
	public CancionDetachedCriteria createIncluye_aCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_incluye_a"));
	}
	
	public Album uniqueAlbum(PersistentSession session) {
		return (Album) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Album[] listAlbum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

