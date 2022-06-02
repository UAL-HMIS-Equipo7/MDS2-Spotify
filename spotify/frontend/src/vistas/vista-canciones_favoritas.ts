import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-canciones_favoritas')
export class VistaCanciones_favoritas extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-around;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m); font-weight: bold;">Canciones Favoritas</label>
 <vaadin-vertical-layout style="height: 100%; align-self: center; justify-content: space-around; align-items: center; margin: var(--lumo-space-s); width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="contenedorSuperior" style="align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="contenedorInferior" style="align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-button id="verMasB" style="align-self: flex-end; margin: var(--lumo-space-s);">
   Ver más 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
