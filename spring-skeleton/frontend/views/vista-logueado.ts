import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;position:absolute" id="vaadinHorizontalLayout">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 30%;" id="verticalLayout-izquierdo">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; margin-left: var(--lumo-space-m); width: 100%;" id="horizontalLayout-ListaUsuariosMasFamosos">
    <label style="height: 20%; width: 100%; flex-grow: 1; margin: var(--lumo-space-xs); font-size: 15px;" id="label-ListaUsuariosMasFamosos">Lista de usuarios más famosos</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="flex-grow: 1; height: 75%; flex-shrink: 1; width: 70%; align-self: center; flex-direction: column; align-items: stretch;" id="horizontalLayout-ListaUsuariosMasFamosos2"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-VerMasUsuarios">
    <vaadin-button style="flex-grow: 1; padding: var(--lumo-space-m); margin-left: var(--lumo-space-m); margin-bottom: var(--lumo-space-s); align-self: flex-start;" tabindex="0" id="button-VerMasUsuarios">
      Ver más usuarios 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-grow: 1; align-items: center; justify-content: space-around;" id="verticalLayout-central">
   <vaadin-horizontal-layout style="flex-grow: 1; height: 9%;" id="horizontalLayout-centralSuperior">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 15%; margin-top: 23px;" id="verticalLayout-CerrarSesionNotificaciones">
     <vaadin-button style="flex-grow: 0; max-width: none; align-self: flex-end; Height:30px;" tabindex="0" id="button-CerrarSesion">
       Cerrar Sesión 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; max-width: none; align-self: flex-end; Height:30px;" tabindex="0" id="button-Notificaciones">
       Notificaciones 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: flex-start;" id="verticalLayout-imagenPerfil">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-ImagenPerfil">
      <img id="img-PortadaTwitter" style="flex-grow: 1; width: 25%; margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-s); height: 50%; align-self: flex-start;">
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 15%; max-height: 25%;" id="verticalLayout-BaneadoVerperfil">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; margin-top: var(--lumo-space-l); max-height: 50%;" id="horizontalLayout-Baneados">
      <vaadin-button tabindex="0" style="flex-grow: 1; align-self: flex-start; Height:30px; width: 200%;" id="button-Baneados">
        Baneados 
      </vaadin-button>
      <img id="img-PerfilUsuario" style="flex-grow: 1; width: 100%; height: 100%; margin-left: var(--lumo-space-s);">
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-VerPerfilEscribirTweet">
      <vaadin-vertical-layout theme="spacing" id="verticalLayout-VerPerfilEscribirTweet">
       <vaadin-button style="flex-grow: 1; Height:30px; align-self: flex-start;" tabindex="0" id="button-VerPerfil">
         Ver perfil 
       </vaadin-button>
       <vaadin-button style="flex-grow: 1; width: 100%; Height:30px; align-self: flex-start;" tabindex="0" id="button-EscribirTweet">
         Escribir tweet 
       </vaadin-button>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout style="flex-grow: 1; align-items: stretch; align-self: center; flex-direction: column; width: 100%; margin-top: var(--lumo-space-xl); padding-top: var(--lumo-space-xl);" id="verticalLayout-inferior"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-grow: 1; width: 35%;" id="verticalLayout-derecho" theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontalLayout-ListaHashtagsUsados">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; margin-right: var(--lumo-space-m);" id="verticalLayout-listaHashtagsMasUsados">
     <div style="align-self: flex-end; margin-right: var(--lumo-space-xs); margin: var(--lumo-space-xs); flex-grow: 1; font-size: 15px;" id="label-ListaDeHashtagsMasUsados">
       Lista de Hashtags más usados 
     </div>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="flex-grow: 1; height: 75%; width: 70%; align-self: center; flex-direction: column; align-items: stretch;" id="horizontalLayout-HashtagsMasUsados"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontalLayout-VerMasHashtags">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticaLayout-VerMásHashTags">
     <vaadin-button style="flex-grow: 0; padding: var(--lumo-space-m); align-self: flex-end; margin-bottom: var(--lumo-space-s); margin-right: var(--lumo-space-m); flex-shrink: 1;" tabindex="0" id="button-VerMasHashtags">
       Ver más hashtags 
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
