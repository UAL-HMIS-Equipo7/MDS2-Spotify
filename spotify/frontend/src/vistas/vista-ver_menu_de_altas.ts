import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_menu_de_altas')
export class VistaVer_menu_de_altas extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="layoutPrincipal">
 <vaadin-button id="cerrarB" style="align-self: flex-start; margin: var(--lumo-space-l);">
   Cerrar 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; height: 60%; justify-content: center; align-items: center; align-self: center;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;" id="contenedorCancion">
   <label id="cancionL">Canción</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;" id="contenedorEstilo">
   <label id="estiloL">Estilos</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;" id="contenedorAlbum">
   <label id="albumL">Álbum</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;" id="contenedorArtista">
   <label id="artistaL">Artista</label>
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
