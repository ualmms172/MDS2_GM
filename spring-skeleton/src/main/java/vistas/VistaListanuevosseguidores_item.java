package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listanuevosseguidores_item")
@JsModule("./views/vista-listanuevosseguidores_item.ts")
public class VistaListanuevosseguidores_item extends LitTemplate {

    @Id("vertical-listanuevosseguidores_item")
	private Element verticalListanuevosseguidores_item;
	@Id("horizontal-listanuevosseguidores_item")
	private HorizontalLayout horizontalListanuevosseguidores_item;
	@Id("Label-TextoSeguir")
	private Label labelTextoSeguir;
	@Id("button-Seguir/NoSeguir")
	private Button buttonSeguir_NoSeguir;

	public VistaListanuevosseguidores_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalListanuevosseguidores_item() {
		return verticalListanuevosseguidores_item;
	}

	public void setVerticalListanuevosseguidores_item(Element verticalListanuevosseguidores_item) {
		this.verticalListanuevosseguidores_item = verticalListanuevosseguidores_item;
	}

	public HorizontalLayout getHorizontalListanuevosseguidores_item() {
		return horizontalListanuevosseguidores_item;
	}

	public void setHorizontalListanuevosseguidores_item(HorizontalLayout horizontalListanuevosseguidores_item) {
		this.horizontalListanuevosseguidores_item = horizontalListanuevosseguidores_item;
	}

	public Label getLabelTextoSeguir() {
		return labelTextoSeguir;
	}

	public void setLabelTextoSeguir(Label labelTextoSeguir) {
		this.labelTextoSeguir = labelTextoSeguir;
	}

	public Button getButtonSeguir_NoSeguir() {
		return buttonSeguir_NoSeguir;
	}

	public void setButtonSeguir_NoSeguir(Button buttonSeguir_NoSeguir) {
		this.buttonSeguir_NoSeguir = buttonSeguir_NoSeguir;
	}
	
	

}