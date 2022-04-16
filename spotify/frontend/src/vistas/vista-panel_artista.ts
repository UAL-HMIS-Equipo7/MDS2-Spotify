import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-panel_artista')
export class VistaPanel_artista extends LitElement {
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
 <label id="estiloL" style="align-self: center; margin: var(--lumo-space-s);">Estilo</label>
 <vaadin-horizontal-layout style="height: 48%; margin: var(--lumo-space-s); width: 98%; padding: var(--lumo-space-xs);" id="contenedorSuperior"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 98%; padding: var(--lumo-space-xs); height: 48%;" id="contenedorInferior"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
