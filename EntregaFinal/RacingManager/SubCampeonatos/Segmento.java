public class Segmento {
	private Float _tamanho;
	private String _gDU;
	private String _tipo;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._tamanho != null ) {
			lHashCode += this._tamanho.hashCode();
		}
		if ( this._gDU != null ) {
			lHashCode += this._gDU.hashCode();
		}
		if ( this._tipo != null ) {
			lHashCode += this._tipo.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof Segmento) {
			Segmento lSegmentoObject = (Segmento) aObject;
			boolean lEquals = true;
			lEquals &= ((this._tamanho == lSegmentoObject._tamanho)
				|| (this._tamanho != null && this._tamanho.equals(lSegmentoObject._tamanho)));
			lEquals &= ((this._gDU == lSegmentoObject._gDU)
				|| (this._gDU != null && this._gDU.equals(lSegmentoObject._gDU)));
			lEquals &= ((this._tipo == lSegmentoObject._tipo)
				|| (this._tipo != null && this._tipo.equals(lSegmentoObject._tipo)));
			return lEquals;
		}
		return false;
	}
}