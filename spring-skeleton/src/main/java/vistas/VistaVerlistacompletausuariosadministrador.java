package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

@Tag("vista-verlistacompletausuariosadministrador")
@JsModule("./views/vista-verlistacompletausuariosadministrador.ts")
public class VistaVerlistacompletausuariosadministrador extends LitTemplate {

    @Id("verticalLayout-VentanaCompleta")
	private Element verticalLayoutVentanaCompleta;
	@Id("label-Usuarios")
	private Label labelUsuarios;
	@Id("verticalLayout-ListaUsuarios")
	private Element verticalLayoutListaUsuarios;

	public VistaVerlistacompletausuariosadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayoutVentanaCompleta() {
		return verticalLayoutVentanaCompleta;
	}

	public void setVerticalLayoutVentanaCompleta(Element verticalLayoutVentanaCompleta) {
		this.verticalLayoutVentanaCompleta = verticalLayoutVentanaCompleta;
	}

	public Label getLabelUsuarios() {
		return labelUsuarios;
	}

	public void setLabelUsuarios(Label labelUsuarios) {
		this.labelUsuarios = labelUsuarios;
	}

	public Element getVerticalLayoutListaUsuarios() {
		return verticalLayoutListaUsuarios;
	}

	public void setVerticalLayoutListaUsuarios(Element verticalLayoutListaUsuarios) {
		this.verticalLayoutListaUsuarios = verticalLayoutListaUsuarios;
	}
	
	
	
	
	

}