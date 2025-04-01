import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-verhashtaggeneral')
export class VistaVerhashtaggeneral extends LitElement {
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
 <label style="align-self: center; margin: var(--lumo-space-xl); flex-grow: 0;" id="label-Hashtag">Hashtag</label>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: center; align-items: stretch;" id="verticalLayout-ListaHashtags"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
