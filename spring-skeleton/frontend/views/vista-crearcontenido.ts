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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;position:absolute;" id="horizontalLayout-Completo ">
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-PrevisualizacionFoto">
  <img style="flex-grow: 1; align-self: center;" id="img-Imagen">
  <label style="flex-grow: 1; align-self: center;" id="label-PrevisualizacionFoto">Previsualización Foto</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 40%;" id="verticalLayout-CrearContenido ">
  <label style="flex-grow: 1; align-self: center; margin-top: var(--lumo-space-xl);" id="label-CrearContenido">Crear [CONTENIDO]</label>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-Texto">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="label-Texto">Texto</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text" id="textField-CampoTexto"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-Foto">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="label-Foto">Foto</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text" id="textField-UrlFoto"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-Video">
   <label style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="label-Video">Video</label>
   <vaadin-text-field style="flex-grow: 1; margin-right: var(--lumo-space-xl);" type="text" id="textField-textoVideo"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-AtrasPublicar">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Atras">
    <vaadin-button style="flex-grow: 1; align-self: flex-start;" tabindex="0" id="button-Atras">
      Atrás 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Publicar">
    <vaadin-button style="flex-grow: 1; align-self: flex-end;" tabindex="0" id="button-Publicar">
      Publicar 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-PrevisualizacionVideo">
  <img style="flex-grow: 1;" id="img-Video">
  <label style="flex-grow: 1; align-self: center;" id="label-PrevisualizacionVideo">Previsualización Video</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
