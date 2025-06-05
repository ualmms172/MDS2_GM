package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;

@Tag("vista-crearcontenido")
@JsModule("./views/vista-crearcontenido.ts")
public class VistaCrearcontenido extends LitTemplate {

    @Id("horizontalLayout-Completo ")
	private HorizontalLayout horizontalLayoutCompleto;
	@Id("verticalLayout-PrevisualizacionFoto")
	private Element verticalLayoutPrevisualizacionFoto;
	@Id("img-Imagen")
	private Image imgImagen;
	@Id("label-PrevisualizacionFoto")
	private Label labelPrevisualizacionFoto;
	@Id("verticalLayout-CrearContenido ")
	private Element verticalLayoutCrearContenido;
	@Id("label-CrearContenido")
	private Label labelCrearContenido;
	@Id("horizontalLayout-Texto")
	private HorizontalLayout horizontalLayoutTexto;
	@Id("label-Texto")
	private Label labelTexto;
	@Id("textField-CampoTexto")
	private TextField textFieldCampoTexto;
	@Id("horizontalLayout-Foto")
	private HorizontalLayout horizontalLayoutFoto;
	@Id("label-Foto")
	private Label labelFoto;
	@Id("textField-UrlFoto")
	private TextField textFieldUrlFoto;
	@Id("horizontalLayout-Video")
	private HorizontalLayout horizontalLayoutVideo;
	@Id("label-Video")
	private Label labelVideo;
	@Id("textField-textoVideo")
	private TextField textFieldTextoVideo;
	@Id("horizontalLayout-AtrasPublicar")
	private HorizontalLayout horizontalLayoutAtrasPublicar;
	@Id("verticalLayout-Atras")
	private Element verticalLayoutAtras;
	@Id("button-Atras")
	private Button buttonAtras;
	@Id("verticalLayout-Publicar")
	private Element verticalLayoutPublicar;
	@Id("button-Publicar")
	private Button buttonPublicar;
	@Id("verticalLayout-PrevisualizacionVideo")
	private Element verticalLayoutPrevisualizacionVideo;
	@Id("label-PrevisualizacionVideo")
	private Label labelPrevisualizacionVideo;
	@Id("img-Video")
	private Div imgVideo;

	public VistaCrearcontenido() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getHorizontalLayoutCompleto() {
		return horizontalLayoutCompleto;
	}

	public void setHorizontalLayoutCompleto(HorizontalLayout horizontalLayoutCompleto) {
		this.horizontalLayoutCompleto = horizontalLayoutCompleto;
	}

	public Element getVerticalLayoutPrevisualizacionFoto() {
		return verticalLayoutPrevisualizacionFoto;
	}

	public void setVerticalLayoutPrevisualizacionFoto(Element verticalLayoutPrevisualizacionFoto) {
		this.verticalLayoutPrevisualizacionFoto = verticalLayoutPrevisualizacionFoto;
	}

	public Image getImgImagen() {
		return imgImagen;
	}

	public void setImgImagen(Image imgImagen) {
		this.imgImagen = imgImagen;
	}

	public Label getLabelPrevisualizacionFoto() {
		return labelPrevisualizacionFoto;
	}

	public void setLabelPrevisualizacionFoto(Label labelPrevisualizacionFoto) {
		this.labelPrevisualizacionFoto = labelPrevisualizacionFoto;
	}

	public Element getVerticalLayoutCrearContenido() {
		return verticalLayoutCrearContenido;
	}

	public void setVerticalLayoutCrearContenido(Element verticalLayoutCrearContenido) {
		this.verticalLayoutCrearContenido = verticalLayoutCrearContenido;
	}

	public Label getLabelCrearContenido() {
		return labelCrearContenido;
	}

	public void setLabelCrearContenido(Label labelCrearContenido) {
		this.labelCrearContenido = labelCrearContenido;
	}

	public HorizontalLayout getHorizontalLayoutTexto() {
		return horizontalLayoutTexto;
	}

