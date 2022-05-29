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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" id="fotoImgLayout" style="width: 30%; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
   <label id="emailL">Email</label>
   <label id="nickL">Nick</label>
   <vaadin-button id="seguirB">
     Seguir 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m);" id="vaadinVerticalLayout">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: space-evenly;">
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
