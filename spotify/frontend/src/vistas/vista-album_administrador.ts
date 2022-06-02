import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-album_administrador')
export class VistaAlbum_administrador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .albumAdministrador {
	    	margin: var(--lumo-space-s); 
	    	padding: var(--lumo-space-s);
	    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <label id="albumL" style="align-self: center; margin: var(--lumo-space-s);">Nombre Álbum</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 85%; height: 90%; align-self: center; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" id="albumImgLayout" style="width: 100%; height: 100%; max-width: 600px; max-height: 600px;"></vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 60%; align-items: center; justify-content: space-around;">
   <vaadin-button id="editarAlbumB" style="width: 100%; height: 100%;">
     Editar Álbum 
   </vaadin-button>
   <vaadin-button id="eliminarAlbumB" style="width: 100%; height: 100%;">
     Eliminar Álbum 
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
