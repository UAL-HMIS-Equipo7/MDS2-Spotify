import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-canciones_recomendadas';
import './vista-albumes_recomendados';
import './vista-listas_recomendadas';

@customElement('vista-recomendaciones')
export class VistaRecomendaciones extends LitElement {
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
 <label id="tituloL" style="align-self: center;">Recomendaciones</label>
 <vista-canciones_recomendadas style="align-self: center;"></vista-canciones_recomendadas>
 <vista-albumes_recomendados style="align-self: center;"></vista-albumes_recomendados>
 <vista-listas_recomendadas style="width: 100%; height: 100%;"></vista-listas_recomendadas>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
