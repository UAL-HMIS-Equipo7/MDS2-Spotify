import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-resultados_listas_de_reproduccion')
export class VistaResultados_listas_de_reproduccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-evenly;" theme="spacing-s">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m); font-weight: bold;">Listas de reproducción</label>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-xs); width: 100%; height: 40%; align-self: center; align-items: center; justify-content: space-evenly;" id="contenedorSuperior"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-s); width: 100%; height: 40%; align-self: center; align-items: center; justify-content: space-evenly;" id="contenedorInferior"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
