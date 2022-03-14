import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-artista_administrador';

@customElement('vista-artistas_administrador')
export class VistaArtistas_administrador extends LitElement {
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
 <label id="tituloL">Artistas</label>
 <vaadin-scroller id="navegacionSB" style="width: 100%; height: 100%;">
  <vista-artista_administrador></vista-artista_administrador>
  <vista-artista_administrador></vista-artista_administrador>
  <vista-artista_administrador></vista-artista_administrador>
  <vista-artista_administrador></vista-artista_administrador>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
