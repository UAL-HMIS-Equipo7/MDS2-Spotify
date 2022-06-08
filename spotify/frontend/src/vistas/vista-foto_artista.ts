import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-foto_artista')
export class VistaFoto_artista extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; padding: var(--lumo-space-m);">
 <vaadin-horizontal-layout theme="spacing" id="fotoImgLayout" style="width: 100%; height: 100%; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
 <vaadin-button id="nickB" style="align-self: center; width: 100%; flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-m);">
   Nick 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
