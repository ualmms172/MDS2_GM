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

@Tag("vista-registrar")
@JsModule("./views/vista-registrar.ts")
public class VistaRegistrar extends LitTemplate {

    @Id("horizontalLayout-Completo")
	private HorizontalLayout horizontalLayoutCompleto;
	@Id("verticalLayout-PrevisualizacionFotoPerfil")
	private Element verticalLayoutPrevisualizacionFotoPerfil;
	@Id("img-Perfil")
	private Image imgPerfil;
	@Id("label-PrevisualizacionFotoPerfil")
	private Label labelPrevisualizacionFotoPerfil;
	@Id("verticalLayout-Formulario")
	private Element verticalLayoutFormulario;
	@Id("label-Registrarse")
	private Label labelRegistrarse;
	@Id("horizontalLayout-Nick")
	private HorizontalLayout horizontalLayoutNick;
	@Id("label-Nick")
	private Label labelNick;
	@Id("textField-Nick")
	private TextField textFieldNick;
	@Id("horizontalLayout-Correo")
	private HorizontalLayout horizontalLayoutCorreo;
	@Id("label-Correo")
	private Label labelCorreo;
	@Id("textField-Correo")
	private TextField textFieldCorreo;
	@Id("horizontalLayout-Contrasena")
	private HorizontalLayout horizontalLayoutContrasena;
	@Id("label-Contrasena")
	private Label labelContrasena;
	@Id("textField-Contrasena")
	private TextField textFieldContrasena;
	@Id("horizontalLayout-FotoDePerfil")
	private HorizontalLayout horizontalLayoutFotoDePerfil;
	@Id("label-FotoDePerfil")
	private Label labelFotoDePerfil;
	@Id("textField-FotoDePerfil")
	private TextField textFieldFotoDePerfil;
	@Id("horizontalLayout-FotoDeFondo")
	private HorizontalLayout horizontalLayoutFotoDeFondo;
	@Id("label-FotoDeFondo")
	private Label labelFotoDeFondo;
	@Id("textField-FotoDeFondo")
	private TextField textFieldFotoDeFondo;
	@Id("horizontalLayout-Descripcion")
	private HorizontalLayout horizontalLayoutDescripcion;
	@Id("label-Descripcion")
	private Label labelDescripcion;
	@Id("textField-Descripcion")
	private TextField textFieldDescripcion;
	@Id("horizontalLayout-AtrasContinuar")
	private HorizontalLayout horizontalLayoutAtrasContinuar;
	@Id("verticalLayout-Atras")
	private Element verticalLayoutAtras;
	@Id("button-Atras")
	private Button buttonAtras;
	@Id("verticalLayout-Continuar")
	private Element verticalLayoutContinuar;
	@Id("button-Continuar")
	private Button buttonContinuar;

	public VistaRegistrar() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getHorizontalLayoutCompleto() {
		return horizontalLayoutCompleto;
	}

	public void setHorizontalLayoutCompleto(HorizontalLayout horizontalLayoutCompleto) {
		this.horizontalLayoutCompleto = horizontalLayoutCompleto;
	}

	public Element getVerticalLayoutPrevisualizacionFotoPerfil() {
		return verticalLayoutPrevisualizacionFotoPerfil;
	}

	public void setVerticalLayoutPrevisualizacionFotoPerfil(Element verticalLayoutPrevisualizacionFotoPerfil) {
		this.verticalLayoutPrevisualizacionFotoPerfil = verticalLayoutPrevisualizacionFotoPerfil;
	}

	public Image getImgPerfil() {
		return imgPerfil;
	}

	public void setImgPerfil(Image imgPerfil) {
		this.imgPerfil = imgPerfil;
	}

	public Label getLabelPrevisualizacionFotoPerfil() {
		return labelPrevisualizacionFotoPerfil;
	}

	public void setLabelPrevisualizacionFotoPerfil(Label labelPrevisualizacionFotoPerfil) {
		this.labelPrevisualizacionFotoPerfil = labelPrevisualizacionFotoPerfil;
	}

	public Element getVerticalLayoutFormulario() {
		return verticalLayoutFormulario;
	}

	public void setVerticalLayoutFormulario(Element verticalLayoutFormulario) {
		this.verticalLayoutFormulario = verticalLayoutFormulario;
	}

	public Label getLabelRegistrarse() {
		return labelRegistrarse;
	}

	public void setLabelRegistrarse(Label labelRegistrarse) {
		this.labelRegistrarse = labelRegistrarse;
	}

	public HorizontalLayout getHorizontalLayoutNick() {
		return horizontalLayoutNick;
	}

	public void setHorizontalLayoutNick(HorizontalLayout horizontalLayoutNick) {
		this.horizontalLayoutNick = horizontalLayoutNick;
	}

