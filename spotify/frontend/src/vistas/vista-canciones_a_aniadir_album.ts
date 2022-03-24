import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-cancion_album';

@customElement('vista-canciones_a_aniadir_album')
export class VistaCanciones_a_aniadir_album extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-text-field label="" placeholder="Buscar canción a añadir" id="aniadirCancionTF" style="width: 40%; align-self: center; margin: var(--lumo-space-xl);"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="anteriorB">
    Anterior 
  </vaadin-button>
  <vista-cancion_album id="vistaCancion_album"></vista-cancion_album>
  <vaadin-button id="posteriorB">
    Posterior 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
