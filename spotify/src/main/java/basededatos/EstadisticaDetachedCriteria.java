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

public class EstadisticaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final IntegerExpression tiempoReproducido;
	public final IntegerExpression numeroCanciones;
	public final IntegerExpression numeroArtistas;
	public final CollectionExpression artistas_mas_escuchados;
	public final CollectionExpression estilos_mas_escuchados;
	
	public EstadisticaDetachedCriteria() {
		super(basededatos.Estadistica.class, basededatos.EstadisticaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		tiempoReproducido = new IntegerExpression("tiempoReproducido", this.getDetachedCriteria());
		numeroCanciones = new IntegerExpression("numeroCanciones", this.getDetachedCriteria());
		numeroArtistas = new IntegerExpression("numeroArtistas", this.getDetachedCriteria());
		artistas_mas_escuchados = new CollectionExpression("ORM_artistas_mas_escuchados", this.getDetachedCriteria());
		estilos_mas_escuchados = new CollectionExpression("ORM_estilos_mas_escuchados", this.getDetachedCriteria());
	}
	
	public EstadisticaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EstadisticaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		tiempoReproducido = new IntegerExpression("tiempoReproducido", this.getDetachedCriteria());
		numeroCanciones = new IntegerExpression("numeroCanciones", this.getDetachedCriteria());
		numeroArtistas = new IntegerExpression("numeroArtistas", this.getDetachedCriteria());
		artistas_mas_escuchados = new CollectionExpression("ORM_artistas_mas_escuchados", this.getDetachedCriteria());
		estilos_mas_escuchados = new CollectionExpression("ORM_estilos_mas_escuchados", this.getDetachedCriteria());
	}
	
	public Usuario_genericoDetachedCriteria createUsuarioCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("usuario"));
	}
	
	public ArtistaDetachedCriteria createArtistas_mas_escuchadosCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_artistas_mas_escuchados"));
	}
	
	public EstiloDetachedCriteria createEstilos_mas_escuchadosCriteria() {
		return new EstiloDetachedCriteria(createCriteria("ORM_estilos_mas_escuchados"));
	}
	
	public Estadistica uniqueEstadistica(PersistentSession session) {
		return (Estadistica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estadistica[] listEstadistica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
	}
}

