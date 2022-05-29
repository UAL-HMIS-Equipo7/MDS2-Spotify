import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-creditos')
export class VistaCreditos extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 90%; height: 20%; justify-content: center; margin: var(--lumo-space-xl); align-self: center;">
  <vaadin-horizontal-layout theme="spacing" id="cancionImgLayout"></vaadin-horizontal-layout>
  <label id="tituloL">Titulo</label>
  <vaadin-button id="cerrarB">
    Cerrar 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 60%; align-items: center; align-self: center; height: 80%; justify-content: center;">
  <label id="tituloAlbumL">Titulo del Album</label>
  <label id="compositorL">Compositor/es</label>
  <label id="productorL">Productor/es</label>
  <label id="interpreteL">Intérprete/s</label>
  <label id="ficheroL">Fichero Multimedia asociado</label>
  <label id="estiloL">Estilos </label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
