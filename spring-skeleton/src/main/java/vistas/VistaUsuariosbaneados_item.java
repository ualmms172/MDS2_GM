package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

@Tag("vista-usuariosbaneados_item")
@JsModule("./views/vista-usuariosbaneados_item.ts")
public class VistaUsuariosbaneados_item extends LitTemplate {

    @Id("vertical-usuariosbaneados_item")
	private Element verticalUsuariosbaneados_item;
	@Id("img-PerfilUsuarioBaneado")
	private Image imgPerfilUsuarioBaneado;
	@Id("horizontal-usuariosbaneados_item")
	private HorizontalLayout horizontalUsuariosbaneados_item;
	@Id("button-Desbanear")
	private Button buttonDesbanear;
	@Id("label-NumSeguidores")
	private Label labelNumSeguidores;
	@Id("label-Nick")
	private Label labelNick;

	public VistaUsuariosbaneados_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalUsuariosbaneados_item() {
		return verticalUsuariosbaneados_item;
	}

	public void setVerticalUsuariosbaneados_item(Element verticalUsuariosbaneados_item) {
		this.verticalUsuariosbaneados_item = verticalUsuariosbaneados_item;
	}

	public Image getImgPerfilUsuarioBaneado() {
		return imgPerfilUsuarioBaneado;
	}

	public void setImgPerfilUsuarioBaneado(Image imgPerfilUsuarioBaneado) {
		this.imgPerfilUsuarioBaneado = imgPerfilUsuarioBaneado;
	}

	public HorizontalLayout getHorizontalUsuariosbaneados_item() {
		return horizontalUsuariosbaneados_item;
	}

	public void setHorizontalUsuariosbaneados_item(HorizontalLayout horizontalUsuariosbaneados_item) {
		this.horizontalUsuariosbaneados_item = horizontalUsuariosbaneados_item;
	}

	public Button getButtonDesbanear() {
		return buttonDesbanear;
	}

	public void setButtonDesbanear(Button buttonDesbanear) {
		this.buttonDesbanear = buttonDesbanear;
	}

	public Label getLabelNumSeguidores() {
		return labelNumSeguidores;
	}

	public void setLabelNumSeguidores(Label labelNumSeguidores) {
		this.labelNumSeguidores = labelNumSeguidores;
	}

	public Label getLabelNick() {
		return labelNick;
	}

	public void setLabelNick(Label labelNick) {
		this.labelNick = labelNick;
	}
	
	

}