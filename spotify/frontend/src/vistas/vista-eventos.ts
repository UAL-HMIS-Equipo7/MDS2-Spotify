import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-evento';

@customElement('vista-eventos')
export class VistaEventos extends LitElement {
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
 <label id="tituloL" style="align-self: center;">Conciertos, festivales</label>
 <vaadin-scroller id="navegacionSB" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; justify-content: center;">
   <vista-evento></vista-evento>
   <vista-evento></vista-evento>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
   <vista-evento></vista-evento>
   <vista-evento></vista-evento>
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
