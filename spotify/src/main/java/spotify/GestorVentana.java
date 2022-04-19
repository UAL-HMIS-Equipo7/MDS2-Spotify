package spotify;

import java.util.Vector;
import java.util.stream.Stream;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

public class GestorVentana {

	private static VerticalLayout _layoutPrincipal;
	
	private static Component[] _historialVentanas = new Component[2];
	private static int _index = 0;
	
	public static void setLayoutPrincipal(VerticalLayout layoutPrincipal) {
		_layoutPrincipal = layoutPrincipal;
	}
	
	
	public static void CambiarVentana(Component nuevaVentana) {
		
		_historialVentanas[_index] = nuevaVentana;
		
		_layoutPrincipal.removeAll();
		_layoutPrincipal.add(nuevaVentana);
		
		_index++;
		_index = _index % 2;
	}
	
	public static void Atras() {
		
		CambiarVentana(_historialVentanas[_index]);
	}
}
