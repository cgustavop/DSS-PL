package EntregaFinal.src.SubSimulacao;

public class EstadoJogador {
	private int _segmento;
	private int _volta;
	private EstadoCarro _estadoCarro;

	public EstadoCarro get_estadoCarro() {
		return _estadoCarro;
	}

	public int get_segmento() {
		return _segmento;
	}

	public int get_volta() {
		return _volta;
	}

	public void set_estadoCarro(EstadoCarro _estadoCarro) {
		this._estadoCarro = _estadoCarro;
	}
	
	public void set_segmento(int _segmento) {
		this._segmento = _segmento;
	}

	public void set_volta(int _volta) {
		this._volta = _volta;
	}	
	
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