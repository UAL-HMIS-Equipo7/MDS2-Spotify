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
@Table(name="Estadistica")
public class Estadistica implements Serializable {
	public Estadistica() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESTADISTICA_ARTISTAS_MAS_ESCUCHADOS) {
			return ORM_artistas_mas_escuchados;
		}
		else if (key == ORMConstants.KEY_ESTADISTICA_ESTILOS_MAS_ESCUCHADOS) {
			return ORM_estilos_mas_escuchados;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ESTADISTICA_USUARIO) {
			this.usuario = (basededatos.Usuario_generico) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_ESTADISTICA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ESTADISTICA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(optional=false, targetEntity=basededatos.Usuario_generico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_genericoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKEstadistic756625"))	
	private basededatos.Usuario_generico usuario;
	
	@Column(name="TiempoReproducido", nullable=false, length=10)	
	private int tiempoReproducido;
	
	@Column(name="NumeroCanciones", nullable=false, length=10)	
	private int numeroCanciones;
	
	@Column(name="NumeroArtistas", nullable=false, length=10)	
	private int numeroArtistas;
	
	@ManyToMany(mappedBy="ORM_aparece_en", targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_artistas_mas_escuchados = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_aparece_en", targetEntity=basededatos.Estilo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estilos_mas_escuchados = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTiempoReproducido(int value) {
		this.tiempoReproducido = value;
	}
	
	public int getTiempoReproducido() {
		return tiempoReproducido;
	}
	
	public void setNumeroCanciones(int value) {
		this.numeroCanciones = value;
	}
	
	public int getNumeroCanciones() {
		return numeroCanciones;
	}
	
	public void setNumeroArtistas(int value) {
		this.numeroArtistas = value;
	}
	
	public int getNumeroArtistas() {
		return numeroArtistas;
	}
	
	public void setUsuario(basededatos.Usuario_generico value) {
		if (this.usuario != value) {
			basededatos.Usuario_generico lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setEstadistica(this);
			}
			if (lusuario != null && lusuario.getEstadistica() == this) {
				lusuario.setEstadistica(null);
			}
		}
	}
	
	public basededatos.Usuario_generico getUsuario() {
		return usuario;
	}
	
	private void setORM_Artistas_mas_escuchados(java.util.Set value) {
		this.ORM_artistas_mas_escuchados = value;
	}
	
	private java.util.Set getORM_Artistas_mas_escuchados() {
		return ORM_artistas_mas_escuchados;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection artistas_mas_escuchados = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTADISTICA_ARTISTAS_MAS_ESCUCHADOS, ORMConstants.KEY_ARTISTA_APARECE_EN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estilos_mas_escuchados(java.util.Set value) {
		this.ORM_estilos_mas_escuchados = value;
	}
	
	private java.util.Set getORM_Estilos_mas_escuchados() {
		return ORM_estilos_mas_escuchados;
	}
	
	@Transient	
	public final basededatos.EstiloSetCollection estilos_mas_escuchados = new basededatos.EstiloSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTADISTICA_ESTILOS_MAS_ESCUCHADOS, ORMConstants.KEY_ESTILO_APARECE_EN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
