import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox-group.js';

@customElement('vista-ver_cancion')
export class VistaVer_cancion extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 98%; align-self: center; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" id="fotoCancionImgLayout" style="align-items: center; justify-content: center;"></vaadin-horizontal-layout>
  <label id="tituloL" style="align-self: center; font-weight: bold;">TÍTULO</label>
  <vaadin-button id="aniadirFavoritosB" style="align-self: center;">
    Añadir a favoritos 
  </vaadin-button>
  <div class="divScroll350" style="align-self: center;">
   <vaadin-checkbox-group id="listasCB" style="width: 100%; height: 100%;" label="Listas de reproducción"></vaadin-checkbox-group>
  </div>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 98%; align-self: center; align-items: center; justify-content: center;">
  <label id="creditosTituloL" style="align-self: center; font-weight: bold;">Créditos</label>
  <label id="creditosTituloCancionL" style="align-self: center;">Título</label>
  <label id="creditosTituloAlbumL" style="align-self: center;">Título del álbum</label>
  <label id="creditosCompositorL" style="align-self: center;">Compositor/es</label>
  <label id="creditosProductorL" style="align-self: center;">Productor/es</label>
  <label id="creditosInterpreteL" style="align-self: center;">Intérprete/s</label>
  <label id="creditosFicheroL" style="align-self: center;">Fichero multimedia</label>
  <label id="creditoEstiloL" style="align-self: center;">Estilos</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
