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

    .eventos{
    	width: 80%; height: 80%; align-self: center;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m);">Conciertos, festivales</label>
 <vaadin-scroller id="navegacionSB" style="width: 100%; margin: var(--lumo-space-s);">
  <vaadin-horizontal-layout style="height: 100%; width: 100%;">
   <vista-evento style="align-self: center;" class="eventos"></vista-evento>
   <vista-evento style="align-self: center;" class="eventos"></vista-evento>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 100%;">
   <vista-evento class="eventos"></vista-evento>
   <vista-evento class="eventos"></vista-evento>
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
