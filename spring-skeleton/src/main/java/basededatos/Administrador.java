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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="LogueadoID", referencedColumnName="ID")
public class Administrador extends basededatos.Logueado implements Serializable {
	public Administrador() {
	}
	
	@Column(name="Id_admin", nullable=false, length=10)	
	private int id_admin;
	
	public void setId_admin(int value) {
		this.id_admin = value;
	}
	
	public int getId_admin() {
		return id_admin;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
