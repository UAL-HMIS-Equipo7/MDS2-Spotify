import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-around;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m); font-weight: bold;">Recomendaciones</label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center; align-items: center;" id="contenedor"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
