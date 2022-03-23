import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-dar_de_alta_estilo')
export class VistaDar_de_alta_estilo extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-evenly; align-items: center;">
 <label id="tituloL">Estilo</label>
 <label id="errorL">Mensaje de error correspondiente</label>
 <vaadin-horizontal-layout theme="spacing">
  <label id="nombreL">Nombre</label>
  <vaadin-text-field id="nombreTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: center;">
  <label id="descripcionL">Descripción</label>
  <vaadin-text-area id="descripcionTF"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="guardarB">
    Guardar 
  </vaadin-button>
  <vaadin-button id="cancelarL">
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
