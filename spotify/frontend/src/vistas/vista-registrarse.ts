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
 <vaadin-button id="atrasB" style="align-self: flex-start;">
   Button 
 </vaadin-button>
 <label id="tituloL" style="align-self: center;">Registro de usuario</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%; align-self: center;">
  <img id="emailImg" style="width: 8%; height: 100%; align-self: center;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
  <vaadin-text-field label="" placeholder="Email" id="emailTF" style="align-self: center; flex-grow: 0; flex-shrink: 0;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%;">
  <img id="nickImg" style="width: 8%; height: 100%;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
  <vaadin-text-field label="" placeholder="Nick" id="nickTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%;">
  <img id="contraseniaImg" style="width: 8%; height: 100%; align-self: center;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-text-field label="" placeholder="Contraseña" id="contraseniaTF" style="width: 50%; height: 50%;"></vaadin-text-field>
   <vaadin-text-field label="" placeholder="Repita la contraseña" id="repiteContraseniaTF" style="height: 50%;"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%;">
  <img id="fotoImg" style="width: 8%; height: 100%; align-self: center;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
  <vaadin-button id="fotoFC">
   Choose file
  </vaadin-button>
  <label style="align-self: center;" id="opcionalL">*Opcional</label>
 </vaadin-horizontal-layout>
 <a href="https://vaadin.com" id="iniciarSesionB" style="align-self: center;">Inicar sesion </a>
 <label id="errorL" style="align-self: center;">Mensaje de error</label>
 <vaadin-button id="RegistrarseB" style="align-self: center;">
  Registrarse
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
