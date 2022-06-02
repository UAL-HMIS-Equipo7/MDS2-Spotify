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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" theme="spacing-s">
 <label id="estiloL" style="align-self: center; margin: var(--lumo-space-s); font-weight: bold;">Estilo</label>
 <vaadin-horizontal-layout style="height: 45%; width: 100%; align-self: center; align-items: center; justify-content: space-around;" id="contenedorSuperior"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 45%; align-self: center; align-items: center; justify-content: space-around;" id="contenedorInferior"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
