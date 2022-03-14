import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-edicion_y_creacion_album';
import './vista-canciones_a_aniadir_album';

@customElement('vista-dar_de_alta_album')
export class VistaDar_de_alta_album extends LitElement {
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
 <vista-edicion_y_creacion_album style="width: 100%; height: 100%;"></vista-edicion_y_creacion_album>
 <vista-canciones_a_aniadir_album style="width: 100%; height: 100%;"></vista-canciones_a_aniadir_album>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
