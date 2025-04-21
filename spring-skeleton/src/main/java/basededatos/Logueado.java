/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Antonio Gallardo(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Logueado")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Logueado")
public class Logueado implements Serializable {
	public Logueado() {
	}
	
	@Column(name="Id_logueado", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_LOGUEADO_ID_LOGUEADO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_LOGUEADO_ID_LOGUEADO_GENERATOR", strategy="native")	
	private int id_logueado;
	
	@Column(name="Nick", nullable=true, length=255)	
	private String Nick;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String Contrasena;
	
	public void setNick(String value) {
		this.Nick = value;
	}
	
	public String getNick() {
		return Nick;
	}
	
	public void setContrasena(String value) {
		this.Contrasena = value;
	}
	
	public String getContrasena() {
		return Contrasena;
	}
	
	private void setId_logueado(int value) {
		this.id_logueado = value;
	}
	
	public int getId_logueado() {
		return id_logueado;
	}
	
	public int getORMID() {
		return getId_logueado();
	}
	
	public String toString() {
		return String.valueOf(getId_logueado());
	}
	
}
