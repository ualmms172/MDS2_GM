import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-listacontenido_item')
export class VistaListacontenido_item extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; background-color: #cdc8c8; align-self: center; width: 70%; overflow: hidden;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" id="horizontalLayout-RetweeteadoPor" style="align-self: center;">
    <label id="label-RetweeteadoPor">Retweeteado por [Usuario]</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; height: 15%;" id="horizontalLayout-Cabecera">
    <img style="flex-grow: 1; width: 38%; height: 100%; margin-top: var(--lumo-space-s); margin-left: var(--lumo-space-s);" id="img-FotoPerfilTweet">
    <label style="flex-grow: 1; width: 100%; margin-top: var(--lumo-space-xl);" id="label-NombreUsuario">Nombre Usuario</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 70%; width: 100%;" id="vaadinHorizontalLayout1">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout2">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontalLayout-CuerpoTweet">
      <label style="flex-grow: 1; margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-m);" id="label-CuerpoTwet">Texto tweet</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; align-self: center;" id="horizontalLayout-Multimedia">
      <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-Multimedia">
       <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 60%; align-self: center;" id="horizontal-Multimedia">
        <img style="flex-grow: 1;" id="img-FotoTweet">
        <div style="flex-grow: 1;" id="div-Tweet">
          Div 
        </div>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; max-height: 30%;" id="horizontalLayout-Opciones">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-RetweetBorrar">
     <vaadin-button style="flex-grow: 1; align-self: flex-start; margin-left: var(--lumo-space-xs);" tabindex="0" id="button-Retweet">
       Retweetear 
     </vaadin-button>
     <vaadin-button style="flex-grow: 1; align-self: flex-start; margin-left: var(--lumo-space-xs);" tabindex="0" id="button-Borrar">
       Borrar 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: stretch;" id="verticalLayout-EspacioBotones"></vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-MeGusta">
     <vaadin-horizontal-layout theme="spacing" id="horizontalLayout-MeGusta">
      <label style="flex-grow: 1;" id="label-MeGusta">Num Me gusta</label>
      <img style="flex-grow: 1;" id="img-MeGusta">
      <vaadin-button id="button-MeGusta" style="flex-grow: 1;" tabindex="0">
        Me gusta 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
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
