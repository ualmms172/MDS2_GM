import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-logueado')
export class VistaLogueado extends LitElement {
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
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 25%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;">
    <label style="height: 20%; width: 100%; flex-grow: 1; margin: var(--lumo-space-xs);" id="label">Lista de usuarios más famosos</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 75%; width: 100%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-button style="flex-grow: 1; padding: var(--lumo-space-m); margin-left: var(--lumo-space-m); margin-bottom: var(--lumo-space-s);" tabindex="0" id="vaadinButton">
      Button 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 50%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; height: 60%;">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 15%;">
     <vaadin-button style="flex-grow: 1; height: 30%; width: 20%; max-height: 10%; max-width: 90%; margin-top: var(--lumo-space-l); align-self: flex-start;" tabindex="0">
       Button 
     </vaadin-button>
     <vaadin-button style="flex-grow: 1; max-height: 10%; max-width: 90%; align-self: flex-start;" tabindex="0">
       Button 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: flex-start;">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;">
      <img style="flex-grow: 1; width: 55%; margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-s);" src=".\img\PortadaTwitter.jpeg">
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;"></vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 15%; max-height: 25%;">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; margin-top: var(--lumo-space-l); max-height: 50%;">
      <img style="flex-grow: 1; width: 50%; height: 20%;" src=".\img\FotoPerfilEjemplo.jpg">
      <vaadin-button tabindex="0" style="flex-grow: 1;">
        Button 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;">
      <vaadin-vertical-layout theme="spacing">
       <vaadin-button style="flex-grow: 1;" tabindex="0">
         Button 
       </vaadin-button>
       <vaadin-button style="flex-grow: 1;" tabindex="0">
         Button 
       </vaadin-button>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 1;"></vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 25%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
     <div style="align-self: flex-end; margin-right: var(--lumo-space-xs); margin: var(--lumo-space-xs); flex-grow: 1;">
       Lista de Hashtags más usados 
     </div>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 75%; width: 100%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
     <vaadin-button style="flex-grow: 1; padding: var(--lumo-space-m); align-self: flex-end; margin-bottom: var(--lumo-space-s); margin-right: var(--lumo-space-m);" tabindex="0">
       Button 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
