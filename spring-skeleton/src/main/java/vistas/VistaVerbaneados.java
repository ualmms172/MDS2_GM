package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

@Tag("vista-verbaneados")
@JsModule("./views/vista-verbaneados.ts")
public class VistaVerbaneados extends LitTemplate {

    @Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("label-UsuariosBaneados")
	private Label labelUsuariosBaneados;
	@Id("verticalLayout-Lista")
	private Element verticalLayoutLista;
	@Id("button-Atras")
	private Button buttonAtras;

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public VistaVerbaneados() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public Label getLabelUsuariosBaneados() {
		return labelUsuariosBaneados;
	}

	public void setLabelUsuariosBaneados(Label labelUsuariosBaneados) {
		this.labelUsuariosBaneados = labelUsuariosBaneados;
	}

	public Element getVerticalLayoutLista() {
		return verticalLayoutLista;
	}

	public void setVerticalLayoutLista(Element verticalLayoutLista) {
		this.verticalLayoutLista = verticalLayoutLista;
	}
	
	
	
	
	
	
	
	

}