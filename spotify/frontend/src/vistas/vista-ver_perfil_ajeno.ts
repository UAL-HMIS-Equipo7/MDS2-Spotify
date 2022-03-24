import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-listas_de_reproduccion_perfil';

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
   <img id="fotoImg" src="https://skillz4kidzmartialarts.com/wp-content/uploads/2017/04/default-image-620x600.jpg" style="width: 30%;">
   <label id="emailL">Email</label>
   <label id="nickL">Nick</label>
   <vaadin-button id="seguirB">
     Seguir 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: space-evenly;">
    <label id="seguidoresL">Seguidores: X</label>
    <label id="seguidosL">Seguidos: X</label>
   </vaadin-horizontal-layout>
   <vista-listas_de_reproduccion_perfil></vista-listas_de_reproduccion_perfil>
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
