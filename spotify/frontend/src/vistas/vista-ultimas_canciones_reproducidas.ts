import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ultimas_canciones_reproducidas')
export class VistaUltimas_canciones_reproducidas extends LitElement {
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
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m); font-weight: bold;">Últimas Canciones Reproducidas</label>
 <vaadin-vertical-layout style="justify-content: space-around; align-items: center; align-self: center; height: 100%; margin: var(--lumo-space-s); width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="contenedorSuperior" style="align-items: center; justify-content: center; align-self: center;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="contenedorInferior" style="align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
