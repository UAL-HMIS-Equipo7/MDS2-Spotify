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

public class CancionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression incluida_en_albumesId;
	public final AssociationExpression incluida_en_albumes;
	public final StringExpression titulo;
	public final StringExpression productores;
	public final StringExpression ficheroMultimediaRuta;
	public final StringExpression compositores;
	public final StringExpression ficheroMultimediaAltaCalidadRuta;
	public final IntegerExpression numReproducciones;
	public final CollectionExpression usuario;
	public final CollectionExpression estilos;
	public final CollectionExpression incluida_en_listas;
	public final CollectionExpression intepretes;
	
	public CancionDetachedCriteria() {
		super(basededatos.Cancion.class, basededatos.CancionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		incluida_en_albumesId = new IntegerExpression("incluida_en_albumes.id", this.getDetachedCriteria());
		incluida_en_albumes = new AssociationExpression("incluida_en_albumes", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		productores = new StringExpression("productores", this.getDetachedCriteria());
		ficheroMultimediaRuta = new StringExpression("ficheroMultimediaRuta", this.getDetachedCriteria());
		compositores = new StringExpression("compositores", this.getDetachedCriteria());
		ficheroMultimediaAltaCalidadRuta = new StringExpression("ficheroMultimediaAltaCalidadRuta", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		estilos = new CollectionExpression("ORM_estilos", this.getDetachedCriteria());
		incluida_en_listas = new CollectionExpression("ORM_incluida_en_listas", this.getDetachedCriteria());
		intepretes = new CollectionExpression("ORM_intepretes", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CancionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		incluida_en_albumesId = new IntegerExpression("incluida_en_albumes.id", this.getDetachedCriteria());
		incluida_en_albumes = new AssociationExpression("incluida_en_albumes", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		productores = new StringExpression("productores", this.getDetachedCriteria());
		ficheroMultimediaRuta = new StringExpression("ficheroMultimediaRuta", this.getDetachedCriteria());
		compositores = new StringExpression("compositores", this.getDetachedCriteria());
		ficheroMultimediaAltaCalidadRuta = new StringExpression("ficheroMultimediaAltaCalidadRuta", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		estilos = new CollectionExpression("ORM_estilos", this.getDetachedCriteria());
		incluida_en_listas = new CollectionExpression("ORM_incluida_en_listas", this.getDetachedCriteria());
		intepretes = new CollectionExpression("ORM_intepretes", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria createIncluida_en_albumesCriteria() {
		return new AlbumDetachedCriteria(createCriteria("incluida_en_albumes"));
	}
	
	public Usuario_genericoDetachedCriteria createUsuarioCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public EstiloDetachedCriteria createEstilosCriteria() {
		return new EstiloDetachedCriteria(createCriteria("ORM_estilos"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createIncluida_en_listasCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_incluida_en_listas"));
	}
	
	public ArtistaDetachedCriteria createIntepretesCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_intepretes"));
	}
	
	public Cancion uniqueCancion(PersistentSession session) {
		return (Cancion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cancion[] listCancion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

