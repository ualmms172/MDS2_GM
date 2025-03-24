import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-eliminarpropiacuenta')
export class VistaEliminarpropiacuenta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="verticalLayout-Principal">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; align-self: center;" id="horizontalLayout-Aviso">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="verticalLayout-Aviso">
   <label style="flex-grow: 1; align-self: center;" id="label-Aviso">¿Estas seguro de que quieres eliminar tu cuenta?</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1;" id="horizontalLayout-Motivo">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Motivo">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-Motivo1">
    <label style="flex-grow: 1; margin-right: var(--lumo-space-xl);" id="label-Motivo">Motivo</label>
    <vaadin-text-field style="flex-grow: 1; margin-left: var(--lumo-space-xl);" type="text" id="textField-Motivo"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontalLayout-AtrasEliminar">
  <vaadin-button style="align-self: center; margin-bottom: var(--lumo-space-xl);margin-left: 200px; flex-grow: 0;" tabindex="0" id="button-Atras">
    Atras 
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-centro"></vaadin-vertical-layout>
  <vaadin-button style="margin-right:  200px; margin-bottom: var(--lumo-space-xl); align-self: center;" tabindex="0" id="button-Eliminar">
    Eliminar 
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
