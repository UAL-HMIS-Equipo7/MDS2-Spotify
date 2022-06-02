import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_perfil_propio')
export class VistaVer_perfil_propio extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin: var(--lumo-space-m); padding: var(--lumo-space-m); height: 100%; justify-content: space-between; width: 30%;" id="contenedorIzquierdo">
   <vaadin-horizontal-layout theme="spacing" id="fotoImgLayout" style="width: 90%; height: 40%;"></vaadin-horizontal-layout>
   <label id="emailL">Email</label>
   <label id="nickL" style="font-weight: bold;">Nick</label>
   <vaadin-button id="modificarInformacionB">
     Modificar Información 
   </vaadin-button>
   <vaadin-button id="darseBajaB">
     Darse de baja 
   </vaadin-button>
   <vaadin-button id="aniadirInformacionEventosB">
     Añadir información de conciertos 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 60%; height: 100%; justify-content: space-between; align-items: center;" id="contenedorDerecho">
   <vaadin-horizontal-layout style="width: 100%; height: 30%; align-items: center; justify-content: space-around;">
    <vaadin-button id="seguidoresB">
      Seguidores: X 
    </vaadin-button>
    <vaadin-button id="seguidosB">
      Seguidos: X 
    </vaadin-button>
    <vaadin-button id="notificacionesB">
      Notificaciones 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
