import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-editar_usuario')
export class VistaEditar_usuario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-around; padding: var(--lumo-space-s);">
 <label id="tituloL">Usuario Registrado</label>
 <label id="errorL">Mensaje de error correspondiente</label>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-horizontal-layout theme="spacing" id="fotoImgLayout" style="max-width: 500px; max-height: 500px;"></vaadin-horizontal-layout>
  <vaadin-button id="elegirFotoB">
    Elegir Foto 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <label id="emailL">Email</label>
  <vaadin-text-field id="emailTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <label id="nickL">Nick</label>
  <vaadin-text-field id="nickTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <label id="contraseniaL">Contraseña</label>
  <vaadin-text-field id="contraseniaTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="guardarB">
    Guardar 
  </vaadin-button>
  <vaadin-button id="cancelarB">
    Cancelar 
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
