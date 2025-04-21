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
@Table(name="baneo")
public class baneo implements Serializable {
	public baneo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BANEO_USUARIOREGISTRADO) {
			this.usuarioRegistrado = (basededatos.UsuarioRegistrado) owner;
		}
		
		else if (key == ORMConstants.KEY_BANEO_ADMINISTRADOR) {
			this.administrador = (basededatos.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_baneo", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_BANEO_ID_BANEO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_BANEO_ID_BANEO_GENERATOR", strategy="native")	
	private int id_baneo;
	
	@Column(name="FechaFin", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date FechaFin;
	
	@OneToOne(targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UsuarioRegistradoLogueadoId_logueado", referencedColumnName="LogueadoId_logueado", nullable=false) })	
	private basededatos.UsuarioRegistrado usuarioRegistrado;
	
	@ManyToOne(targetEntity=basededatos.Administrador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AdministradorLogueadoId_logueado", referencedColumnName="LogueadoId_logueado", nullable=false) })	
	private basededatos.Administrador administrador;
	
	public void setFechaFin(java.util.Date value) {
		this.FechaFin = value;
	}
	
	public java.util.Date getFechaFin() {
		return FechaFin;
	}
	
	private void setId_baneo(int value) {
		this.id_baneo = value;
	}
	
	public int getId_baneo() {
		return id_baneo;
	}
	
	public int getORMID() {
		return getId_baneo();
	}
	
	public void setUsuarioRegistrado(basededatos.UsuarioRegistrado value) {
		if (this.usuarioRegistrado != value) {
			basededatos.UsuarioRegistrado lusuarioRegistrado = this.usuarioRegistrado;
			this.usuarioRegistrado = value;
			if (value != null) {
				usuarioRegistrado.setBaneo(this);
			}
			if (lusuarioRegistrado != null && lusuarioRegistrado.getBaneo() == this) {
				lusuarioRegistrado.setBaneo(null);
			}
		}
	}
	
	public basededatos.UsuarioRegistrado getUsuarioRegistrado() {
		return usuarioRegistrado;
	}
	
	public void setAdministrador(basededatos.Administrador value) {
		if (administrador != null) {
			administrador.baneos.remove(this);
		}
		if (value != null) {
			value.baneos.add(this);
		}
	}
	
	public basededatos.Administrador getAdministrador() {
		return administrador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Administrador(basededatos.Administrador value) {
		this.administrador = value;
	}
	
	private basededatos.Administrador getORM_Administrador() {
		return administrador;
	}
	
	public String toString() {
		return String.valueOf(getId_baneo());
	}
	
}
