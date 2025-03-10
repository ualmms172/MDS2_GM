package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Div;

@Tag("vista-usuarionoregistrado")
@JsModule("./views/vista-usuarionoregistrado.ts")
public class VistaUsuarionoregistrado extends LitTemplate {

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("verticalLayout-izquierda")
	private Element verticalLayoutIzquierda;
	@Id("horizontalLayout-ListaUsuariosMasFamosos")
	private HorizontalLayout horizontalLayoutListaUsuariosMasFamosos;
	@Id("label-ListaUsuariosMasFamosos")
	private Label labelListaUsuariosMasFamosos;
	@Id("horizontalLayout-listaUsuariosFamosos")
	private HorizontalLayout horizontalLayoutListaUsuariosFamosos;
	@Id("horizontalLayout-VerMasUsuarios")
	private HorizontalLayout horizontalLayoutVerMasUsuarios;
	@Id("button-VerMasUsuarios")
	private Button buttonVerMasUsuarios;
	@Id("verticalLayout-central")
	private Element verticalLayoutCentral;
	@Id("horizontalLayout-centralSuperior")
	private HorizontalLayout horizontalLayoutCentralSuperior;
	@Id("image-IconoTwitter")
	private Image imageIconoTwitter;
	@Id("horizontalLayout-CentrarInferior")
	private HorizontalLayout horizontalLayoutCentrarInferior;
	@Id("verticalLayout-centralInferior")
	private Element verticalLayoutCentralInferior;
	@Id("button-IniciarSesion")
	private Button buttonIniciarSesion;
	@Id("button-Registrarse")
	private Button buttonRegistrarse;
	@Id("verticalLayout-derecha")
	private Element verticalLayoutDerecha;
	@Id("horizontalLayout-ListaHashtags")
	private HorizontalLayout horizontalLayoutListaHashtags;
	@Id("verticalLayout-ListaHashtagsMasUsados")
	private Element verticalLayoutListaHashtagsMasUsados;
	@Id("label-ListaHashtagMasUsados")
	private Div labelListaHashtagMasUsados;
	@Id("Horizontallayout-listaDeHashtagMasUsados")
	private HorizontalLayout horizontallayoutListaDeHashtagMasUsados;
	@Id("horizontalLayout-VerMasHashtags")
	private HorizontalLayout horizontalLayoutVerMasHashtags;
	@Id("verticalLayout-VerMasHashtags")
	private Element verticalLayoutVerMasHashtags;
	@Id("button-VerMasHashtags")
	private Button buttonVerMasHashtags;

	 public VistaUsuarionoregistrado() {
	        // You can initialise any data required for the connected UI components here.
	    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVerticalLayoutIzquierda() {
		return verticalLayoutIzquierda;
	}

	public void setVerticalLayoutIzquierda(Element verticalLayoutIzquierda) {
		this.verticalLayoutIzquierda = verticalLayoutIzquierda;
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

	public HorizontalLayout getHorizontalLayoutListaUsuariosFamosos() {
		return horizontalLayoutListaUsuariosFamosos;
	}

	public void setHorizontalLayoutListaUsuariosFamosos(HorizontalLayout horizontalLayoutListaUsuariosFamosos) {
		this.horizontalLayoutListaUsuariosFamosos = horizontalLayoutListaUsuariosFamosos;
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

	public Image getImageIconoTwitter() {
		return imageIconoTwitter;
	}

	public void setImageIconoTwitter(Image imageIconoTwitter) {
		this.imageIconoTwitter = imageIconoTwitter;
	}

	public HorizontalLayout getHorizontalLayoutCentrarInferior() {
		return horizontalLayoutCentrarInferior;
	}

	public void setHorizontalLayoutCentrarInferior(HorizontalLayout horizontalLayoutCentrarInferior) {
		this.horizontalLayoutCentrarInferior = horizontalLayoutCentrarInferior;
	}

	public Element getVerticalLayoutCentralInferior() {
		return verticalLayoutCentralInferior;
	}

	public void setVerticalLayoutCentralInferior(Element verticalLayoutCentralInferior) {
		this.verticalLayoutCentralInferior = verticalLayoutCentralInferior;
	}

	public Button getButtonIniciarSesion() {
		return buttonIniciarSesion;
	}

	public void setButtonIniciarSesion(Button buttonIniciarSesion) {
		this.buttonIniciarSesion = buttonIniciarSesion;
	}

	public Button getButtonRegistrarse() {
		return buttonRegistrarse;
	}

	public void setButtonRegistrarse(Button buttonRegistrarse) {
		this.buttonRegistrarse = buttonRegistrarse;
	}

	public Element getVerticalLayoutDerecha() {
		return verticalLayoutDerecha;
	}

	public void setVerticalLayoutDerecha(Element verticalLayoutDerecha) {
		this.verticalLayoutDerecha = verticalLayoutDerecha;
	}

	public HorizontalLayout getHorizontalLayoutListaHashtags() {
		return horizontalLayoutListaHashtags;
	}

	public void setHorizontalLayoutListaHashtags(HorizontalLayout horizontalLayoutListaHashtags) {
		this.horizontalLayoutListaHashtags = horizontalLayoutListaHashtags;
	}

	public Element getVerticalLayoutListaHashtagsMasUsados() {
		return verticalLayoutListaHashtagsMasUsados;
	}

	public void setVerticalLayoutListaHashtagsMasUsados(Element verticalLayoutListaHashtagsMasUsados) {
		this.verticalLayoutListaHashtagsMasUsados = verticalLayoutListaHashtagsMasUsados;
	}

	public Div getLabelListaHashtagMasUsados() {
		return labelListaHashtagMasUsados;
	}

	public void setLabelListaHashtagMasUsados(Div labelListaHashtagMasUsados) {
		this.labelListaHashtagMasUsados = labelListaHashtagMasUsados;
	}

	public HorizontalLayout getHorizontallayoutListaDeHashtagMasUsados() {
		return horizontallayoutListaDeHashtagMasUsados;
	}

	public void setHorizontallayoutListaDeHashtagMasUsados(HorizontalLayout horizontallayoutListaDeHashtagMasUsados) {
		this.horizontallayoutListaDeHashtagMasUsados = horizontallayoutListaDeHashtagMasUsados;
	}

	public HorizontalLayout getHorizontalLayoutVerMasHashtags() {
		return horizontalLayoutVerMasHashtags;
	}

	public void setHorizontalLayoutVerMasHashtags(HorizontalLayout horizontalLayoutVerMasHashtags) {
		this.horizontalLayoutVerMasHashtags = horizontalLayoutVerMasHashtags;
	}

	public Element getVerticalLayoutVerMasHashtags() {
		return verticalLayoutVerMasHashtags;
	}

	public void setVerticalLayoutVerMasHashtags(Element verticalLayoutVerMasHashtags) {
		this.verticalLayoutVerMasHashtags = verticalLayoutVerMasHashtags;
	}

	public Button getButtonVerMasHashtags() {
		return buttonVerMasHashtags;
	}

	public void setButtonVerMasHashtags(Button buttonVerMasHashtags) {
		this.buttonVerMasHashtags = buttonVerMasHashtags;
	}
	
	
	 


	

}