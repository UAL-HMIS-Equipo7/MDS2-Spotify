import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-foto_artista';

@customElement('vista-artistas_similares')
export class VistaArtistas_similares extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <vista-foto_artista></vista-foto_artista>
   <vista-foto_artista></vista-foto_artista>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <vista-foto_artista></vista-foto_artista>
   <vista-foto_artista></vista-foto_artista>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-scroller style="width: 100%; height: 100%;"></vaadin-scroller>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
