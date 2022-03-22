import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion';

@customElement('vista-ultimas_canciones_reproducidas')
export class VistaUltimas_canciones_reproducidas extends LitElement {
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
 <label id="tituloL">Últimas Canciones Reproducidas</label>
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
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
