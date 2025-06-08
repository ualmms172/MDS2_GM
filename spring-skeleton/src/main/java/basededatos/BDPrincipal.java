package basededatos;

import java.time.LocalDate;
import java.util.Date;

import org.orm.PersistentException;

public class BDPrincipal implements iUsuarioregistrado, iUsuarioNoRegistrado, iAdministrador, iLogueado {
	public BD_UsuarioRegistrado _bd_usu = new BD_UsuarioRegistrado();
	public BD_Administrador _bd_adm = new BD_Administrador();
	public BD_Tweet _bd_twe = new BD_Tweet();
	public BD_Comentario _bd_com = new BD_Comentario();
	public BD_Hashtag _bd_has = new BD_Hashtag();
	public BD_Texto _bd_tex = new BD_Texto();
	public BD_Multimedia _bd_mul = new BD_Multimedia();

	public UsuarioRegistrado[] Cargar_Usuarios() {
		try {
	        return _bd_usu.Cargar_Usuarios();
	    } catch (PersistentException e) {
	        
	        System.err.println("Error al cargar usuarios: " + e.getMessage());
	        e.printStackTrace(); 
	       
	        return null;
	    }
	}

	public Hashtag[] Cargar_Hashtags() {
		try {
	        return _bd_has.Cargar_Hashtags();
	    } catch (PersistentException e) {
	        
	        System.err.println("Error al cargar hashtags: " + e.getMessage());
	        e.printStackTrace(); 
	       
	        return null;
	    }
	}

