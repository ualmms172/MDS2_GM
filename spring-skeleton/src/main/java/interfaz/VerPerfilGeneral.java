package interfaz;

import vistas.VistaVerperfilgeneral;

public class VerPerfilGeneral extends VistaVerperfilgeneral{
	
	public boolean mencion;
	
	
	public VerPerfilGeneral(ListaUsuariosGeneral_item listaUsuario) {
		
		this.getLabelNick().setText(listaUsuario.u.getNick());
		this.getLabelDescripcion().setText(listaUsuario.u.getDescripcion());
		this.getLabelNumSeguidores().setText("Seguidores : "+String.valueOf(listaUsuario.u.seguidoPor.size()));
		this.getLabelNumSeguidos().setText("Seguidos : "+String.valueOf(listaUsuario.u.sigueA.size()));
		if(listaUsuario.u.getFotoFondo()!=null)
			this.getImgCabecera().setSrc(listaUsuario.u.getFotoFondo());
		this.getImgPerfil().setSrc(listaUsuario.u.getFotoPerfil());
		
		this.getImgPerfil().setHeight("100%");
		this.getImgPerfil().setWidth("100%");
		

		this.getImgCabecera().setHeight("200px");
		this.getImgCabecera().setWidth("200px");
		
		
	}
	
	public VerPerfilGeneral(ListaTweetsGeneral_item listaTweets,Boolean mencion ) {
		
		this.mencion=mencion;
		
		basededatos.UsuarioRegistrado user =null;
		
		if(mencion) {
			 user = listaTweets.t.getMencionaA();
		}
		else {
			user = listaTweets.t.getEscritoPor();
		}
		
		this.getLabelNick().setText(user.getNick());
		this.getLabelDescripcion().setText(user.getDescripcion());
		this.getLabelNumSeguidores().setText("Seguidores : "+String.valueOf(user.seguidoPor.size()));
		this.getLabelNumSeguidos().setText("Seguidos : "+String.valueOf(user.sigueA.size()));
		if(user.getFotoFondo()!=null)
			this.getImgCabecera().setSrc(user.getFotoFondo());
		this.getImgPerfil().setSrc(user.getFotoPerfil());
		
		this.getImgPerfil().setHeight("100%");
		this.getImgPerfil().setWidth("100%");

		this.getImgCabecera().setHeight("200px");
		this.getImgCabecera().setWidth("200px");
		
	}
	
	public VerPerfilGeneral(VertweetGeneral verTweet,Boolean mencion) {
		
		this.mencion=mencion;
		
		basededatos.UsuarioRegistrado user =null;
		
		if(mencion) {
			 user = verTweet._listaTweetsGeneral.t.getMencionaA();
		}
		else {
			user = verTweet._listaTweetsGeneral.t.getEscritoPor();
		}
		
		this.getLabelNick().setText(user.getNick());
		this.getLabelDescripcion().setText(user.getDescripcion());
		this.getLabelNumSeguidores().setText("Seguidores : "+String.valueOf(user.seguidoPor.size()));
		this.getLabelNumSeguidos().setText("Seguidos : "+String.valueOf(user.sigueA.size()));
		if(user.getFotoFondo()!=null)
			this.getImgCabecera().setSrc(user.getFotoFondo());
		this.getImgPerfil().setSrc(user.getFotoPerfil());
		
		this.getImgPerfil().setHeight("100%");
		this.getImgPerfil().setWidth("100%");


		this.getImgCabecera().setHeight("200px");
		this.getImgCabecera().setWidth("200px");
		
	}
	
	public VerPerfilGeneral(ListaComentariosGeneral_item listaComentarios) {
		
		this.getLabelNick().setText(listaComentarios.c.getEscritoPor().getNick());
		this.getLabelDescripcion().setText(listaComentarios.c.getEscritoPor().getDescripcion());
		this.getLabelNumSeguidores().setText("Seguidores : "+String.valueOf(listaComentarios.c.getEscritoPor().seguidoPor.size()));
		this.getLabelNumSeguidos().setText("Seguidos : "+String.valueOf(listaComentarios.c.getEscritoPor().sigueA.size()));
		if(listaComentarios.c.getEscritoPor().getFotoFondo()!=null)
			this.getImgCabecera().setSrc(listaComentarios.c.getEscritoPor().getFotoFondo());
		this.getImgPerfil().setSrc(listaComentarios.c.getEscritoPor().getFotoPerfil());
		
		this.getImgPerfil().setHeight("100%");
		this.getImgPerfil().setWidth("100%");

		this.getImgCabecera().setHeight("200px");
		this.getImgCabecera().setWidth("200px");
		
	}
	
	public VerPerfilGeneral(UsuarioRegistrado usuarioregistrado) {
		
		this.getLabelNick().setText(usuarioregistrado.u.getNick());
		this.getLabelDescripcion().setText(usuarioregistrado.u.getDescripcion());
		this.getLabelNumSeguidores().setText("Seguidores : "+String.valueOf(usuarioregistrado.u.seguidoPor.size()));
		this.getLabelNumSeguidos().setText("Seguidos : "+String.valueOf(usuarioregistrado.u.sigueA.size()));
		if(usuarioregistrado.u.getFotoFondo()!=null)
			this.getImgCabecera().setSrc(usuarioregistrado.u.getFotoFondo());
		this.getImgPerfil().setSrc(usuarioregistrado.u.getFotoPerfil());
		
		this.getImgPerfil().setHeight("100%");
		this.getImgPerfil().setWidth("100%");
		
		this.getImgPerfil().setHeight("100%");
		this.getImgPerfil().setWidth("100%");


		this.getImgCabecera().setHeight("200px");
		this.getImgCabecera().setWidth("200px");
		
	}
	
}