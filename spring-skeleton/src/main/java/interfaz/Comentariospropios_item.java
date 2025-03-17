package interfaz;

public class Comentariospropios_item extends ListaComentariosGeneral_item {
	public Comentariospropios_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonBorrar().setVisible(false);
	}

	public Comentariospropios _comentariospropios;
}