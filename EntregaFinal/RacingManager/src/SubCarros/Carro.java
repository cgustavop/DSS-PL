package SubCarros;

public class Carro {
	private String _marca;
	private String _modelo;
	private int _cilindrada;
	private int _potencia;
	private int _fiabilidade;
	private String _iD;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._marca != null ) {
			lHashCode += this._marca.hashCode();
		}
		if ( this._modelo != null ) {
			lHashCode += this._modelo.hashCode();
		}
		if ( this._iD != null ) {
			lHashCode += this._iD.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof Carro) {
			Carro lCarroObject = (Carro) aObject;
			boolean lEquals = true;
			lEquals &= ((this._marca == lCarroObject._marca)
				|| (this._marca != null && this._marca.equals(lCarroObject._marca)));
			lEquals &= ((this._modelo == lCarroObject._modelo)
				|| (this._modelo != null && this._modelo.equals(lCarroObject._modelo)));
			lEquals &= this._cilindrada == lCarroObject._cilindrada;
			lEquals &= this._potencia == lCarroObject._potencia;
			lEquals &= this._fiabilidade == lCarroObject._fiabilidade;
			lEquals &= ((this._iD == lCarroObject._iD)
				|| (this._iD != null && this._iD.equals(lCarroObject._iD)));
			return lEquals;
		}
		return false;
	}
}