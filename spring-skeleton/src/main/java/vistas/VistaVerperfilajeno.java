package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

@Tag("vista-verperfilajeno")
@JsModule("./views/vista-verperfilajeno.ts")
public class VistaVerperfilajeno extends LitTemplate {

    @Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("verticalLayout-Bloqueo")
	private Element verticalLayoutBloqueo;
	@Id("horizontalLayout-Bloqueo")
	private HorizontalLayout horizontalLayoutBloqueo;
	@Id("label-Descripcion")
	private Label labelDescripcion;
	@Id("label-NumSeguidos")
	private Label labelNumSeguidos;
	@Id("label-NumSeguidores")
	private Label labelNumSeguidores;
	@Id("label-Nick")
	private Label labelNick;
	@Id("verticalLayout-InformacionPerfil")
	private Element verticalLayoutInformacionPerfil;
	@Id("img-Perfil")
	private Image imgPerfil;
	@Id("verticalLayout-Bloquear")
	private Element verticalLayoutBloquear;
	@Id("horizontalLayout-CentroPerfil")
	private HorizontalLayout horizontalLayoutCentroPerfil;
	@Id("img-Cabecera")
	private Image imgCabecera;
	@Id("horizontalLayout-Cabecera")
	private HorizontalLayout horizontalLayoutCabecera;
	@Id("label-Bloqueo")
	private Label labelBloqueo;
	@Id("button-Bloquear")
	private Button buttonBloquear;

	public VistaVerperfilajeno() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public Element getVerticalLayoutBloqueo() {
		return verticalLayoutBloqueo;
	}

	public void setVerticalLayoutBloqueo(Element verticalLayoutBloqueo) {
		this.verticalLayoutBloqueo = verticalLayoutBloqueo;
	}

	public HorizontalLayout getHorizontalLayoutBloqueo() {
		return horizontalLayoutBloqueo;
	}

	public void setHorizontalLayoutBloqueo(HorizontalLayout horizontalLayoutBloqueo) {
		this.horizontalLayoutBloqueo = horizontalLayoutBloqueo;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public Label getLabelNumSeguidos() {
		return labelNumSeguidos;
	}

	public void setLabelNumSeguidos(Label labelNumSeguidos) {
		this.labelNumSeguidos = labelNumSeguidos;
	}

	public Label getLabelNumSeguidores() {
		return labelNumSeguidores;
	}

	public void setLabelNumSeguidores(Label labelNumSeguidores) {
		this.labelNumSeguidores = labelNumSeguidores;
	}

	public Label getLabelNick() {
		return labelNick;
	}

	public void setLabelNick(Label labelNick) {
		this.labelNick = labelNick;
	}

	public Element getVerticalLayoutInformacionPerfil() {
		return verticalLayoutInformacionPerfil;
	}

	public void setVerticalLayoutInformacionPerfil(Element verticalLayoutInformacionPerfil) {
		this.verticalLayoutInformacionPerfil = verticalLayoutInformacionPerfil;
	}

	public Image getImgPerfil() {
		return imgPerfil;
	}

	public void setImgPerfil(Image imgPerfil) {
		this.imgPerfil = imgPerfil;
	}

	public Element getVerticalLayoutBloquear() {
		return verticalLayoutBloquear;
	}

	public void setVerticalLayoutBloquear(Element verticalLayoutBloquear) {
		this.verticalLayoutBloquear = verticalLayoutBloquear;
	}

	public HorizontalLayout getHorizontalLayoutCentroPerfil() {
		return horizontalLayoutCentroPerfil;
	}

	public void setHorizontalLayoutCentroPerfil(HorizontalLayout horizontalLayoutCentroPerfil) {
		this.horizontalLayoutCentroPerfil = horizontalLayoutCentroPerfil;
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

	public Label getLabelBloqueo() {
		return labelBloqueo;
	}

	public void setLabelBloqueo(Label labelBloqueo) {
		this.labelBloqueo = labelBloqueo;
	}

	public Button getButtonBloquear() {
		return buttonBloquear;
	}

	public void setButtonBloquear(Button buttonBloquear) {
		this.buttonBloquear = buttonBloquear;
	}
	
	
	
	
	
	
	
	

}