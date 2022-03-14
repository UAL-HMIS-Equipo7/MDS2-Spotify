import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-confirmacion_de_correo')
export class VistaConfirmacion_de_correo extends LitElement {
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
  Atrás
 </vaadin-button>
 <label id="tituloL" style="align-self: center;">Verificación de Código</label>
 <vaadin-text-field label="" placeholder="Introduzca el código" id="codigoTF" style="align-self: center;"></vaadin-text-field>
 <label id="errorL" style="align-self: center;">Error Correspondiente</label>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-button id="confirmarB">
   Confirmar
  </vaadin-button>
  <vaadin-button id="reenviarB">
   Reenviar
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
