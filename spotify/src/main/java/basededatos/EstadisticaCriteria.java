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

public class EstadisticaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final IntegerExpression tiempoReproducido;
	public final IntegerExpression numeroCanciones;
	public final IntegerExpression numeroArtistas;
	public final CollectionExpression artistas_mas_escuchados;
	public final CollectionExpression estilos_mas_escuchados;
	
	public EstadisticaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
		tiempoReproducido = new IntegerExpression("tiempoReproducido", this);
		numeroCanciones = new IntegerExpression("numeroCanciones", this);
		numeroArtistas = new IntegerExpression("numeroArtistas", this);
		artistas_mas_escuchados = new CollectionExpression("ORM_artistas_mas_escuchados", this);
		estilos_mas_escuchados = new CollectionExpression("ORM_estilos_mas_escuchados", this);
	}
	
	public EstadisticaCriteria(PersistentSession session) {
		this(session.createCriteria(Estadistica.class));
	}
	
	public EstadisticaCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public Usuario_genericoCriteria createUsuarioCriteria() {
		return new Usuario_genericoCriteria(createCriteria("usuario"));
	}
	
	public ArtistaCriteria createArtistas_mas_escuchadosCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_artistas_mas_escuchados"));
	}
	
	public EstiloCriteria createEstilos_mas_escuchadosCriteria() {
		return new EstiloCriteria(createCriteria("ORM_estilos_mas_escuchados"));
	}
	
	public Estadistica uniqueEstadistica() {
		return (Estadistica) super.uniqueResult();
	}
	
	public Estadistica[] listEstadistica() {
		java.util.List list = super.list();
		return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
	}
}

