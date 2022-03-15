import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_evento')
export class VistaVer_evento extends LitElement {
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
 <vaadin-button>
  Atras
 </vaadin-button>
 <label id="tituloL" style="align-self: center;">Información concierto</label>
 <img id="fotoEventoImg" style="align-self: center;" src="https://m.media-amazon.com/images/I/51e6kpkyuIL._AC_SY355_.jpg">
 <label id="fechaHoraL" style="align-self: center;">Fecha y hora</label>
 <label id="descripcionTItuloL" style="align-self: center;">Descripción</label>
 <vaadin-text-field placeholder="Placeholder" id="descripcionTF" style="align-self: center;"></vaadin-text-field>
 <label id="precioL" style="align-self: center;">Precio</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
