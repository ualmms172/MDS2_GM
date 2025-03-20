import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-notificaciones')
export class VistaNotificaciones extends LitElement {
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
 <label style="align-self: center; flex-grow: 1; margin-top: var(--lumo-space-l);">Notificaciones</label>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%; height: 60%;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; margin-left: var(--lumo-space-m);">
   <label style="align-self: center;">Retweets recibidos</label>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
   <label style="align-self: center;">Seguidores obtenidos</label>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; margin-right: var(--lumo-space-m);">
   <label style="align-self: center;">Menciones</label>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 100%;"></vaadin-vertical-layout>
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
