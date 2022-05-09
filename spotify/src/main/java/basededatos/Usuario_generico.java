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
@Table(name="Usuario_generico")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario_generico implements Serializable {
	public Usuario_generico() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_GENERICO_SEGUIDOR) {
			return ORM_seguidor;
		}
		else if (key == ORMConstants.KEY_USUARIO_GENERICO_LISTAS) {
			return ORM_listas;
		}
		else if (key == ORMConstants.KEY_USUARIO_GENERICO_SEGUIDO) {
			return ORM_seguido;
		}
		else if (key == ORMConstants.KEY_USUARIO_GENERICO_ULTIMAS_REPRODUCIDAS) {
			return ORM_ultimas_reproducidas;
		}
		else if (key == ORMConstants.KEY_USUARIO_GENERICO_NOTIFICACIONES) {
			return ORM_notificaciones;
		}
		else if (key == ORMConstants.KEY_USUARIO_GENERICO_LISTA_SEGUIDA) {
			return ORM_lista_seguida;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_GENERICO_DATOS) {
			this.datos = (basededatos.Datos_Acceso) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_GENERICO_FAVORITA) {
			this.favorita = (basededatos.Lista_de_reproduccion) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_GENERICO_ESTADISTICA) {
			this.estadistica = (basededatos.Estadistica) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_USUARIO_GENERICO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_USUARIO_GENERICO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(optional=false, targetEntity=basededatos.Datos_Acceso.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Datos_AccesoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario_ge625375"))	
	private basededatos.Datos_Acceso datos;
	
	@Column(name="Nick", nullable=true, length=255)	
	private String nick;
	
	@Column(name="FotoRuta", nullable=true, length=255)	
	private String fotoRuta;
	
	@ManyToMany(targetEntity=basededatos.Usuario_generico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_generico_Usuario_generico", joinColumns={ @JoinColumn(name="Usuario_genericoId2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_genericoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor = new java.util.HashSet();
	
	@OneToMany(mappedBy="autor", targetEntity=basededatos.Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas = new java.util.HashSet();
	
	@OneToOne(mappedBy="propietario_favorito", targetEntity=basededatos.Lista_de_reproduccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private basededatos.Lista_de_reproduccion favorita;
	
	@ManyToMany(mappedBy="ORM_seguidor", targetEntity=basededatos.Usuario_generico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguido = new java.util.HashSet();
	
	@OneToOne(mappedBy="usuario", targetEntity=basededatos.Estadistica.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private basededatos.Estadistica estadistica;
	
	@ManyToMany(mappedBy="ORM_usuario", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ultimas_reproducidas = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuario", targetEntity=basededatos.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_notificaciones = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_seguidor", targetEntity=basededatos.Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lista_seguida = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setFotoRuta(String value) {
		this.fotoRuta = value;
	}
	
	public String getFotoRuta() {
		return fotoRuta;
	}
	
	private void setORM_Seguidor(java.util.Set value) {
		this.ORM_seguidor = value;
	}
	
	private java.util.Set getORM_Seguidor() {
		return ORM_seguidor;
	}
	
	@Transient	
	public final basededatos.Usuario_genericoSetCollection seguidor = new basededatos.Usuario_genericoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_GENERICO_SEGUIDOR, ORMConstants.KEY_USUARIO_GENERICO_SEGUIDO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setDatos(basededatos.Datos_Acceso value) {
		if (this.datos != value) {
			basededatos.Datos_Acceso ldatos = this.datos;
			this.datos = value;
			if (value != null) {
				datos.setUsuario(this);
			}
			if (ldatos != null && ldatos.getUsuario() == this) {
				ldatos.setUsuario(null);
			}
		}
	}
	
	public basededatos.Datos_Acceso getDatos() {
		return datos;
	}
	
	private void setORM_Listas(java.util.Set value) {
		this.ORM_listas = value;
	}
	
	private java.util.Set getORM_Listas() {
		return ORM_listas;
	}
	
	@Transient	
	public final basededatos.Lista_de_reproduccionSetCollection listas = new basededatos.Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_GENERICO_LISTAS, ORMConstants.KEY_LISTA_DE_REPRODUCCION_AUTOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setFavorita(basededatos.Lista_de_reproduccion value) {
		if (this.favorita != value) {
			basededatos.Lista_de_reproduccion lfavorita = this.favorita;
			this.favorita = value;
			if (value != null) {
				favorita.setPropietario_favorito(this);
			}
			if (lfavorita != null && lfavorita.getPropietario_favorito() == this) {
				lfavorita.setPropietario_favorito(null);
			}
		}
	}
	
	public basededatos.Lista_de_reproduccion getFavorita() {
		return favorita;
	}
	
	private void setORM_Seguido(java.util.Set value) {
		this.ORM_seguido = value;
	}
	
	private java.util.Set getORM_Seguido() {
		return ORM_seguido;
	}
	
	@Transient	
	public final basededatos.Usuario_genericoSetCollection seguido = new basededatos.Usuario_genericoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_GENERICO_SEGUIDO, ORMConstants.KEY_USUARIO_GENERICO_SEGUIDOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEstadistica(basededatos.Estadistica value) {
		if (this.estadistica != value) {
			basededatos.Estadistica lestadistica = this.estadistica;
			this.estadistica = value;
			if (value != null) {
				estadistica.setUsuario(this);
			}
			if (lestadistica != null && lestadistica.getUsuario() == this) {
				lestadistica.setUsuario(null);
			}
		}
	}
	
	public basededatos.Estadistica getEstadistica() {
		return estadistica;
	}
	
	private void setORM_Ultimas_reproducidas(java.util.Set value) {
		this.ORM_ultimas_reproducidas = value;
	}
	
	private java.util.Set getORM_Ultimas_reproducidas() {
		return ORM_ultimas_reproducidas;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection ultimas_reproducidas = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_GENERICO_ULTIMAS_REPRODUCIDAS, ORMConstants.KEY_CANCION_USUARIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Notificaciones(java.util.Set value) {
		this.ORM_notificaciones = value;
	}
	
	private java.util.Set getORM_Notificaciones() {
		return ORM_notificaciones;
	}
	
	@Transient	
	public final basededatos.EventoSetCollection notificaciones = new basededatos.EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_GENERICO_NOTIFICACIONES, ORMConstants.KEY_EVENTO_USUARIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Lista_seguida(java.util.Set value) {
		this.ORM_lista_seguida = value;
	}
	
	private java.util.Set getORM_Lista_seguida() {
		return ORM_lista_seguida;
	}
	
	@Transient	
	public final basededatos.Lista_de_reproduccionSetCollection lista_seguida = new basededatos.Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_GENERICO_LISTA_SEGUIDA, ORMConstants.KEY_LISTA_DE_REPRODUCCION_SEGUIDOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
