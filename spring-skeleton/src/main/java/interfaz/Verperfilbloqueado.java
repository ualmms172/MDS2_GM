package interfaz;

public class Verperfilbloqueado extends VerperfilgeneralUsuarioRegistrado {
	//private event _desbloquear;
	//private event _bloquear;
	//private Label _bloqueo;
	//private Button _bloquearB;
	//public Verperfilajeno _verperfilajeno;
	
	//public Verperfilbloqueado(Verperfilajeno verperfilajeno) {
		
		//_verperfilajeno = verperfilajeno; 
	//}
	

	
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	
	public Verperfilbloqueado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado) {
		super(mostrartweetsUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilbloqueado(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilbloqueado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		super(vertweetgeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Hacer constructores: 

	public void Desbloquear() {
		throw new UnsupportedOperationException();
	}

	public void Bloquear() {
		throw new UnsupportedOperationException();
	}
}