import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-realizar_busqueda_de_administrador')
export class VistaRealizar_busqueda_de_administrador extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%; flex-direction: row;">
  <vaadin-button id="atrasB" style="margin: var(--lumo-space-m);">
    Atrás 
  </vaadin-button>
  <label style="align-self: center; margin-left: var(--lumo-space-xl);" id="errorL">No hay ningún resultado para la búsqueda realizada</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%; justify-content: space-around; margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m);" id="contenedorSuperior"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%; justify-content: space-around; align-self: center; align-items: center; margin-bottom: var(--lumo-space-m); margin-top: var(--lumo-space-m);" id="contenedorInferior"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
