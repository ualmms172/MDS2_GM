package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-verlistacompletahashtagusuarioregistrado")
@JsModule("./views/vista-verlistacompletahashtagusuarioregistrado.ts")
public class VistaVerlistacompletahashtagusuarioregistrado extends LitTemplate {

    @Id("verticalLayout-ListaHashtags")
	private Element verticalLayoutListaHashtags;
	@Id("label-Hashtags")
	private Label labelHashtags;
	@Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;

	public VistaVerlistacompletahashtagusuarioregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutListaHashtags() {
		return verticalLayoutListaHashtags;
	}

	public void setVerticalLayoutListaHashtags(Element verticalLayoutListaHashtags) {
		this.verticalLayoutListaHashtags = verticalLayoutListaHashtags;
	}

	public Label getLabelHashtags() {
		return labelHashtags;
	}

	public void setLabelHashtags(Label labelHashtags) {
		this.labelHashtags = labelHashtags;
	}

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	
	
	
	
}