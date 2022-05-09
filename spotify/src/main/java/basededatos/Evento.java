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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Evento")
public class Evento implements Serializable {
	public Evento() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EVENTO_USUARIO) {
			return ORM_usuario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENTO_PUBLICADO_POR) {
			this.publicado_por = (basededatos.Artista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_EVENTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_EVENTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaUsuario_genericoId", referencedColumnName="Usuario_genericoId", nullable=false) }, foreignKey=@ForeignKey(name="FKEvento205044"))	
	private basededatos.Artista publicado_por;
	
	@Column(name="ImagenRuta", nullable=true, length=255)	
	private String imagenRuta;
	
	@Column(name="FechaYHora", nullable=true, length=255)	
	private String fechaYHora;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Precio", nullable=false, length=10)	
	private int precio;
	
	@ManyToMany(targetEntity=basededatos.Usuario_generico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_generico_Evento", joinColumns={ @JoinColumn(name="EventoId") }, inverseJoinColumns={ @JoinColumn(name="Usuario_genericoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setImagenRuta(String value) {
		this.imagenRuta = value;
	}
	
	public String getImagenRuta() {
		return imagenRuta;
	}
	
	public void setFechaYHora(String value) {
		this.fechaYHora = value;
	}
	
	public String getFechaYHora() {
		return fechaYHora;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setPrecio(int value) {
		this.precio = value;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPublicado_por(basededatos.Artista value) {
		if (publicado_por != null) {
			publicado_por.eventos.remove(this);
		}
		if (value != null) {
			value.eventos.add(this);
		}
	}
	
	public basededatos.Artista getPublicado_por() {
		return publicado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Publicado_por(basededatos.Artista value) {
		this.publicado_por = value;
	}
	
	private basededatos.Artista getORM_Publicado_por() {
		return publicado_por;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final basededatos.Usuario_genericoSetCollection usuario = new basededatos.Usuario_genericoSetCollection(this, _ormAdapter, ORMConstants.KEY_EVENTO_USUARIO, ORMConstants.KEY_USUARIO_GENERICO_NOTIFICACIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
