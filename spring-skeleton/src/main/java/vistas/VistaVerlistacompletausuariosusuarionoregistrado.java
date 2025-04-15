package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-verlistacompletausuariosusuarionoregistrado")
@JsModule("./views/vista-verlistacompletausuariosusuarionoregistrado.ts")
public class VistaVerlistacompletausuariosusuarionoregistrado extends LitTemplate {

    @Id("verticalLayout-ListaUsuarios")
	private Element verticalLayoutListaUsuarios;
	@Id("label-Usuarios")
	private Label labelUsuarios;
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

	public VistaVerlistacompletausuariosusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutListaUsuarios() {
		return verticalLayoutListaUsuarios;
	}

	public void setVerticalLayoutListaUsuarios(Element verticalLayoutListaUsuarios) {
		this.verticalLayoutListaUsuarios = verticalLayoutListaUsuarios;
	}

	public Label getLabelUsuarios() {
		return labelUsuarios;
	}

	public void setLabelUsuarios(Label labelUsuarios) {
		this.labelUsuarios = labelUsuarios;
	}

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}
	
	
	
	
	
	

}