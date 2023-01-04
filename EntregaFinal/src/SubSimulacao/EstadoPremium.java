package EntregaFinal.src.SubSimulacao;

public class EstadoPremium {
	public EstadoJogadorPremium _estadosJogadoresMap;

	public EstadoJogadorPremium getEstadoJogador(String aJogadorID) {
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
		} else if (aObject instanceof EstadoPremium) {
			EstadoPremium lEstadoPremiumObject = (EstadoPremium) aObject;
			boolean lEquals = true;
			lEquals &= ((this._estadosJogadoresMap == lEstadoPremiumObject._estadosJogadoresMap)
				|| (this._estadosJogadoresMap != null && this._estadosJogadoresMap.equals(lEstadoPremiumObject._estadosJogadoresMap)));
			return lEquals;
		}
		return false;
	}
}