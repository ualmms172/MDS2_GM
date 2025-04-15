package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-notificaciones")
@JsModule("./views/vista-notificaciones.ts")
public class VistaNotificaciones extends LitTemplate {

    @Id("verticalLayout-RetweetsRecibidos1")
	private Element verticalLayoutRetweetsRecibidos1;
	@Id("label-RetweetsRecibidos")
	private Label labelRetweetsRecibidos;
	@Id("verticalLayout-RetweetsRecibidos")
	private Element verticalLayoutRetweetsRecibidos;
	@Id("horizontalLayout-CajasNotificaciones")
	private HorizontalLayout horizontalLayoutCajasNotificaciones;
	@Id("label-Notificaciones")
	private Label labelNotificaciones;
	@Id("verticalLayout-Notificaciones")
	private Element verticalLayoutNotificaciones;
	@Id("verticalLayout-SeguidoresObtenidos")
	private Element verticalLayoutSeguidoresObtenidos;
	@Id("label-SeguidoresObtenidos")
	private Label labelSeguidoresObtenidos;
	@Id("verticalLayout-CajaSeguidoresObtenidos")
	private Element verticalLayoutCajaSeguidoresObtenidos;
	@Id("verticalLayout-Menciones")
	private Element verticalLayoutMenciones;
	@Id("label-Menciones")
	private Label labelMenciones;
	@Id("verticalLayout-CajaMenciones")
	private Element verticalLayoutCajaMenciones;
	@Id("button-Atras")
	private Button buttonAtras;

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutRetweetsRecibidos1() {
		return verticalLayoutRetweetsRecibidos1;
	}

	public void setVerticalLayoutRetweetsRecibidos1(Element verticalLayoutRetweetsRecibidos1) {
		this.verticalLayoutRetweetsRecibidos1 = verticalLayoutRetweetsRecibidos1;
	}

	public Label getLabelRetweetsRecibidos() {
		return labelRetweetsRecibidos;
	}

	public void setLabelRetweetsRecibidos(Label labelRetweetsRecibidos) {
		this.labelRetweetsRecibidos = labelRetweetsRecibidos;
	}

	public Element getVerticalLayoutRetweetsRecibidos() {
		return verticalLayoutRetweetsRecibidos;
	}

	public void setVerticalLayoutRetweetsRecibidos(Element verticalLayoutRetweetsRecibidos) {
		this.verticalLayoutRetweetsRecibidos = verticalLayoutRetweetsRecibidos;
	}

	public HorizontalLayout getHorizontalLayoutCajasNotificaciones() {
		return horizontalLayoutCajasNotificaciones;
	}

	public void setHorizontalLayoutCajasNotificaciones(HorizontalLayout horizontalLayoutCajasNotificaciones) {
		this.horizontalLayoutCajasNotificaciones = horizontalLayoutCajasNotificaciones;
	}

	public Label getLabelNotificaciones() {
		return labelNotificaciones;
	}

	public void setLabelNotificaciones(Label labelNotificaciones) {
		this.labelNotificaciones = labelNotificaciones;
	}

	public Element getVerticalLayoutNotificaciones() {
		return verticalLayoutNotificaciones;
	}

	public void setVerticalLayoutNotificaciones(Element verticalLayoutNotificaciones) {
		this.verticalLayoutNotificaciones = verticalLayoutNotificaciones;
	}

	public Element getVerticalLayoutSeguidoresObtenidos() {
		return verticalLayoutSeguidoresObtenidos;
	}

	public void setVerticalLayoutSeguidoresObtenidos(Element verticalLayoutSeguidoresObtenidos) {
		this.verticalLayoutSeguidoresObtenidos = verticalLayoutSeguidoresObtenidos;
	}

	public Label getLabelSeguidoresObtenidos() {
		return labelSeguidoresObtenidos;
	}

	public void setLabelSeguidoresObtenidos(Label labelSeguidoresObtenidos) {
		this.labelSeguidoresObtenidos = labelSeguidoresObtenidos;
	}

	public Element getVerticalLayoutCajaSeguidoresObtenidos() {
		return verticalLayoutCajaSeguidoresObtenidos;
	}

	public void setVerticalLayoutCajaSeguidoresObtenidos(Element verticalLayoutCajaSeguidoresObtenidos) {
		this.verticalLayoutCajaSeguidoresObtenidos = verticalLayoutCajaSeguidoresObtenidos;
	}

	public Element getVerticalLayoutMenciones() {
		return verticalLayoutMenciones;
	}

	public void setVerticalLayoutMenciones(Element verticalLayoutMenciones) {
		this.verticalLayoutMenciones = verticalLayoutMenciones;
	}

	public Label getLabelMenciones() {
		return labelMenciones;
	}

	public void setLabelMenciones(Label labelMenciones) {
		this.labelMenciones = labelMenciones;
	}

	public Element getVerticalLayoutCajaMenciones() {
		return verticalLayoutCajaMenciones;
	}

	public void setVerticalLayoutCajaMenciones(Element verticalLayoutCajaMenciones) {
		this.verticalLayoutCajaMenciones = verticalLayoutCajaMenciones;
	}
	
	

}