	public Label getLabelNick() {
		return labelNick;
	}

	public void setLabelNick(Label labelNick) {
		this.labelNick = labelNick;
	}

	public TextField getTextFieldNick() {
		return textFieldNick;
	}

	public void setTextFieldNick(TextField textFieldNick) {
		this.textFieldNick = textFieldNick;
	}

	public HorizontalLayout getHorizontalLayoutCorreo() {
		return horizontalLayoutCorreo;
	}

	public void setHorizontalLayoutCorreo(HorizontalLayout horizontalLayoutCorreo) {
		this.horizontalLayoutCorreo = horizontalLayoutCorreo;
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

	public HorizontalLayout getHorizontalLayoutContrasena() {
		return horizontalLayoutContrasena;
	}

	public void setHorizontalLayoutContrasena(HorizontalLayout horizontalLayoutContrasena) {
		this.horizontalLayoutContrasena = horizontalLayoutContrasena;
	}

	public Label getLabelContrasena() {
		return labelContrasena;
	}

	public void setLabelContrasena(Label labelContrasena) {
		this.labelContrasena = labelContrasena;
	}

	public TextField getTextFieldContrasena() {
		return textFieldContrasena;
	}

	public void setTextFieldContrasena(TextField textFieldContrasena) {
		this.textFieldContrasena = textFieldContrasena;
	}

	public HorizontalLayout getHorizontalLayoutFotoDePerfil() {
		return horizontalLayoutFotoDePerfil;
	}

	public void setHorizontalLayoutFotoDePerfil(HorizontalLayout horizontalLayoutFotoDePerfil) {
		this.horizontalLayoutFotoDePerfil = horizontalLayoutFotoDePerfil;
	}

	public Label getLabelFotoDePerfil() {
		return labelFotoDePerfil;
	}

	public void setLabelFotoDePerfil(Label labelFotoDePerfil) {
		this.labelFotoDePerfil = labelFotoDePerfil;
	}

	public TextField getTextFieldFotoDePerfil() {
		return textFieldFotoDePerfil;
	}

	public void setTextFieldFotoDePerfil(TextField textFieldFotoDePerfil) {
		this.textFieldFotoDePerfil = textFieldFotoDePerfil;
	}

	public HorizontalLayout getHorizontalLayoutFotoDeFondo() {
		return horizontalLayoutFotoDeFondo;
	}

	public void setHorizontalLayoutFotoDeFondo(HorizontalLayout horizontalLayoutFotoDeFondo) {
		this.horizontalLayoutFotoDeFondo = horizontalLayoutFotoDeFondo;
	}

	public Label getLabelFotoDeFondo() {
		return labelFotoDeFondo;
	}

	public void setLabelFotoDeFondo(Label labelFotoDeFondo) {
		this.labelFotoDeFondo = labelFotoDeFondo;
	}

	public TextField getTextFieldFotoDeFondo() {
		return textFieldFotoDeFondo;
	}

	public void setTextFieldFotoDeFondo(TextField textFieldFotoDeFondo) {
		this.textFieldFotoDeFondo = textFieldFotoDeFondo;
	}

	public HorizontalLayout getHorizontalLayoutDescripcion() {
		return horizontalLayoutDescripcion;
	}

	public void setHorizontalLayoutDescripcion(HorizontalLayout horizontalLayoutDescripcion) {
		this.horizontalLayoutDescripcion = horizontalLayoutDescripcion;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public TextField getTextFieldDescripcion() {
		return textFieldDescripcion;
	}

	public void setTextFieldDescripcion(TextField textFieldDescripcion) {
		this.textFieldDescripcion = textFieldDescripcion;
	}

	public HorizontalLayout getHorizontalLayoutAtrasContinuar() {
		return horizontalLayoutAtrasContinuar;
	}

	public void setHorizontalLayoutAtrasContinuar(HorizontalLayout horizontalLayoutAtrasContinuar) {
		this.horizontalLayoutAtrasContinuar = horizontalLayoutAtrasContinuar;
	}

	public Element getVerticalLayoutAtras() {
		return verticalLayoutAtras;
	}

	public void setVerticalLayoutAtras(Element verticalLayoutAtras) {
		this.verticalLayoutAtras = verticalLayoutAtras;
	}

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public Element getVerticalLayoutContinuar() {
		return verticalLayoutContinuar;
	}

	public void setVerticalLayoutContinuar(Element verticalLayoutContinuar) {
		this.verticalLayoutContinuar = verticalLayoutContinuar;
	}

	public Button getButtonContinuar() {
		return buttonContinuar;
	}

	public void setButtonContinuar(Button buttonContinuar) {
		this.buttonContinuar = buttonContinuar;
	}
	
	
	
	
	
	
	
	
	
	

}