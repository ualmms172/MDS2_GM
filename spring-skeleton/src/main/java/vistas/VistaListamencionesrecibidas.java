package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listamencionesrecibidas")
@JsModule("./views/vista-listamencionesrecibidas.ts")
public class VistaListamencionesrecibidas extends LitTemplate {

    @Id("vertical-listamencionesrecibidas")
	private Element verticalListamencionesrecibidas;

	public VistaListamencionesrecibidas() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListamencionesrecibidas() {
		return verticalListamencionesrecibidas;
	}

	public void setVerticalListamencionesrecibidas(Element verticalListamencionesrecibidas) {
		this.verticalListamencionesrecibidas = verticalListamencionesrecibidas;
	}

	
	

}