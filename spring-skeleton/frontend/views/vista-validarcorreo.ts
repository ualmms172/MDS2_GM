import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-validarcorreo')
export class VistaValidarcorreo extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="verticalLayout-VentanaCompleta">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-EnviarCorreo">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: flex-end;" id="verticalLayout-TextoInformativo">
   <label id="label-Notificacion">Se le ha enviado un correo con un código de confirmación</label>
   <label style="align-self: center;" id="label-Ingreso">Ingreselo para validar su cuenta</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-CampoTexto">
  <vaadin-text-field style="flex-grow: 1; align-self: center;" type="text" id="textField-Cuenta"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="HorizontalLayout-AtrasValidar">
  <vaadin-button style="align-self: flex-start; margin-left: 80px;" tabindex="0" id="button-Atras">
    Atrás 
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Central"></vaadin-vertical-layout>
  <vaadin-button style="align-self: flex-start; margin-right: 80px;" tabindex="0" id="button-Validar">
    Validar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
