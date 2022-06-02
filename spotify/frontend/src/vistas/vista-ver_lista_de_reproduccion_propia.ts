import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin: var(--lumo-space-s);">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; height: 100%; align-items: center;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; width: 15%; height: 100%;">
   <label id="editarL" style="font-weight: bold;">Opciones de edición</label>
   <vaadin-button id="editarB">
     Editar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
