import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-edicion_y_creacion_album')
export class VistaEdicion_y_creacion_album extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-evenly;">
 <label id="tituloL">Álbum</label>
 <label id="errorL">Mensaje de error correspondiente</label>
 <vaadin-horizontal-layout theme="spacing">
  <img id="fotoImg" style="width: 150px;" src="https://www.leadershipmartialartsct.com/wp-content/uploads/2017/04/default-image-620x600.jpg">
  <vaadin-button id="elegirFotoB">
    Elegir imagen 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="tituloAlbumL">Título</label>
  <vaadin-text-field label="" placeholder="" id="tituloAlbumTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="artistaL">Nombre del artista</label>
  <vaadin-text-field label="" placeholder="" id="artistaTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="label">Fecha de edición</label>
  <vaadin-text-field label="" placeholder="" id="fechaEdicionTF" readonly></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vaadin-button id="guardarB">
    Guardar 
  </vaadin-button>
  <vaadin-button id="cancelarB">
    Cancelar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
