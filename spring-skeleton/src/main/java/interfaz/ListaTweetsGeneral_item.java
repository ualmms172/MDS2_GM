package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;

import basededatos.Tweet;

public class ListaTweetsGeneral_item extends ListaContenido_item {
	
		ListaTweetsGeneral_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		this.t=t;
		
	}

	public Tweet t;
	public ListaTweetsGeneral _listaTweetsGeneral;
	
	public Span[] Mencion() {
		
		String texto = this.getLabelCuerpoTwet().getText();
	    String[] partes = texto.split("@\\w+");

	    // Extrae el nombre mencionado usando expresión regular
	    Pattern pattern = Pattern.compile("@\\w+");
	    Matcher matcher = pattern.matcher(texto);
	    String mencion = matcher.find() ? matcher.group() : "";

	    Span spanAntes = new Span(partes.length > 0 ? partes[0] : "");
	    Span spanMencion = new Span(mencion);
	    Span spanDespues = new Span(partes.length > 1 ? partes[1] : "");

	    return new Span[] { spanAntes, spanMencion, spanDespues };

	}
	
	public Span[] Hashtag(Span[] mencion) {
		Pattern patternHashtag = Pattern.compile("#\\w+");

		if (mencion == null) {
			// Caso sin mención previa: partir texto del Label original por hashtag
			String texto = this.getLabelCuerpoTwet().getText();
			String[] partes = texto.split("#\\w+");

			Matcher matcher = patternHashtag.matcher(texto);
			String hashtag = matcher.find() ? matcher.group() : "";

			Span spanAntes = new Span(partes.length > 0 ? partes[0] : "");
			Span spanHashtag = new Span(hashtag);
			Span spanDespues = new Span(partes.length > 1 ? partes[1] : "");

			return new Span[] { spanAntes, spanHashtag, spanDespues };
		}

		// Caso con mención previa: buscar hashtag en mencion[0] o mencion[2]
		String textoAntes = mencion[0].getText();
		String textoDespues = mencion[2].getText();

		Matcher matcherAntes = patternHashtag.matcher(textoAntes);
		Matcher matcherDespues = patternHashtag.matcher(textoDespues);

		List<Span> resultado = new ArrayList<>();

		if (matcherAntes.find()) {
			int start = matcherAntes.start();
			int end = matcherAntes.end();

			String antesHashtag = textoAntes.substring(0, start);
			String hashtag = textoAntes.substring(start, end);
			String despuesHashtag = textoAntes.substring(end);

			if (!antesHashtag.isEmpty())
				resultado.add(new Span(antesHashtag));

			Span spanHashtag = new Span(hashtag);
			resultado.add(spanHashtag);

			if (!despuesHashtag.isEmpty())
				resultado.add(new Span(despuesHashtag));

			// Mantener la mención intacta en medio
			resultado.add(mencion[1]);
			resultado.add(mencion[2]);

		} else if (matcherDespues.find()) {
			int start = matcherDespues.start();
			int end = matcherDespues.end();

			String antesHashtag = textoDespues.substring(0, start);
			String hashtag = textoDespues.substring(start, end);
			String despuesHashtag = textoDespues.substring(end);

			resultado.add(mencion[0]);
			resultado.add(mencion[1]);

			if (!antesHashtag.isEmpty())
				resultado.add(new Span(antesHashtag));

			Span spanHashtag = new Span(hashtag);
			resultado.add(spanHashtag);

			if (!despuesHashtag.isEmpty())
				resultado.add(new Span(despuesHashtag));

		} else {
			// No hay hashtag, devolver la mención original completa
			return mencion;
		}

		return resultado.toArray(new Span[0]);
	}


	protected void copiarEstilos(Label label, Span destino) {
	    destino.getStyle().set("font-family", label.getStyle().get("font-family"));
	    destino.getStyle().set("font-size", label.getStyle().get("font-size"));
	    destino.getStyle().set("font-weight", label.getStyle().get("font-weight"));
	    destino.getStyle().set("color", label.getStyle().get("color"));
	    destino.getStyle().set("display", "inline");
	}

}