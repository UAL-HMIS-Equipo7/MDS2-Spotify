import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-foto_artista';

@customElement('vista-artistas_similares')
export class VistaArtistas_similares extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .artistasSimilares {
    	height: 90%; margin: var(--lumo-space-l); padding: var(--lumo-space-s);
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label style="align-self: center; margin: var(--lumo-space-m);">Artistas Similares</label>
 <vaadin-scroller style="width: 100%; height: 100%;" id="navegacionSB">
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 98%;">
   <vista-foto_artista class="artistasSimilares"></vista-foto_artista>
   <vista-foto_artista class="artistasSimilares"></vista-foto_artista>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 98%; height: 100%;">
   <vista-foto_artista class="artistasSimilares"></vista-foto_artista>
   <vista-foto_artista class="artistasSimilares"></vista-foto_artista>
  </vaadin-horizontal-layout>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
