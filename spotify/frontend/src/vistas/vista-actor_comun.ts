import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-recomendaciones';
import './vista-ultimas_canciones_reproducidas';
import './vista-canciones_favoritas';

@customElement('vista-actor_comun')
export class VistaActor_comun extends LitElement {
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
 <vaadin-button id="verEstadisticasB" style="align-self: flex-end;">
   Estadísticas de uso 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 70%;">
   <vista-ultimas_canciones_reproducidas></vista-ultimas_canciones_reproducidas>
   <vista-canciones_favoritas></vista-canciones_favoritas>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 30%; height: 100%;">
   <vista-recomendaciones style="height: 15%;"></vista-recomendaciones>
   <vaadin-button id="menuAdministracionB">
     Menú Administración 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
