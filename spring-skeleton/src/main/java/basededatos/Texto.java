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
@Table(name="Texto")
public class Texto implements Serializable {
	public Texto() {
	}
	
	@Column(name="Id_texto", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_TEXTO_ID_TEXTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_TEXTO_ID_TEXTO_GENERATOR", strategy="native")	
	private int id_texto;
	
	@OneToOne(optional=false, targetEntity=basededatos.Contenido.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ContenidoId_cont", referencedColumnName="Id_cont", nullable=false) }, foreignKey=@ForeignKey(name="FKTexto963038"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Contenido PerteneceA;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String Texto;
	
	public void setTexto(String value) {
		this.Texto = value;
	}
	
	public String getTexto() {
		return Texto;
	}
	
	private void setId_texto(int value) {
		this.id_texto = value;
	}
	
	public int getId_texto() {
		return id_texto;
	}
	
	public int getORMID() {
		return getId_texto();
	}
	
	public void setPerteneceA(basededatos.Contenido value) {
		if (this.PerteneceA != value) {
			basededatos.Contenido lPerteneceA = this.PerteneceA;
			this.PerteneceA = value;
			if (value != null) {
				PerteneceA.setContieneTexto(this);
			}
			if (lPerteneceA != null && lPerteneceA.getContieneTexto() == this) {
				lPerteneceA.setContieneTexto(null);
			}
		}
	}
	
	public basededatos.Contenido getPerteneceA() {
		return PerteneceA;
	}
	
	public String toString() {
		return String.valueOf(getId_texto());
	}
	
}
