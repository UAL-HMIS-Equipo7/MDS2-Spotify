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
@Table(name="Estilo")
public class Estilo implements Serializable {
	public Estilo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESTILO_APARECE_EN) {
			return ORM_aparece_en;
		}
		else if (key == ORMConstants.KEY_ESTILO_ARTISTAS) {
			return ORM_artistas;
		}
		else if (key == ORMConstants.KEY_ESTILO_CANCIONES) {
			return ORM_canciones;
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
	@GeneratedValue(generator="BASEDEDATOS_ESTILO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ESTILO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=basededatos.Estadistica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Estadistica_Estilo", joinColumns={ @JoinColumn(name="EstiloId") }, inverseJoinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece_en = new java.util.HashSet();
	
	@OneToMany(mappedBy="estilo", targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_artistas = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_estilos", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Aparece_en(java.util.Set value) {
		this.ORM_aparece_en = value;
	}
	
	private java.util.Set getORM_Aparece_en() {
		return ORM_aparece_en;
	}
	
	@Transient	
	public final basededatos.EstadisticaSetCollection aparece_en = new basededatos.EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTILO_APARECE_EN, ORMConstants.KEY_ESTADISTICA_ESTILOS_MAS_ESCUCHADOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Artistas(java.util.Set value) {
		this.ORM_artistas = value;
	}
	
	private java.util.Set getORM_Artistas() {
		return ORM_artistas;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection artistas = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTILO_ARTISTAS, ORMConstants.KEY_ARTISTA_ESTILO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Canciones(java.util.Set value) {
		this.ORM_canciones = value;
	}
	
	private java.util.Set getORM_Canciones() {
		return ORM_canciones;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection canciones = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTILO_CANCIONES, ORMConstants.KEY_CANCION_ESTILOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
