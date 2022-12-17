import java.util.ArrayList;
import java.util.List;

public class CorridaBase extends Corrida {
	public ArrayList<EstadoBase> _listaEstados = new ArrayList<EstadoBase>();

	public List<EstadoBase> getListaEstados() {
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
		} else if (aObject instanceof CorridaBase) {
			CorridaBase lCorridaBaseObject = (CorridaBase) aObject;
			boolean lEquals = true;
			lEquals &= ((this._listaEstados == lCorridaBaseObject._listaEstados)
				|| (this._listaEstados != null && this._listaEstados.equals(lCorridaBaseObject._listaEstados)));
			return lEquals;
		}
		return false;
	}
}