import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-listahashtagsgeneral_item')
export class VistaListahashtagsgeneral_item extends LitElement {
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
<vaadin-vertical-layout id="vertical-hashtagsgeneral_item">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center; background-color: #cdc8c8; justify-content: space-evenly; width: 70%;" id="horizontal-listahashtagsgeneral_item">
  <label style="flex-grow: 1; align-self: center; margin-left: var(--lumo-space-s);" id="label-Hashtag">Hashtag</label>
  <label style="flex-grow: 1; align-self: center;" id="label-NumTweets">Num Tweets</label>
  <label style="flex-grow: 1; align-self: center;" id="label-Creador">Creador</label>
  <vaadin-button style="flex-grow: 1; align-self: center; margin-right: var(--lumo-space-s);" tabindex="0" id="button-EscribirTweet">
    Escribir tweet 
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
