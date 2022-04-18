package spotify;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class GestorVentana {

	private static VerticalLayout _layoutPrincipal;
	
	private static Component _ventanaAnterior;
	
	public static void setLayoutPrincipal(VerticalLayout layoutPrincipal) {
		_layoutPrincipal = layoutPrincipal;
	}
	
	public static void CambiarVentana(Component nuevaVentana) {
		
//		if (_layoutPrincipal.getComponentCount() > 0) {
//			_ventanaAnterior = _layoutPrincipal.getComponentAt(0);
//		}
		
		_layoutPrincipal.removeAll();
		_layoutPrincipal.add(nuevaVentana);
	}
	
	public static void Atras() {
		if (_ventanaAnterior == null)
			return;
		
		_layoutPrincipal.removeAll();
		_layoutPrincipal.add(_ventanaAnterior);
		_ventanaAnterior = null;
	}
}
