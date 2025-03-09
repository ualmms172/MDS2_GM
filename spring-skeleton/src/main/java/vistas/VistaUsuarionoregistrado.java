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

	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label-listaUsuariosFamosos")
	private HorizontalLayout labelListaUsuariosFamosos;
	@Id("layout-listaUsuariosFamosos")
	private HorizontalLayout layoutListaUsuariosFamosos;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("button-VerMasUsuarios")
	private Button buttonVerMasUsuarios;
	@Id("layout-central")
	private Element layoutCentral;
	@Id("layout-centralSuperior")
	private HorizontalLayout layoutCentralSuperior;
	@Id("image-IconoTwitter")
	private Image imageIconoTwitter;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("layout-centralInferior")
	private Element layoutCentralInferior;
	@Id("button-IniciarSesion")
	private Button buttonIniciarSesion;
	@Id("button-Registrarse")
	private Button buttonRegistrarse;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("label-ListaHashtagMasUsados")
	private Div labelListaHashtagMasUsados;
	@Id("layout-listaDeHashtagMasUsados")
	private HorizontalLayout layoutListaDeHashtagMasUsados;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("button-VerMasHashtags")
	private Button buttonVerMasHashtags;
	
	public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }
	
	public void setLabel(Label label) {
		this.label = label;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public void setLabelListaUsuariosFamosos(HorizontalLayout labelListaUsuariosFamosos) {
		this.labelListaUsuariosFamosos = labelListaUsuariosFamosos;
	}

	public void setLayoutListaUsuariosFamosos(HorizontalLayout layoutListaUsuariosFamosos) {
		this.layoutListaUsuariosFamosos = layoutListaUsuariosFamosos;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public void setButtonVerMasUsuarios(Button buttonVerMasUsuarios) {
		this.buttonVerMasUsuarios = buttonVerMasUsuarios;
	}

	public void setLayoutCentral(Element layoutCentral) {
		this.layoutCentral = layoutCentral;
	}

	public void setLayoutCentralSuperior(HorizontalLayout layoutCentralSuperior) {
		this.layoutCentralSuperior = layoutCentralSuperior;
	}

	public void setImageIconoTwitter(Image imageIconoTwitter) {
		this.imageIconoTwitter = imageIconoTwitter;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public void setLayoutCentralInferior(Element layoutCentralInferior) {
		this.layoutCentralInferior = layoutCentralInferior;
	}

	public void setButtonIniciarSesion(Button buttonIniciarSesion) {
		this.buttonIniciarSesion = buttonIniciarSesion;
	}

	public void setButtonRegistrarse(Button buttonRegistrarse) {
		this.buttonRegistrarse = buttonRegistrarse;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public void setLabelListaHashtagMasUsados(Div labelListaHashtagMasUsados) {
		this.labelListaHashtagMasUsados = labelListaHashtagMasUsados;
	}

	public void setLayoutListaDeHashtagMasUsados(HorizontalLayout layoutListaDeHashtagMasUsados) {
		this.layoutListaDeHashtagMasUsados = layoutListaDeHashtagMasUsados;
	}

	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public void setButtonVerMasHashtags(Button buttonVerMasHashtags) {
		this.buttonVerMasHashtags = buttonVerMasHashtags;
	}

	public Label getLabel() {
		return label;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public HorizontalLayout getLabelListaUsuariosFamosos() {
		return labelListaUsuariosFamosos;
	}

	public HorizontalLayout getLayoutListaUsuariosFamosos() {
		return layoutListaUsuariosFamosos;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public Button getButtonVerMasUsuarios() {
		return buttonVerMasUsuarios;
	}

	public Element getLayoutCentral() {
		return layoutCentral;
	}

	public HorizontalLayout getLayoutCentralSuperior() {
		return layoutCentralSuperior;
	}

	public Image getImageIconoTwitter() {
		return imageIconoTwitter;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public Element getLayoutCentralInferior() {
		return layoutCentralInferior;
	}

	public Button getButtonIniciarSesion() {
		return buttonIniciarSesion;
	}

	public Button getButtonRegistrarse() {
		return buttonRegistrarse;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public Div getLabelListaHashtagMasUsados() {
		return labelListaHashtagMasUsados;
	}

	public HorizontalLayout getLayoutListaDeHashtagMasUsados() {
		return layoutListaDeHashtagMasUsados;
	}

	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public Button getButtonVerMasHashtags() {
		return buttonVerMasHashtags;
	}
	
	


	

}