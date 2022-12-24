package SubCampeonatos;

import java.util.ArrayList;

public class Circuito {
	private String _nome;
	private Integer _nr_voltas;
	private Integer _nr_curvas;
	private Integer _nr_chicanes;
	private ArrayList<Segmento> _segmentos = new ArrayList<Segmento>();
	public TempoMetereologico _tempo_metereologico;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._nome != null ) {
			lHashCode += this._nome.hashCode();
		}
		if ( this._nr_voltas != null ) {
			lHashCode += this._nr_voltas.hashCode();
		}
		if ( this._nr_curvas != null ) {
			lHashCode += this._nr_curvas.hashCode();
		}
		if ( this._nr_chicanes != null ) {
			lHashCode += this._nr_chicanes.hashCode();
		}
		if ( this._segmentos != null ) {
			lHashCode += this._segmentos.hashCode();
		}
		if ( this._tempo_metereologico != null ) {
			lHashCode += this._tempo_metereologico.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof Circuito) {
			Circuito lCircuitoObject = (Circuito) aObject;
			boolean lEquals = true;
			lEquals &= ((this._nome == lCircuitoObject._nome)
				|| (this._nome != null && this._nome.equals(lCircuitoObject._nome)));
			lEquals &= ((this._nr_voltas == lCircuitoObject._nr_voltas)
				|| (this._nr_voltas != null && this._nr_voltas.equals(lCircuitoObject._nr_voltas)));
			lEquals &= ((this._nr_curvas == lCircuitoObject._nr_curvas)
				|| (this._nr_curvas != null && this._nr_curvas.equals(lCircuitoObject._nr_curvas)));
			lEquals &= ((this._nr_chicanes == lCircuitoObject._nr_chicanes)
				|| (this._nr_chicanes != null && this._nr_chicanes.equals(lCircuitoObject._nr_chicanes)));
			lEquals &= ((this._segmentos == lCircuitoObject._segmentos)
				|| (this._segmentos != null && this._segmentos.equals(lCircuitoObject._segmentos)));
			lEquals &= ((this._tempo_metereologico == lCircuitoObject._tempo_metereologico)
				|| (this._tempo_metereologico != null && this._tempo_metereologico.equals(lCircuitoObject._tempo_metereologico)));
			return lEquals;
		}
		return false;
	}
}