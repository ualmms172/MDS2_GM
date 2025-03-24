package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

@Tag("vista-iniciarsesin")
@JsModule("./views/vista-iniciarsesin.ts")
public class VistaIniciarsesin extends LitTemplate {

    @Id("verticalLayout-Ventana")
	private Element verticalLayoutVentana;
	@Id("horizontalLayout-IniciaSesion")
	private HorizontalLayout horizontalLayoutIniciaSesion;
	@Id("label-IniciarSesion")
	private Label labelIniciarSesion;
	@Id("horizontalLayout-CorreoNick")
	private HorizontalLayout horizontalLayoutCorreoNick;
	@Id("label-Correo")
	private Label labelCorreo;
	@Id("textField-Correo")
	private TextField textFieldCorreo;
	@Id("horizontalLayout-Contraseña")
	private HorizontalLayout horizontalLayoutContraseña;
	@Id("label-Contraseña")
	private Label labelContraseña;
	@Id("textField-contraseña")
	private TextField textFieldContraseña;
	@Id("verticalLayout-IniciarSesion")
	private Element verticalLayoutIniciarSesion;
	@Id("horizontalLayout-RecuperarContraseña")
	private HorizontalLayout horizontalLayoutRecuperarContraseña;
	@Id("label-OlvidarContraseña")
	private Label labelOlvidarContraseña;
	@Id("button-RecuperarContraseña")
	private Button buttonRecuperarContraseña;
	@Id("horizontalLayout-Central")
	private HorizontalLayout horizontalLayoutCentral;
	@Id("label-central")
	private Label labelCentral;
	@Id("horizontalLayout-IniciarSesion")
	private HorizontalLayout horizontalLayoutIniciarSesion;
	@Id("button-IniciarSesionConGoogle")
	private Button buttonIniciarSesionConGoogle;
	@Id("img-IniciarSesion")
	private Image imgIniciarSesion;
	@Id("horizontalLayout-AtrasContinuar")
	private HorizontalLayout horizontalLayoutAtrasContinuar;
	@Id("button-Atras")
	private Button buttonAtras;
	@Id("button-Continuar")
	private Button buttonContinuar;

	public VistaIniciarsesin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentana() {
		return verticalLayoutVentana;
	}

	public void setVerticalLayoutVentana(Element verticalLayoutVentana) {
		this.verticalLayoutVentana = verticalLayoutVentana;
	}

	public HorizontalLayout getHorizontalLayoutIniciaSesion() {
		return horizontalLayoutIniciaSesion;
	}

	public void setHorizontalLayoutIniciaSesion(HorizontalLayout horizontalLayoutIniciaSesion) {
		this.horizontalLayoutIniciaSesion = horizontalLayoutIniciaSesion;
	}

	public Label getLabelIniciarSesion() {
		return labelIniciarSesion;
	}

	public void setLabelIniciarSesion(Label labelIniciarSesion) {
		this.labelIniciarSesion = labelIniciarSesion;
	}

	public HorizontalLayout getHorizontalLayoutCorreoNick() {
		return horizontalLayoutCorreoNick;
	}

	public void setHorizontalLayoutCorreoNick(HorizontalLayout horizontalLayoutCorreoNick) {
		this.horizontalLayoutCorreoNick = horizontalLayoutCorreoNick;
	}

	public Label getLabelCorreo() {
		return labelCorreo;
	}

	public void setLabelCorreo(Label labelCorreo) {
		this.labelCorreo = labelCorreo;
	}

	public TextField getTextFieldCorreo() {
		return textFieldCorreo;
	}

	public void setTextFieldCorreo(TextField textFieldCorreo) {
		this.textFieldCorreo = textFieldCorreo;
	}

	public HorizontalLayout getHorizontalLayoutContraseña() {
		return horizontalLayoutContraseña;
	}

	public void setHorizontalLayoutContraseña(HorizontalLayout horizontalLayoutContraseña) {
		this.horizontalLayoutContraseña = horizontalLayoutContraseña;
	}

	public Label getLabelContraseña() {
		return labelContraseña;
	}

	public void setLabelContraseña(Label labelContraseña) {
		this.labelContraseña = labelContraseña;
	}

	public TextField getTextFieldContraseña() {
		return textFieldContraseña;
	}

	public void setTextFieldContraseña(TextField textFieldContraseña) {
		this.textFieldContraseña = textFieldContraseña;
	}

	public Element getVerticalLayoutIniciarSesion() {
		return verticalLayoutIniciarSesion;
	}

	public void setVerticalLayoutIniciarSesion(Element verticalLayoutIniciarSesion) {
		this.verticalLayoutIniciarSesion = verticalLayoutIniciarSesion;
	}

	public HorizontalLayout getHorizontalLayoutRecuperarContraseña() {
		return horizontalLayoutRecuperarContraseña;
	}

	public void setHorizontalLayoutRecuperarContraseña(HorizontalLayout horizontalLayoutRecuperarContraseña) {
		this.horizontalLayoutRecuperarContraseña = horizontalLayoutRecuperarContraseña;
	}

	public Label getLabelOlvidarContraseña() {
		return labelOlvidarContraseña;
	}

	public void setLabelOlvidarContraseña(Label labelOlvidarContraseña) {
		this.labelOlvidarContraseña = labelOlvidarContraseña;
	}

	public Button getButtonRecuperarContraseña() {
		return buttonRecuperarContraseña;
	}

	public void setButtonRecuperarContraseña(Button buttonRecuperarContraseña) {
		this.buttonRecuperarContraseña = buttonRecuperarContraseña;
	}

	public HorizontalLayout getHorizontalLayoutCentral() {
		return horizontalLayoutCentral;
	}

	public void setHorizontalLayoutCentral(HorizontalLayout horizontalLayoutCentral) {
		this.horizontalLayoutCentral = horizontalLayoutCentral;
	}

	public Label getLabelCentral() {
		return labelCentral;
	}

	public void setLabelCentral(Label labelCentral) {
		this.labelCentral = labelCentral;
	}

	public HorizontalLayout getHorizontalLayoutIniciarSesion() {
		return horizontalLayoutIniciarSesion;
	}

	public void setHorizontalLayoutIniciarSesion(HorizontalLayout horizontalLayoutIniciarSesion) {
		this.horizontalLayoutIniciarSesion = horizontalLayoutIniciarSesion;
	}

	public Button getButtonIniciarSesionConGoogle() {
		return buttonIniciarSesionConGoogle;
	}

	public void setButtonIniciarSesionConGoogle(Button buttonIniciarSesionConGoogle) {
		this.buttonIniciarSesionConGoogle = buttonIniciarSesionConGoogle;
	}

	public Image getImgIniciarSesion() {
		return imgIniciarSesion;
	}

	public void setImgIniciarSesion(Image imgIniciarSesion) {
		this.imgIniciarSesion = imgIniciarSesion;
	}

	public HorizontalLayout getHorizontalLayoutAtrasContinuar() {
		return horizontalLayoutAtrasContinuar;
	}

	public void setHorizontalLayoutAtrasContinuar(HorizontalLayout horizontalLayoutAtrasContinuar) {
		this.horizontalLayoutAtrasContinuar = horizontalLayoutAtrasContinuar;
	}

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public Button getButtonContinuar() {
		return buttonContinuar;
	}

	public void setButtonContinuar(Button buttonContinuar) {
		this.buttonContinuar = buttonContinuar;
	}
	
	
	
	
	
	
	

}