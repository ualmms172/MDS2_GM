package interfaz;

public class baneo {
	//private Date _fechaFin;
	public UsuarioRegistrado _banea;
	public Administrador _baneadoPor;

	public void setBanea(UsuarioRegistrado aBanea) {
		this._banea = aBanea;
	}

	public UsuarioRegistrado getBanea() {
		return this._banea;
	}

	public void setBaneadoPor(Administrador aBaneadoPor) {
		this._baneadoPor = aBaneadoPor;
	}

	public Administrador getBaneadoPor() {
		return this._baneadoPor;
	}
}