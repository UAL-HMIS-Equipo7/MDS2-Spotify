import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
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
 <vaadin-button id="atrasB" style="align-self: flex-start; margin: var(--lumo-space-m);">
   Atrás 
 </vaadin-button>
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-s); font-weight: bold;">Registro de usuario</label>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-s); justify-content: center;">
  <img id="emailImg" style="flex-shrink: 1; flex-grow: 0; max-width: 100px; max-height: 100px;" src="https://github.com/mdmontesinos/MDS2-Spotify/blob/master/spotify/src/main/webapp/img/correo.png?raw=true">
  <vaadin-text-field label="" placeholder="Email" id="emailTF" style="align-self: center; flex-grow: 0; flex-shrink: 0;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin: var(--lumo-space-s);">
  <img id="nickImg" style="max-width: 100px; max-height: 100px;" src="https://github.com/mdmontesinos/MDS2-Spotify/blob/master/spotify/src/main/webapp/img/nick.png?raw=true">
  <vaadin-text-field label="" placeholder="Nick" id="nickTF" style="align-self: center;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-s);">
  <img id="contraseniaImg" style="align-self: center; max-width: 100px; max-height: 100px;" src="https://github.com/mdmontesinos/MDS2-Spotify/blob/master/spotify/src/main/webapp/img/password.png?raw=true">
  <vaadin-vertical-layout theme="spacing" style="height: 100%; justify-content: center;">
   <vaadin-text-field label="" placeholder="Contraseña" id="contraseniaTF"></vaadin-text-field>
   <vaadin-text-field label="" placeholder="Repita la contraseña" id="repiteContraseniaTF"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin: var(--lumo-space-s);">
  <img id="fotoImg" style="max-width: 100px; max-height: 100px;" src="">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
   <vaadin-button id="fotoFC">
    Foto de perfil
   </vaadin-button>
   <label style="align-self: center;" id="opcionalL">*Opcional</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <label id="errorL" style="align-self: center; margin: var(--lumo-space-s);">Mensaje de error</label>
 <vaadin-button id="RegistrarseB" style="align-self: center; margin: var(--lumo-space-s);">
   Registrarse 
 </vaadin-button>
 <vaadin-button id="iniciarSesionB" style="align-self: center;">
   Iniciar Sesión 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
