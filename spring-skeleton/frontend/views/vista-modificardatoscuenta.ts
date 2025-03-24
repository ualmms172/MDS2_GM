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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="horizontalLayout-Completo">
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-PrevisualizacionFotoPerfil">
  <img style="flex-grow: 1; align-self: center;" id="img-Perfil">
  <label style="flex-grow: 1; align-self: center;" id="label-PrevisualizacionFotoPerfil"> Previsualización Foto Perfil</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 40%;" id="verticalLayout-Formulario">
  <label style="flex-grow: 1; align-self: center; margin-top: var(--lumo-space-xl);" id="label-CambiarDatos">Cambiar datos</label>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-Nick">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="label-Nick">Nick</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: 74px;" type="text" id="textField-Nick"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-FotoPerfil ">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="label-FotoDePerfil">Foto de perfil</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: 10px;" type="text" id="textField-FotoDePerfil"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-FotoDeFondo">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="label-FotoDeFondo">Foto de Fondo</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text" id="textField-FotoDeFondo"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1; width: 100%;" id="horizontalLayout-Descripcion">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="label-Descripcion">Descripción </label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: 20px;" type="text" id="textField-Descripcion"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-AtrasModificar">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Atras">
    <vaadin-button style="flex-grow: 1; align-self: flex-start;" tabindex="0" id="button-Atras">
      Atrás 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Modificar">
    <vaadin-button style="flex-grow: 1; align-self: flex-end;" tabindex="0" id="button-Modificar">
      Modificar 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-derecho"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
