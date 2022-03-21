import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-canciones_administrador';
import './vista-albumes_administrador';
import './vista-artistas_administrador';
import './vista-usuarios_administrador';

@customElement('vista-realizar_busqueda_de_administrador')
export class VistaRealizar_busqueda_de_administrador extends LitElement {
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
 <vaadin-button id="atrasB">
   Atrás 
 </vaadin-button>
 <label style="align-self: center;">No hay ningún resultado para la búsqueda realizada</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
  <vista-canciones_administrador style="width: 100%; height: 100%;"></vista-canciones_administrador>
  <vista-albumes_administrador style="width: 100%; height: 100%;"></vista-albumes_administrador>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vista-artistas_administrador style="width: 100%; height: 100%;"></vista-artistas_administrador>
  <vista-usuarios_administrador style="width: 100%; height: 100%;"></vista-usuarios_administrador>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
