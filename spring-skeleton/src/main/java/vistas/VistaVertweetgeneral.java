package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;

@Tag("vista-vertweetgeneral")
@JsModule("./views/vista-vertweetgeneral.ts")
public class VistaVertweetgeneral extends LitTemplate {

    @Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("horizontalLayout-tweetCompleto")
	private HorizontalLayout horizontalLayoutTweetCompleto;
	@Id("verticalLayout-TweetCompleto")
	private Element verticalLayoutTweetCompleto;
	@Id("horizontalLayout-Cabecera")
	private HorizontalLayout horizontalLayoutCabecera;
	@Id("img-FotoPerfilTweet")
	private Image imgFotoPerfilTweet;
	@Id("label-NombreUsuario")
	private Label labelNombreUsuario;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("horizontalLayout-CuerpoTweet")
	private HorizontalLayout horizontalLayoutCuerpoTweet;
	@Id("label-CuerpoTwet")
	private Label labelCuerpoTwet;
	@Id("horizontalLayout-Multimedia")
	private HorizontalLayout horizontalLayoutMultimedia;
	@Id("verticalLayout-Multimedia")
	private Element verticalLayoutMultimedia;
	@Id("horizontal-Multimedia")
	private HorizontalLayout horizontalMultimedia;
	@Id("img-FotoTweet")
	private Image imgFotoTweet;
	@Id("div-Tweet")
	private Div divTweet;
	@Id("horizontalLayout-Opciones")
	private HorizontalLayout horizontalLayoutOpciones;
	@Id("verticalLayout-RetweetBorrar")
	private Element verticalLayoutRetweetBorrar;
	@Id("button-Retweet")
	private Button buttonRetweet;
	@Id("button-Borrar")
	private Button buttonBorrar;
	@Id("verticalLayout-EspacioBotones")
	private Element verticalLayoutEspacioBotones;
	@Id("verticalLayout-MeGusta")
	private Element verticalLayoutMeGusta;
	@Id("horizontalLayout-MeGusta")
	private HorizontalLayout horizontalLayoutMeGusta;
	@Id("label-MeGusta")
	private Label labelMeGusta;
	@Id("img-MeGusta")
	private Image imgMeGusta;
	@Id("button-MeGusta")
	private Button buttonMeGusta;
	@Id("icon-MeGusta")
	private Button iconMeGusta;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("button-comentar")
	private Button buttonComentar;
	@Id("button-Atras")
	private Button buttonAtras;

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public VistaVertweetgeneral() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public HorizontalLayout getHorizontalLayoutTweetCompleto() {
		return horizontalLayoutTweetCompleto;
	}

	public void setHorizontalLayoutTweetCompleto(HorizontalLayout horizontalLayoutTweetCompleto) {
		this.horizontalLayoutTweetCompleto = horizontalLayoutTweetCompleto;
	}

	public Element getVerticalLayoutTweetCompleto() {
		return verticalLayoutTweetCompleto;
	}

	public void setVerticalLayoutTweetCompleto(Element verticalLayoutTweetCompleto) {
		this.verticalLayoutTweetCompleto = verticalLayoutTweetCompleto;
	}

	public HorizontalLayout getHorizontalLayoutCabecera() {
		return horizontalLayoutCabecera;
	}

	public void setHorizontalLayoutCabecera(HorizontalLayout horizontalLayoutCabecera) {
		this.horizontalLayoutCabecera = horizontalLayoutCabecera;
	}

	public Image getImgFotoPerfilTweet() {
		return imgFotoPerfilTweet;
	}

	public void setImgFotoPerfilTweet(Image imgFotoPerfilTweet) {
		this.imgFotoPerfilTweet = imgFotoPerfilTweet;
	}

	public Label getLabelNombreUsuario() {
		return labelNombreUsuario;
	}

