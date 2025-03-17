package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listacontenido")
@JsModule("./views/vista-listacontenido.ts")
public class VistaListacontenido extends LitTemplate {

    @Id("vertical-listacontenido")
	private Element verticalListacontenido;
	

	public VistaListacontenido() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListacontenido() {
		return verticalListacontenido;
	}

	public void setVerticalListacontenido(Element verticalListacontenido) {
		this.verticalListacontenido = verticalListacontenido;
	}


	
	

}