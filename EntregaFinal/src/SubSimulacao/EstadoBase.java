package EntregaFinal.src.SubSimulacao;

import java.util.HashMap;
import java.util.Map;

public class EstadoBase {
	private Map<String,EstadoJogador> _estadosJogadoresMap = new HashMap<>();

	public EstadoJogador getEstadoJogador(String aJogadorID) {
		return this._estadosJogadoresMap.get(aJogadorID);
	}

	public Map<String, EstadoJogador> get_estadosJogadoresMap() {
		return _estadosJogadoresMap;
	}

	public void set_estadosJogadoresMap( Map<String, EstadoJogador> _estadosJogadoresMap) {
		this._estadosJogadoresMap = _estadosJogadoresMap;
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._estadosJogadoresMap != null ) {
			lHashCode += this._estadosJogadoresMap.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof EstadoBase) {
			EstadoBase lEstadoBaseObject = (EstadoBase) aObject;
			boolean lEquals = true;
			lEquals &= ((this._estadosJogadoresMap == lEstadoBaseObject._estadosJogadoresMap)
				|| (this._estadosJogadoresMap != null && this._estadosJogadoresMap.equals(lEstadoBaseObject._estadosJogadoresMap)));
			return lEquals;
		}
		return false;
	}
}