	public void setLabelNombreUsuario(Label labelNombreUsuario) {
		this.labelNombreUsuario = labelNombreUsuario;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public HorizontalLayout getHorizontalLayoutCuerpoTweet() {
		return horizontalLayoutCuerpoTweet;
	}

	public void setHorizontalLayoutCuerpoTweet(HorizontalLayout horizontalLayoutCuerpoTweet) {
		this.horizontalLayoutCuerpoTweet = horizontalLayoutCuerpoTweet;
	}

	public Label getLabelCuerpoTwet() {
		return labelCuerpoTwet;
	}

	public void setLabelCuerpoTwet(Label labelCuerpoTwet) {
		this.labelCuerpoTwet = labelCuerpoTwet;
	}

	public HorizontalLayout getHorizontalLayoutMultimedia() {
		return horizontalLayoutMultimedia;
	}

	public void setHorizontalLayoutMultimedia(HorizontalLayout horizontalLayoutMultimedia) {
		this.horizontalLayoutMultimedia = horizontalLayoutMultimedia;
	}

	public Element getVerticalLayoutMultimedia() {
		return verticalLayoutMultimedia;
	}

	public void setVerticalLayoutMultimedia(Element verticalLayoutMultimedia) {
		this.verticalLayoutMultimedia = verticalLayoutMultimedia;
	}

	public HorizontalLayout getHorizontalMultimedia() {
		return horizontalMultimedia;
	}

	public void setHorizontalMultimedia(HorizontalLayout horizontalMultimedia) {
		this.horizontalMultimedia = horizontalMultimedia;
	}

	public Image getImgFotoTweet() {
		return imgFotoTweet;
	}

	public void setImgFotoTweet(Image imgFotoTweet) {
		this.imgFotoTweet = imgFotoTweet;
	}

	public Div getDivTweet() {
		return divTweet;
	}

	public void setDivTweet(Div divTweet) {
		this.divTweet = divTweet;
	}

	public HorizontalLayout getHorizontalLayoutOpciones() {
		return horizontalLayoutOpciones;
	}

	public void setHorizontalLayoutOpciones(HorizontalLayout horizontalLayoutOpciones) {
		this.horizontalLayoutOpciones = horizontalLayoutOpciones;
	}

	public Element getVerticalLayoutRetweetBorrar() {
		return verticalLayoutRetweetBorrar;
	}

	public void setVerticalLayoutRetweetBorrar(Element verticalLayoutRetweetBorrar) {
		this.verticalLayoutRetweetBorrar = verticalLayoutRetweetBorrar;
	}

	public Button getButtonRetweet() {
		return buttonRetweet;
	}

	public void setButtonRetweet(Button buttonRetweet) {
		this.buttonRetweet = buttonRetweet;
	}

	public Button getButtonBorrar() {
		return buttonBorrar;
	}

	public void setButtonBorrar(Button buttonBorrar) {
		this.buttonBorrar = buttonBorrar;
	}

	public Element getVerticalLayoutEspacioBotones() {
		return verticalLayoutEspacioBotones;
	}

	public void setVerticalLayoutEspacioBotones(Element verticalLayoutEspacioBotones) {
		this.verticalLayoutEspacioBotones = verticalLayoutEspacioBotones;
	}

	public Element getVerticalLayoutMeGusta() {
		return verticalLayoutMeGusta;
	}

	public void setVerticalLayoutMeGusta(Element verticalLayoutMeGusta) {
		this.verticalLayoutMeGusta = verticalLayoutMeGusta;
	}

	public HorizontalLayout getHorizontalLayoutMeGusta() {
		return horizontalLayoutMeGusta;
	}

	public void setHorizontalLayoutMeGusta(HorizontalLayout horizontalLayoutMeGusta) {
		this.horizontalLayoutMeGusta = horizontalLayoutMeGusta;
	}

	public Label getLabelMeGusta() {
		return labelMeGusta;
	}

	public void setLabelMeGusta(Label labelMeGusta) {
		this.labelMeGusta = labelMeGusta;
	}

	public Image getImgMeGusta() {
		return imgMeGusta;
	}

	public void setImgMeGusta(Image imgMeGusta) {
		this.imgMeGusta = imgMeGusta;
	}

	public Button getButtonMeGusta() {
		return buttonMeGusta;
	}

	public void setButtonMeGusta(Button buttonMeGusta) {
		this.buttonMeGusta = buttonMeGusta;
	}

	public Button getIconMeGusta() {
		return iconMeGusta;
	}

	public void setIconMeGusta(Button iconMeGusta) {
		this.iconMeGusta = iconMeGusta;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	
	public Button getButtonComentar() {
		return buttonComentar;
	}

	public void setButtonComentar(Button buttonComentar) {
		this.buttonComentar = buttonComentar;
	}
	
    
    
    
    
    
    
    
    

}