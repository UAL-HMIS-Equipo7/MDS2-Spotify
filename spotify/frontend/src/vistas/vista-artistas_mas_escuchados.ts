import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-imagen_artistas';

@customElement('vista-artistas_mas_escuchados')
export class VistaArtistas_mas_escuchados extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .imagenArtista {
    	max-width: 350px;
    	max-heigth: 350px;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m);">Artistas más escuchados</label>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center; margin: var(--lumo-space-m); align-self: center;">
  <vista-imagen_artistas class="imagenArtista"></vista-imagen_artistas>
  <vista-imagen_artistas class="imagenArtista"></vista-imagen_artistas>
  <vista-imagen_artistas class="imagenArtista"></vista-imagen_artistas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; align-self: center;">
  <vista-imagen_artistas class="imagenArtista"></vista-imagen_artistas>
  <vista-imagen_artistas class="imagenArtista"></vista-imagen_artistas>
  <vista-imagen_artistas class="imagenArtista"></vista-imagen_artistas>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
