import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';

@customElement('vista-crearcontenido')
export class VistaCrearcontenido extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
  <img style="flex-grow: 1; align-self: center;">
  <label style="flex-grow: 1; align-self: center;">Previsualización Foto</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 40%;">
  <label style="flex-grow: 1; align-self: center; margin-top: var(--lumo-space-xl);">Crear [CONTENIDO]</label>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);">Texto</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);">Foto</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);">Video</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-button style="flex-grow: 1; align-self: flex-start;" tabindex="0">
     Atrás
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-button style="flex-grow: 1; align-self: flex-end;" tabindex="0">
     Publicar
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
  <img style="flex-grow: 1;">
  <label style="flex-grow: 1; align-self: center;">Previsualización Video</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
