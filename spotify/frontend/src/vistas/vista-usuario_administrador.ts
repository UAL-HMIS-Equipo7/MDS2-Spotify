import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usuario_administrador')
export class VistaUsuario_administrador extends LitElement {
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
 <label id="usuarioL">Nombre Usuario</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <img id="usuarioImg" style="width: 100%; height: 100%;" src="https://www.leadershipmartialartsct.com/wp-content/uploads/2017/04/default-image-620x600.jpg">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-button id="editarUsuarioB" style="width: 100%; height: 100%;">
    Editar Usuario 
   </vaadin-button>
   <vaadin-button id="eliminarUsuarioB" style="width: 100%; height: 100%;">
    Eliminar Usuario
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
