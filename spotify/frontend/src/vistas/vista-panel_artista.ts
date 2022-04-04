import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-albumes';
import './vista-canciones_mas_exitosas';
import './vista-artistas_similares';
import './vista-eventos';

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
 <vaadin-horizontal-layout style="height: 48%; margin: var(--lumo-space-s); width: 98%; padding: var(--lumo-space-xs);" id="contenedorSuperior">
  <vista-albumes style="width: 100%; padding: var(--lumo-space-xs);"></vista-albumes>
  <vista-canciones_mas_exitosas style="width: 100%; padding: var(--lumo-space-xs);"></vista-canciones_mas_exitosas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 98%; padding: var(--lumo-space-xs); height: 48%;" id="contenedorInferior">
  <vista-artistas_similares style="width: 100%; flex-grow: 0; flex-shrink: 1; padding: var(--lumo-space-xs);"></vista-artistas_similares>
  <vista-eventos style="flex-shrink: 1; flex-grow: 0; width: 50%; padding: var(--lumo-space-xs);"></vista-eventos>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
