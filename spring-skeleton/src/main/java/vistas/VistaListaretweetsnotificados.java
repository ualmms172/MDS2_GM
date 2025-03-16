package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listaretweetsnotificados")
@JsModule("./views/vista-listaretweetsnotificados.ts")
public class VistaListaretweetsnotificados extends LitTemplate {

    @Id("vertical-listaretweetsnotificados")
	private Element verticalListaretweetsnotificados;
	@Id("verticalInterno-listaretweetsnotificados")
	private Element verticalInternoListaretweetsnotificados;

	public VistaListaretweetsnotificados() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListaretweetsnotificados() {
		return verticalListaretweetsnotificados;
	}

	public void setVerticalListaretweetsnotificados(Element verticalListaretweetsnotificados) {
		this.verticalListaretweetsnotificados = verticalListaretweetsnotificados;
	}

	public Element getVerticalInternoListaretweetsnotificados() {
		return verticalInternoListaretweetsnotificados;
	}

	public void setVerticalInternoListaretweetsnotificados(Element verticalInternoListaretweetsnotificados) {
		this.verticalInternoListaretweetsnotificados = verticalInternoListaretweetsnotificados;
	}
	
	

}