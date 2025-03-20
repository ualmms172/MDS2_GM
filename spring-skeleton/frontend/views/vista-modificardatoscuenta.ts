import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-modificardatoscuenta')
export class VistaModificardatoscuenta extends LitElement {
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
  <label style="flex-grow: 1; align-self: center;"> Previsualización Foto Perfil</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 40%;">
  <label style="flex-grow: 1; align-self: center; margin-top: var(--lumo-space-xl);">Cambiar datos</label>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);">Nick</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: 74px;" type="text"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);">Foto de perfil</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: 10px;" type="text"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);">Foto de Fondo</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1; width: 100%;">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);">Descripción </label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: 20px;" type="text"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-button style="flex-grow: 1; align-self: flex-start;" tabindex="0">
      Atrás 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-button style="flex-grow: 1; align-self: flex-end;" tabindex="0">
     Modificar
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
