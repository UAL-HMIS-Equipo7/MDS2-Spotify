import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-album';

@customElement('vista-albumes')
export class VistaAlbumes extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .albumes {
	    margin: var(--lumo-space-m); height: 98%;
	    }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m);">Álbumes</label>
 <vaadin-scroller style="align-self: center;" id="vaadinScroller">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center; align-items: center; margin: var(--lumo-space-s);">
   <vista-album class="albumes" id="vistaAlbum"></vista-album>
   <vista-album class="albumes" id="vistaAlbum1"></vista-album>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center; margin: var(--lumo-space-s);">
   <vista-album class="albumes"></vista-album>
   <vista-album class="albumes"></vista-album>
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
