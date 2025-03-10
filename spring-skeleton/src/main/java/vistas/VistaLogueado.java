package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Div;

@Tag("vista-logueado")
@JsModule("./views/vista-logueado.ts")
public class VistaLogueado extends LitTemplate {

	
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("verticalLayout-izquierdo")
	private Element verticalLayoutIzquierdo;
	@Id("horizontalLayout-ListaUsuariosMasFamosos")
	private HorizontalLayout horizontalLayoutListaUsuariosMasFamosos;
	@Id("label-ListaUsuariosMasFamosos")
	private Label labelListaUsuariosMasFamosos;
	@Id("horizontalLayout-ListaUsuariosMasFamosos2")
	private HorizontalLayout horizontalLayoutListaUsuariosMasFamosos2;
	@Id("horizontalLayout-VerMasUsuarios")
	private HorizontalLayout horizontalLayoutVerMasUsuarios;
	@Id("button-VerMasUsuarios")
	private Button buttonVerMasUsuarios;
	@Id("verticalLayout-central")
	private Element verticalLayoutCentral;
	@Id("horizontalLayout-centralSuperior")
	private HorizontalLayout horizontalLayoutCentralSuperior;
	@Id("verticalLayout-CerrarSesionNotificaciones")
	private Element verticalLayoutCerrarSesionNotificaciones;
	@Id("button-CerrarSesion")
	private Button buttonCerrarSesion;
	@Id("button-Notificaciones")
	private Button buttonNotificaciones;
	@Id("verticalLayout-imagenPerfil")
	private Element verticalLayoutImagenPerfil;
	@Id("horizontalLayout-ImagenPerfil")
	private HorizontalLayout horizontalLayoutImagenPerfil;
	@Id("img-PortadaTwitter")
	private Image imgPortadaTwitter;
	@Id("horizontalLayout-centralImagen")
	private HorizontalLayout horizontalLayoutCentralImagen;
	@Id("verticalLayout-BaneadoVerperfil")
	private Element verticalLayoutBaneadoVerperfil;
	@Id("horizontalLayout-Baneados")
	private HorizontalLayout horizontalLayoutBaneados;
	@Id("button-Baneados")
	private Button buttonBaneados;
	@Id("img-PerfilUsuario")
	private Image imgPerfilUsuario;
	@Id("horizontalLayout-VerPerfilEscribirTweet")
	private HorizontalLayout horizontalLayoutVerPerfilEscribirTweet;
	@Id("verticalLayout-VerPerfilEscribirTweet")
	private Element verticalLayoutVerPerfilEscribirTweet;
	@Id("button-VerPerfil")
	private Button buttonVerPerfil;
	@Id("button-EscribirTweet")
	private Button buttonEscribirTweet;
	@Id("horizontalLayout-inferior")
	private HorizontalLayout horizontalLayoutInferior;
	@Id("verticalLayout-inferior")
	private Element verticalLayoutInferior;
	@Id("verticalLayout-derecho")
	private Element verticalLayoutDerecho;
	@Id("horizontalLayout-ListaHashtagsUsados")
	private HorizontalLayout horizontalLayoutListaHashtagsUsados;
	@Id("verticalLayout-listaHashtagsMasUsados")
	private Element verticalLayoutListaHashtagsMasUsados;
	@Id("label-ListaDeHashtagsMasUsados")
	private Div labelListaDeHashtagsMasUsados;
	@Id("horizontalLayout-HashtagsMasUsados")
	private HorizontalLayout horizontalLayoutHashtagsMasUsados;
	@Id("horizontalLayout-VerMasHashtags")
	private HorizontalLayout horizontalLayoutVerMasHashtags;
	@Id("verticaLayout-VerMásHashTags")
	private Element verticaLayoutVerMásHashTags;
	@Id("button-VerMasHashtags")
	private Button buttonVerMasHashtags;

	public VistaLogueado() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVerticalLayoutIzquierdo() {
		return verticalLayoutIzquierdo;
	}

	public void setVerticalLayoutIzquierdo(Element verticalLayoutIzquierdo) {
		this.verticalLayoutIzquierdo = verticalLayoutIzquierdo;
	}

	public HorizontalLayout getHorizontalLayoutListaUsuariosMasFamosos() {
		return horizontalLayoutListaUsuariosMasFamosos;
	}

	public void setHorizontalLayoutListaUsuariosMasFamosos(HorizontalLayout horizontalLayoutListaUsuariosMasFamosos) {
		this.horizontalLayoutListaUsuariosMasFamosos = horizontalLayoutListaUsuariosMasFamosos;
	}

	public Label getLabelListaUsuariosMasFamosos() {
		return labelListaUsuariosMasFamosos;
	}