	public void setHorizontalLayoutTexto(HorizontalLayout horizontalLayoutTexto) {
		this.horizontalLayoutTexto = horizontalLayoutTexto;
	}

	public Label getLabelTexto() {
		return labelTexto;
	}

	public void setLabelTexto(Label labelTexto) {
		this.labelTexto = labelTexto;
	}

	public TextField getTextFieldCampoTexto() {
		return textFieldCampoTexto;
	}

	public void setTextFieldCampoTexto(TextField textFieldCampoTexto) {
		this.textFieldCampoTexto = textFieldCampoTexto;
	}

	public HorizontalLayout getHorizontalLayoutFoto() {
		return horizontalLayoutFoto;
	}

	public void setHorizontalLayoutFoto(HorizontalLayout horizontalLayoutFoto) {
		this.horizontalLayoutFoto = horizontalLayoutFoto;
	}

	public Label getLabelFoto() {
		return labelFoto;
	}

	public void setLabelFoto(Label labelFoto) {
		this.labelFoto = labelFoto;
	}

	public TextField getTextFieldUrlFoto() {
		return textFieldUrlFoto;
	}

	public void setTextFieldUrlFoto(TextField textFieldUrlFoto) {
		this.textFieldUrlFoto = textFieldUrlFoto;
	}

	public HorizontalLayout getHorizontalLayoutVideo() {
		return horizontalLayoutVideo;
	}

	public void setHorizontalLayoutVideo(HorizontalLayout horizontalLayoutVideo) {
		this.horizontalLayoutVideo = horizontalLayoutVideo;
	}

	public Label getLabelVideo() {
		return labelVideo;
	}

	public void setLabelVideo(Label labelVideo) {
		this.labelVideo = labelVideo;
	}

	public TextField getTextFieldTextoVideo() {
		return textFieldTextoVideo;
	}

	public void setTextFieldTextoVideo(TextField textFieldTextoVideo) {
		this.textFieldTextoVideo = textFieldTextoVideo;
	}

	public HorizontalLayout getHorizontalLayoutAtrasPublicar() {
		return horizontalLayoutAtrasPublicar;
	}

	public void setHorizontalLayoutAtrasPublicar(HorizontalLayout horizontalLayoutAtrasPublicar) {
		this.horizontalLayoutAtrasPublicar = horizontalLayoutAtrasPublicar;
	}

	public Element getVerticalLayoutAtras() {
		return verticalLayoutAtras;
	}

	public void setVerticalLayoutAtras(Element verticalLayoutAtras) {
		this.verticalLayoutAtras = verticalLayoutAtras;
	}

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}

	public Element getVerticalLayoutPublicar() {
		return verticalLayoutPublicar;
	}

	public void setVerticalLayoutPublicar(Element verticalLayoutPublicar) {
		this.verticalLayoutPublicar = verticalLayoutPublicar;
	}

	public Button getButtonPublicar() {
		return buttonPublicar;
	}

	public void setButtonPublicar(Button buttonPublicar) {
		this.buttonPublicar = buttonPublicar;
	}

	public Element getVerticalLayoutPrevisualizacionVideo() {
		return verticalLayoutPrevisualizacionVideo;
	}

	public void setVerticalLayoutPrevisualizacionVideo(Element verticalLayoutPrevisualizacionVideo) {
		this.verticalLayoutPrevisualizacionVideo = verticalLayoutPrevisualizacionVideo;
	}

	public Div getImgVideo() {
		return imgVideo;
	}

	public void setImgVideo(Div imgVideo) {
		this.imgVideo = imgVideo;
	}

	public Label getLabelPrevisualizacionVideo() {
		return labelPrevisualizacionVideo;
	}

	public void setLabelPrevisualizacionVideo(Label labelPrevisualizacionVideo) {
		this.labelPrevisualizacionVideo = labelPrevisualizacionVideo;
	}
	
	
	
	
	
	

}