import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_perfil_ajeno')
export class VistaVer_perfil_ajeno extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin: var(--lumo-space-xs);">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center; align-items: center;">
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 30%; height: 50%; align-items: center; justify-content: flex-start;">
   <vaadin-horizontal-layout theme="spacing" id="fotoImgLayout" style="width: 90%; align-items: center; justify-content: center; height: 40%;"></vaadin-horizontal-layout>
   <label id="emailL">Email</label>
   <label id="nickL" style="font-weight: bold;">Nick</label>
   <vaadin-button id="seguirB">
     Seguir 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-xs" style="width: 100%; height: 100%; margin: var(--lumo-space-s); align-self: center; align-items: center; justify-content: space-around;" id="vaadinVerticalLayout">
   <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: space-evenly; height: 5%; font-weight: bold;">
    <label id="seguidoresL">Seguidores: X</label>
    <label id="seguidosL">Seguidos: X</label>
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
