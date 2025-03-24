package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-banearusuario")
@JsModule("./views/vista-banearusuario.ts")
public class VistaBanearusuario extends LitTemplate {

    @Id("verticalLayout-Ventana")
	private Element verticalLayoutVentana;
	@Id("label-Banear")
	private Label labelBanear;
	@Id("label-AvisoBaneo")
	private Label labelAvisoBaneo;
	@Id("label-SeleccionTipoBaneo")
	private Label labelSeleccionTipoBaneo;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("horizontalLayout-SeleccionBaneo")
	private HorizontalLayout horizontalLayoutSeleccionBaneo;
	@Id("verticalLayout-Indefinido")
	private Element verticalLayoutIndefinido;
	@Id("button-Indefinido")
	private Button buttonIndefinido;
	@Id("verticalLayout-SeleccionTiempoBaneo")
	private Element verticalLayoutSeleccionTiempoBaneo;
	@Id("placeHolder-tiempoBaneo")
	private TextField placeHolderTiempoBaneo;
	@Id("button-Temporal")
	private Button buttonTemporal;
	@Id("button-Atras")
	private Button buttonAtras;

	public VistaBanearusuario() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentana() {
		return verticalLayoutVentana;
	}

	public void setVerticalLayoutVentana(Element verticalLayoutVentana) {
		this.verticalLayoutVentana = verticalLayoutVentana;
	}

	public Label getLabelBanear() {
		return labelBanear;
	}

	public void setLabelBanear(Label labelBanear) {
		this.labelBanear = labelBanear;
	}

	public Label getLabelAvisoBaneo() {
		return labelAvisoBaneo;
	}

	public void setLabelAvisoBaneo(Label labelAvisoBaneo) {
		this.labelAvisoBaneo = labelAvisoBaneo;
	}

	public Label getLabelSeleccionTipoBaneo() {
		return labelSeleccionTipoBaneo;
	}

	public void setLabelSeleccionTipoBaneo(Label labelSeleccionTipoBaneo) {
		this.labelSeleccionTipoBaneo = labelSeleccionTipoBaneo;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public HorizontalLayout getHorizontalLayoutSeleccionBaneo() {
		return horizontalLayoutSeleccionBaneo;
	}

	public void setHorizontalLayoutSeleccionBaneo(HorizontalLayout horizontalLayoutSeleccionBaneo) {
		this.horizontalLayoutSeleccionBaneo = horizontalLayoutSeleccionBaneo;
	}

	public Element getVerticalLayoutIndefinido() {
		return verticalLayoutIndefinido;
	}

	public void setVerticalLayoutIndefinido(Element verticalLayoutIndefinido) {
		this.verticalLayoutIndefinido = verticalLayoutIndefinido;
	}

	public Button getButtonIndefinido() {
		return buttonIndefinido;
	}

	public void setButtonIndefinido(Button buttonIndefinido) {
		this.buttonIndefinido = buttonIndefinido;
	}

	public Element getVerticalLayoutSeleccionTiempoBaneo() {
		return verticalLayoutSeleccionTiempoBaneo;
	}

	public void setVerticalLayoutSeleccionTiempoBaneo(Element verticalLayoutSeleccionTiempoBaneo) {
		this.verticalLayoutSeleccionTiempoBaneo = verticalLayoutSeleccionTiempoBaneo;
	}

	public TextField getPlaceHolderTiempoBaneo() {
		return placeHolderTiempoBaneo;
	}

	public void setPlaceHolderTiempoBaneo(TextField placeHolderTiempoBaneo) {
		this.placeHolderTiempoBaneo = placeHolderTiempoBaneo;
	}

	public Button getButtonTemporal() {
		return buttonTemporal;
	}

	public void setButtonTemporal(Button buttonTemporal) {
		this.buttonTemporal = buttonTemporal;
	}

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}
	
	
	
	
	
	
	
	
	

}