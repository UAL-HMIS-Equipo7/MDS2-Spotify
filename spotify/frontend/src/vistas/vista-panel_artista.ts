import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-albumes';
import './vista-canciones_mas_exitosas';
import './vista-artistas_similares';

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
 <label id="estiloL" style="align-self: center;">Estilo</label>
 <vaadin-horizontal-layout theme="spacing" style="height: 50%;">
  <vista-albumes></vista-albumes>
  <vista-canciones_mas_exitosas></vista-canciones_mas_exitosas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
  <vista-artistas_similares></vista-artistas_similares>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
