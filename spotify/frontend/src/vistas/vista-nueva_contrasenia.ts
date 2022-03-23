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
 <vaadin-button id="atrasB" style="align-self: flex-start; margin: var(--lumo-space-m);" src="">
   Atras 
 </vaadin-button>
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-l);">Nueva contraseña</label>
 <vaadin-horizontal-layout theme="spacing" style="justify-content: center; align-self: center; height: 40%;">
  <img id="contraseniaImg" style="align-self: center; max-width: 150px; max-height: 150px;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
  <vaadin-vertical-layout theme="spacing" style="justify-content: center;">
   <vaadin-text-field placeholder="Introduzca nueva contraseña" id="contraseniaTF" style="flex-grow: 0; flex-shrink: 1;"></vaadin-text-field>
   <vaadin-text-field placeholder="Repita la nueva contraseña" id="repiteContraseniaTF" style="align-self: center;"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <label id="errorL" style="align-self: center;">Mensaje de error correspondiente</label>
 <vaadin-button id="confirmarB" style="align-self: center; margin: var(--lumo-space-xl);">
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
