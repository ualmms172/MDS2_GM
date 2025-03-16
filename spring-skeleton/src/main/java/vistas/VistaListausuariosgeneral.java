package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listausuariosgeneral")
@JsModule("./views/vista-listausuariosgeneral.ts")
public class VistaListausuariosgeneral extends LitTemplate {

    @Id("vertical-listausuariosgeneral")
	private Element verticalListausuariosgeneral;
	@Id("verticalInterno-listausuariosgeneral")
	private Element verticalInternoListausuariosgeneral;

	public VistaListausuariosgeneral() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListausuariosgeneral() {
		return verticalListausuariosgeneral;
	}

	public void setVerticalListausuariosgeneral(Element verticalListausuariosgeneral) {
		this.verticalListausuariosgeneral = verticalListausuariosgeneral;
	}

	public Element getVerticalInternoListausuariosgeneral() {
		return verticalInternoListausuariosgeneral;
	}

	public void setVerticalInternoListausuariosgeneral(Element verticalInternoListausuariosgeneral) {
		this.verticalInternoListausuariosgeneral = verticalInternoListausuariosgeneral;
	}
	
	

}