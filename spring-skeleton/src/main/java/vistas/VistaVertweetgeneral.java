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
	@Id("vaadinButton")
	private Button vaadinButton;
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

	public VistaVertweetgeneral() {
        // You can initialise any data required for the connected UI components here.
    }
    
    
    
    
    
    
    
    

}