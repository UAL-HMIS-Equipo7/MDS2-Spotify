import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-usuarios';
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vista-usuarios></vista-usuarios>
 <vaadin-scroller id="navegacionSB" style="width: 100%; height: 100%;"></vaadin-scroller>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
