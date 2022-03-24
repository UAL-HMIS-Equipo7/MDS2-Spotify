import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-darse_de_baja')
export class VistaDarse_de_baja extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-evenly;">
 <label id="mensajeL" style="flex-shrink: 0; align-self: center;">¿Está seguro que desea darse de baja? Podrá recuperar su cuenta antes de que pasen 30 días</label>
 <vaadin-horizontal-layout theme="spacing" style="justify-content: center; align-self: center;">
  <vaadin-button id="confirmarB" style="align-self: center;">
    Confirmar 
  </vaadin-button>
  <vaadin-button id="cancelarB" style="align-self: center;">
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
