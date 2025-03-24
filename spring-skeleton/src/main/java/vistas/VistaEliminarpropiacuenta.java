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

@Tag("vista-eliminarpropiacuenta")
@JsModule("./views/vista-eliminarpropiacuenta.ts")
public class VistaEliminarpropiacuenta extends LitTemplate {

    @Id("verticalLayout-Principal")
	private Element verticalLayoutPrincipal;
	@Id("horizontalLayout-Aviso")
	private HorizontalLayout horizontalLayoutAviso;
	@Id("verticalLayout-Aviso")
	private Element verticalLayoutAviso;
	@Id("label-Aviso")
	private Label labelAviso;
	@Id("horizontalLayout-Motivo")
	private HorizontalLayout horizontalLayoutMotivo;
	@Id("verticalLayout-Motivo")
	private Element verticalLayoutMotivo;
	@Id("horizontalLayout-Motivo1")
	private HorizontalLayout horizontalLayoutMotivo1;
	@Id("label-Motivo")
	private Label labelMotivo;
	@Id("textField-Motivo")
	private TextField textFieldMotivo;
	@Id("horizontalLayout-AtrasEliminar")
	private HorizontalLayout horizontalLayoutAtrasEliminar;
	@Id("button-Atras")
	private Button buttonAtras;
	@Id("verticalLayout-centro")
	private Element verticalLayoutCentro;
	@Id("button-Eliminar")
	private Button buttonEliminar;

	public VistaEliminarpropiacuenta() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutPrincipal() {
		return verticalLayoutPrincipal;
	}

	public void setVerticalLayoutPrincipal(Element verticalLayoutPrincipal) {
		this.verticalLayoutPrincipal = verticalLayoutPrincipal;
	}

	public HorizontalLayout getHorizontalLayoutAviso() {
		return horizontalLayoutAviso;
	}

	public void setHorizontalLayoutAviso(HorizontalLayout horizontalLayoutAviso) {
		this.horizontalLayoutAviso = horizontalLayoutAviso;
	}

	public Element getVerticalLayoutAviso() {
		return verticalLayoutAviso;
	}

	public void setVerticalLayoutAviso(Element verticalLayoutAviso) {
		this.verticalLayoutAviso = verticalLayoutAviso;
	}

	public Label getLabelAviso() {
		return labelAviso;
	}

	public void setLabelAviso(Label labelAviso) {
		this.labelAviso = labelAviso;
	}

	public HorizontalLayout getHorizontalLayoutMotivo() {
		return horizontalLayoutMotivo;
	}

	public void setHorizontalLayoutMotivo(HorizontalLayout horizontalLayoutMotivo) {
		this.horizontalLayoutMotivo = horizontalLayoutMotivo;
	}

	public Element getVerticalLayoutMotivo() {
		return verticalLayoutMotivo;
	}

	public void setVerticalLayoutMotivo(Element verticalLayoutMotivo) {
		this.verticalLayoutMotivo = verticalLayoutMotivo;
	}

	public HorizontalLayout getHorizontalLayoutMotivo1() {
		return horizontalLayoutMotivo1;
	}

	public void setHorizontalLayoutMotivo1(HorizontalLayout horizontalLayoutMotivo1) {
		this.horizontalLayoutMotivo1 = horizontalLayoutMotivo1;
	}

	public Label getLabelMotivo() {
		return labelMotivo;
	}

	public void setLabelMotivo(Label labelMotivo) {
		this.labelMotivo = labelMotivo;
	}

	public TextField getTextFieldMotivo() {
		return textFieldMotivo;
	}

	public void setTextFieldMotivo(TextField textFieldMotivo) {
		this.textFieldMotivo = textFieldMotivo;
	}

	public HorizontalLayout getHorizontalLayoutAtrasEliminar() {
		return horizontalLayoutAtrasEliminar;
	}

	public void setHorizontalLayoutAtrasEliminar(HorizontalLayout horizontalLayoutAtrasEliminar) {
		this.horizontalLayoutAtrasEliminar = horizontalLayoutAtrasEliminar;
	}

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public Element getVerticalLayoutCentro() {
		return verticalLayoutCentro;
	}

	public void setVerticalLayoutCentro(Element verticalLayoutCentro) {
		this.verticalLayoutCentro = verticalLayoutCentro;
	}

	public Button getButtonEliminar() {
		return buttonEliminar;
	}

	public void setButtonEliminar(Button buttonEliminar) {
		this.buttonEliminar = buttonEliminar;
	}
	
}