package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

@Tag("vista-verlistacompletahashtagsadmin")
@JsModule("./views/vista-verlistacompletahashtagsadmin.ts")
public class VistaVerlistacompletahashtagsadmin extends LitTemplate {

    @Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("label-Hashtags")
	private Label labelHashtags;
	@Id("verticalLayout-ListaHashtags")
	private Element verticalLayoutListaHashtags;
	@Id("button-Atras")
	private Button buttonAtras;

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public VistaVerlistacompletahashtagsadmin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public Label getLabelHashtags() {
		return labelHashtags;
	}

	public void setLabelHashtags(Label labelHashtags) {
		this.labelHashtags = labelHashtags;
	}

	public Element getVerticalLayoutListaHashtags() {
		return verticalLayoutListaHashtags;
	}

	public void setVerticalLayoutListaHashtags(Element verticalLayoutListaHashtags) {
		this.verticalLayoutListaHashtags = verticalLayoutListaHashtags;
	}
	
	
	
	

}