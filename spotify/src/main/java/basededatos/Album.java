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
@Table(name="Album")
public class Album implements Serializable {
	public Album() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ALBUM_AUTORES) {
			return ORM_autores;
		}
		else if (key == ORMConstants.KEY_ALBUM_INCLUYE_A) {
			return ORM_incluye_a;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ALBUM_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ALBUM_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="FechaEdicion", nullable=true, length=255)	
	private String fechaEdicion;
	
	@Column(name="ImagenRuta", nullable=true, length=255)	
	private String imagenRuta;
	
	@ManyToMany(targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Album", joinColumns={ @JoinColumn(name="AlbumId") }, inverseJoinColumns={ @JoinColumn(name="ArtistaUsuario_genericoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_autores = new java.util.HashSet();
	
	@OneToMany(mappedBy="incluida_en_albumes", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incluye_a = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setFechaEdicion(String value) {
		this.fechaEdicion = value;
	}
	
	public String getFechaEdicion() {
		return fechaEdicion;
	}
	
	public void setImagenRuta(String value) {
		this.imagenRuta = value;
	}
	
	public String getImagenRuta() {
		return imagenRuta;
	}
	
	private void setORM_Autores(java.util.Set value) {
		this.ORM_autores = value;
	}
	
	private java.util.Set getORM_Autores() {
		return ORM_autores;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection autores = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_AUTORES, ORMConstants.KEY_ARTISTA_ALBUMES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Incluye_a(java.util.Set value) {
		this.ORM_incluye_a = value;
	}
	
	private java.util.Set getORM_Incluye_a() {
		return ORM_incluye_a;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection incluye_a = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_INCLUYE_A, ORMConstants.KEY_CANCION_INCLUIDA_EN_ALBUMES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
