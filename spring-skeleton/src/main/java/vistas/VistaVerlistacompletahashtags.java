package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-verlistacompletahashtags")
@JsModule("./views/vista-verlistacompletahashtags.ts")
public class VistaVerlistacompletahashtags extends LitTemplate {

    @Id("verticalLayout-ListaHashtags")
	private Element verticalLayoutListaHashtags;
	@Id("label-Hashtags")
	private Label labelHashtags;
	@Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("button-Atras")
	private Button buttonAtras;

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public VistaVerlistacompletahashtags() {
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