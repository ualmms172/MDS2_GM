package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listahashtagsgeneral")
@JsModule("./views/vista-listahashtagsgeneral.ts")
public class VistaListahashtagsgeneral extends LitTemplate {

    @Id("vertical-listahastagsgeneral")
	private Element verticalListahastagsgeneral;

	public VistaListahashtagsgeneral() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListahastagsgeneral() {
		return verticalListahastagsgeneral;
	}

	public void setVerticalListahastagsgeneral(Element verticalListahastagsgeneral) {
		this.verticalListahastagsgeneral = verticalListahastagsgeneral;
	}

	
	

}