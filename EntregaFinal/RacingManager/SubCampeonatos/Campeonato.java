import java.util.ArrayList;

public class Campeonato {
	private String _nome;
	private Integer _nr_circuitos;
	private Boolean _disponibilidade;
	private ArrayList<CircuitoDAO> _circuitos = new ArrayList<CircuitoDAO>();

	public void addCircuito(String aNome) {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._nome != null ) {
			lHashCode += this._nome.hashCode();
		}
		if ( this._nr_circuitos != null ) {
			lHashCode += this._nr_circuitos.hashCode();
		}
		if ( this._disponibilidade != null ) {
			lHashCode += this._disponibilidade.hashCode();
		}
		if ( this._circuitos != null ) {
			lHashCode += this._circuitos.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof Campeonato) {
			Campeonato lCampeonatoObject = (Campeonato) aObject;
			boolean lEquals = true;
			lEquals &= ((this._nome == lCampeonatoObject._nome)
				|| (this._nome != null && this._nome.equals(lCampeonatoObject._nome)));
			lEquals &= ((this._nr_circuitos == lCampeonatoObject._nr_circuitos)
				|| (this._nr_circuitos != null && this._nr_circuitos.equals(lCampeonatoObject._nr_circuitos)));
			lEquals &= ((this._disponibilidade == lCampeonatoObject._disponibilidade)
				|| (this._disponibilidade != null && this._disponibilidade.equals(lCampeonatoObject._disponibilidade)));
			lEquals &= ((this._circuitos == lCampeonatoObject._circuitos)
				|| (this._circuitos != null && this._circuitos.equals(lCampeonatoObject._circuitos)));
			return lEquals;
		}
		return false;
	}
}