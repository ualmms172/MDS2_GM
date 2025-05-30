package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;

import basededatos.Tweet;

public class ListaTweetsGeneral_item extends ListaContenido_item {
	
		ListaTweetsGeneral_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		this.t=t;
		
		if(!t.mencionaA.isEmpty()) 
			Mencion();
		
		if(!t.contiene.isEmpty())
			Hashtag();
		
		// TODO Auto-generated constructor stub
	}

	//private Button _accederATweet;
	public Tweet t;
	public ListaTweetsGeneral _listaTweetsGeneral;
	
	public void Mencion() {
		Label labelOriginal = this.getLabelCuerpoTwet();
	    String texto = labelOriginal.getText();

	    int indexAt = texto.indexOf('@');
	    int indexEspacio = texto.indexOf(' ', indexAt);
	    if (indexEspacio == -1) {
	        indexEspacio = texto.length();
	    }

	    String antes = texto.substring(0, indexAt);
	    String mencion = texto.substring(indexAt, indexEspacio);
	    String despues = texto.substring(indexEspacio);

	    // Crear el nuevo Span que reemplazará visualmente al Label
	    Span nuevoSpan = new Span();

	    // Copiar estilos visuales si el Label tiene alguno
	    nuevoSpan.getStyle().set("font-family", labelOriginal.getStyle().get("font-family"));
	    nuevoSpan.getStyle().set("font-size", labelOriginal.getStyle().get("font-size"));
	    nuevoSpan.getStyle().set("font-weight", labelOriginal.getStyle().get("font-weight"));
	    nuevoSpan.getStyle().set("color", labelOriginal.getStyle().get("color"));
	    nuevoSpan.getStyle().set("display", "inline");

	    // Construir el texto con partes
	    Span spanAntes = new Span(antes);
	    Span spanMencion = new Span(mencion);
	    spanMencion.getStyle().set("color", "blue");
	    spanMencion.getStyle().set("cursor", "pointer");
	    spanMencion.getElement().addEventListener("click", e -> {
	        System.out.println("Click en mención: " + mencion);
	        // Puedes usar UI.getCurrent().navigate(...) si quieres navegar
	    });
	    Span spanDespues = new Span(despues);

	    nuevoSpan.add(spanAntes, spanMencion, spanDespues);

	    // Reemplazar el Label por el nuevo Span en su padre
	    this.getHorizontalLayoutCuerpoTweet().removeAll();
	    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
	}
	
	public void Hashtag() {
	    Component contenido = this.getHorizontalLayoutCuerpoTweet().getComponentAt(0);

	    String texto;
	    if (contenido instanceof Label) {
	        texto = ((Label) contenido).getText();
	    } else if (contenido instanceof Span) {
	        texto = ((Span) contenido).getText(); // Recupera el texto combinado del span
	    } else {
	        return; // No es ni Label ni Span, salimos
	    }

	    int indexHash = texto.indexOf('#');
	    if (indexHash == -1) {
	        return; // No hay hashtag
	    }

	    int indexEspacio = texto.indexOf(' ', indexHash);
	    if (indexEspacio == -1) {
	        indexEspacio = texto.length();
	    }

	    String antes = texto.substring(0, indexHash);
	    String hashtag = texto.substring(indexHash, indexEspacio);
	    String despues = texto.substring(indexEspacio);

	    // Crear nuevo span con hashtag clickeable
	    Span nuevoSpan = new Span();
	    nuevoSpan.getStyle().set("display", "inline");

	    Span spanAntes = new Span(antes);
	    Span spanHashtag = new Span(hashtag);
	    spanHashtag.getStyle().set("color", "green");
	    spanHashtag.getStyle().set("cursor", "pointer");
	    spanHashtag.getElement().addEventListener("click", e -> {
	        System.out.println("Click en hashtag: " + hashtag);
	        // UI.getCurrent().navigate("hashtag/" + hashtag.substring(1));
	    });
	    Span spanDespues = new Span(despues);

	    nuevoSpan.add(spanAntes, spanHashtag, spanDespues);

	    // Reemplazar en el layout
	    this.getHorizontalLayoutCuerpoTweet().removeAll();
	    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
	}


}