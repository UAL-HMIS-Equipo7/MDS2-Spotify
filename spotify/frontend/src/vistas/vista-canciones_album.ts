import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion';

@customElement('vista-canciones_album')
export class VistaCanciones_album extends LitElement {
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
 <label style="align-self: center; margin: var(--lumo-space-m);" id="label">Listado de Canciones</label>
 <vaadin-scroller id="navegacionSB" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="justify-content: space-evenly;">
   <vista-cancion></vista-cancion>
   <vista-cancion></vista-cancion>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="justify-content: space-evenly;">
   <vista-cancion></vista-cancion>
   <vista-cancion></vista-cancion>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="justify-content: space-evenly;">
   <vista-cancion></vista-cancion>
   <vista-cancion></vista-cancion>
  </vaadin-horizontal-layout>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
