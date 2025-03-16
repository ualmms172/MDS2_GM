package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

@Tag("vista-listausuariosgeneral_item")
@JsModule("./views/vista-listausuariosgeneral_item.ts")
public class VistaListausuariosgeneral_item extends LitTemplate {

    @Id("vertical-listausuariosgeneral_item")
	private Element verticalListausuariosgeneral_item;
	@Id("horizontal-listausuariosgeneral_item")
	private HorizontalLayout horizontalListausuariosgeneral_item;
	@Id("label-Nick")
	private Label labelNick;
	@Id("label-NumSeguidores")
	private Label labelNumSeguidores;
	@Id("label-NumSeguidos")
	private Label labelNumSeguidos;
	@Id("label-NumTweets")
	private Label labelNumTweets;
	@Id("label-Seguido/NoSeguido")
	private Label labelSeguido_NoSeguido;
	@Id("button-Banear")
	private Button buttonBanear;
	@Id("img-PerfilUsuario")
	private Image imgPerfilUsuario;
	@Id("button-Seguir")
	private Button buttonSeguir;

	public VistaListausuariosgeneral_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListausuariosgeneral_item() {
		return verticalListausuariosgeneral_item;
	}

	public void setVerticalListausuariosgeneral_item(Element verticalListausuariosgeneral_item) {
		this.verticalListausuariosgeneral_item = verticalListausuariosgeneral_item;
	}

	public HorizontalLayout getHorizontalListausuariosgeneral_item() {
		return horizontalListausuariosgeneral_item;
	}

	public void setHorizontalListausuariosgeneral_item(HorizontalLayout horizontalListausuariosgeneral_item) {
		this.horizontalListausuariosgeneral_item = horizontalListausuariosgeneral_item;
	}

	public Label getLabelNick() {
		return labelNick;
	}

	public void setLabelNick(Label labelNick) {
		this.labelNick = labelNick;
	}

	public Label getLabelNumSeguidores() {
		return labelNumSeguidores;
	}

	public void setLabelNumSeguidores(Label labelNumSeguidores) {
		this.labelNumSeguidores = labelNumSeguidores;
	}

	public Label getLabelNumSeguidos() {
		return labelNumSeguidos;
	}

	public void setLabelNumSeguidos(Label labelNumSeguidos) {
		this.labelNumSeguidos = labelNumSeguidos;
	}

	public Label getLabelNumTweets() {
		return labelNumTweets;
	}

	public void setLabelNumTweets(Label labelNumTweets) {
		this.labelNumTweets = labelNumTweets;
	}

	public Label getLabelSeguido_NoSeguido() {
		return labelSeguido_NoSeguido;
	}

	public void setLabelSeguido_NoSeguido(Label labelSeguido_NoSeguido) {
		this.labelSeguido_NoSeguido = labelSeguido_NoSeguido;
	}

	public Button getButtonBanear() {
		return buttonBanear;
	}

	public void setButtonBanear(Button buttonBanear) {
		this.buttonBanear = buttonBanear;
	}

	public Image getImgPerfilUsuario() {
		return imgPerfilUsuario;
	}

	public void setImgPerfilUsuario(Image imgPerfilUsuario) {
		this.imgPerfilUsuario = imgPerfilUsuario;
	}

	public Button getButtonSeguir() {
		return buttonSeguir;
	}

	public void setButtonSeguir(Button buttonSeguir) {
		this.buttonSeguir = buttonSeguir;
	}
	
	
	

}