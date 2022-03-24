import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
 <img id="fotoB" style="width: 100%; height: 100%;" src="data:image/png;base64,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">
 <a href="https://vaadin.com" id="nickB" style="align-self: center; width: 100%; flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-m);">Nick</a>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
