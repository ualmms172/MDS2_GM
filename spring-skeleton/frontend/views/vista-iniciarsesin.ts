import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-iniciarsesin')
export class VistaIniciarsesin extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;">
  <label style="align-self: center;">Iniciar Sesión</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;">
  <label>Correo/Nick</label>
  <vaadin-text-field type="text"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;">
  <label>Contraseña</label>
  <vaadin-text-field type="text"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1;">
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;">
   <label>¿Has olvidado tu contraseña? Recuperala aquí: </label>
   <vaadin-button tabindex="0">
    Recuperar contraseña
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;">
   <label style="align-self: flex-start;">o</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;">
   <vaadin-button style="align-self: flex-start;" tabindex="0">
    Iniciar con Google
   </vaadin-button>
   <img>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;">
  <vaadin-button tabindex="0">
   Atras
  </vaadin-button>
  <vaadin-button style="margin-left: 400px;" tabindex="0">
   Continuar
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
