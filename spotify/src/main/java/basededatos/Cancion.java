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
@Table(name="Cancion")
public class Cancion implements Serializable {
	public Cancion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CANCION_USUARIO) {
			return ORM_usuario;
		}
		else if (key == ORMConstants.KEY_CANCION_ESTILOS) {
			return ORM_estilos;
		}
		else if (key == ORMConstants.KEY_CANCION_INCLUIDA_EN_LISTAS) {
			return ORM_incluida_en_listas;
		}
		else if (key == ORMConstants.KEY_CANCION_INTEPRETES) {
			return ORM_intepretes;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CANCION_INCLUIDA_EN_ALBUMES) {
			this.incluida_en_albumes = (basededatos.Album) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_CANCION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANCION_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Album.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AlbumId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="FKCancion505647"))	
	private basededatos.Album incluida_en_albumes;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Productores", nullable=true, length=255)	
	private String productores;
	
	@Column(name="FicheroMultimediaRuta", nullable=true, length=255)	
	private String ficheroMultimediaRuta;
	
	@Column(name="Compositores", nullable=true, length=255)	
	private String compositores;
	
	@Column(name="FicheroMultimediaAltaCalidadRuta", nullable=true, length=255)	
	private String ficheroMultimediaAltaCalidadRuta;
	
	@Column(name="NumReproducciones", nullable=false, length=10)	
	private int numReproducciones;
	
	@ManyToMany(targetEntity=basededatos.Usuario_generico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_generico_Cancion", joinColumns={ @JoinColumn(name="CancionId") }, inverseJoinColumns={ @JoinColumn(name="Usuario_genericoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Estilo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Estilo_Cancion", joinColumns={ @JoinColumn(name="CancionId") }, inverseJoinColumns={ @JoinColumn(name="EstiloId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estilos = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Lista_de_reproduccion_Cancion", joinColumns={ @JoinColumn(name="CancionId") }, inverseJoinColumns={ @JoinColumn(name="Lista_de_reproduccionId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incluida_en_listas = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Cancion", joinColumns={ @JoinColumn(name="CancionId") }, inverseJoinColumns={ @JoinColumn(name="ArtistaUsuario_genericoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_intepretes = new java.util.HashSet();
	
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
	
	public void setProductores(String value) {
		this.productores = value;
	}
	
	public String getProductores() {
		return productores;
	}
	
	public void setFicheroMultimediaRuta(String value) {
		this.ficheroMultimediaRuta = value;
	}
	
	public String getFicheroMultimediaRuta() {
		return ficheroMultimediaRuta;
	}
	
	public void setCompositores(String value) {
		this.compositores = value;
	}
	
	public String getCompositores() {
		return compositores;
	}
	
	public void setFicheroMultimediaAltaCalidadRuta(String value) {
		this.ficheroMultimediaAltaCalidadRuta = value;
	}
	
	public String getFicheroMultimediaAltaCalidadRuta() {
		return ficheroMultimediaAltaCalidadRuta;
	}
	
	public void setNumReproducciones(int value) {
		this.numReproducciones = value;
	}
	
	public int getNumReproducciones() {
		return numReproducciones;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final basededatos.Usuario_genericoSetCollection usuario = new basededatos.Usuario_genericoSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_USUARIO, ORMConstants.KEY_USUARIO_GENERICO_ULTIMAS_REPRODUCIDAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estilos(java.util.Set value) {
		this.ORM_estilos = value;
	}
	
	private java.util.Set getORM_Estilos() {
		return ORM_estilos;
	}
	
	@Transient	
	public final basededatos.EstiloSetCollection estilos = new basededatos.EstiloSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ESTILOS, ORMConstants.KEY_ESTILO_CANCIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Incluida_en_listas(java.util.Set value) {
		this.ORM_incluida_en_listas = value;
	}
	
	private java.util.Set getORM_Incluida_en_listas() {
		return ORM_incluida_en_listas;
	}
	
	@Transient	
	public final basededatos.Lista_de_reproduccionSetCollection incluida_en_listas = new basededatos.Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_INCLUIDA_EN_LISTAS, ORMConstants.KEY_LISTA_DE_REPRODUCCION_CANCIONES_INCLUIDAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Intepretes(java.util.Set value) {
		this.ORM_intepretes = value;
	}
	
	private java.util.Set getORM_Intepretes() {
		return ORM_intepretes;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection intepretes = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_INTEPRETES, ORMConstants.KEY_ARTISTA_CANCIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setIncluida_en_albumes(basededatos.Album value) {
		if (incluida_en_albumes != null) {
			incluida_en_albumes.incluye_a.remove(this);
		}
		if (value != null) {
			value.incluye_a.add(this);
		}
	}
	
	public basededatos.Album getIncluida_en_albumes() {
		return incluida_en_albumes;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Incluida_en_albumes(basededatos.Album value) {
		this.incluida_en_albumes = value;
	}
	
	private basededatos.Album getORM_Incluida_en_albumes() {
		return incluida_en_albumes;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
