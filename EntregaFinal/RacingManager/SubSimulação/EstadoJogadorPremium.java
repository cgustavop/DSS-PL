public class EstadoJogadorPremium extends EstadoJogador {
	private int _tempoTotal;

	public int hashCode() {
		int lHashCode = 0;
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof EstadoJogadorPremium) {
			EstadoJogadorPremium lEstadoJogadorPremiumObject = (EstadoJogadorPremium) aObject;
			boolean lEquals = true;
			lEquals &= this._tempoTotal == lEstadoJogadorPremiumObject._tempoTotal;
			return lEquals;
		}
		return false;
	}
}