	public Tweet Escribir_Tweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado, UsuarioRegistrado aUsuario) {
		
		try {
	        return _bd_twe.Escribir_Tweet( aHashtag,  aUsuarioMencionado,  aUsuario); 
	    } catch (PersistentException e) {
	        
	        System.err.println("Error al escribir el tweet: " + e.getMessage());
	        e.printStackTrace(); 
	       
	        return null;
	    }
	}

	public Comentario Escribir_Comentario(Tweet aTweet, UsuarioRegistrado aUsuario) {
	    try {
	        return _bd_com.Escribir_Comentario(aTweet, aUsuario);
	    } catch (PersistentException e) {
	        System.err.println("Error al escribir comentario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public Tweet Escribir_Retweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado,Tweet aTweet, UsuarioRegistrado aUsuario) {
	    try {
	        return _bd_twe.Escribir_Retweet( aHashtag,  aUsuarioMencionado,aTweet, aUsuario);
	    } catch (PersistentException e) {
	        System.err.println("Error al escribir retweet: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public void Eliminar_Usuario(UsuarioRegistrado aUsuario) {
	    try {
	        _bd_usu.Eliminar_Usuario(aUsuario);
	    } catch (PersistentException e) {
	        System.err.println("Error al eliminar usuario: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) {
	    try {
	        return _bd_usu.ModificarCuenta(aUsuario, aDescripcion, aUrl_fondo, aUrl_perfil, aNick);
	    } catch (PersistentException e) {
	        System.err.println("Error al modificar cuenta: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) {
	    try {
	        return _bd_usu.Seguir_Usuario(aSeguidor, aSeguido);
	    } catch (PersistentException e) {
	        System.err.println("Error al seguir usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) {
	    try {
	        return _bd_usu.Dejar_Seguir(aSeguidor, aSeguido);
	    } catch (PersistentException e) {
	        System.err.println("Error al dejar de seguir usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) {
	    try {
	        return _bd_usu.Bloquear(aBloqueador, aBloqueado);
	    } catch (PersistentException e) {
	        System.err.println("Error al bloquear usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) {
	    try {
	        return _bd_usu.Desbloquear(aBloqueador, aBloqueado);
	    } catch (PersistentException e) {
	        System.err.println("Error al desbloquear usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}


	public UsuarioRegistrado DarLikeTweet(UsuarioRegistrado aUsuario, Tweet aTweet) {
	    try {
	        return _bd_twe.DarLikeTweet(aUsuario, aTweet);
	    } catch (PersistentException e) {
	        System.err.println("Error al dar like al tweet: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado QuitarLikeTweet(UsuarioRegistrado aUsuario, Tweet aTweet) {
	    try {
	        return _bd_twe.QuitarLikeTweet(aUsuario, aTweet);
	    } catch (PersistentException e) {
	        System.err.println("Error al quitar like del tweet: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado DarLikeComentario(UsuarioRegistrado aUsuario, Comentario aComentario) {
	    try {
	        return _bd_com.DarLikeComentario(aUsuario, aComentario);
	    } catch (PersistentException e) {
	        System.err.println("Error al dar like al comentario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado QuitarLikeComentario(UsuarioRegistrado aUsuario, Comentario aComentario) {
	    try {
	        return _bd_com.QuitarLikeComentario(aUsuario, aComentario);
	    } catch (PersistentException e) {
	        System.err.println("Error al quitar like del comentario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado Mencionar(Tweet aTweet, UsuarioRegistrado aUr) {
	    try {
	        return _bd_twe.Mencionar(aTweet, aUr);
	    } catch (PersistentException e) {
	        System.err.println("Error al mencionar usuario en tweet: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado BuscarUsuario(String aNick) {
	    try {
	        return _bd_usu.BuscarUsuario(aNick);
	    } catch (PersistentException e) {
	        System.err.println("Error al buscar usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public Hashtag BuscarHashtag(String aHashtag) {
	    try {
	        return _bd_has.BuscarHashtag(aHashtag);
	    } catch (PersistentException e) {
	        System.err.println("Error al buscar hashtag: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public Hashtag CrearHashtag(String aHashtag,UsuarioRegistrado aUsuario) {
	    try {
	        return _bd_has.CrearHashtag(aHashtag,aUsuario);
	    } catch (PersistentException e) {
	        System.err.println("Error al crear hashtag: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}


	public UsuarioRegistrado Registrar_Usuario(String aNick, String aDescripcion, String aUrl_perfil, String aUrl_fondo, String aContrasena,String aCorreo) {
	    try {
	        return _bd_usu.Registrar_Usuario(aNick, aDescripcion, aUrl_perfil, aUrl_fondo, aContrasena, aCorreo);
	    } catch (PersistentException e) {
	        System.err.println("Error al registrar usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public Logueado Loguear(String aNick, String aPassword) {
	    try {
	        Logueado log = _bd_usu.buscar_usuario(aNick, aPassword);
	        if (log == null) {
	            log = _bd_adm.Buscar_administrador(aNick, aPassword);
	        }
	        return log;
	    } catch (PersistentException e) {
	        System.err.println("Error al loguear usuario o administrador: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public UsuarioRegistrado[] Cargar_Baneados() {
	    try {
	        return _bd_usu.Cargar_Baneados();
	    } catch (PersistentException e) {
	        System.err.println("Error al cargar usuarios baneados: " + e.getMessage());
	        e.printStackTrace();
	        return new UsuarioRegistrado[0]; // o null si prefieres
	    }
	}

	public Administrador Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador,Date aFecha) {
	    try {
	        return _bd_adm.Banear(aUsuarioRegistrado, aAdministrador,aFecha);
	    } catch (PersistentException e) {
	        System.err.println("Error al banear usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public Administrador Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) {
	    try {
	        return _bd_adm.Desbanear(aUsuarioRegistrado, aAdministrador);
	    } catch (PersistentException e) {
	        System.err.println("Error al desbanear usuario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public Administrador BorrarTweet(Tweet aTweet,Administrador aAdministrador) {
	    try {
	        return _bd_twe.BorrarTweet(aTweet,aAdministrador);
	    } catch (PersistentException e) {
	        System.err.println("Error al borrar tweet: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	public Administrador BorrarComentario(Comentario aComentario,Administrador aAdministrador) {
	    try {
	        return _bd_com.BorrarComentario(aComentario,aAdministrador);
	    } catch (PersistentException e) {
	        System.err.println("Error al borrar comentario: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public UsuarioRegistrado BuscarUsuarioCorreo(String aCorreo) {
		 try {
		        return _bd_usu.BuscarUsuarioCorreo(aCorreo);
		    } catch (PersistentException e) {
		        System.err.println("Error al buscar usuario por su correo: " + e.getMessage());
		        e.printStackTrace();
		        return null;
		    }
	}

	

	@Override
	public Administrador ObtenerAdminId(Administrador aAdministrador) {
		Administrador admin=null;
		try {
			admin = this._bd_adm.ObtenerAdminId(aAdministrador);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}

	@Override
	public UsuarioRegistrado ObtenerUsuarioId(UsuarioRegistrado aUsuario) {
		UsuarioRegistrado user=null;
		try {
			user = this._bd_usu.ObtenerUsuarioId(aUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public Tweet ObtenerTweetId(Tweet aTweet) {
		Tweet twe=null;
		try {
			twe = this._bd_twe.ObtenerTweetId(aTweet);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return twe;
	}

	
	
	@Override
	public Hashtag ObtenerHashtagId(Hashtag aHashtag) {
		Hashtag hash=null;
		try {
			hash = this._bd_has.ObtenerHashtagId(aHashtag);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hash;
	}
	
	@Override
	public UsuarioRegistrado Escribir_Texto(String aTexto, Contenido aContenido){
	    try {
	        return _bd_tex.Escribir_Texto( aTexto,aContenido);
	    } catch (PersistentException e) {
	        System.err.println("Error al escribir texto: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}
	
	@Override
	public UsuarioRegistrado Escribir_Multimedia(String aUrl_foto, String aUrl_video,Contenido aContenido){
	    try {
	        return _bd_mul.Escribir_Multimedia( aUrl_foto,aUrl_video,aContenido);
	    } catch (PersistentException e) {
	        System.err.println("Error al escribir multimedia: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}
	
	
	






}