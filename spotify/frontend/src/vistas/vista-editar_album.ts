import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-edicion_y_creacion_album';
import './vista-canciones_en_album';

@customElement('vista-editar_album')
export class VistaEditar_album extends LitElement {
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
 <vista-edicion_y_creacion_album style="width: 100%; height: 100%;" id="vistaEdicion_y_creacion_album"></vista-edicion_y_creacion_album>
 <vista-canciones_en_album style="width: 100%; height: 100%;" id="vistaCanciones_en_album"></vista-canciones_en_album>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
