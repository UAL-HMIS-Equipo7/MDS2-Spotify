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

public class Usuario_RegistradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression datosId;
	public final AssociationExpression datos;
	public final StringExpression nick;
	public final StringExpression fotoRuta;
	public final CollectionExpression seguidor;
	public final CollectionExpression listas;
	public final IntegerExpression favoritaId;
	public final AssociationExpression favorita;
	public final CollectionExpression seguido;
	public final IntegerExpression estadisticaId;
	public final AssociationExpression estadistica;
	public final CollectionExpression ultimas_reproducidas;
	public final CollectionExpression notificaciones;
	public final CollectionExpression lista_seguida;
	
	public Usuario_RegistradoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		datosId = new IntegerExpression("datos.id", this);
		datos = new AssociationExpression("datos", this);
		nick = new StringExpression("nick", this);
		fotoRuta = new StringExpression("fotoRuta", this);
		seguidor = new CollectionExpression("ORM_seguidor", this);
		listas = new CollectionExpression("ORM_listas", this);
		favoritaId = new IntegerExpression("favorita.id", this);
		favorita = new AssociationExpression("favorita", this);
		seguido = new CollectionExpression("ORM_seguido", this);
		estadisticaId = new IntegerExpression("estadistica.id", this);
		estadistica = new AssociationExpression("estadistica", this);
		ultimas_reproducidas = new CollectionExpression("ORM_ultimas_reproducidas", this);
		notificaciones = new CollectionExpression("ORM_notificaciones", this);
		lista_seguida = new CollectionExpression("ORM_lista_seguida", this);
	}
	
	public Usuario_RegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_Registrado.class));
	}
	
	public Usuario_RegistradoCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public Datos_AccesoCriteria createDatosCriteria() {
		return new Datos_AccesoCriteria(createCriteria("datos"));
	}
	
	public Usuario_genericoCriteria createSeguidorCriteria() {
		return new Usuario_genericoCriteria(createCriteria("ORM_seguidor"));
	}
	
	public Lista_de_reproduccionCriteria createListasCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_listas"));
	}
	
	public Lista_de_reproduccionCriteria createFavoritaCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("favorita"));
	}
	
	public Usuario_genericoCriteria createSeguidoCriteria() {
		return new Usuario_genericoCriteria(createCriteria("ORM_seguido"));
	}
	
	public EstadisticaCriteria createEstadisticaCriteria() {
		return new EstadisticaCriteria(createCriteria("estadistica"));
	}
	
	public CancionCriteria createUltimas_reproducidasCriteria() {
		return new CancionCriteria(createCriteria("ORM_ultimas_reproducidas"));
	}
	
	public EventoCriteria createNotificacionesCriteria() {
		return new EventoCriteria(createCriteria("ORM_notificaciones"));
	}
	
	public Lista_de_reproduccionCriteria createLista_seguidaCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_lista_seguida"));
	}
	
	public Usuario_Registrado uniqueUsuario_Registrado() {
		return (Usuario_Registrado) super.uniqueResult();
	}
	
	public Usuario_Registrado[] listUsuario_Registrado() {
		java.util.List list = super.list();
		return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
	}
}

