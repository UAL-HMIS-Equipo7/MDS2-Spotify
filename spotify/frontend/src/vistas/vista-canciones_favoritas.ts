import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-canciones_favoritas')
export class VistaCanciones_favoritas extends LitElement {
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
 <label id="tituloL">Canciones Favoritas</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
 </vaadin-horizontal-layout>
 <vaadin-button id="verMasB" style="align-self: flex-end;">
  Ver más
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
