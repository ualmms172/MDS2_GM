import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-banearusuario')
export class VistaBanearusuario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="verticalLayout-Ventana">
 <label style="flex-grow: 1; margin-top: var(--lumo-space-xl); width: 100%40%; margin-left: var(--lumo-space-xl); align-self: center;" id="label-Banear">BANEAR</label>
 <label style="flex-grow: 1; align-self: center; margin-left: var(--lumo-space-xl);" id="label-AvisoBaneo">Esta a punto de banear al usuario: [Nombre de usuario]</label>
 <label style="flex-grow: 1; align-self: center; margin-left: var(--lumo-space-xl);" id="label-SeleccionTipoBaneo">Seleccione el tipo de baneo que desea realizar</label>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 40%;" id="vaadinHorizontalLayout"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 100%;" id="horizontalLayout-SeleccionBaneo">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; height: 40%; align-self: flex-end;" id="verticalLayout-Indefinido">
   <vaadin-button style="flex-grow: 1; align-self: center; width: 20%; height: 10%;" tabindex="0" id="button-Indefinido">
     Indefinido 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-SeleccionTiempoBaneo">
   <vaadin-text-field label="Label" placeholder="Placeholder" style="flex-grow: 1; align-self: center;" type="text" id="placeHolder-tiempoBaneo"></vaadin-text-field>
   <vaadin-button style="flex-grow: 1; align-self: center;" tabindex="0" id="button-Temporal">
     Temporal 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-button style="flex-grow: 1; margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-xl); height: 3%; width: 8%;" tabindex="0" id="button-Atras">
   Atrás 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
