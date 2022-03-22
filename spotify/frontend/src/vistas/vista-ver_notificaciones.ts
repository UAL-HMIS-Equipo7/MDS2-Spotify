import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-notificaciones';

@customElement('vista-ver_notificaciones')
export class VistaVer_notificaciones extends LitElement {
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
 <vaadin-button id="cerrarB">
  Cerrar 
 </vaadin-button>
 <label id="numeroNotificacionesL" style="align-self: center;">Tienes ?? notificaciones nuevas</label>
 <vista-notificaciones style="width: 100%; height: 100%;"></vista-notificaciones>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
