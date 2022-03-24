import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-foto_artista';

@customElement('vista-artistas')
export class VistaArtistas extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin: var(--lumo-space-s);">
  <vista-foto_artista style="width: 100%; height: 100%;"></vista-foto_artista>
  <vista-foto_artista style="width: 100%; height: 100%;"></vista-foto_artista>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin: var(--lumo-space-s);">
  <vista-foto_artista style="width: 100%; height: 100%;"></vista-foto_artista>
  <vista-foto_artista style="width: 100%; height: 100%;"></vista-foto_artista>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
