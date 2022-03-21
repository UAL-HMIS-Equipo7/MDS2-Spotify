import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_reproduccion_ajena';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloL" style="align-self: center;">Listas de reproducción</label>
 <vaadin-horizontal-layout theme="spacing">
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-s);">
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
