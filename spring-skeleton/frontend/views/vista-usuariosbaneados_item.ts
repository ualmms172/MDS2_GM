import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-usuariosbaneados_item')
export class VistaUsuariosbaneados_item extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
  <img style="flex-grow: 1; align-self: center;">
  <label style="flex-grow: 1; align-self: center;">Nick</label>
  <label style="align-self: center; flex-grow: 1;">NumSeguidores</label>
  <vaadin-button style="align-self: center; flex-grow: 1;" tabindex="0">
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