	public void setLabelListaUsuariosMasFamosos(Label labelListaUsuariosMasFamosos) {
		this.labelListaUsuariosMasFamosos = labelListaUsuariosMasFamosos;
	}

	public HorizontalLayout getHorizontalLayoutListaUsuariosMasFamosos2() {
		return horizontalLayoutListaUsuariosMasFamosos2;
	}

	public void setHorizontalLayoutListaUsuariosMasFamosos2(HorizontalLayout horizontalLayoutListaUsuariosMasFamosos2) {
		this.horizontalLayoutListaUsuariosMasFamosos2 = horizontalLayoutListaUsuariosMasFamosos2;
	}

	public HorizontalLayout getHorizontalLayoutVerMasUsuarios() {
		return horizontalLayoutVerMasUsuarios;
	}

	public void setHorizontalLayoutVerMasUsuarios(HorizontalLayout horizontalLayoutVerMasUsuarios) {
		this.horizontalLayoutVerMasUsuarios = horizontalLayoutVerMasUsuarios;
	}

	public Button getButtonVerMasUsuarios() {
		return buttonVerMasUsuarios;
	}

	public void setButtonVerMasUsuarios(Button buttonVerMasUsuarios) {
		this.buttonVerMasUsuarios = buttonVerMasUsuarios;
	}

	public Element getVerticalLayoutCentral() {
		return verticalLayoutCentral;
	}

	public void setVerticalLayoutCentral(Element verticalLayoutCentral) {
		this.verticalLayoutCentral = verticalLayoutCentral;
	}

	public HorizontalLayout getHorizontalLayoutCentralSuperior() {
		return horizontalLayoutCentralSuperior;
	}

	public void setHorizontalLayoutCentralSuperior(HorizontalLayout horizontalLayoutCentralSuperior) {
		this.horizontalLayoutCentralSuperior = horizontalLayoutCentralSuperior;
	}

	public Element getVerticalLayoutCerrarSesionNotificaciones() {
		return verticalLayoutCerrarSesionNotificaciones;
	}

	public void setVerticalLayoutCerrarSesionNotificaciones(Element verticalLayoutCerrarSesionNotificaciones) {
		this.verticalLayoutCerrarSesionNotificaciones = verticalLayoutCerrarSesionNotificaciones;
	}

	public Button getButtonCerrarSesion() {
		return buttonCerrarSesion;
	}

	public void setButtonCerrarSesion(Button buttonCerrarSesion) {
		this.buttonCerrarSesion = buttonCerrarSesion;
	}

	public Button getButtonNotificaciones() {
		return buttonNotificaciones;
	}

	public void setButtonNotificaciones(Button buttonNotificaciones) {
		this.buttonNotificaciones = buttonNotificaciones;
	}

	public Element getVerticalLayoutImagenPerfil() {
		return verticalLayoutImagenPerfil;
	}

	public void setVerticalLayoutImagenPerfil(Element verticalLayoutImagenPerfil) {
		this.verticalLayoutImagenPerfil = verticalLayoutImagenPerfil;
	}

	public HorizontalLayout getHorizontalLayoutImagenPerfil() {
		return horizontalLayoutImagenPerfil;
	}

	public void setHorizontalLayoutImagenPerfil(HorizontalLayout horizontalLayoutImagenPerfil) {
		this.horizontalLayoutImagenPerfil = horizontalLayoutImagenPerfil;
	}

	public Image getImgPortadaTwitter() {
		return imgPortadaTwitter;
	}

	public void setImgPortadaTwitter(Image imgPortadaTwitter) {
		this.imgPortadaTwitter = imgPortadaTwitter;
	}

	public HorizontalLayout getHorizontalLayoutCentralImagen() {
		return horizontalLayoutCentralImagen;
	}

	public void setHorizontalLayoutCentralImagen(HorizontalLayout horizontalLayoutCentralImagen) {
		this.horizontalLayoutCentralImagen = horizontalLayoutCentralImagen;
	}

	public Element getVerticalLayoutBaneadoVerperfil() {
		return verticalLayoutBaneadoVerperfil;
	}

	public void setVerticalLayoutBaneadoVerperfil(Element verticalLayoutBaneadoVerperfil) {
		this.verticalLayoutBaneadoVerperfil = verticalLayoutBaneadoVerperfil;
	}

	public HorizontalLayout getHorizontalLayoutBaneados() {
		return horizontalLayoutBaneados;
	}

	public void setHorizontalLayoutBaneados(HorizontalLayout horizontalLayoutBaneados) {
		this.horizontalLayoutBaneados = horizontalLayoutBaneados;
	}

	public Button getButtonBaneados() {
		return buttonBaneados;
	}

	public void setButtonBaneados(Button buttonBaneados) {
		this.buttonBaneados = buttonBaneados;
	}

