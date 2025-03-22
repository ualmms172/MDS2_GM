import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-verperfilajeno')
export class VistaVerperfilajeno extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; flex-grow: 1;">
  <img style="flex-grow: 1;">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: flex-start; width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 10.1%; margin: var(--lumo-space-s); height: 100%;">
   <img style="flex-grow: 0; height: 30%; align-self: center;">
   <vaadin-button tabindex="0" style="flex-grow: 0; align-self: center;">
     Bloquear 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 0.05%;">
   <label>Nick</label>
   <label>Num Seguidores: </label>
   <label>Num Seguidos:</label>
  </vaadin-vertical-layout>
  <label style="flex-grow: 1;">Descripción: </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-start; flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
   <label style="flex-grow: 0; align-self: center;">Este perfil te ha bloqueado.</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
