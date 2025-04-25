package interfaz;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;

public class Retweetear extends CrearContenido {
	//private event _publicarretweet;
	//private event _mencionar;
	//private event _usarHashtag;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	
	public Retweetear (MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado) {
		
		_mostrartweetspropiosUsuarioRegistrado = mostrartweetspropiosUsuarioRegistrado; 
		this.getButtonPublicar().addClickListener(event->Publicarretweet());
		this.getButtonAtras().addClickListener(event->{
			
			Pantalla.MainView.removeAll();
			VerperfilgeneralUsuarioRegistrado v;
			 if(_mostrartweetspropiosUsuarioRegistrado!=null) {
				 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item);
						 }
						 
						 Pantalla.MainView.add(v);
					 }
					 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 Pantalla.MainView.add(v);
					 }
					 else {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
						 }
						 Pantalla.MainView.add(v);
					 }
				 }
					 
				 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
					 VerHashtagUsuarioRegistrado y = new VerHashtagUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado);
					 Pantalla.MainView.add(y);
				 }
				 else {
					 UsuarioRegistrado y = new UsuarioRegistrado((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
					 Pantalla.MainView.add(y);
				 }
			 }
			 else {
				 Pantalla.MainView.add(_vertweetgeneralUsuarioRegistrado); 
			 }
			
		});
		
	}
	
	public Retweetear (VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		this.getButtonPublicar().addClickListener(event->Publicarretweet());
		this.getButtonAtras().addClickListener(event->{
			
			Pantalla.MainView.removeAll();
			VerperfilgeneralUsuarioRegistrado v;
			 if(_mostrartweetspropiosUsuarioRegistrado!=null) {
				 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item);
						 }
						 Pantalla.MainView.add(v);
					 }
					 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 Pantalla.MainView.add(v);
					 }
					 else {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
						 }
						 Pantalla.MainView.add(v);
					 }
				 }
					 
				 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
					 VerHashtagUsuarioRegistrado y = new VerHashtagUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado);
					 Pantalla.MainView.add(y);
				 }
				 else {
					 UsuarioRegistrado y = new UsuarioRegistrado((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
					 Pantalla.MainView.add(y);
				 }
			 }
			 else {
				 Pantalla.MainView.add(_vertweetgeneralUsuarioRegistrado); 
			 }
			
		});
		
	}
	
	
	
	
	
	

	public void Publicarretweet() {
		
		 Pantalla.MainView.removeAll();
		 VerperfilgeneralUsuarioRegistrado v;
		 
		 if(_mostrartweetspropiosUsuarioRegistrado!=null) {
			 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item);
					 }
					 Pantalla.MainView.add(v);
				 }
				 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
					 }
					 Pantalla.MainView.add(v);
				 }
				 else {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
					 }
					 Pantalla.MainView.add(v);
				 }
			 }
				 
			 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				 VerHashtagUsuarioRegistrado y = new VerHashtagUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado);
				 Pantalla.MainView.add(y);
			 }
			 else {
				 UsuarioRegistrado y = new UsuarioRegistrado((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
				 Pantalla.MainView.add(y);
			 }
		 }
		 else {
			 Pantalla.MainView.add(_vertweetgeneralUsuarioRegistrado); 
		 }
	}

}