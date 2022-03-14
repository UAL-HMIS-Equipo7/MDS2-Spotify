import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancion_administrador')
export class VistaCancion_administrador extends LitElement {
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
 <label id="cancionL" style="width: 100%;">Titulo Cancion</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <img id="cancionImg" style="width: 100%; height: 100%;" src="https://www.leadershipmartialartsct.com/wp-content/uploads/2017/04/default-image-620x600.jpg">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-button id="editarCancionB" style="width: 100%; height: 100%;">
    Editar Canción
   </vaadin-button>
   <vaadin-button id="eliminarCancionB" style="width: 100%; height: 100%;">
    Eliminar Canción
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-button id="aniadirAVistaCibernautaB" style="width: 100%; height: 100%;">
  Añadir canción a vista cibernauta
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
