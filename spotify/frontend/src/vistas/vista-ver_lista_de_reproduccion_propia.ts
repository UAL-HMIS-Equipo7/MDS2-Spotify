import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-ver_lista_de_reproduccion';

@customElement('vista-ver_lista_de_reproduccion_propia')
export class VistaVer_lista_de_reproduccion_propia extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin: var(--lumo-space-s); align-items: center; justify-content: center;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-vertical-layout theme="spacing">
   <label id="editarL">Opciones de edición</label>
   <vaadin-button id="editarB">
     Editar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vista-ver_lista_de_reproduccion style="align-self: center;"></vista-ver_lista_de_reproduccion>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
