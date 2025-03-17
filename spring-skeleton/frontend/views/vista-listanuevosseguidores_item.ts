import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-listanuevosseguidores_item')
export class VistaListanuevosseguidores_item extends LitElement {
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
<vaadin-vertical-layout id="vertical-listanuevosseguidores_item">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontal-listanuevosseguidores_item">
  <label style="flex-grow: 1; align-self: center;" id="Label-TextoSeguir">Label</label>
  <vaadin-button style="flex-grow: 1; align-self: center;" id="button-Seguir/NoSeguir" tabindex="0">
    Button 
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
