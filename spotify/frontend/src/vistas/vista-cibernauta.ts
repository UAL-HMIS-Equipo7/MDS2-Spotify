import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cibernauta')
export class VistaCibernauta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;" id="LayoutPrincipal">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%; padding: var(--lumo-space-l); justify-content: space-between;">
  <img id="fotoImg" style="width: 100%; height: 100%; max-width: 125px; max-height: 125px;" src="https://play-lh.googleusercontent.com/UrY7BAZ-XfXGpfkeWg0zCCeo-7ras4DCoRalC_WXXWTK9q5b0Iw7B0YQMsVxZaNB7DM">
  <label id="nombreAppL" style="margin: var(--lumo-space-l); text-align: center; font-size:large;">Nombre App</label>
  <vaadin-button id="iniciarSesionB" style="width: 300px; max-width: 300px;">
    Iniciar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 80%; flex-grow: 0; padding: var(--lumo-space-m); align-items: center; justify-content: center;" id="vaadinHorizontalLayout"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
