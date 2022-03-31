import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-estilos_mas_escuchados')
export class VistaEstilos_mas_escuchados extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

	.imagenEstilo {
    	max-width: 350px;
    	max-heigth: 350px;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-m);">Estilos más escuchados</label>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center;" id="contenedorSuperior"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center;" id="contenedorInferior"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
