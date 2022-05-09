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

public class EstiloCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression aparece_en;
	public final CollectionExpression artistas;
	public final CollectionExpression canciones;
	
	public EstiloCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		aparece_en = new CollectionExpression("ORM_aparece_en", this);
		artistas = new CollectionExpression("ORM_artistas", this);
		canciones = new CollectionExpression("ORM_canciones", this);
	}
	
	public EstiloCriteria(PersistentSession session) {
		this(session.createCriteria(Estilo.class));
	}
	
	public EstiloCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public EstadisticaCriteria createAparece_enCriteria() {
		return new EstadisticaCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public ArtistaCriteria createArtistasCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_artistas"));
	}
	
	public CancionCriteria createCancionesCriteria() {
		return new CancionCriteria(createCriteria("ORM_canciones"));
	}
	
	public Estilo uniqueEstilo() {
		return (Estilo) super.uniqueResult();
	}
	
	public Estilo[] listEstilo() {
		java.util.List list = super.list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

