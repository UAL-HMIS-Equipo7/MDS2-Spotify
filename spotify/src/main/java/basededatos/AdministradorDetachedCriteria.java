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

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final IntegerExpression limiteCancionesReproducibles;
	public final IntegerExpression numeroCancionesMostradas;
	
	public AdministradorDetachedCriteria() {
		super(basededatos.Administrador.class, basededatos.AdministradorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		datosId = new IntegerExpression("datos.id", this.getDetachedCriteria());
		datos = new AssociationExpression("datos", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoRuta = new StringExpression("fotoRuta", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		listas = new CollectionExpression("ORM_listas", this.getDetachedCriteria());
		favoritaId = new IntegerExpression("favorita.id", this.getDetachedCriteria());
		favorita = new AssociationExpression("favorita", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		estadisticaId = new IntegerExpression("estadistica.id", this.getDetachedCriteria());
		estadistica = new AssociationExpression("estadistica", this.getDetachedCriteria());
		ultimas_reproducidas = new CollectionExpression("ORM_ultimas_reproducidas", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		lista_seguida = new CollectionExpression("ORM_lista_seguida", this.getDetachedCriteria());
		limiteCancionesReproducibles = new IntegerExpression("limiteCancionesReproducibles", this.getDetachedCriteria());
		numeroCancionesMostradas = new IntegerExpression("numeroCancionesMostradas", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AdministradorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		datosId = new IntegerExpression("datos.id", this.getDetachedCriteria());
		datos = new AssociationExpression("datos", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoRuta = new StringExpression("fotoRuta", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		listas = new CollectionExpression("ORM_listas", this.getDetachedCriteria());
		favoritaId = new IntegerExpression("favorita.id", this.getDetachedCriteria());
		favorita = new AssociationExpression("favorita", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		estadisticaId = new IntegerExpression("estadistica.id", this.getDetachedCriteria());
		estadistica = new AssociationExpression("estadistica", this.getDetachedCriteria());
		ultimas_reproducidas = new CollectionExpression("ORM_ultimas_reproducidas", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		lista_seguida = new CollectionExpression("ORM_lista_seguida", this.getDetachedCriteria());
		limiteCancionesReproducibles = new IntegerExpression("limiteCancionesReproducibles", this.getDetachedCriteria());
		numeroCancionesMostradas = new IntegerExpression("numeroCancionesMostradas", this.getDetachedCriteria());
	}
	
	public Datos_AccesoDetachedCriteria createDatosCriteria() {
		return new Datos_AccesoDetachedCriteria(createCriteria("datos"));
	}
	
	public Usuario_genericoDetachedCriteria createSeguidorCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createListasCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_listas"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createFavoritaCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("favorita"));
	}
	
	public Usuario_genericoDetachedCriteria createSeguidoCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("ORM_seguido"));
	}
	
	public EstadisticaDetachedCriteria createEstadisticaCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("estadistica"));
	}
	
	public CancionDetachedCriteria createUltimas_reproducidasCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_ultimas_reproducidas"));
	}
	
	public EventoDetachedCriteria createNotificacionesCriteria() {
		return new EventoDetachedCriteria(createCriteria("ORM_notificaciones"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createLista_seguidaCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_lista_seguida"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

