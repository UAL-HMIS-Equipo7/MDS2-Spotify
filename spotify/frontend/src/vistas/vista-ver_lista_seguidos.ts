import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-ver_lista_seguidos')
export class VistaVer_lista_seguidos extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; justify-content: space-between; align-items: center;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m); font-weight: bold;">Seguidos</label>
 <vaadin-scroller id="navegacionSB" style="height: 95%; align-self: center; width: 100%;"></vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
