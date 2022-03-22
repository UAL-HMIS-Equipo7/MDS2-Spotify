import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloL" style="align-self: center;">Canciones más exitosas</label>
<<<<<<< HEAD
 <vaadin-scroller id="navegacionSB" style="align-self: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vista-cancion></vista-cancion>
   <vista-cancion></vista-cancion>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vista-cancion></vista-cancion>
   <vista-cancion></vista-cancion>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
=======
 <vaadin-scroller id="navegacionSB" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <vista-cancion></vista-cancion>
   <vista-cancion></vista-cancion>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
>>>>>>> branch 'master' of https://github.com/mdmontesinos/MDS2-Spotify.git
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
