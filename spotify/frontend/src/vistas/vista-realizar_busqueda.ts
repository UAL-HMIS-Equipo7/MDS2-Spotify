import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-resultados_canciones';
import './vista-resultados_listas_de_reproduccion';
import './vista-resultados_artistas';

@customElement('vista-realizar_busqueda')
export class VistaRealizar_busqueda extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <label id="mensajeL" style="align-self: center; margin: var(--lumo-space-s);">Se han encontrado los siguientes resultados</label>
 <label id="errorL" style="align-self: center;">No se han encontrado resultados</label>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vista-resultados_canciones></vista-resultados_canciones>
  <vista-resultados_listas_de_reproduccion></vista-resultados_listas_de_reproduccion>
 </vaadin-horizontal-layout>
 <vista-resultados_artistas style="align-self: center;"></vista-resultados_artistas>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
