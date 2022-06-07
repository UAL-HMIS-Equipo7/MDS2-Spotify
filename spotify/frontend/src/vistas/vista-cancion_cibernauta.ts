import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cancion_cibernauta')
export class VistaCancion_cibernauta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-m);">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-s);">Titulo</label>
 <vaadin-vertical-layout style="width: 90%; height: 90%; align-self: center; align-items: center; justify-content: center;" id="contenedor"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
