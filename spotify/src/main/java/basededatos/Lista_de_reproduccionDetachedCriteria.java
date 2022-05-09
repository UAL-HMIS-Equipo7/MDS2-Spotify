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

public class Lista_de_reproduccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression propietario_favoritoId;
	public final AssociationExpression propietario_favorito;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final StringExpression titulo;
	public final CollectionExpression seguidor;
	public final CollectionExpression canciones_incluidas;
	
	public Lista_de_reproduccionDetachedCriteria() {
		super(basededatos.Lista_de_reproduccion.class, basededatos.Lista_de_reproduccionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		propietario_favoritoId = new IntegerExpression("propietario_favorito.id", this.getDetachedCriteria());
		propietario_favorito = new AssociationExpression("propietario_favorito", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.id", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		canciones_incluidas = new CollectionExpression("ORM_canciones_incluidas", this.getDetachedCriteria());
	}
	
	public Lista_de_reproduccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Lista_de_reproduccionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		propietario_favoritoId = new IntegerExpression("propietario_favorito.id", this.getDetachedCriteria());
		propietario_favorito = new AssociationExpression("propietario_favorito", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.id", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		canciones_incluidas = new CollectionExpression("ORM_canciones_incluidas", this.getDetachedCriteria());
	}
	
	public Usuario_genericoDetachedCriteria createPropietario_favoritoCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("propietario_favorito"));
	}
	
	public Usuario_genericoDetachedCriteria createAutorCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("autor"));
	}
	
	public Usuario_genericoDetachedCriteria createSeguidorCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public CancionDetachedCriteria createCanciones_incluidasCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_canciones_incluidas"));
	}
	
	public Lista_de_reproduccion uniqueLista_de_reproduccion(PersistentSession session) {
		return (Lista_de_reproduccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista_de_reproduccion[] listLista_de_reproduccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
	}
}

