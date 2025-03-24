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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="verticalLayout-VentanaCompleta">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; flex-grow: 1;" id="horizontalLayout-Cabecera">
  <img style="flex-grow: 1;" id="img-Cabecera">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: flex-start; width: 100%;" id="horizontalLayout-CentroPerfil">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 10.1%; margin: var(--lumo-space-s); height: 100%;" id="verticalLayout-Bloquear">
   <img style="flex-grow: 0; height: 30%; align-self: center;" id="img-Perfil">
   <vaadin-button tabindex="0" style="flex-grow: 0; align-self: center;" id="button-Bloquear">
     Bloquear 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 0.05%;" id="verticalLayout-InformacionPerfil">
   <label id="label-Nick">Nick</label>
   <label id="label-NumSeguidores">Num Seguidores: </label>
   <label id="label-NumSeguidos">Num Seguidos:</label>
  </vaadin-vertical-layout>
  <label style="flex-grow: 1;" id="label-Descripcion">Descripción: </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-start; flex-grow: 1;" id="horizontalLayout-Bloqueo">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Bloqueo">
   <label style="flex-grow: 0; align-self: center;" id="label-Bloqueo">Este perfil te ha bloqueado.</label>
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
