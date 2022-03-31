import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-s);">Listas de reproducción</label>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-s); width: 90%; justify-content: center;">
  <vaadin-button id="anteriorB" style="margin-right: var(--lumo-space-m);">
    Anterior 
  </vaadin-button>
  <vaadin-button id="siguienteB" style="margin-left: var(--lumo-space-m);">
    Siguiente 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="contenedor" style="width: 90%;"></vaadin-horizontal-layout>
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
