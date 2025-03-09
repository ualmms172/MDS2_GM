package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

@Tag("vista-logueado")
@JsModule("./views/vista-logueado.ts")
public class VistaLogueado extends LitTemplate {

    public VistaLogueado() {
        // You can initialise any data required for the connected UI components here.
    }

}