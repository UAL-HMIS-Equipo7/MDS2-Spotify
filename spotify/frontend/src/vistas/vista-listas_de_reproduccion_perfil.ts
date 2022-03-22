import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-lista_de_reproduccion_ajena';
import './vista-lista_de_reproduccion_propia';

@customElement('vista-listas_de_reproduccion_perfil')
export class VistaListas_de_reproduccion_perfil extends LitElement {
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
  <vaadin-button id="anteriorB">
    Anterior 
  </vaadin-button>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_propia></vista-lista_de_reproduccion_propia>
  <vaadin-button id="siguienteB">
    Siguiente 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-text-field placeholder="Listas por página" id="listasPorPaginaTF"></vaadin-text-field>
  <label id="numPaginaL">1/?</label>
 </vaadin-horizontal-layout>
 <vaadin-button id="crearListaB" style="align-self: center;">
  Crear Lista
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
