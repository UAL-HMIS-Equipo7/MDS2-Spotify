import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin: var(--lumo-space-s); justify-content: space-around; padding: var(--lumo-space-m);">
 <vaadin-button id="atrasB">
   Atras 
 </vaadin-button>
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-s);">Información concierto</label>
 <vaadin-horizontal-layout theme="spacing" id="fotoEventoImgLayout" style="align-items: center; justify-content: center; align-self: center;"></vaadin-horizontal-layout>
 <label id="fechaHoraL" style="align-self: center; margin: var(--lumo-space-s);">Fecha y hora</label>
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
