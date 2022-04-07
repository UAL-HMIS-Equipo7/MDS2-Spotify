import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_estadisticas')
export class VistaVer_estadisticas extends LitElement {
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
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m);">Estadísticas de uso</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 90%; height: 100%; align-self: center; padding: var(--lumo-space-s);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 40%; justify-content: center;">
   <label id="tiempoTituloL" style="align-self: center;">Tiempo reproducido</label>
   <label id="tiempoL" style="align-self: center;">0000000</label>
   <label id="numCancionesTituloL" style="align-self: center;">Número de canciones reproducidas</label>
   <label id="numCancionesL" style="align-self: center;">000000</label>
   <label id="numArtistasTituloL" style="align-self: center;">Número de artistas escuchados</label>
   <label id="numArtistasL" style="align-self: center;">000000</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
