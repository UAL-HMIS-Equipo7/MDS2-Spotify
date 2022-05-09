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

public class Lista_de_reproduccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression propietario_favoritoId;
	public final AssociationExpression propietario_favorito;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final StringExpression titulo;
	public final CollectionExpression seguidor;
	public final CollectionExpression canciones_incluidas;
	
	public Lista_de_reproduccionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		propietario_favoritoId = new IntegerExpression("propietario_favorito.id", this);
		propietario_favorito = new AssociationExpression("propietario_favorito", this);
		autorId = new IntegerExpression("autor.id", this);
		autor = new AssociationExpression("autor", this);
		titulo = new StringExpression("titulo", this);
		seguidor = new CollectionExpression("ORM_seguidor", this);
		canciones_incluidas = new CollectionExpression("ORM_canciones_incluidas", this);
	}
	
	public Lista_de_reproduccionCriteria(PersistentSession session) {
		this(session.createCriteria(Lista_de_reproduccion.class));
	}
	
	public Lista_de_reproduccionCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public Usuario_genericoCriteria createPropietario_favoritoCriteria() {
		return new Usuario_genericoCriteria(createCriteria("propietario_favorito"));
	}
	
	public Usuario_genericoCriteria createAutorCriteria() {
		return new Usuario_genericoCriteria(createCriteria("autor"));
	}
	
	public Usuario_genericoCriteria createSeguidorCriteria() {
		return new Usuario_genericoCriteria(createCriteria("ORM_seguidor"));
	}
	
	public CancionCriteria createCanciones_incluidasCriteria() {
		return new CancionCriteria(createCriteria("ORM_canciones_incluidas"));
	}
	
	public Lista_de_reproduccion uniqueLista_de_reproduccion() {
		return (Lista_de_reproduccion) super.uniqueResult();
	}
	
	public Lista_de_reproduccion[] listLista_de_reproduccion() {
		java.util.List list = super.list();
		return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
	}
}

