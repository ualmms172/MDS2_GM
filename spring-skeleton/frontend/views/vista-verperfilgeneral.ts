import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verperfilgeneral')
export class VistaVerperfilgeneral extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute;" id="verticalLayout-VentanaCompleta">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; flex-grow: 1;" id="horizontalLayout-Cabecera">
  <img style="flex-grow: 1;" id="img-Cabecera">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: flex-start; width: 100%;" id="horizontalLayout-PerfilCentral">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 10.1%; margin: var(--lumo-space-s); height: 100%;" id="verticalLayout-Opciones">
   <img style="flex-grow: 0; height: 30%; align-self: center;" id="img-Perfil">
   <vaadin-button tabindex="0" style="flex-grow: 0; align-self: center;" id="button-Bloquear">
     Bloquear 
   </vaadin-button>
   <vaadin-button tabindex="0" style="flex-grow: 0;" id="button-ModidicarDatos">
     Modificar Datos 
   </vaadin-button>
   <vaadin-button tabindex="0" style="flex-grow: 0;" id="button-EliminarCuenta">
     Eliminar Cuenta 
   </vaadin-button>
   <vaadin-button tabindex="0" style="flex-grow: 0; align-self: center;" id="button-Banear">
     Banear 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 0.05%;" id="verticalLayout-PerfilCentral">
   <label id="label-Nick">Nick</label>
   <vaadin-button tabindex="0" id="button-Seguir">
     Seguir 
   </vaadin-button>
   <label id="label-NumSeguidores">Num Seguidores: </label>
   <label id="label-NumSeguidos">Num Seguidos:</label>
  </vaadin-vertical-layout>
  <label style="flex-grow: 1;" id="label-Descripcion">Descripción: </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-start; flex-grow: 1;" id="horizontalLayout-Inferior">
  <vaadin-button style="align-self: flex-end; margin-left: var(--lumo-space-s); margin-bottom: var(--lumo-space-m);" tabindex="0">
   Atras
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%; height: 100%; align-items: stretch;" id="verticalLayout-Inferior"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="VerticalLayout-EstarBloqueado" style="flex-grow: 1;">
   <label id="label-AvisoBloqueo" style="flex-grow: 1; align-self: center;">Este usuario te ha bloqueado.</label>
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
