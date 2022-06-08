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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-around;">
 <vaadin-button id="atrasB" style="align-self: flex-start; margin: var(--lumo-space-s);">
   Atrás 
 </vaadin-button>
 <img id="alertaImg" style="height: 50%; width: 50%; align-self: center; max-width: 350px; max-height: 350px;" src="https://github.com/mdmontesinos/MDS2-Spotify/blob/master/spotify/src/main/webapp/img/bloqueo-inicio.png?raw=true">
 <label id="errorL" style="align-self: center;">Ha fallado demasiados intentos de inicio de sesión. Inténtelo de nuevo en:</label>
 <label id="tiempoL" style="align-self: center; font-weight: bold;">00:00</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
