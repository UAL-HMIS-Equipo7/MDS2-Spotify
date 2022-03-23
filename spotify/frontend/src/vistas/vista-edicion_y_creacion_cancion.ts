import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-edicion_y_creacion_cancion')
export class VistaEdicion_y_creacion_cancion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: space-evenly; padding: var(--lumo-space-s);">
 <label id="tituloCancionL">Canción</label>
 <label id="errorL">Mensaje de error correspondiente</label>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;">
  <label id="ficheroL">Fichero multimedia</label>
  <vaadin-button id="elegirFicheroB">
    Seleccionar archivos 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="tituloL">Título</label>
  <vaadin-text-field id="tituloTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="estiloL">Estilos</label>
  <vaadin-combo-box id="estiloCB"></vaadin-combo-box>
 </vaadin-horizontal-layout>
 <label id="creditosL">Créditos</label>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="creditosTituloL">Título</label>
  <vaadin-text-field id="creditosTituloTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="tituloAlbumL">Título del álbum</label>
  <vaadin-text-field id="tituloAlbumTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="compositorL">Compositor/es</label>
  <vaadin-text-field id="compositorTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="productorL">Productor/es</label>
  <vaadin-text-field id="productorTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
  <label id="interpreteL">Intérprete/es</label>
  <vaadin-text-field id="interpreteTF"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="guardarB">
    Guardar 
  </vaadin-button>
  <vaadin-button id="cancelarB">
    Cancelar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
