/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ArtistaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression datosId;
	public final AssociationExpression datos;
	public final StringExpression nick;
	public final StringExpression fotoRuta;
	public final CollectionExpression seguidor;
	public final CollectionExpression listas;
	public final IntegerExpression favoritaId;
	public final AssociationExpression favorita;
	public final CollectionExpression seguido;
	public final IntegerExpression estadisticaId;
	public final AssociationExpression estadistica;
	public final CollectionExpression ultimas_reproducidas;
	public final CollectionExpression notificaciones;
	public final CollectionExpression lista_seguida;
	public final IntegerExpression estiloId;
	public final AssociationExpression estilo;
	public final CollectionExpression aparece_en;
	public final CollectionExpression albumes;
	public final CollectionExpression eventos;
	public final CollectionExpression canciones;
	
	public ArtistaDetachedCriteria() {
		super(basededatos.Artista.class, basededatos.ArtistaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		datosId = new IntegerExpression("datos.id", this.getDetachedCriteria());
		datos = new AssociationExpression("datos", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoRuta = new StringExpression("fotoRuta", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		listas = new CollectionExpression("ORM_listas", this.getDetachedCriteria());
		favoritaId = new IntegerExpression("favorita.id", this.getDetachedCriteria());
		favorita = new AssociationExpression("favorita", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		estadisticaId = new IntegerExpression("estadistica.id", this.getDetachedCriteria());
		estadistica = new AssociationExpression("estadistica", this.getDetachedCriteria());
		ultimas_reproducidas = new CollectionExpression("ORM_ultimas_reproducidas", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		lista_seguida = new CollectionExpression("ORM_lista_seguida", this.getDetachedCriteria());
		estiloId = new IntegerExpression("estilo.id", this.getDetachedCriteria());
		estilo = new AssociationExpression("estilo", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		albumes = new CollectionExpression("ORM_albumes", this.getDetachedCriteria());
		eventos = new CollectionExpression("ORM_eventos", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ArtistaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		datosId = new IntegerExpression("datos.id", this.getDetachedCriteria());
		datos = new AssociationExpression("datos", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoRuta = new StringExpression("fotoRuta", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		listas = new CollectionExpression("ORM_listas", this.getDetachedCriteria());
		favoritaId = new IntegerExpression("favorita.id", this.getDetachedCriteria());
		favorita = new AssociationExpression("favorita", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		estadisticaId = new IntegerExpression("estadistica.id", this.getDetachedCriteria());
		estadistica = new AssociationExpression("estadistica", this.getDetachedCriteria());
		ultimas_reproducidas = new CollectionExpression("ORM_ultimas_reproducidas", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		lista_seguida = new CollectionExpression("ORM_lista_seguida", this.getDetachedCriteria());
		estiloId = new IntegerExpression("estilo.id", this.getDetachedCriteria());
		estilo = new AssociationExpression("estilo", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		albumes = new CollectionExpression("ORM_albumes", this.getDetachedCriteria());
		eventos = new CollectionExpression("ORM_eventos", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
	}
	
	public EstiloDetachedCriteria createEstiloCriteria() {
		return new EstiloDetachedCriteria(createCriteria("estilo"));
	}
	
	public EstadisticaDetachedCriteria createAparece_enCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public AlbumDetachedCriteria createAlbumesCriteria() {
		return new AlbumDetachedCriteria(createCriteria("ORM_albumes"));
	}
	
	public EventoDetachedCriteria createEventosCriteria() {
		return new EventoDetachedCriteria(createCriteria("ORM_eventos"));
	}
	
	public CancionDetachedCriteria createCancionesCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_canciones"));
	}
	
	public Datos_AccesoDetachedCriteria createDatosCriteria() {
		return new Datos_AccesoDetachedCriteria(createCriteria("datos"));
	}
	
	public Usuario_genericoDetachedCriteria createSeguidorCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createListasCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_listas"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createFavoritaCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("favorita"));
	}
	
	public Usuario_genericoDetachedCriteria createSeguidoCriteria() {
		return new Usuario_genericoDetachedCriteria(createCriteria("ORM_seguido"));
	}
	
	public EstadisticaDetachedCriteria createEstadisticaCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("estadistica"));
	}
	
	public CancionDetachedCriteria createUltimas_reproducidasCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_ultimas_reproducidas"));
	}
	
	public EventoDetachedCriteria createNotificacionesCriteria() {
		return new EventoDetachedCriteria(createCriteria("ORM_notificaciones"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createLista_seguidaCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_lista_seguida"));
	}
	
	public Artista uniqueArtista(PersistentSession session) {
		return (Artista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Artista[] listArtista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

