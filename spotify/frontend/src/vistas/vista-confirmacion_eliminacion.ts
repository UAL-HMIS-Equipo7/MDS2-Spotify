import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-confirmacion_eliminacion')
export class VistaConfirmacion_eliminacion extends LitElement {
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
 <label id="mensajeL" style="align-self: center;">Vas a eliminar un elemento. ¿Está seguro de realizar esta acción?</label>
 <label id="nombreElementoL" style="align-self: center; flex-grow: 0; flex-shrink: 1; font-weight: bold; margin: var(--lumo-space-m);">Nombre de elemento a eliminar</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; align-self: center;">
  <vaadin-button id="confirmarB" style="width: 100%;">
    Confirmar 
  </vaadin-button>
  <vaadin-button id="cancelarB" style="width: 100%;">
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
