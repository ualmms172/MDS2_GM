package interfaz;

public class MostrartweetsUsuarioRegistrado_item extends MostrartweetspropiosUsuarioRegistrado_item {
	MostrartweetsUsuarioRegistrado_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(true);
		
		this.getButtonMeGusta().addClickListener(event-> Darlikeatweet());
		this.getButtonMeGusta().getElement()
	    .executeJs("this.addEventListener('click', function(e) { e.stopPropagation(); })");

	}

	//private event _darlikeatweet;
	//private Button _darMeGusta;
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	
	public Boolean dado = false;
	
	public void Darlikeatweet() {
		
		if(!dado) {
			this.getButtonMeGusta().getStyle().set("color", "red");
			this.getButtonMeGusta().setText("Quitar");
			MostrartweetsUsuarioRegistrado la = (MostrartweetsUsuarioRegistrado) _lista;
			la._item.add(this);
			dado=true;
			}
			
			else {
				this.getButtonMeGusta().getStyle().set("color", "gray");
				this.getButtonMeGusta().setText("Dar me gusta");
				MostrartweetsUsuarioRegistrado la = (MostrartweetsUsuarioRegistrado) _lista;
				la._item.add(this);
				dado=false;
				}
	}
}