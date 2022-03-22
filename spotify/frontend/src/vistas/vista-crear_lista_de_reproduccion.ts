import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-crear_lista_de_reproduccion')
export class VistaCrear_lista_de_reproduccion extends LitElement {
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
 <label id="tituloL" style="align-self: center;">Lista de reproducción</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <label id="tituloListaL" style="align-self: center;">Título</label>
  <vaadin-text-field label="" id="tituloListaTF" style="align-self: center;">
   Text
  </vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <label id="autorListaL" style="align-self: center;">Autor</label>
  <vaadin-text-field label="" id="autorListaTF" style="align-self: center;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: stretch; justify-content: center;">
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
