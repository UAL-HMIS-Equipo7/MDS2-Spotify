import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-contactar_con_la_empresa')
export class VistaContactar_con_la_empresa extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-evenly;">
 <label id="soporteL" style="align-self: center;">SOPORTE</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; justify-content: center;">
  <label id="asuntoL" style="align-self: center;">Asunto</label>
  <vaadin-text-field label="" placeholder="Placeholder" id="asuntoTF" style="align-self: center;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <label id="incidenciaL" style="align-self: center;">INCIDENCIA</label>
 <vaadin-text-field placeholder="Placeholder" id="incidenciaTF" style="align-self: center;"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
  <vaadin-button id="enviarB">
    Enviar 
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
