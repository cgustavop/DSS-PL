package EntregaFinal.src.SubSimulacao;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;
import EntregaFinal.src.data.CampeonatoAtivoDAO;

import java.util.List;
import java.util.function.Consumer;

public class SubSimulacao implements ISubSimulacao {
	public CampeonatoAtivoDAO _campeonatoMap;
	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof SubSimulacao) {
			SubSimulacao lSubSimulaçaoObject = (SubSimulacao) aObject;
			boolean lEquals = true;
			lEquals &= ((this._campeonatoMap == lSubSimulaçaoObject._campeonatoMap)
				|| (this._campeonatoMap != null && this._campeonatoMap.equals(lSubSimulaçaoObject._campeonatoMap)));
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