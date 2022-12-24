package SubSimulacao;

import SubCampeonatos.SubCampeonatosFacade;

public class Corrida {
	public SubCampeonatosFacade _circuito;
	public DadosJogador _dadosJogador;

	public DadosJogador getDadosJogador(String aJogadorID) {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._circuito != null ) {
			lHashCode += this._circuito.hashCode();
		}
		if ( this._dadosJogador != null ) {
			lHashCode += this._dadosJogador.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof Corrida) {
			Corrida lCorridaObject = (Corrida) aObject;
			boolean lEquals = true;
			lEquals &= ((this._circuito == lCorridaObject._circuito)
				|| (this._circuito != null && this._circuito.equals(lCorridaObject._circuito)));
			lEquals &= ((this._dadosJogador == lCorridaObject._dadosJogador)
				|| (this._dadosJogador != null && this._dadosJogador.equals(lCorridaObject._dadosJogador)));
			return lEquals;
		}
		return false;
	}
}