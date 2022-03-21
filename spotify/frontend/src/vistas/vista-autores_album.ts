import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import './vista-nombreartista';

@customElement('vista-autores_album')
export class VistaAutores_album extends LitElement {
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
 <vaadin-combo-box id="artistasCB">
  <vista-nombreartista></vista-nombreartista>
  <vista-nombreartista></vista-nombreartista>
 </vaadin-combo-box>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
