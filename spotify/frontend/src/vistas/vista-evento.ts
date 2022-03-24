import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-evento')
export class VistaEvento extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: center; padding: var(--lumo-space-m);">
 <img id="fotoEventoImg" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
 <label id="nombreL" style="align-self: center; margin: var(--lumo-space-m);">Nombre</label>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
