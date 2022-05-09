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

public class EventoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression publicado_porId;
	public final AssociationExpression publicado_por;
	public final StringExpression imagenRuta;
	public final StringExpression fechaYHora;
	public final StringExpression descripcion;
	public final IntegerExpression precio;
	public final CollectionExpression usuario;
	
	public EventoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		publicado_porId = new IntegerExpression("publicado_por.", this);
		publicado_por = new AssociationExpression("publicado_por", this);
		imagenRuta = new StringExpression("imagenRuta", this);
		fechaYHora = new StringExpression("fechaYHora", this);
		descripcion = new StringExpression("descripcion", this);
		precio = new IntegerExpression("precio", this);
		usuario = new CollectionExpression("ORM_usuario", this);
	}
	
	public EventoCriteria(PersistentSession session) {
		this(session.createCriteria(Evento.class));
	}
	
	public EventoCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createPublicado_porCriteria() {
		return new ArtistaCriteria(createCriteria("publicado_por"));
	}
	
	public Usuario_genericoCriteria createUsuarioCriteria() {
		return new Usuario_genericoCriteria(createCriteria("ORM_usuario"));
	}
	
	public Evento uniqueEvento() {
		return (Evento) super.uniqueResult();
	}
	
	public Evento[] listEvento() {
		java.util.List list = super.list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

