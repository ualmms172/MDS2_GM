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
	@Id("label")
	private Label label;
	@Id("label-ListaUsuariosMasFamosos")
	private HorizontalLayout labelListaUsuariosMasFamosos;
	@Id("verticalLayout-Izquierdo")
	private Element verticalLayoutIzquierdo;
	@Id("horizontalLayout-listaUsuariosMasFamosos")
	private HorizontalLayout horizontalLayoutListaUsuariosMasFamosos;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("button-VerMasUsuarios")
	private Button buttonVerMasUsuarios;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("button-Notificaciones")
	private Button buttonNotificaciones;
	@Id("button-cerrarSesion")
	private Button buttonCerrarSesion;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("button-Baneados")
	private Button buttonBaneados;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("img")
	private Image img;
	@Id("button-EscribirTweet")
	private Button buttonEscribirTweet;
	@Id("button-VerPerfil")
	private Button buttonVerPerfil;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("vaadinHorizontalLayout7")
	private HorizontalLayout vaadinHorizontalLayout7;
	@Id("img1")
	private Image img1;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("vaadinHorizontalLayout8")
	private HorizontalLayout vaadinHorizontalLayout8;
	@Id("vaadinVerticalLayout6")
	private Element vaadinVerticalLayout6;
	@Id("label-ListaDeHashtagsMasUsados")
	private Div labelListaDeHashtagsMasUsados;
	@Id("lablel-ListaHashtagsMasUsados")
	private Element lablelListaHashtagsMasUsados;
	@Id("vaadinHorizontalLayout9")
	private HorizontalLayout vaadinHorizontalLayout9;
	@Id("button-VerMasHashtags")
	private Button buttonVerMasHashtags;
	@Id("verticaLayout-VerMásHashTags")
	private Element verticaLayoutVerMásHashTags;
	@Id("vaadinHorizontalLayout10")
	private HorizontalLayout vaadinHorizontalLayout10;
	@Id("horizontalLayout-HashtagsMasUsados")
	private HorizontalLayout horizontalLayoutHashtagsMasUsados;
	
	

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



	public Label getLabel() {
		return label;
	}



	public void setLabel(Label label) {
		this.label = label;
	}



	public HorizontalLayout getLabelListaUsuariosMasFamosos() {
		return labelListaUsuariosMasFamosos;
	}



	public void setLabelListaUsuariosMasFamosos(HorizontalLayout labelListaUsuariosMasFamosos) {
		this.labelListaUsuariosMasFamosos = labelListaUsuariosMasFamosos;
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



	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}



	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Button getButtonVerMasUsuarios() {
		return buttonVerMasUsuarios;
	}



	public void setButtonVerMasUsuarios(Button buttonVerMasUsuarios) {
		this.buttonVerMasUsuarios = buttonVerMasUsuarios;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}



	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}



	public Button getButtonNotificaciones() {
		return buttonNotificaciones;
	}



	public void setButtonNotificaciones(Button buttonNotificaciones) {
		this.buttonNotificaciones = buttonNotificaciones;
	}



	public Button getButtonCerrarSesion() {
		return buttonCerrarSesion;
	}



	public void setButtonCerrarSesion(Button buttonCerrarSesion) {
		this.buttonCerrarSesion = buttonCerrarSesion;
	}



	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}



	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}



	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}



	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}



	public Button getButtonBaneados() {
		return buttonBaneados;
	}



	public void setButtonBaneados(Button buttonBaneados) {
		this.buttonBaneados = buttonBaneados;
	}



	public HorizontalLayout getVaadinHorizontalLayout6() {
		return vaadinHorizontalLayout6;
	}



	public void setVaadinHorizontalLayout6(HorizontalLayout vaadinHorizontalLayout6) {
		this.vaadinHorizontalLayout6 = vaadinHorizontalLayout6;
	}



	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}



	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}



	public HorizontalLayout getVaadinHorizontalLayout5() {
		return vaadinHorizontalLayout5;
	}



	public void setVaadinHorizontalLayout5(HorizontalLayout vaadinHorizontalLayout5) {
		this.vaadinHorizontalLayout5 = vaadinHorizontalLayout5;
	}



	public Image getImg() {
		return img;
	}



	public void setImg(Image img) {
		this.img = img;
	}



	public Button getButtonEscribirTweet() {
		return buttonEscribirTweet;
	}



	public void setButtonEscribirTweet(Button buttonEscribirTweet) {
		this.buttonEscribirTweet = buttonEscribirTweet;
	}



	public Button getButtonVerPerfil() {
		return buttonVerPerfil;
	}



	public void setButtonVerPerfil(Button buttonVerPerfil) {
		this.buttonVerPerfil = buttonVerPerfil;
	}



	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}



	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}



	public HorizontalLayout getVaadinHorizontalLayout7() {
		return vaadinHorizontalLayout7;
	}



	public void setVaadinHorizontalLayout7(HorizontalLayout vaadinHorizontalLayout7) {
		this.vaadinHorizontalLayout7 = vaadinHorizontalLayout7;
	}



	public Image getImg1() {
		return img1;
	}



	public void setImg1(Image img1) {
		this.img1 = img1;
	}



	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}



	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}



	public HorizontalLayout getVaadinHorizontalLayout8() {
		return vaadinHorizontalLayout8;
	}



	public void setVaadinHorizontalLayout8(HorizontalLayout vaadinHorizontalLayout8) {
		this.vaadinHorizontalLayout8 = vaadinHorizontalLayout8;
	}



	public Element getVaadinVerticalLayout6() {
		return vaadinVerticalLayout6;
	}



	public void setVaadinVerticalLayout6(Element vaadinVerticalLayout6) {
		this.vaadinVerticalLayout6 = vaadinVerticalLayout6;
	}



	public Div getLabelListaDeHashtagsMasUsados() {
		return labelListaDeHashtagsMasUsados;
	}



	public void setLabelListaDeHashtagsMasUsados(Div labelListaDeHashtagsMasUsados) {
		this.labelListaDeHashtagsMasUsados = labelListaDeHashtagsMasUsados;
	}



	public Element getLablelListaHashtagsMasUsados() {
		return lablelListaHashtagsMasUsados;
	}



	public void setLablelListaHashtagsMasUsados(Element lablelListaHashtagsMasUsados) {
		this.lablelListaHashtagsMasUsados = lablelListaHashtagsMasUsados;
	}



	public HorizontalLayout getVaadinHorizontalLayout9() {
		return vaadinHorizontalLayout9;
	}



	public void setVaadinHorizontalLayout9(HorizontalLayout vaadinHorizontalLayout9) {
		this.vaadinHorizontalLayout9 = vaadinHorizontalLayout9;
	}



	public Button getButtonVerMasHashtags() {
		return buttonVerMasHashtags;
	}



	public void setButtonVerMasHashtags(Button buttonVerMasHashtags) {
		this.buttonVerMasHashtags = buttonVerMasHashtags;
	}



	public Element getVerticaLayoutVerMásHashTags() {
		return verticaLayoutVerMásHashTags;
	}



	public void setVerticaLayoutVerMásHashTags(Element verticaLayoutVerMásHashTags) {
		this.verticaLayoutVerMásHashTags = verticaLayoutVerMásHashTags;
	}



	public HorizontalLayout getVaadinHorizontalLayout10() {
		return vaadinHorizontalLayout10;
	}



	public void setVaadinHorizontalLayout10(HorizontalLayout vaadinHorizontalLayout10) {
		this.vaadinHorizontalLayout10 = vaadinHorizontalLayout10;
	}



	public HorizontalLayout getHorizontalLayoutHashtagsMasUsados() {
		return horizontalLayoutHashtagsMasUsados;
	}



	public void setHorizontalLayoutHashtagsMasUsados(HorizontalLayout horizontalLayoutHashtagsMasUsados) {
		this.horizontalLayoutHashtagsMasUsados = horizontalLayoutHashtagsMasUsados;
	}
	
	
	

}