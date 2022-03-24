import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 98%; align-self: center;">
  <img id="fotoCancionImg" style="align-self: center;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20">
  <label id="tituloL" style="align-self: center;">TÍTULO</label>
  <vaadin-button id="aniadirFavoritosB" style="align-self: center;">
    Añadir a favoritos 
  </vaadin-button>
  <label id="aniadirListaL" style="align-self: center;">Añadir a lista de reproducción</label>
  <vaadin-combo-box id="aniadirListaB" style="align-self: center;"></vaadin-combo-box>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 98%; align-self: center;">
  <label id="creditosTituloL" style="align-self: center;">Créditos</label>
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
