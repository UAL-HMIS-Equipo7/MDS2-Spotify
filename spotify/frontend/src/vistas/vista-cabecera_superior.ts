import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabecera_superior')
export class VistaCabecera_superior extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <img id="inicioB" style="width: 15%; height: 15%;" src="https://cdn.pixabay.com/photo/2013/07/12/15/53/home-150499_960_720.png">
 <label id="telefonoL" style="width: 30%; height: 30%;">900900900</label>
 <a href="https://vaadin.com" id="contactoB">Correo@contacto</a>
 <img id="buscarB" style="width: 15%; height: 15%;" src="http://assets.stickpng.com/images/59cfc4d2d3b1936210a5ddc7.png">
 <vaadin-text-field label="" placeholder="Buscar" id="buscarTF" style="width: 10%;"></vaadin-text-field>
 <img style="width: 15%; height: 15%;" src="https://www.softzone.es/app/uploads/2018/04/guest.png?x=480&amp;quality=20" id="perfilImg">
 <vaadin-button id="verPerfilUsuarioB">
  Ver perfil
 </vaadin-button>
 <vaadin-button id="verPerfilArtistaB">
  Ver perfil
 </vaadin-button>
 <vaadin-button id="verPerfilAdministradorB">
  Ver perfil
 </vaadin-button>
 <vaadin-button id="cerrarSesionB">
  Cerrar sesión
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
