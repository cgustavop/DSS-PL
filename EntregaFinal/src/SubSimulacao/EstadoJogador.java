package EntregaFinal.src.SubSimulacao;

public class EstadoJogador {
	private int _segmento;
	private int _volta;
	public EstadoCarro _estadoCarro;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._estadoCarro != null ) {
			lHashCode += this._estadoCarro.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof EstadoJogador) {
			EstadoJogador lEstadoJogadorObject = (EstadoJogador) aObject;
			boolean lEquals = true;
			lEquals &= this._segmento == lEstadoJogadorObject._segmento;
			lEquals &= this._volta == lEstadoJogadorObject._volta;
			lEquals &= ((this._estadoCarro == lEstadoJogadorObject._estadoCarro)
				|| (this._estadoCarro != null && this._estadoCarro.equals(lEstadoJogadorObject._estadoCarro)));
			return lEquals;
		}
		return false;
	}
}