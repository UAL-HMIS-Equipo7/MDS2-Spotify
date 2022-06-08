import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-editar_informacion_del_perfil_no_artista')
export class VistaEditar_informacion_del_perfil_no_artista extends LitElement {
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
<vaadin-vertical-layout style="width: 20%; height: 100%; justify-content: center; align-items: center;">
 <vaadin-text-field placeholder="Email" id="emailTF"></vaadin-text-field>
 <vaadin-text-field placeholder="Nick" id="nickTF"></vaadin-text-field>
 <vaadin-button id="guardarB">
   Guardar 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
