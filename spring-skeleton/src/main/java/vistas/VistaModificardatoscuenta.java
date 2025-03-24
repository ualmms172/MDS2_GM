package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-modificardatoscuenta")
@JsModule("./views/vista-modificardatoscuenta.ts")
public class VistaModificardatoscuenta extends LitTemplate {

    @Id("horizontalLayout-Completo")
	private HorizontalLayout horizontalLayoutCompleto;
	@Id("img-Perfil")
	private Image imgPerfil;
	@Id("verticalLayout-PrevisualizacionFotoPerfil")
	private Element verticalLayoutPrevisualizacionFotoPerfil;
	@Id("horizontalLayout-Nick")
	private HorizontalLayout horizontalLayoutNick;
	@Id("label-CambiarDatos")
	private Label labelCambiarDatos;
	@Id("verticalLayout-Formulario")
	private Element verticalLayoutFormulario;
	@Id("label-PrevisualizacionFotoPerfil")
	private Label labelPrevisualizacionFotoPerfil;
	@Id("label-FotoDePerfil")
	private Label labelFotoDePerfil;
	@Id("horizontalLayout-FotoPerfil ")
	private HorizontalLayout horizontalLayoutFotoPerfil;
	@Id("textField-Nick")
	private TextField textFieldNick;
	@Id("label-Nick")
	private Label labelNick;
	@Id("textField-FotoDePerfil")
	private TextField textFieldFotoDePerfil;
	@Id("horizontalLayout-AtrasModificar")
	private HorizontalLayout horizontalLayoutAtrasModificar;
	@Id("textField-Descripcion")
	private TextField textFieldDescripcion;
	@Id("label-Descripcion")
	private Label labelDescripcion;
	@Id("horizontalLayout-Descripcion")
	private HorizontalLayout horizontalLayoutDescripcion;
	@Id("textField-FotoDeFondo")
	private TextField textFieldFotoDeFondo;
	@Id("label-FotoDeFondo")
	private Label labelFotoDeFondo;
	@Id("horizontalLayout-FotoDeFondo")
	private HorizontalLayout horizontalLayoutFotoDeFondo;
	@Id("verticalLayout-Atras")
	private Element verticalLayoutAtras;
	@Id("verticalLayout-Modificar")
	private Element verticalLayoutModificar;
	@Id("button-Atras")
	private Button buttonAtras;
	@Id("button-Modificar")
	private Button buttonModificar;
	@Id("verticalLayout-derecho")
	private Element verticalLayoutDerecho;

	public VistaModificardatoscuenta() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getHorizontalLayoutCompleto() {
		return horizontalLayoutCompleto;
	}

	public void setHorizontalLayoutCompleto(HorizontalLayout horizontalLayoutCompleto) {
		this.horizontalLayoutCompleto = horizontalLayoutCompleto;
	}

	public Image getImgPerfil() {
		return imgPerfil;
	}

	public void setImgPerfil(Image imgPerfil) {
		this.imgPerfil = imgPerfil;
	}

	public Element getVerticalLayoutPrevisualizacionFotoPerfil() {
		return verticalLayoutPrevisualizacionFotoPerfil;
	}

	public void setVerticalLayoutPrevisualizacionFotoPerfil(Element verticalLayoutPrevisualizacionFotoPerfil) {
		this.verticalLayoutPrevisualizacionFotoPerfil = verticalLayoutPrevisualizacionFotoPerfil;
	}

	public HorizontalLayout getHorizontalLayoutNick() {
		return horizontalLayoutNick;
	}

	public void setHorizontalLayoutNick(HorizontalLayout horizontalLayoutNick) {
		this.horizontalLayoutNick = horizontalLayoutNick;
	}

	public Label getLabelCambiarDatos() {
		return labelCambiarDatos;
	}

	public void setLabelCambiarDatos(Label labelCambiarDatos) {
		this.labelCambiarDatos = labelCambiarDatos;
	}

	public Element getVerticalLayoutFormulario() {
		return verticalLayoutFormulario;
	}

	public void setVerticalLayoutFormulario(Element verticalLayoutFormulario) {
		this.verticalLayoutFormulario = verticalLayoutFormulario;
	}

