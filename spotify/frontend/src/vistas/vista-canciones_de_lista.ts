import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloPanelL" style="flex-shrink: 1; flex-grow: 0; align-self: center;">Listado de canciones</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center;">
  <vista-cancion style="width: 100%; height: 100%;"></vista-cancion>
  <vista-cancion style="width: 100%; height: 100%;"></vista-cancion>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center;">
  <vista-cancion style="width: 100%; height: 100%;"></vista-cancion>
  <vista-cancion style="width: 100%; height: 100%;"></vista-cancion>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center; justify-content: center;">
  <vista-cancion style="width: 100%; height: 100%;"></vista-cancion>
  <vista-cancion style="width: 100%; height: 100%;"></vista-cancion>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
