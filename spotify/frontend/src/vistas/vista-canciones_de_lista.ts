import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-canciones_de_lista')
export class VistaCanciones_de_lista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" theme="spacing-s">
 <label id="tituloPanelL" style="flex-shrink: 1; flex-grow: 0; align-self: center; margin: var(--lumo-space-m); font-weight: bold;">Listado de canciones</label>
 <vaadin-scroller id="navegacionSB" style="width: 100%; align-self: center;"></vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
