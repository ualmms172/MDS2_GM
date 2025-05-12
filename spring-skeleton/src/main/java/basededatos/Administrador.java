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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Administrador")
@PrimaryKeyJoinColumn(name="LogueadoId_logueado", referencedColumnName="Id_logueado")
public class Administrador extends basededatos.Logueado implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_BANEOS) {
			return ORM_baneos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_admin", nullable=false, length=10)	
	private int id_admin;
	
	@OneToMany(mappedBy="administrador", targetEntity=basededatos.baneo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_baneos = new java.util.HashSet();
	
	public void setId_admin(int value) {
		this.id_admin = value;
	}
	
	public int getId_admin() {
		return id_admin;
	}
	
	public basededatos.UsuarioRegistrado[] getUsuarioRegistrados() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = baneos.getIterator();lIter.hasNext();) {
			lValues.add(((basededatos.baneo)lIter.next()).getUsuarioRegistrado());
		}
		return (basededatos.UsuarioRegistrado[])lValues.toArray(new basededatos.UsuarioRegistrado[lValues.size()]);
	}
	
	public void removeUsuarioRegistrado(basededatos.UsuarioRegistrado aUsuarioRegistrado) {
		basededatos.baneo[] lBaneos = baneos.toArray();
		for(int i = 0; i < lBaneos.length; i++) {
			if(lBaneos[i].getUsuarioRegistrado().equals(aUsuarioRegistrado)) {
				baneos.remove(lBaneos[i]);
			}
		}
	}
	
	public void addUsuarioRegistrado(basededatos.baneo aBaneo, basededatos.UsuarioRegistrado aUsuarioRegistrado) {
		aBaneo.setUsuarioRegistrado(aUsuarioRegistrado);
		baneos.add(aBaneo);
	}
	
	public basededatos.baneo getBaneoByUsuarioRegistrado(basededatos.UsuarioRegistrado aUsuarioRegistrado) {
		basededatos.baneo[] lBaneos = baneos.toArray();
		for(int i = 0; i < lBaneos.length; i++) {
			if(lBaneos[i].getUsuarioRegistrado().equals(aUsuarioRegistrado)) {
				return lBaneos[i];
			}
		}
		return null;
	}
	
	private void setORM_Baneos(java.util.Set value) {
		this.ORM_baneos = value;
	}
	
	private java.util.Set getORM_Baneos() {
		return ORM_baneos;
	}
	
	@Transient	
	public final basededatos.baneoSetCollection baneos = new basededatos.baneoSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_BANEOS, ORMConstants.KEY_BANEO_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
