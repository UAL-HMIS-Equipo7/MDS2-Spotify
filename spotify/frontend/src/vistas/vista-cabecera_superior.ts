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
<vaadin-horizontal-layout class="content" style="justify-content: space-between; align-items: center; margin: var(--lumo-space-xs);">
 <img id="inicioB" style="width: 10%; height: 10%; max-width: 125px; max-height: 125px;" src="https://play-lh.googleusercontent.com/UrY7BAZ-XfXGpfkeWg0zCCeo-7ras4DCoRalC_WXXWTK9q5b0Iw7B0YQMsVxZaNB7DM">
 <label id="telefonoL" style="margin: var(--lumo-space-xs);">900900900</label>
 <vaadin-button id="contactoB" style="margin: var(--lumo-space-xs);">
   Contactar 
 </vaadin-button>
 <img id="buscarB" style="width: 7%; height: 8%; margin: var(--lumo-space-xs); max-width: 75px; max-height: 75px;" src="https://github.com/mdmontesinos/MDS2-Spotify/blob/master/spotify/src/main/webapp/img/buscar-lupa.png?raw=true">
 <vaadin-text-field label="" placeholder="Buscar" id="buscarTF" style="width: 15%; margin: var(--lumo-space-xs);"></vaadin-text-field>
 <img style="width: 15%; height: 15%; margin: var(--lumo-space-xs); max-width: 125px; max-height: 125px;" src="https://github.com/mdmontesinos/MDS2-Spotify/blob/master/spotify/src/main/webapp/img/icono-perfil.png?raw=true" id="perfilImg">
 <vaadin-button id="verPerfilUsuarioB" style="margin: var(--lumo-space-xs);">
   Ver perfil 
 </vaadin-button>
 <vaadin-button id="verPerfilArtistaB" style="margin: var(--lumo-space-xs);">
   Ver perfil 
 </vaadin-button>
 <vaadin-button id="verPerfilAdministradorB" style="margin: var(--lumo-space-xs);">
   Ver perfil 
 </vaadin-button>
 <vaadin-button id="cerrarSesionB" style="margin: var(--lumo-space-xs);">
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
