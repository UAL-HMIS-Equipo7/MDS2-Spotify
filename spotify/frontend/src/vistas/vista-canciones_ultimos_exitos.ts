import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion_cibernauta';

@customElement('vista-canciones_ultimos_exitos')
export class VistaCanciones_ultimos_exitos extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .cancionCiber {
    	max-width: 300px;
    	max-height: 300px;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-m);">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;" id="contenedorSuperior">
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;" id="contenedorInferior">
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
  <vista-cancion_cibernauta class="cancionCiber"></vista-cancion_cibernauta>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
