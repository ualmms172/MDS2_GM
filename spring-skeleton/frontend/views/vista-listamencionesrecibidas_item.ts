import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listamencionesrecibidas_item')
export class VistaListamencionesrecibidas_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vertical-listamencionesrecibidas_item">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontal-listamencionesrecibidas_item">
  <label style="flex-grow: 1; align-self: center;" id="label-Mencion">Label</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
