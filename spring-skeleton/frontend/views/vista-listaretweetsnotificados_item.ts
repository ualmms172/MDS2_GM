import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listaretweetsnotificados_item')
export class VistaListaretweetsnotificados_item extends LitElement {
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
<vaadin-vertical-layout id="vertical-listaretweetsnotificados_item">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontal-listaretweetsnotificados_item">
  <label style="flex-grow: 1; align-self: center;" id="label-TextoRetweetNotificado">Label</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
