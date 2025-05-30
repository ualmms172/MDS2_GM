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
@Table(name="Multimedia")
public class Multimedia implements Serializable {
	public Multimedia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MULTIMEDIA_PERTENECEA) {
			this.PerteneceA = (basededatos.Contenido) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_mult", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_MULTIMEDIA_ID_MULT_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_MULTIMEDIA_ID_MULT_GENERATOR", strategy="native")	
	private int id_mult;
	
	@ManyToOne(targetEntity=basededatos.Contenido.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ContenidoId_cont", referencedColumnName="Id_cont", nullable=false) }, foreignKey=@ForeignKey(name="FKMultimedia154392"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Contenido PerteneceA;
	
	@Column(name="Url", nullable=true, length=255)	
	private String url;
	
	@Column(name="Foto", nullable=false, length=1)	
	private boolean foto;
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	private void setId_mult(int value) {
		this.id_mult = value;
	}
	
	public int getId_mult() {
		return id_mult;
	}
	
	public int getORMID() {
		return getId_mult();
	}
	
	public void setFoto(boolean value) {
		this.foto = value;
	}
	
	public boolean getFoto() {
		return foto;
	}
	
	public void setPerteneceA(basededatos.Contenido value) {
		if (PerteneceA != null) {
			PerteneceA.contieneMultimedia.remove(this);
		}
		if (value != null) {
			value.contieneMultimedia.add(this);
		}
	}
	
	public basededatos.Contenido getPerteneceA() {
		return PerteneceA;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PerteneceA(basededatos.Contenido value) {
		this.PerteneceA = value;
	}
	
	private basededatos.Contenido getORM_PerteneceA() {
		return PerteneceA;
	}
	
	public String toString() {
		return String.valueOf(getId_mult());
	}
	
}
