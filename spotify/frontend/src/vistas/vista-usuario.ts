import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuario')
export class VistaUsuario extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-m);">
 <img id="fotoB" style=" " src="https://m.media-amazon.com/images/I/51e6kpkyuIL._AC_SY355_.jpg">
 <a href="https://vaadin.com" id="nickB" style="align-self: center;">Nick </a>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
