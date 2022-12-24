package SubSimulacao;

import java.util.List;
import java.util.function.Consumer;

import SubCarros.Carro;
import SubCampeonatos.Campeonato;
import SubPilotos.Piloto;

public class SubSimulacao implements ISubSimulacao {
	public CampeonatoAtivoDAO _campeonatoMap;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._campeonatoMap != null ) {
			lHashCode += this._campeonatoMap.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof SubSimulacao) {
			SubSimulacao lSubSimulacaoObject = (SubSimulacao) aObject;
			boolean lEquals = true;
			lEquals &= ((this._campeonatoMap == lSubSimulacaoObject._campeonatoMap)
				|| (this._campeonatoMap != null && this._campeonatoMap.equals(lSubSimulacaoObject._campeonatoMap)));
			return lEquals;
		}
		return false;
	}

	public void registarJogador(Campeonato aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto) {
		throw new UnsupportedOperationException();
	}

	public void jogadorPronto(Campeonato aCampeonato, String aJogadorID) {
		throw new UnsupportedOperationException();
	}

	public CorridaBase simularCorridaBase(Campeonato aCampeonato) {
		throw new UnsupportedOperationException();
	}

	public CorridaPremium simularCorridaPremium(Campeonato aCampeonato) {
		throw new UnsupportedOperationException();
	}

	public List<DadosJogador> ranking(Campeonato aCampeonato) {
		throw new UnsupportedOperationException();
	}

	public void afinarCarro(Campeonato aCampeonato, String aJogadorID, Consumer<Carro> aFunc) {
		throw new UnsupportedOperationException();
	}

	public boolean temProxCorrida(Campeonato aCampeonato) {
		throw new UnsupportedOperationException();
	}
}