import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-listahashtagsgeneral_item')
export class VistaListahashtagsgeneral_item extends LitElement {
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
  <label style="flex-grow: 1; align-self: center; margin-left: var(--lumo-space-s);">Hashtag</label>
  <label style="flex-grow: 1; align-self: center;">Num Tweets</label>
  <label style="flex-grow: 1; align-self: center;">Creador</label>
  <vaadin-button style="flex-grow: 1; align-self: center; margin-right: var(--lumo-space-s);" tabindex="0">
   Escribir tweet
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
