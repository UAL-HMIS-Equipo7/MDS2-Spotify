import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-canciones_a_modificar_lista')
export class VistaCanciones_a_modificar_lista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-evenly;" id="vaadinVerticalLayout">
 <label id="tituloL">Listado de canciones</label>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-text-field placeholder="Añadir canción" id="aniadirCancionTF"></vaadin-text-field>
  <vaadin-button id="aniadirCancionB">
   Añadir
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; align-items: center;">
  <vaadin-button id="anteriorB" style="width: 100%;">
   Anterior
  </vaadin-button>
  <vaadin-button id="posteriorB" style="width: 100%;">
   Posterior
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
