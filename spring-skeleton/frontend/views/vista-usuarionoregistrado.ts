import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-usuarionoregistrado')
export class VistaUsuarionoregistrado extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 25%;" id="vaadinVerticalLayout">
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="label-listaUsuariosFamosos">
   <label style="height: 20%; width: 100%; flex-grow: 1; margin: var(--lumo-space-xs);" id="label">Lista de usuarios más famosos</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 75%; flex-shrink: 1; width: 100%;" id="layout-listaUsuariosFamosos"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="vaadinHorizontalLayout1">
   <vaadin-button style="flex-grow: 1; padding: var(--lumo-space-m); margin-left: var(--lumo-space-m); margin-bottom: var(--lumo-space-s); flex-shrink: 1; align-self: flex-start;" tabindex="0" id="button-VerMasUsuarios">
    Ver más usuarios
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 50%;" id="layout-central">
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; height: 60%;" id="layout-centralSuperior">
   <img style="flex-grow: 1; width: 100%; height: 60%; align-self: center; margin-top: var(--lumo-space-xl);" src=".\img\PortadaTwitter.jpeg" id="image-IconoTwitter">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout2">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 1;" id="layout-centralInferior">
    <vaadin-button style="align-self: center; flex-grow: 0; margin-top: var(--lumo-space-s);" tabindex="0" id="button-IniciarSesion">
     Iniciar Sesión
    </vaadin-button>
    <vaadin-button style="align-self: center; margin-top: var(--lumo-space-s); margin-bottom: var(--lumo-space-xl);" tabindex="0" id="button-Registrarse">
     Registrarse
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 25%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout3">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout2">
    <div style="align-self: flex-end; margin-right: var(--lumo-space-xs); margin: var(--lumo-space-xs); flex-grow: 1;" id="label-ListaHashtagMasUsados">
      Lista de Hashtags más usados 
    </div>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 75%; width: 100%;" id="layout-listaDeHashtagMasUsados"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout4">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout3">
    <vaadin-button style="flex-grow: 0; padding: var(--lumo-space-m); align-self: flex-end; margin-bottom: var(--lumo-space-s); margin-right: var(--lumo-space-m);" tabindex="0" id="button-VerMasHashtags">
     Ver más hashtags
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
