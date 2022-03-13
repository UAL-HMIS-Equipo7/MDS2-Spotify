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
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
  <vista-cancion_cibernauta></vista-cancion_cibernauta>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
