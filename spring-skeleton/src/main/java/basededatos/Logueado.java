/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Logueado")
@Inheritance(strategy=InheritanceType.JOINED)
public class Logueado implements Serializable {
	public Logueado() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_LOGUEADO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_LOGUEADO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nick", nullable=true, length=255)	
	private String Nick;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String Contrasena;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String Correo;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
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
	
	public void setCorreo(String value) {
		this.Correo = value;
	}
	
	public String getCorreo() {
		return Correo;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
