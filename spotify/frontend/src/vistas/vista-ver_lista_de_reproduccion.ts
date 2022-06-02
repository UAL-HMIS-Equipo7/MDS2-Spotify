import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_lista_de_reproduccion')
export class VistaVer_lista_de_reproduccion extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; margin: var(--lumo-space-s);">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; margin: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
   <vaadin-button id="compartirB" style="width: 20%;">
     Compartir 
   </vaadin-button>
   <vaadin-button id="seguirB" style="width: 20%;">
     Seguir 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%;">
  <label id="informacionL" style="align-self: center; font-weight: bold;">Información de la lista</label>
  <label id="tituloL" style="align-self: center;">Título</label>
  <vaadin-button id="autorB" style="align-self: center;">
    Autor 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