	public Image getImgPerfilUsuario() {
		return imgPerfilUsuario;
	}

	public void setImgPerfilUsuario(Image imgPerfilUsuario) {
		this.imgPerfilUsuario = imgPerfilUsuario;
	}

	public HorizontalLayout getHorizontalLayoutVerPerfilEscribirTweet() {
		return horizontalLayoutVerPerfilEscribirTweet;
	}

	public void setHorizontalLayoutVerPerfilEscribirTweet(HorizontalLayout horizontalLayoutVerPerfilEscribirTweet) {
		this.horizontalLayoutVerPerfilEscribirTweet = horizontalLayoutVerPerfilEscribirTweet;
	}

	public Element getVerticalLayoutVerPerfilEscribirTweet() {
		return verticalLayoutVerPerfilEscribirTweet;
	}

	public void setVerticalLayoutVerPerfilEscribirTweet(Element verticalLayoutVerPerfilEscribirTweet) {
		this.verticalLayoutVerPerfilEscribirTweet = verticalLayoutVerPerfilEscribirTweet;
	}

	public Button getButtonVerPerfil() {
		return buttonVerPerfil;
	}

	public void setButtonVerPerfil(Button buttonVerPerfil) {
		this.buttonVerPerfil = buttonVerPerfil;
	}

	public Button getButtonEscribirTweet() {
		return buttonEscribirTweet;
	}

	public void setButtonEscribirTweet(Button buttonEscribirTweet) {
		this.buttonEscribirTweet = buttonEscribirTweet;
	}

	public HorizontalLayout getHorizontalLayoutInferior() {
		return horizontalLayoutInferior;
	}

	public void setHorizontalLayoutInferior(HorizontalLayout horizontalLayoutInferior) {
		this.horizontalLayoutInferior = horizontalLayoutInferior;
	}

	public Element getVerticalLayoutInferior() {
		return verticalLayoutInferior;
	}

	public void setVerticalLayoutInferior(Element verticalLayoutInferior) {
		this.verticalLayoutInferior = verticalLayoutInferior;
	}

	public Element getVerticalLayoutDerecho() {
		return verticalLayoutDerecho;
	}

	public void setVerticalLayoutDerecho(Element verticalLayoutDerecho) {
		this.verticalLayoutDerecho = verticalLayoutDerecho;
	}

	public HorizontalLayout getHorizontalLayoutListaHashtagsUsados() {
		return horizontalLayoutListaHashtagsUsados;
	}

	public void setHorizontalLayoutListaHashtagsUsados(HorizontalLayout horizontalLayoutListaHashtagsUsados) {
		this.horizontalLayoutListaHashtagsUsados = horizontalLayoutListaHashtagsUsados;
	}

	public Element getVerticalLayoutListaHashtagsMasUsados() {
		return verticalLayoutListaHashtagsMasUsados;
	}

	public void setVerticalLayoutListaHashtagsMasUsados(Element verticalLayoutListaHashtagsMasUsados) {
		this.verticalLayoutListaHashtagsMasUsados = verticalLayoutListaHashtagsMasUsados;
	}

	public Div getLabelListaDeHashtagsMasUsados() {
		return labelListaDeHashtagsMasUsados;
	}

	public void setLabelListaDeHashtagsMasUsados(Div labelListaDeHashtagsMasUsados) {
		this.labelListaDeHashtagsMasUsados = labelListaDeHashtagsMasUsados;
	}

	public HorizontalLayout getHorizontalLayoutHashtagsMasUsados() {
		return horizontalLayoutHashtagsMasUsados;
	}

	public void setHorizontalLayoutHashtagsMasUsados(HorizontalLayout horizontalLayoutHashtagsMasUsados) {
		this.horizontalLayoutHashtagsMasUsados = horizontalLayoutHashtagsMasUsados;
	}

	public HorizontalLayout getHorizontalLayoutVerMasHashtags() {
		return horizontalLayoutVerMasHashtags;
	}

	public void setHorizontalLayoutVerMasHashtags(HorizontalLayout horizontalLayoutVerMasHashtags) {
		this.horizontalLayoutVerMasHashtags = horizontalLayoutVerMasHashtags;
	}

	public Element getVerticaLayoutVerMásHashTags() {
		return verticaLayoutVerMásHashTags;
	}

	public void setVerticaLayoutVerMásHashTags(Element verticaLayoutVerMásHashTags) {
		this.verticaLayoutVerMásHashTags = verticaLayoutVerMásHashTags;
	}

	public Button getButtonVerMasHashtags() {
		return buttonVerMasHashtags;
	}

	public void setButtonVerMasHashtags(Button buttonVerMasHashtags) {
		this.buttonVerMasHashtags = buttonVerMasHashtags;
	}



	
	

}