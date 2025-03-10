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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; background-color: #cdc8c8;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; height: 15%;">
    <img style="flex-grow: 1; width: 38%; height: 100%; margin-top: var(--lumo-space-s); margin-left: var(--lumo-space-s);">
    <label style="flex-grow: 1; width: 100%; margin-top: var(--lumo-space-xl);">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 70%; width: 100%;">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
      <label style="flex-grow: 1; margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-m);">Label</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
      <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
       <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 60%; align-self: center;">
        <img style="flex-grow: 1;">
        <div style="flex-grow: 1;">
          Div 
        </div>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 20%;">
     <vaadin-button style="flex-grow: 1; align-self: flex-start; width: 30%; margin-left: var(--lumo-space-m);" tabindex="0">
       Button 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;"></vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 20%;">
     <label style="flex-grow: 1;">Label</label>
     <img style="flex-grow: 1;">
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
