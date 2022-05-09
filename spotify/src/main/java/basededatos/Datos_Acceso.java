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
@Table(name="Datos_Acceso")
public class Datos_Acceso implements Serializable {
	public Datos_Acceso() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_DATOS_ACCESO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_DATOS_ACCESO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="NumeroIntentos", nullable=false, length=10)	
	private int numeroIntentos;
	
	@Column(name="FechaYHoraBloqueo", nullable=true, length=255)	
	private String fechaYHoraBloqueo;
	
	@OneToOne(mappedBy="datos", targetEntity=basededatos.Usuario_generico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private basededatos.Usuario_generico usuario;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setNumeroIntentos(int value) {
		this.numeroIntentos = value;
	}
	
	public int getNumeroIntentos() {
		return numeroIntentos;
	}
	
	public void setFechaYHoraBloqueo(String value) {
		this.fechaYHoraBloqueo = value;
	}
	
	public String getFechaYHoraBloqueo() {
		return fechaYHoraBloqueo;
	}
	
	public void setUsuario(basededatos.Usuario_generico value) {
		if (this.usuario != value) {
			basededatos.Usuario_generico lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setDatos(this);
			}
			if (lusuario != null && lusuario.getDatos() == this) {
				lusuario.setDatos(null);
			}
		}
	}
	
	public basededatos.Usuario_generico getUsuario() {
		return usuario;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
