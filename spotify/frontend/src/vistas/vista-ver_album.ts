import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver_album')
export class VistaVer_album extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: flex-start;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; align-items: center;" id="vaadinVerticalLayout">
   <label id="informacionL">Información</label>
   <label id="tituloL">Título</label>
   <label id="fechaEdicionL">01/01/2020</label>
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
