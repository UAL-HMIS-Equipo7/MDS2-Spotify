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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-around;" theme="spacing-s">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 90%; justify-content: center;">
  <vaadin-button id="busquedaB">
    Buscar 
  </vaadin-button>
  <vaadin-text-field label="" placeholder="Buscar elemento a modificar" id="busquedaTF" style="width: 70%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-button id="darAltaB" style="align-self: center; width: 30%;">
   Dar de alta 
 </vaadin-button>
 <vaadin-vertical-layout theme="spacing" style="align-items: center;">
  <label id="numCancionesMostradasL">Número canciones mostradas al cibernauta</label>
  <vaadin-text-field placeholder="6" id="numCancionesMostradasTF"></vaadin-text-field>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: center;">
  <label id="limiteCancionesReproduciblesL">Límite de canciones reproducibles por el cibernauta</label>
  <vaadin-text-field placeholder="10" id="limiteCancionesReproduciblesTF"></vaadin-text-field>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
