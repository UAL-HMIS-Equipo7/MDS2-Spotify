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

public class EstiloDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression aparece_en;
	public final CollectionExpression artistas;
	public final CollectionExpression canciones;
	
	public EstiloDetachedCriteria() {
		super(basededatos.Estilo.class, basededatos.EstiloCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
	}
	
	public EstiloDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EstiloCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
	}
	
	public EstadisticaDetachedCriteria createAparece_enCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public ArtistaDetachedCriteria createArtistasCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_artistas"));
	}
	
	public CancionDetachedCriteria createCancionesCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_canciones"));
	}
	
	public Estilo uniqueEstilo(PersistentSession session) {
		return (Estilo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estilo[] listEstilo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

