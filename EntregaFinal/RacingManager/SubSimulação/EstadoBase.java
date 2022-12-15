public class EstadoBase {
	public EstadoJogador _estadosJogadoresMap;

	public EstadoJogador getEstadoJogador(String aJogadorID) {
		throw new UnsupportedOperationException();
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