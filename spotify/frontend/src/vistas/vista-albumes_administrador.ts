import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-album_administrador';

@customElement('vista-albumes_administrador')
export class VistaAlbumes_administrador extends LitElement {
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
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-s);">Álbumes</label>
 <vaadin-scroller id="navegacionSB" style="width: 100%; height: 100%;">
  <vista-album_administrador class="albumAdministrador"></vista-album_administrador>
  <vista-album_administrador class="albumAdministrador"></vista-album_administrador>
  <vista-album_administrador class="albumAdministrador"></vista-album_administrador>
  <vista-album_administrador class="albumAdministrador"></vista-album_administrador>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
