import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-iniciarsesin')
export class VistaIniciarsesin extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="verticalLayout-Ventana">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;" id="horizontalLayout-IniciaSesion">
  <label style="align-self: center;" id="label-IniciarSesion">Iniciar Sesión</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-CorreoNick">
  <label id="label-Correo">Correo/Nick</label>
  <vaadin-text-field type="text" id="textField-Correo"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-Contraseña">
  <label id="label-Contraseña">Contraseña</label>
  <vaadin-text-field type="text" id="textField-contraseña"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1;" id="verticalLayout-IniciarSesion">
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-RecuperarContraseña">
   <label id="label-OlvidarContraseña">¿Has olvidado tu contraseña? Recuperala aquí: </label>
   <vaadin-button tabindex="0" id="button-RecuperarContraseña">
     Recuperar contraseña 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-Central">
   <label style="align-self: flex-start;" id="label-central">o</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-IniciarSesion">
   <vaadin-button style="align-self: flex-start;" tabindex="0" id="button-IniciarSesionConGoogle">
     Iniciar con Google 
   </vaadin-button>
   <img id="img-IniciarSesion">
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="horizontalLayout-AtrasContinuar">
  <vaadin-button tabindex="0" id="button-Atras">
    Atras 
  </vaadin-button>
  <vaadin-button style="margin-left: 400px;" tabindex="0" id="button-Continuar">
    Continuar 
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
