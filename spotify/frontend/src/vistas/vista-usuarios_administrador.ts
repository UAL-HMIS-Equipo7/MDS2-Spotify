import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-usuarios_administrador')
export class VistaUsuarios_administrador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .usuarioAdministrador {
	    	margin: var(--lumo-space-s); 
	    	padding: var(--lumo-space-s);
	    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-around;">
 <label id="tituloL" style="align-self: center; margin: var(--lumo-space-s); font-weight: bold;">Usuarios</label>
 <vaadin-scroller style="width: 100%; height: 100%; align-self: center;" id="navegacionSB"></vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
