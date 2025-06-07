package interfaz;

import vistas.VistaVerperfilgeneral;

public class VerPerfilGeneral extends VistaVerperfilgeneral{
	//private Label _nick;
	//private Label _numSeguidores;
	//private Label _numSeguidos;
	//private Label _descripcion;
	//private Image _fotoPerfil;
	//private Image _fotoFondo;
	
	public boolean mencion;
	
//	public VerPerfilGeneral() {
//		
//	}
	
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
		
	}
	
	public VerPerfilGeneral(UsuarioRegistrado usuarioregistrado) {
		
	}
	
}