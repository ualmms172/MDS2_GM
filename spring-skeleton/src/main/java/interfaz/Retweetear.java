package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.Contenido;
import basededatos.Tweet;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
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
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
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
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
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
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
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
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
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
	
	
	
	
	
	

	public void Publicarretweet() { //No se si es del todo correcto, he añadido solo el recargar a los MainView existentes (ademas de lo inicial claro)
		
		basededatos.Tweet t = null;
		if(_mostrartweetspropiosUsuarioRegistrado!=null) t = _mostrartweetspropiosUsuarioRegistrado.t;
		else t=_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t;
		
		boolean hecho=false;
		
		for(Contenido cont : Interfaz.ur.u.escribe.toArray()) {
			if(cont instanceof Tweet) continue;
			Tweet tweet = (Tweet)cont;
			if(tweet.getRetweeteaA()!=null)
				if(tweet.getRetweeteaA().getORMID()==t.getORMID()) {
					hecho=true;
					break;
				}
		}
		
		if (hecho && this.getTextFieldCampoTexto().isEmpty() && this.getTextFieldTextoVideo().isEmpty() && this.getTextFieldUrlFoto().isEmpty() ) {
            Notification.show("Ya has hecho un retweet vacio de este tweet. Para uno nuevo rellena algún campo.");
            return;
        }
		
		String texto = this.getTextFieldCampoTexto().getValue();
		String foto = this.getTextFieldUrlFoto().getValue();
		String video = this.getTextFieldTextoVideo().getValue();
		
		basededatos.UsuarioRegistrado ubd=Interfaz.ur._iUsuarioregistrado.Escribir_Retweet(t, texto, foto, video, Interfaz.ur.u);
	
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		
		 Pantalla.MainView.removeAll();
		 VerperfilgeneralUsuarioRegistrado v;
		 
		 if(_mostrartweetspropiosUsuarioRegistrado!=null) {
			 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 Pantalla.MainView.add(v.Recargar(u)); 
				 }
				 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
					 }
					 Pantalla.MainView.add(v.Recargar(u));
				 }
				 else {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 Pantalla.MainView.add(v.Recargar(u));
				 }
			 }
				 
			 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				 VerHashtagUsuarioRegistrado y = new VerHashtagUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado);
				 Pantalla.MainView.add(y.Recargar(u));
			 }
			 else {
				 //UsuarioRegistrado y = new UsuarioRegistrado((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
				 Pantalla.MainView.add(u);
			 }
		 }
		 else {
			 Pantalla.MainView.add(_vertweetgeneralUsuarioRegistrado.Recargar(u)); 
		 }
	}
	
	public Retweetear Recargar(UsuarioRegistrado log) {
		Retweetear vista = null;
		if(this._vertweetgeneralUsuarioRegistrado!=null) {
			vista = new Retweetear(_vertweetgeneralUsuarioRegistrado.Recargar(log));
		}
		else {
			MostrartweetspropiosUsuarioRegistrado lt = this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado;
			if(lt._verperfilgeneralUsuarioRegistrado!=null) {
				lt = new MostrartweetspropiosUsuarioRegistrado(lt._verperfilgeneralUsuarioRegistrado.Recargar(log));
				vista= new Retweetear(_mostrartweetspropiosUsuarioRegistrado);
			}
			else if(lt._verHashtagUsuarioRegistrado!=null) {
				lt = new MostrartweetspropiosUsuarioRegistrado(lt._verHashtagUsuarioRegistrado.Recargar(log));
				vista= new Retweetear(_mostrartweetspropiosUsuarioRegistrado); 
				}
			else {
				lt = new MostrartweetspropiosUsuarioRegistrado(log);
				vista = new Retweetear(_mostrartweetspropiosUsuarioRegistrado);
			}
		}
		return vista;
	}

}