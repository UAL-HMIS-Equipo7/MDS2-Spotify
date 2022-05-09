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
@Table(name="Artista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_genericoId", referencedColumnName="Id")
public class Artista extends basededatos.Usuario_generico implements Serializable {
	public Artista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARTISTA_APARECE_EN) {
			return ORM_aparece_en;
		}
		else if (key == ORMConstants.KEY_ARTISTA_ALBUMES) {
			return ORM_albumes;
		}
		else if (key == ORMConstants.KEY_ARTISTA_EVENTOS) {
			return ORM_eventos;
		}
		else if (key == ORMConstants.KEY_ARTISTA_CANCIONES) {
			return ORM_canciones;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ARTISTA_ESTILO) {
			this.estilo = (basededatos.Estilo) owner;
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
	
	@ManyToOne(targetEntity=basededatos.Estilo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EstiloId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKArtista318398"))	
	private basededatos.Estilo estilo;
	
	@ManyToMany(targetEntity=basededatos.Estadistica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Estadistica_Artista", joinColumns={ @JoinColumn(name="ArtistaUsuario_genericoId") }, inverseJoinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece_en = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_autores", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_albumes = new java.util.HashSet();
	
	@OneToMany(mappedBy="publicado_por", targetEntity=basededatos.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_eventos = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_intepretes", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones = new java.util.HashSet();
	
	private void setORM_Aparece_en(java.util.Set value) {
		this.ORM_aparece_en = value;
	}
	
	private java.util.Set getORM_Aparece_en() {
		return ORM_aparece_en;
	}
	
	@Transient	
	public final basededatos.EstadisticaSetCollection aparece_en = new basededatos.EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_APARECE_EN, ORMConstants.KEY_ESTADISTICA_ARTISTAS_MAS_ESCUCHADOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Albumes(java.util.Set value) {
		this.ORM_albumes = value;
	}
	
	private java.util.Set getORM_Albumes() {
		return ORM_albumes;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection albumes = new basededatos.AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ALBUMES, ORMConstants.KEY_ALBUM_AUTORES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Eventos(java.util.Set value) {
		this.ORM_eventos = value;
	}
	
	private java.util.Set getORM_Eventos() {
		return ORM_eventos;
	}
	
	@Transient	
	public final basededatos.EventoSetCollection eventos = new basededatos.EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_EVENTOS, ORMConstants.KEY_EVENTO_PUBLICADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEstilo(basededatos.Estilo value) {
		if (estilo != null) {
			estilo.artistas.remove(this);
		}
		if (value != null) {
			value.artistas.add(this);
		}
	}
	
	public basededatos.Estilo getEstilo() {
		return estilo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estilo(basededatos.Estilo value) {
		this.estilo = value;
	}
	
	private basededatos.Estilo getORM_Estilo() {
		return estilo;
	}
	
	private void setORM_Canciones(java.util.Set value) {
		this.ORM_canciones = value;
	}
	
	private java.util.Set getORM_Canciones() {
		return ORM_canciones;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection canciones = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_CANCIONES, ORMConstants.KEY_CANCION_INTEPRETES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
