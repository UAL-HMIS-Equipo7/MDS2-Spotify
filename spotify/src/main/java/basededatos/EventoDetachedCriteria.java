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

public class EventoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression publicado_porId;
	public final AssociationExpression publicado_por;
	public final StringExpression imagenRuta;
	public final StringExpression fechaYHora;
	public final StringExpression descripcion;
	public final IntegerExpression precio;
	public final CollectionExpression usuario;
	
	public EventoDetachedCriteria() {
		super(basededatos.Evento.class, basededatos.EventoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		publicado_porId = new IntegerExpression("publicado_por.", this.getDetachedCriteria());
		publicado_por = new AssociationExpression("publicado_por", this.getDetachedCriteria());
		imagenRuta = new StringExpression("imagenRuta", this.getDetachedCriteria());
		fechaYHora = new StringExpression("fechaYHora", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new IntegerExpression("precio", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
	}
	
	public EventoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EventoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		publicado_porId = new IntegerExpression("publicado_por.", this.getDetachedCriteria());
		publicado_por = new AssociationExpression("publicado_por", this.getDetachedCriteria());
		imagenRuta = new StringExpression("imagenRuta", this.getDetachedCriteria());
		fechaYHora = new StringExpression("fechaYHora", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new IntegerExpression("precio", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createPublicado_porCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("publicado_por"));
	}
	
	public Usuario_genericoDetachedCriteria createUsuarioCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public Evento uniqueEvento(PersistentSession session) {
		return (Evento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evento[] listEvento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

