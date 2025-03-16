package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listahashtagsgeneral_item")
@JsModule("./views/vista-listahashtagsgeneral_item.ts")
public class VistaListahashtagsgeneral_item extends LitTemplate {

    @Id("vertical-hashtagsgeneral_item")
	private Element verticalHashtagsgeneral_item;
	@Id("button-EscribirTweet")
	private Button buttonEscribirTweet;
	@Id("label-Creador")
	private Label labelCreador;
	@Id("label-NumTweets")
	private Label labelNumTweets;
	@Id("label-Hashtag")
	private Label labelHashtag;
	@Id("horizontal-listahashtagsgeneral_item")
	private HorizontalLayout horizontalListahashtagsgeneral_item;

	public VistaListahashtagsgeneral_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalHashtagsgeneral_item() {
		return verticalHashtagsgeneral_item;
	}

	public void setVerticalHashtagsgeneral_item(Element verticalHashtagsgeneral_item) {
		this.verticalHashtagsgeneral_item = verticalHashtagsgeneral_item;
	}

	public Button getButtonEscribirTweet() {
		return buttonEscribirTweet;
	}

	public void setButtonEscribirTweet(Button buttonEscribirTweet) {
		this.buttonEscribirTweet = buttonEscribirTweet;
	}

	public Label getLabelCreador() {
		return labelCreador;
	}

	public void setLabelCreador(Label labelCreador) {
		this.labelCreador = labelCreador;
	}

	public Label getLabelNumTweets() {
		return labelNumTweets;
	}

	public void setLabelNumTweets(Label labelNumTweets) {
		this.labelNumTweets = labelNumTweets;
	}

	public Label getLabelHashtag() {
		return labelHashtag;
	}

	public void setLabelHashtag(Label labelHashtag) {
		this.labelHashtag = labelHashtag;
	}

	public HorizontalLayout getHorizontalListahashtagsgeneral_item() {
		return horizontalListahashtagsgeneral_item;
	}

	public void setHorizontalListahashtagsgeneral_item(HorizontalLayout horizontalListahashtagsgeneral_item) {
		this.horizontalListahashtagsgeneral_item = horizontalListahashtagsgeneral_item;
	}

	
	
}