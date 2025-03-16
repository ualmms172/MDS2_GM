package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listanuevosseguidores")
@JsModule("./views/vista-listanuevosseguidores.ts")
public class VistaListanuevosseguidores extends LitTemplate {

    @Id("vertical-listanuevoseguidores")
	private Element verticalListanuevoseguidores;
	@Id("verticalInterno-listanuevoseguidores")
	private Element verticalInternoListanuevoseguidores;

	public VistaListanuevosseguidores() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListanuevoseguidores() {
		return verticalListanuevoseguidores;
	}

	public void setVerticalListanuevoseguidores(Element verticalListanuevoseguidores) {
		this.verticalListanuevoseguidores = verticalListanuevoseguidores;
	}

	public Element getVerticalInternoListanuevoseguidores() {
		return verticalInternoListanuevoseguidores;
	}

	public void setVerticalInternoListanuevoseguidores(Element verticalInternoListanuevoseguidores) {
		this.verticalInternoListanuevoseguidores = verticalInternoListanuevoseguidores;
	}
	
	

}