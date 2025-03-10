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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;position:absolute" id="vaadinHorizontalLayout">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 25%;" id="verticalLayout-izquierdo">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-ListaUsuariosMasFamosos">
    <label style="height: 20%; width: 100%; flex-grow: 1; margin: var(--lumo-space-xs);" id="label-ListaUsuariosMasFamosos">Lista de usuarios más famosos</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 75%; width: 100%;" id="horizontalLayout-ListaUsuariosMasFamosos2"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-VerMasUsuarios">
    <vaadin-button style="flex-grow: 1; padding: var(--lumo-space-m); margin-left: var(--lumo-space-m); margin-bottom: var(--lumo-space-s); align-self: flex-start;" tabindex="0" id="button-VerMasUsuarios">
      Ver más usuarios 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 50%;" id="verticalLayout-central">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%; height: 60%;" id="horizontalLayout-centralSuperior">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 15%;" id="verticalLayout-CerrarSesionNotificaciones">
     <vaadin-button style="flex-grow: 1; width: auto; max-height: 5.5%; max-width: none; margin-top: var(--lumo-space-l); align-self: flex-start; flex-shrink: 1; height: 20%; Margin-top : 30px;" tabindex="0" id="button-CerrarSesion">
       Cerrar Sesión 
     </vaadin-button>
     <vaadin-button style="flex-grow: 1; max-height: 5.5%; max-width: none; align-self: flex-start; width: auto; Height:30px;" tabindex="0" id="button-Notificaciones">
       Notificaciones 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: flex-start;" id="verticalLayout-imagenPerfil">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-ImagenPerfil">
      <img style="flex-grow: 1; width: 55%; margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-s);" src=".\img\PortadaTwitter.jpeg" id="img-PortadaTwitter">
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-centralImagen"></vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 15%; max-height: 25%;" id="verticalLayout-BaneadoVerperfil">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; margin-top: var(--lumo-space-l); max-height: 50%;" id="horizontalLayout-Baneados">
      <vaadin-button tabindex="0" style="flex-grow: 1; width: 300%; align-self: flex-start;  Height:30px;" id="button-Baneados">
        Baneados 
      </vaadin-button>
      <img style="flex-grow: 1; width: 100%; height: 100%;" src=".\img\FotoPerfilEjemplo.jpg" id="img-PerfilUsuario">
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;" id="horizontalLayout-VerPerfilEscribirTweet">
      <vaadin-vertical-layout theme="spacing" id="verticalLayout-VerPerfilEscribirTweet">
       <vaadin-button style="flex-grow: 1; Height:30px;" tabindex="0" id="button-VerPerfil">
         Ver perfil 
       </vaadin-button>
       <vaadin-button style="flex-grow: 1; width: 100%; Height:30px;" tabindex="0" id="button-EscribirTweet">
         Escribir tweet 
       </vaadin-button>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontalLayout-inferior">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 1;" id="verticalLayout-inferior"></vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 25%;" id="verticalLayout-derecho">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;" id="horizontalLayout-ListaHashtagsUsados">
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="verticalLayout-listaHashtagsMasUsados">
     <div style="align-self: flex-end; margin-right: var(--lumo-space-xs); margin: var(--lumo-space-xs); flex-grow: 1;" id="label-ListaDeHashtagsMasUsados">
       Lista de Hashtags más usados 
     </div>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 75%; width: 100%;" id="horizontalLayout-HashtagsMasUsados"></vaadin-horizontal-layout>
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
