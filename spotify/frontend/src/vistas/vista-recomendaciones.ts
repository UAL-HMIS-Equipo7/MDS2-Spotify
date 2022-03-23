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
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-s);">Recomendaciones</label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 90%; justify-content: center;">
  <vista-canciones_recomendadas style="align-self: center; height: 30%;"></vista-canciones_recomendadas>
  <vista-albumes_recomendados style="align-self: center; height: 30%;"></vista-albumes_recomendados>
  <vista-listas_recomendadas style="height: 30%; align-self: center;"></vista-listas_recomendadas>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
