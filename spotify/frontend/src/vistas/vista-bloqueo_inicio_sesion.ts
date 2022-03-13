import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-bloqueo_inicio_sesion')
export class VistaBloqueo_inicio_sesion extends LitElement {
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
 <vaadin-button id="atrasB" style="align-self: flex-start;">
  Atrás
 </vaadin-button>
 <img id="alertaImg" style="align-self: center;" src="https://www.leadershipmartialartsct.com/wp-content/uploads/2017/04/default-image-620x600.jpg">
 <label id="errorL" style="align-self: center;">Ha fallado demasiados intentos de inicio de sesión. Inténtelo de nuevo en:</label>
 <label id="tiempoL" style="align-self: center;">00:00</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
