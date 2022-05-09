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

public class Datos_AccesoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression tipo;
	public final IntegerExpression numeroIntentos;
	public final StringExpression fechaYHoraBloqueo;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public Datos_AccesoDetachedCriteria() {
		super(basededatos.Datos_Acceso.class, basededatos.Datos_AccesoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		numeroIntentos = new IntegerExpression("numeroIntentos", this.getDetachedCriteria());
		fechaYHoraBloqueo = new StringExpression("fechaYHoraBloqueo", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public Datos_AccesoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Datos_AccesoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		numeroIntentos = new IntegerExpression("numeroIntentos", this.getDetachedCriteria());
		fechaYHoraBloqueo = new StringExpression("fechaYHoraBloqueo", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public Usuario_genericoDetachedCriteria createUsuarioCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("usuario"));
	}
	
	public Datos_Acceso uniqueDatos_Acceso(PersistentSession session) {
		return (Datos_Acceso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Datos_Acceso[] listDatos_Acceso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Datos_Acceso[]) list.toArray(new Datos_Acceso[list.size()]);
	}
}

