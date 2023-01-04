package EntregaFinal.src.SubSimulacao;

import java.util.ArrayList;
import java.util.List;

public class CorridaPremium extends Corrida {
	public ArrayList<EstadoPremium> _listaEstados = new ArrayList<EstadoPremium>();

	public List<EstadoPremium> getListaEstados() {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._listaEstados != null ) {
			lHashCode += this._listaEstados.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CorridaPremium) {
			CorridaPremium lCorridaPremiumObject = (CorridaPremium) aObject;
			boolean lEquals = true;
			lEquals &= ((this._listaEstados == lCorridaPremiumObject._listaEstados)
				|| (this._listaEstados != null && this._listaEstados.equals(lCorridaPremiumObject._listaEstados)));
			return lEquals;
		}
		return false;
	}
}