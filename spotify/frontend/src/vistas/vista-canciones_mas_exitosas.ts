import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-canciones_mas_exitosas')
export class VistaCanciones_mas_exitosas extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-around;" theme="spacing-xs">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m); font-weight: bold;">Canciones más exitosas</label>
 <vaadin-scroller id="navegacionSB" style="align-self: center; width: 100%; height: 90%;"></vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
