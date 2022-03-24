import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-aniadir_informacion_de_eventos')
export class VistaAniadir_informacion_de_eventos extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-around;">
 <label id="tituloL" style="align-self: center;">Introducir Imagen</label>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <img id="imagenImg" style="width: 100px;" src="https://www.leadershipmartialartsct.com/wp-content/uploads/2017/04/default-image-620x600.jpg">
  <vaadin-button id="elegirImagenFC" style="align-self: center;">
    Elegir Imagen 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-text-field label="" placeholder="Introducir fecha y hora" id="fechaHoraTF" style="align-self: center;"></vaadin-text-field>
 <label id="descripcionL" style="align-self: center;">Descripción</label>
 <vaadin-text-area label="" placeholder="" style="align-self: center; width: 60%; height: 40%;"></vaadin-text-area>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <label id="precioL" style="align-self: center;">Precio</label>
  <vaadin-text-field placeholder="Introducir precio" id="precioTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-button id="confirmarB">
    Confirmar 
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
