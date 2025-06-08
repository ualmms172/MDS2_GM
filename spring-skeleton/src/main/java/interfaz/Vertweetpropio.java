package interfaz;

public class Vertweetpropio extends VertweetgeneralUsuarioRegistrado {

	
	
	
	public Vertweetpropio(MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado_item) {
		super(mostrartweetspropiosUsuarioRegistrado_item);
		this.getButtonMeGusta().setVisible(false);

	}
	
	
}