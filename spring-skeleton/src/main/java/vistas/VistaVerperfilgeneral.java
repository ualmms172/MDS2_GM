package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

@Tag("vista-verperfilgeneral")
@JsModule("./views/vista-verperfilgeneral.ts")
public class VistaVerperfilgeneral extends LitTemplate {

    @Id("button-Bloquear")
	private Button buttonBloquear;
	@Id("img-Perfil")
	private Image imgPerfil;
	@Id("verticalLayout-Opciones")
	private Element verticalLayoutOpciones;
	@Id("horizontalLayout-PerfilCentral")
	private HorizontalLayout horizontalLayoutPerfilCentral;
	@Id("img-Cabecera")
	private Image imgCabecera;
	@Id("horizontalLayout-Cabecera")
	private HorizontalLayout horizontalLayoutCabecera;
	@Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("button-ModidicarDatos")
	private Button buttonModidicarDatos;
	@Id("button-EliminarCuenta")
	private Button buttonEliminarCuenta;
	@Id("button-Banear")
	private Button buttonBanear;
	@Id("verticalLayout-PerfilCentral")
	private Element verticalLayoutPerfilCentral;
	@Id("label-Nick")
	private Label labelNick;
	@Id("button-Seguir")
	private Button buttonSeguir;
	@Id("label-NumSeguidores")
	private Label labelNumSeguidores;
	@Id("label-NumSeguidos")
	private Label labelNumSeguidos;
	@Id("label-Descripcion")
	private Label labelDescripcion;
	@Id("horizontalLayout-Inferior")
	private HorizontalLayout horizontalLayoutInferior;
	@Id("verticalLayout-Inferior")
	private Element verticalLayoutInferior;

	public VistaVerperfilgeneral() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getButtonBloquear() {
		return buttonBloquear;
	}

	public void setButtonBloquear(Button buttonBloquear) {
		this.buttonBloquear = buttonBloquear;
	}

	public Image getImgPerfil() {
		return imgPerfil;
	}

	public void setImgPerfil(Image imgPerfil) {
		this.imgPerfil = imgPerfil;
	}

	public Element getVerticalLayoutOpciones() {
		return verticalLayoutOpciones;
	}

	public void setVerticalLayoutOpciones(Element verticalLayoutOpciones) {
		this.verticalLayoutOpciones = verticalLayoutOpciones;
	}

	public HorizontalLayout getHorizontalLayoutPerfilCentral() {
		return horizontalLayoutPerfilCentral;
	}

	public void setHorizontalLayoutPerfilCentral(HorizontalLayout horizontalLayoutPerfilCentral) {
		this.horizontalLayoutPerfilCentral = horizontalLayoutPerfilCentral;
	}

	public Image getImgCabecera() {
		return imgCabecera;
	}

	public void setImgCabecera(Image imgCabecera) {
		this.imgCabecera = imgCabecera;
	}

	public HorizontalLayout getHorizontalLayoutCabecera() {
		return horizontalLayoutCabecera;
	}

	public void setHorizontalLayoutCabecera(HorizontalLayout horizontalLayoutCabecera) {
		this.horizontalLayoutCabecera = horizontalLayoutCabecera;
	}

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public Button getButtonModidicarDatos() {
		return buttonModidicarDatos;
	}

	public void setButtonModidicarDatos(Button buttonModidicarDatos) {
		this.buttonModidicarDatos = buttonModidicarDatos;
	}

	public Button getButtonEliminarCuenta() {
		return buttonEliminarCuenta;
	}

	public void setButtonEliminarCuenta(Button buttonEliminarCuenta) {
		this.buttonEliminarCuenta = buttonEliminarCuenta;
	}

	public Button getButtonBanear() {
		return buttonBanear;
	}

	public void setButtonBanear(Button buttonBanear) {
		this.buttonBanear = buttonBanear;
	}

	public Element getVerticalLayoutPerfilCentral() {
		return verticalLayoutPerfilCentral;
	}

	public void setVerticalLayoutPerfilCentral(Element verticalLayoutPerfilCentral) {
		this.verticalLayoutPerfilCentral = verticalLayoutPerfilCentral;
	}

	public Label getLabelNick() {
		return labelNick;
	}

	public void setLabelNick(Label labelNick) {
		this.labelNick = labelNick;
	}

	public Button getButtonSeguir() {
		return buttonSeguir;
	}

	public void setButtonSeguir(Button buttonSeguir) {
		this.buttonSeguir = buttonSeguir;
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

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public HorizontalLayout getHorizontalLayoutInferior() {
		return horizontalLayoutInferior;
	}

	public void setHorizontalLayoutInferior(HorizontalLayout horizontalLayoutInferior) {
		this.horizontalLayoutInferior = horizontalLayoutInferior;
	}

	public Element getVerticalLayoutInferior() {
		return verticalLayoutInferior;
	}

	public void setVerticalLayoutInferior(Element verticalLayoutInferior) {
		this.verticalLayoutInferior = verticalLayoutInferior;
	}
	
	
	
	
	
	
	
	
	
	

}