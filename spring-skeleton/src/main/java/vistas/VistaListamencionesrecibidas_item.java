package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listamencionesrecibidas_item")
@JsModule("./views/vista-listamencionesrecibidas_item.ts")
public class VistaListamencionesrecibidas_item extends LitTemplate {

    @Id("vertical-listamencionesrecibidas_item")
	private Element verticalListamencionesrecibidas_item;
	@Id("label-Mencion")
	private Label labelMencion;
	@Id("horizontal-listamencionesrecibidas_item")
	private HorizontalLayout horizontalListamencionesrecibidas_item;

	public VistaListamencionesrecibidas_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListamencionesrecibidas_item() {
		return verticalListamencionesrecibidas_item;
	}

	public void setVerticalListamencionesrecibidas_item(Element verticalListamencionesrecibidas_item) {
		this.verticalListamencionesrecibidas_item = verticalListamencionesrecibidas_item;
	}

	public Label getLabelMencion() {
		return labelMencion;
	}

	public void setLabelMencion(Label labelMencion) {
		this.labelMencion = labelMencion;
	}

	public HorizontalLayout getHorizontalListamencionesrecibidas_item() {
		return horizontalListamencionesrecibidas_item;
	}

	public void setHorizontalListamencionesrecibidas_item(HorizontalLayout horizontalListamencionesrecibidas_item) {
		this.horizontalListamencionesrecibidas_item = horizontalListamencionesrecibidas_item;
	}
	
	

}