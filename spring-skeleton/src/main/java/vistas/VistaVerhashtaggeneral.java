package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

@Tag("vista-verhashtaggeneral")
@JsModule("./views/vista-verhashtaggeneral.ts")
public class VistaVerhashtaggeneral extends LitTemplate {

    @Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("label-Hashtag")
	private Label labelHashtag;
	@Id("verticalLayout-ListaHashtags")
	private Element verticalLayoutListaHashtags;

	public VistaVerhashtaggeneral() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public Label getLabelHashtag() {
		return labelHashtag;
	}

	public void setLabelHashtag(Label labelHashtag) {
		this.labelHashtag = labelHashtag;
	}

	public Element getVerticalLayoutListaHashtags() {
		return verticalLayoutListaHashtags;
	}

	public void setVerticalLayoutListaHashtags(Element verticalLayoutListaHashtags) {
		this.verticalLayoutListaHashtags = verticalLayoutListaHashtags;
	}

	
	
	
	
	
	
}