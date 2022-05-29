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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-m); justify-content: center;">
 <vaadin-horizontal-layout theme="spacing" id="fotoImgLayout" style="align-items: center; justify-content: center; align-self: center;"></vaadin-horizontal-layout>
 <a href="https://vaadin.com" id="nickB" style="align-self: center;">Nick </a>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
