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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vertical-usuariosbaneados_item">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontal-usuariosbaneados_item">
  <img style="flex-grow: 1; align-self: center;" id="img-PerfilUsuarioBaneado">
  <label style="flex-grow: 1; align-self: center;" id="label-Nick">Nick</label>
  <label style="align-self: center; flex-grow: 1;" id="label-NumSeguidores">NumSeguidores</label>
  <vaadin-button style="align-self: center; flex-grow: 1;" tabindex="0" id="button-Desbanear">
   Desbanear 
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