	public Label getLabelPrevisualizacionFotoPerfil() {
		return labelPrevisualizacionFotoPerfil;
	}

	public void setLabelPrevisualizacionFotoPerfil(Label labelPrevisualizacionFotoPerfil) {
		this.labelPrevisualizacionFotoPerfil = labelPrevisualizacionFotoPerfil;
	}

	public Label getLabelFotoDePerfil() {
		return labelFotoDePerfil;
	}

	public void setLabelFotoDePerfil(Label labelFotoDePerfil) {
		this.labelFotoDePerfil = labelFotoDePerfil;
	}

	public HorizontalLayout getHorizontalLayoutFotoPerfil() {
		return horizontalLayoutFotoPerfil;
	}

	public void setHorizontalLayoutFotoPerfil(HorizontalLayout horizontalLayoutFotoPerfil) {
		this.horizontalLayoutFotoPerfil = horizontalLayoutFotoPerfil;
	}

	public TextField getTextFieldNick() {
		return textFieldNick;
	}

	public void setTextFieldNick(TextField textFieldNick) {
		this.textFieldNick = textFieldNick;
	}

	public Label getLabelNick() {
		return labelNick;
	}

	public void setLabelNick(Label labelNick) {
		this.labelNick = labelNick;
	}

	public TextField getTextFieldFotoDePerfil() {
		return textFieldFotoDePerfil;
	}

	public void setTextFieldFotoDePerfil(TextField textFieldFotoDePerfil) {
		this.textFieldFotoDePerfil = textFieldFotoDePerfil;
	}

	public HorizontalLayout getHorizontalLayoutAtrasModificar() {
		return horizontalLayoutAtrasModificar;
	}

	public void setHorizontalLayoutAtrasModificar(HorizontalLayout horizontalLayoutAtrasModificar) {
		this.horizontalLayoutAtrasModificar = horizontalLayoutAtrasModificar;
	}

	public TextField getTextFieldDescripcion() {
		return textFieldDescripcion;
	}

	public void setTextFieldDescripcion(TextField textFieldDescripcion) {
		this.textFieldDescripcion = textFieldDescripcion;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public HorizontalLayout getHorizontalLayoutDescripcion() {
		return horizontalLayoutDescripcion;
	}

	public void setHorizontalLayoutDescripcion(HorizontalLayout horizontalLayoutDescripcion) {
		this.horizontalLayoutDescripcion = horizontalLayoutDescripcion;
	}

	public TextField getTextFieldFotoDeFondo() {
		return textFieldFotoDeFondo;
	}

	public void setTextFieldFotoDeFondo(TextField textFieldFotoDeFondo) {
		this.textFieldFotoDeFondo = textFieldFotoDeFondo;
	}

	public Label getLabelFotoDeFondo() {
		return labelFotoDeFondo;
	}

	public void setLabelFotoDeFondo(Label labelFotoDeFondo) {
		this.labelFotoDeFondo = labelFotoDeFondo;
	}

	public HorizontalLayout getHorizontalLayoutFotoDeFondo() {
		return horizontalLayoutFotoDeFondo;
	}

	public void setHorizontalLayoutFotoDeFondo(HorizontalLayout horizontalLayoutFotoDeFondo) {
		this.horizontalLayoutFotoDeFondo = horizontalLayoutFotoDeFondo;
	}

	public Element getVerticalLayoutAtras() {
		return verticalLayoutAtras;
	}

	public void setVerticalLayoutAtras(Element verticalLayoutAtras) {
		this.verticalLayoutAtras = verticalLayoutAtras;
	}

	public Element getVerticalLayoutModificar() {
		return verticalLayoutModificar;
	}

	public void setVerticalLayoutModificar(Element verticalLayoutModificar) {
		this.verticalLayoutModificar = verticalLayoutModificar;
	}

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public Button getButtonModificar() {
		return buttonModificar;
	}

	public void setButtonModificar(Button buttonModificar) {
		this.buttonModificar = buttonModificar;
	}

	public Element getVerticalLayoutDerecho() {
		return verticalLayoutDerecho;
	}

	public void setVerticalLayoutDerecho(Element verticalLayoutDerecho) {
		this.verticalLayoutDerecho = verticalLayoutDerecho;
	}
	
	
	
	
	
	
	
	
	
	

}