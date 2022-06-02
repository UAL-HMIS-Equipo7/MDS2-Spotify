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
  <vaadin-horizontal-layout theme="spacing" id="cancionImgLayout" style="width: 100%; height: 100%; max-width: 600px; max-height: 600px;"></vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 60%; align-items: center; justify-content: space-around; flex-shrink: 1; flex-grow: 0;">
   <vaadin-button id="editarCancionB" style="width: 100%; height: 100%;">
     Editar Canción 
   </vaadin-button>
   <vaadin-button id="eliminarCancionB" style="width: 100%; height: 100%;">
     Eliminar Canción 
   </vaadin-button>
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
