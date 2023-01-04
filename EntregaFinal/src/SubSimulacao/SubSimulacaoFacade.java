package EntregaFinal.src.SubSimulacao;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;
import EntregaFinal.src.data.CampeonatoAtivoDAO;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;


public class SubSimulacaoFacade implements ISubSimulacao {
	public CampeonatoAtivoDAO _campeonatoMap = CampeonatoAtivoDAO.getInstance();
	
	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof SubSimulacaoFacade) {
			SubSimulacaoFacade lSubSimulaçaoObject = (SubSimulacaoFacade) aObject;
			boolean lEquals = true;
			lEquals &= ((this._campeonatoMap == lSubSimulaçaoObject._campeonatoMap)
				|| (this._campeonatoMap != null && this._campeonatoMap.equals(lSubSimulaçaoObject._campeonatoMap)));
			return lEquals;
		}
		return false;
	}

	public void registarJogador(int aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto) {
		CampeonatoAtivo cAtiv;	
		if(!this._campeonatoMap.containsKey(aCampeonato)){
			throw new IllegalArgumentException("CampeonatoAtivo não existe: " + aCampeonato);
			
		}
		cAtiv = this._campeonatoMap.get(aCampeonato);
		
		cAtiv.novoJogador(aJogadorID, aCarro, aPiloto);
		this._campeonatoMap.put(aCampeonato, cAtiv);
	}

	public void jogadorPronto(int aCampeonato, String aJogadorID) {
		if(!this._campeonatoMap.containsKey(aCampeonato)){
			throw new IllegalArgumentException("CampeonatoAtivo não existe: " + aCampeonato);
		}
		CampeonatoAtivo cAtiv = this._campeonatoMap.get(aCampeonato);
		cAtiv.jogadorPronto(aJogadorID);
	}

	public CorridaBase simularCorridaBase(int aCampeonato) {
		if(!this._campeonatoMap.containsKey(aCampeonato)){
			throw new IllegalArgumentException("CampeonatoAtivo não existe: " + aCampeonato);
		}
		CampeonatoAtivo cAtiv = this._campeonatoMap.get(aCampeonato);
		return cAtiv.simularCorridaBase();
	}

	public CorridaPremium simularCorridaPremium(int aCampeonato) {
		if(!this._campeonatoMap.containsKey(aCampeonato)){
			throw new IllegalArgumentException("CampeonatoAtivo não existe: " + aCampeonato);
		}
		CampeonatoAtivo cAtiv = this._campeonatoMap.get(aCampeonato);
		return cAtiv.simularCorridaPremium();
	}

	public List<DadosJogador> ranking(int aCampeonato) {
		if(!this._campeonatoMap.containsKey(aCampeonato)){
			throw new IllegalArgumentException("CampeonatoAtivo não existe: " + aCampeonato);
		}
		CampeonatoAtivo cAtiv = this._campeonatoMap.get(aCampeonato);
		return cAtiv.ranking();
	}

	public void afinarCarro(int aCampeonato, String aJogadorID, Consumer<Carro> aFunc) {
		if(!this._campeonatoMap.containsKey(aCampeonato)){
			throw new IllegalArgumentException("CampeonatoAtivo não existe: " + aCampeonato);
		}
		CampeonatoAtivo cAtiv = this._campeonatoMap.get(aCampeonato);
		cAtiv.afinarCarro(aJogadorID, aFunc);
	}

	public boolean temProxCorrida(int aCampeonato) {
		if(!this._campeonatoMap.containsKey(aCampeonato)){
			throw new IllegalArgumentException("CampeonatoAtivo não existe: " + aCampeonato);
		}
		CampeonatoAtivo cAtiv = this._campeonatoMap.get(aCampeonato);
		return cAtiv.temProxCorrida();
	}

	@Override
	public int comecarCampeonato(Campeonato campeonato) {
		CampeonatoAtivo cAtiv = new CampeonatoAtivo(campeonato);
		this._campeonatoMap.put(cAtiv.getId(), cAtiv);
		return cAtiv.getId();
	}

	@Override
	public Map<Campeonato, List<Integer>> buscarCampeonatosEmProgresso() {
		// TODO Auto-generated method stub
		return null;
	}
}