import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-verbaneados')
export class VistaVerbaneados extends LitElement {
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
 <label style="align-self: center; margin: var(--lumo-space-xl);" id="label-UsuariosBaneados">Usuarios Baneados</label>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: center; width: 70%;" id="verticalLayout-Lista"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
