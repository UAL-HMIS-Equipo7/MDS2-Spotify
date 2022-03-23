import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-cancion_administrador';

@customElement('vista-canciones_administrador')
export class VistaCanciones_administrador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

	.cancionAdministrador {
	    	margin: var(--lumo-space-s); 
	    	padding: var(--lumo-space-s);
	    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m);">Canciones</label>
 <vaadin-scroller id="navegacionSB" style="width: 100%; height: 100%; align-self: center;">
  <vista-cancion_administrador class="cancionAdministrador"></vista-cancion_administrador>
  <vista-cancion_administrador class="cancionAdministrador"></vista-cancion_administrador>
  <vista-cancion_administrador class="cancionAdministrador"></vista-cancion_administrador>
  <vista-cancion_administrador class="cancionAdministrador"></vista-cancion_administrador>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
