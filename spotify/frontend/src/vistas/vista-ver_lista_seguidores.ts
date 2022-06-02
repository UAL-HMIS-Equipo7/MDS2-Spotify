import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-ver_lista_seguidores')
export class VistaVer_lista_seguidores extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: space-between;">
 <label id="tituloL" style="margin: var(--lumo-space-m); font-weight: bold;">Seguidores</label>
 <vaadin-scroller id="navegacionSB" style="align-self: center; height: 95%; width: 100%;"></vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
