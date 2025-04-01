import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-listausuariosgeneral_item')
export class VistaListausuariosgeneral_item extends LitElement {
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
<vaadin-vertical-layout id="vertical-listausuariosgeneral_item">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 80%; align-self: center; justify-content: space-around; background-color: #cdc8c8;" id="horizontal-listausuariosgeneral_item">
  <label style="flex-grow: 1; align-self: center; margin-left: var(--lumo-space-s);" id="label-Nick">Nick</label>
  <label style="flex-grow: 1; align-self: center;" id="label-NumSeguidores">Num Seguidores</label>
  <label style="flex-grow: 1; align-self: center;" id="label-NumSeguidos">Num Seguidos</label>
  <label style="flex-grow: 1; align-self: center;" id="label-NumTweets">Num Tweets</label>
  <label style="flex-grow: 1; align-self: center;" id="label-Seguido/NoSeguido">Te sigue o no</label>
  <vaadin-button style="align-self: center; flex-grow: 1;" tabindex="0" id="button-Banear">
    Banear 
  </vaadin-button>
  <img style="flex-grow: 1; align-self: center;" id="img-PerfilUsuario">
  <vaadin-button style="flex-grow: 1; align-self: center; margin-right: var(--lumo-space-s);" tabindex="0" id="button-Seguir">
    Seguir 
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
