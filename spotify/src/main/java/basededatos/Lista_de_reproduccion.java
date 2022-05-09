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
@Table(name="Lista_de_reproduccion")
public class Lista_de_reproduccion implements Serializable {
	public Lista_de_reproduccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_SEGUIDOR) {
			return ORM_seguidor;
		}
		else if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_CANCIONES_INCLUIDAS) {
			return ORM_canciones_incluidas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_AUTOR) {
			this.autor = (basededatos.Usuario_generico) owner;
		}
		
		else if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_PROPIETARIO_FAVORITO) {
			this.propietario_favorito = (basededatos.Usuario_generico) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_LISTA_DE_REPRODUCCION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_LISTA_DE_REPRODUCCION_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(targetEntity=basededatos.Usuario_generico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_genericoId2", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="FKLista_de_r44963"))	
	private basededatos.Usuario_generico propietario_favorito;
	
	@ManyToOne(targetEntity=basededatos.Usuario_generico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_genericoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKLista_de_r287892"))	
	private basededatos.Usuario_generico autor;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@ManyToMany(targetEntity=basededatos.Usuario_generico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_generico_Lista_de_reproduccion", joinColumns={ @JoinColumn(name="Lista_de_reproduccionId") }, inverseJoinColumns={ @JoinColumn(name="Usuario_genericoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_incluida_en_listas", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones_incluidas = new java.util.HashSet();
	
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
	
	public void setAutor(basededatos.Usuario_generico value) {
		if (autor != null) {
			autor.listas.remove(this);
		}
		if (value != null) {
			value.listas.add(this);
		}
	}
	
	public basededatos.Usuario_generico getAutor() {
		return autor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autor(basededatos.Usuario_generico value) {
		this.autor = value;
	}
	
	private basededatos.Usuario_generico getORM_Autor() {
		return autor;
	}
	
	public void setPropietario_favorito(basededatos.Usuario_generico value) {
		if (this.propietario_favorito != value) {
			basededatos.Usuario_generico lpropietario_favorito = this.propietario_favorito;
			this.propietario_favorito = value;
			if (value != null) {
				propietario_favorito.setFavorita(this);
			}
			if (lpropietario_favorito != null && lpropietario_favorito.getFavorita() == this) {
				lpropietario_favorito.setFavorita(null);
			}
		}
	}
	
	public basededatos.Usuario_generico getPropietario_favorito() {
		return propietario_favorito;
	}
	
	private void setORM_Seguidor(java.util.Set value) {
		this.ORM_seguidor = value;
	}
	
	private java.util.Set getORM_Seguidor() {
		return ORM_seguidor;
	}
	
	@Transient	
	public final basededatos.Usuario_genericoSetCollection seguidor = new basededatos.Usuario_genericoSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_DE_REPRODUCCION_SEGUIDOR, ORMConstants.KEY_USUARIO_GENERICO_LISTA_SEGUIDA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Canciones_incluidas(java.util.Set value) {
		this.ORM_canciones_incluidas = value;
	}
	
	private java.util.Set getORM_Canciones_incluidas() {
		return ORM_canciones_incluidas;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection canciones_incluidas = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_DE_REPRODUCCION_CANCIONES_INCLUIDAS, ORMConstants.KEY_CANCION_INCLUIDA_EN_LISTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
