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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_genericoId", referencedColumnName="Id")
public class Administrador extends basededatos.Usuario_generico implements Serializable {
	public Administrador() {
	}
	
	@Column(name="LimiteCancionesReproducibles", nullable=false, length=10)	
	private int limiteCancionesReproducibles;
	
	@Column(name="NumeroCancionesMostradas", nullable=false, length=10)	
	private int numeroCancionesMostradas;
	
	public void setLimiteCancionesReproducibles(int value) {
		this.limiteCancionesReproducibles = value;
	}
	
	public int getLimiteCancionesReproducibles() {
		return limiteCancionesReproducibles;
	}
	
	public void setNumeroCancionesMostradas(int value) {
		this.numeroCancionesMostradas = value;
	}
	
	public int getNumeroCancionesMostradas() {
		return numeroCancionesMostradas;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
