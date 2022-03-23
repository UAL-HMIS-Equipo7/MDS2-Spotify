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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <label id="cancionL" style="margin: var(--lumo-space-s); align-self: center;">Titulo Cancion</label>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; width: 85%; height: 80%; justify-content: space-evenly;">
  <img id="cancionImg" style="width: 100%; height: 100%; max-width: 600px; max-height: 600px;" src="https://www.leadershipmartialartsct.com/wp-content/uploads/2017/04/default-image-620x600.jpg">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; width: 50%; height: 60%; justify-content: space-around;">
   <vaadin-button id="editarCancionB" style="width: 70%; height: 30%;">
     Editar Canción 
   </vaadin-button>
   <vaadin-button id="eliminarCancionB" style="width: 70%; height: 30%;">
     Eliminar Canción 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-button id="aniadirAVistaCibernautaB" style="height: 10%; align-self: center; width: 90%; max-height: 50px; margin: var(--lumo-space-m); max-width: 900px;">
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
