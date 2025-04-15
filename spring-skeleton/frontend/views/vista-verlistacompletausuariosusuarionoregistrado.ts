import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verlistacompletausuariosusuarionoregistrado')
export class VistaVerlistacompletausuariosusuarionoregistrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute;" id="verticalLayout-VentanaCompleta">
 <vaadin-button style="margin-top: var(--lumo-space-l); margin-left: var(--lumo-space-l);">
  Atras
 </vaadin-button>
 <label style="align-self: center; margin: var(--lumo-space-xl);" id="label-Usuarios">Usuarios</label>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 80%; align-items: stretch;" id="verticalLayout-ListaUsuarios"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
