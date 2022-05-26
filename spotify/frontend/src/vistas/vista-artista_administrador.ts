import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-artista_administrador')
export class VistaArtista_administrador extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <label id="artistaL" style="align-self: center; margin: var(--lumo-space-s);">Nombre Artista</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 85%; height: 90%; justify-content: center; align-items: center; align-self: center;">
  <vaadin-horizontal-layout theme="spacing" id="artistaImgLayout" style="max-width: 600px; max-height: 600px; width: 100%; height: 100%;"></vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 60%;">
   <vaadin-button id="editarArtistaB" style="width: 100%; height: 100%;">
     Editar Artista 
   </vaadin-button>
   <vaadin-button id="eliminarArtistaB" style="width: 100%; height: 100%;">
     Eliminar Artista 
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
