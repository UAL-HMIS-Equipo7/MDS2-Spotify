import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-artistas_similares')
export class VistaArtistas_similares extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .artistasSimilares {
    	height: 90%; margin: var(--lumo-space-l); padding: var(--lumo-space-s);
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-evenly;">
 <label style="align-self: center; margin: var(--lumo-space-m); font-weight:bold;" id="label">Artistas Similares</label>
 <vaadin-scroller style="width: 100%; height: 90%; align-self: center;" id="navegacionSB"></vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
