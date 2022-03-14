import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-menu_administracion')
export class VistaMenu_administracion extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="busquedaB">
   Buscar
  </vaadin-button>
  <vaadin-text-field label="" placeholder="Buscar elemento a modificar" id="busquedaTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-button id="darAltaB">
  Dar de alta
 </vaadin-button>
 <label id="numCancionesMostradasL">Número canciones mostradas al cibernauta</label>
 <vaadin-text-field placeholder="6" id="numCancionesMostradasTF"></vaadin-text-field>
 <label id="limiteCancionesReproduciblesL">Límite de canciones reproducibles por el cibernauta</label>
 <vaadin-text-field placeholder="10" id="limiteCancionesReproduciblesTF"></vaadin-text-field>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
