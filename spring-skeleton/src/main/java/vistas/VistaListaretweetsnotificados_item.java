package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listaretweetsnotificados_item")
@JsModule("./views/vista-listaretweetsnotificados_item.ts")
public class VistaListaretweetsnotificados_item extends LitTemplate {

    @Id("vertical-listaretweetsnotificados_item")
	private Element verticalListaretweetsnotificados_item;
	@Id("label-TextoRetweetNotificado")
	private Label labelTextoRetweetNotificado;
	@Id("horizontal-listaretweetsnotificados_item")
	private HorizontalLayout horizontalListaretweetsnotificados_item;

	public VistaListaretweetsnotificados_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListaretweetsnotificados_item() {
		return verticalListaretweetsnotificados_item;
	}

	public void setVerticalListaretweetsnotificados_item(Element verticalListaretweetsnotificados_item) {
		this.verticalListaretweetsnotificados_item = verticalListaretweetsnotificados_item;
	}

	public Label getLabelTextoRetweetNotificado() {
		return labelTextoRetweetNotificado;
	}

	public void setLabelTextoRetweetNotificado(Label labelTextoRetweetNotificado) {
		this.labelTextoRetweetNotificado = labelTextoRetweetNotificado;
	}

	public HorizontalLayout getHorizontalListaretweetsnotificados_item() {
		return horizontalListaretweetsnotificados_item;
	}

	public void setHorizontalListaretweetsnotificados_item(HorizontalLayout horizontalListaretweetsnotificados_item) {
		this.horizontalListaretweetsnotificados_item = horizontalListaretweetsnotificados_item;
	}
	
	
	

}