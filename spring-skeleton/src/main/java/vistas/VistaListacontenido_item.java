package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.IronIcon;

@Tag("vista-listacontenido_item")
@JsModule("./views/vista-listacontenido_item.ts")
public class VistaListacontenido_item extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("horizontal-Multimedia")
	private HorizontalLayout horizontalMultimedia;
	@Id("verticalLayout-Multimedia")
	private Element verticalLayoutMultimedia;
	@Id("horizontalLayout-Multimedia")
	private HorizontalLayout horizontalLayoutMultimedia;
	@Id("label-CuerpoTwet")
	private Label labelCuerpoTwet;
	@Id("horizontalLayout-CuerpoTweet")
	private HorizontalLayout horizontalLayoutCuerpoTweet;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label-NombreUsuario")
	private Label labelNombreUsuario;
	@Id("img-FotoPerfilTweet")
	private Image imgFotoPerfilTweet;
	@Id("horizontalLayout-Cabecera")
	private HorizontalLayout horizontalLayoutCabecera;
	@Id("img-FotoTweet")
	private Image imgFotoTweet;
	@Id("horizontalLayout-Opciones")
	private HorizontalLayout horizontalLayoutOpciones;
	@Id("div-Tweet")
	private Div divTweet;
	@Id("img-MeGusta")
	private Image imgMeGusta;
	@Id("label-MeGusta")
	private Label labelMeGusta;
	@Id("horizontalLayout-MeGusta")
	private HorizontalLayout horizontalLayoutMeGusta;
	@Id("verticalLayout-MeGusta")
	private Element verticalLayoutMeGusta;
	@Id("verticalLayout-EspacioBotones")
	private Element verticalLayoutEspacioBotones;
	@Id("button-Borrar")
	private Button buttonBorrar;
	@Id("button-Retweet")
	private Button buttonRetweet;
	@Id("verticalLayout-RetweetBorrar")
	private Element verticalLayoutRetweetBorrar;
	@Id("button-MeGusta")
	private Button buttonMeGusta;
	@Id("label-RetweeteadoPor")
	private Label labelRetweeteadoPor;
	@Id("horizontalLayout-RetweeteadoPor")
	private HorizontalLayout horizontalLayoutRetweeteadoPor;
	public VistaListacontenido_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public HorizontalLayout getHorizontalMultimedia() {
		return horizontalMultimedia;
	}

	public void setHorizontalMultimedia(HorizontalLayout horizontalMultimedia) {
		this.horizontalMultimedia = horizontalMultimedia;
	}

	public Element getVerticalLayoutMultimedia() {
		return verticalLayoutMultimedia;
	}

	public void setVerticalLayoutMultimedia(Element verticalLayoutMultimedia) {
		this.verticalLayoutMultimedia = verticalLayoutMultimedia;
	}

	public HorizontalLayout getHorizontalLayoutMultimedia() {
		return horizontalLayoutMultimedia;
	}

	public void setHorizontalLayoutMultimedia(HorizontalLayout horizontalLayoutMultimedia) {
		this.horizontalLayoutMultimedia = horizontalLayoutMultimedia;
	}

	public Label getLabelCuerpoTwet() {
		return labelCuerpoTwet;
	}

	public void setLabelCuerpoTwet(Label labelCuerpoTwet) {
		this.labelCuerpoTwet = labelCuerpoTwet;
	}

	public HorizontalLayout getHorizontalLayoutCuerpoTweet() {
		return horizontalLayoutCuerpoTweet;
	}

	public void setHorizontalLayoutCuerpoTweet(HorizontalLayout horizontalLayoutCuerpoTweet) {
		this.horizontalLayoutCuerpoTweet = horizontalLayoutCuerpoTweet;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Label getLabelNombreUsuario() {
		return labelNombreUsuario;
	}

	public void setLabelNombreUsuario(Label labelNombreUsuario) {
		this.labelNombreUsuario = labelNombreUsuario;
	}

	public Image getImgFotoPerfilTweet() {
		return imgFotoPerfilTweet;
	}

	public void setImgFotoPerfilTweet(Image imgFotoPerfilTweet) {
		this.imgFotoPerfilTweet = imgFotoPerfilTweet;
	}

	public HorizontalLayout getHorizontalLayoutCabecera() {
		return horizontalLayoutCabecera;
	}

	public void setHorizontalLayoutCabecera(HorizontalLayout horizontalLayoutCabecera) {
		this.horizontalLayoutCabecera = horizontalLayoutCabecera;
	}

	public Image getImgFotoTweet() {
		return imgFotoTweet;
	}

	public void setImgFotoTweet(Image imgFotoTweet) {
		this.imgFotoTweet = imgFotoTweet;
	}

	public HorizontalLayout getHorizontalLayoutOpciones() {
		return horizontalLayoutOpciones;
	}

	public void setHorizontalLayoutOpciones(HorizontalLayout horizontalLayoutOpciones) {
		this.horizontalLayoutOpciones = horizontalLayoutOpciones;
	}

	public Div getDivTweet() {
		return divTweet;
	}

	public void setDivTweet(Div divTweet) {
		this.divTweet = divTweet;
	}

	public Image getImgMeGusta() {
		return imgMeGusta;
	}

	public void setImgMeGusta(Image imgMeGusta) {
		this.imgMeGusta = imgMeGusta;
	}

	public Label getLabelMeGusta() {
		return labelMeGusta;
	}

	public void setLabelMeGusta(Label labelMeGusta) {
		this.labelMeGusta = labelMeGusta;
	}

	public HorizontalLayout getHorizontalLayoutMeGusta() {
		return horizontalLayoutMeGusta;
	}

	public void setHorizontalLayoutMeGusta(HorizontalLayout horizontalLayoutMeGusta) {
		this.horizontalLayoutMeGusta = horizontalLayoutMeGusta;
	}

	public Element getVerticalLayoutMeGusta() {
		return verticalLayoutMeGusta;
	}

	public void setVerticalLayoutMeGusta(Element verticalLayoutMeGusta) {
		this.verticalLayoutMeGusta = verticalLayoutMeGusta;
	}

	public Element getVerticalLayoutEspacioBotones() {
		return verticalLayoutEspacioBotones;
	}

	public void setVerticalLayoutEspacioBotones(Element verticalLayoutEspacioBotones) {
		this.verticalLayoutEspacioBotones = verticalLayoutEspacioBotones;
	}

	public Button getButtonBorrar() {
		return buttonBorrar;
	}

	public void setButtonBorrar(Button buttonBorrar) {
		this.buttonBorrar = buttonBorrar;
	}

	public Button getButtonRetweet() {
		return buttonRetweet;
	}

	public void setButtonRetweet(Button buttonRetweet) {
		this.buttonRetweet = buttonRetweet;
	}

	public Element getVerticalLayoutRetweetBorrar() {
		return verticalLayoutRetweetBorrar;
	}

	public void setVerticalLayoutRetweetBorrar(Element verticalLayoutRetweetBorrar) {
		this.verticalLayoutRetweetBorrar = verticalLayoutRetweetBorrar;
	}

	public Button getButtonMeGusta() {
		return buttonMeGusta;
	}

	public void setButtonMeGusta(Button buttonMeGusta) {
		this.buttonMeGusta = buttonMeGusta;
	}
	
	public Label getlabelRetweeteadoPor() {
		return labelRetweeteadoPor;
	}

	public void setabelRetweeteadoPor(Label labelRetweeteadoPor) {
		this.labelRetweeteadoPor = labelRetweeteadoPor;
	}
	
	public HorizontalLayout getHorizontalLayoutRetweeteadoPor() {
		return horizontalLayoutRetweeteadoPor;
	}

	public void setabelRetweeteadoPor(HorizontalLayout horizontalLayoutRetweeteadoPor) {
		this.horizontalLayoutRetweeteadoPor = horizontalLayoutRetweeteadoPor;
	}


	
	

}