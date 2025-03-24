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

@Tag("vista-validarcorreo")
@JsModule("./views/vista-validarcorreo.ts")
public class VistaValidarcorreo extends LitTemplate {

    @Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("horizontalLayout-EnviarCorreo")
	private HorizontalLayout horizontalLayoutEnviarCorreo;
	@Id("horizontalLayout-CampoTexto")
	private HorizontalLayout horizontalLayoutCampoTexto;
	@Id("label-Ingreso")
	private Label labelIngreso;
	@Id("label-Notificacion")
	private Label labelNotificacion;
	@Id("verticalLayout-TextoInformativo")
	private Element verticalLayoutTextoInformativo;
	@Id("button-Validar")
	private Button buttonValidar;
	@Id("verticalLayout-Central")
	private Element verticalLayoutCentral;
	@Id("button-Atras")
	private Button buttonAtras;
	@Id("HorizontalLayout-AtrasValidar")
	private HorizontalLayout horizontalLayoutAtrasValidar;
	@Id("textField-Cuenta")
	private TextField textFieldCuenta;

	public VistaValidarcorreo() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public HorizontalLayout getHorizontalLayoutEnviarCorreo() {
		return horizontalLayoutEnviarCorreo;
	}

	public void setHorizontalLayoutEnviarCorreo(HorizontalLayout horizontalLayoutEnviarCorreo) {
		this.horizontalLayoutEnviarCorreo = horizontalLayoutEnviarCorreo;
	}

	public HorizontalLayout getHorizontalLayoutCampoTexto() {
		return horizontalLayoutCampoTexto;
	}

	public void setHorizontalLayoutCampoTexto(HorizontalLayout horizontalLayoutCampoTexto) {
		this.horizontalLayoutCampoTexto = horizontalLayoutCampoTexto;
	}

	public Label getLabelIngreso() {
		return labelIngreso;
	}

	public void setLabelIngreso(Label labelIngreso) {
		this.labelIngreso = labelIngreso;
	}

	public Label getLabelNotificacion() {
		return labelNotificacion;
	}

	public void setLabelNotificacion(Label labelNotificacion) {
		this.labelNotificacion = labelNotificacion;
	}

	public Element getVerticalLayoutTextoInformativo() {
		return verticalLayoutTextoInformativo;
	}

	public void setVerticalLayoutTextoInformativo(Element verticalLayoutTextoInformativo) {
		this.verticalLayoutTextoInformativo = verticalLayoutTextoInformativo;
	}

	public Button getButtonValidar() {
		return buttonValidar;
	}

	public void setButtonValidar(Button buttonValidar) {
		this.buttonValidar = buttonValidar;
	}

	public Element getVerticalLayoutCentral() {
		return verticalLayoutCentral;
	}

	public void setVerticalLayoutCentral(Element verticalLayoutCentral) {
		this.verticalLayoutCentral = verticalLayoutCentral;
	}

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public HorizontalLayout getHorizontalLayoutAtrasValidar() {
		return horizontalLayoutAtrasValidar;
	}

	public void setHorizontalLayoutAtrasValidar(HorizontalLayout horizontalLayoutAtrasValidar) {
		this.horizontalLayoutAtrasValidar = horizontalLayoutAtrasValidar;
	}

	public TextField getTextFieldCuenta() {
		return textFieldCuenta;
	}

	public void setTextFieldCuenta(TextField textFieldCuenta) {
		this.textFieldCuenta = textFieldCuenta;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}