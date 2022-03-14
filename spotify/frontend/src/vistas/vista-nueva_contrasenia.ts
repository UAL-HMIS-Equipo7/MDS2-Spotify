import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-nueva_contrasenia')
export class VistaNueva_contrasenia extends LitElement {
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
 <vaadin-button id="atrasB" style="align-self: flex-start;" src="">
  Atras 
 </vaadin-button>
 <label id="tituloL" style="align-self: center;">Nueva contraseña</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <img id="contraseniaImg" style="width: 20%; align-self: center; height: 100%;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-text-field placeholder="Introduzca la nueva contraseña" id="contraseniaTF" style="align-self: center;"></vaadin-text-field>
   <vaadin-text-field placeholder="Repita la nueva contraseña" id="repiteContraseniaTF" style="align-self: center;"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <label id="errorL" style="align-self: center;">Mensaje de error correspondiente</label>
 <vaadin-button id="confirmarB" style="align-self: center;">
  Confirmar
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
