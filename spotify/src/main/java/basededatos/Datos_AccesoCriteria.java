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

public class Datos_AccesoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression tipo;
	public final IntegerExpression numeroIntentos;
	public final StringExpression fechaYHoraBloqueo;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public Datos_AccesoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		tipo = new StringExpression("tipo", this);
		numeroIntentos = new IntegerExpression("numeroIntentos", this);
		fechaYHoraBloqueo = new StringExpression("fechaYHoraBloqueo", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
	}
	
	public Datos_AccesoCriteria(PersistentSession session) {
		this(session.createCriteria(Datos_Acceso.class));
	}
	
	public Datos_AccesoCriteria() throws PersistentException {
		this(AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession());
	}
	
	public Usuario_genericoCriteria createUsuarioCriteria() {
		return new Usuario_genericoCriteria(createCriteria("usuario"));
	}
	
	public Datos_Acceso uniqueDatos_Acceso() {
		return (Datos_Acceso) super.uniqueResult();
	}
	
	public Datos_Acceso[] listDatos_Acceso() {
		java.util.List list = super.list();
		return (Datos_Acceso[]) list.toArray(new Datos_Acceso[list.size()]);
	}
}

