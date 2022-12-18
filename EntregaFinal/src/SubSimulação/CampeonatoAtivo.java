package EntregaFinal.src.SubSimulação;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CampeonatoAtivo {
	private int _nCorridaAtual;
	public SubCampeonatosFacade _campeonato;
	public JogadorAtivoDAO _jogadorAtivoMap;
	public ArrayList<DadosJogador> _listOrdPos = new ArrayList<DadosJogador>();

	public CorridaBase simularCorridaBase() {
		throw new UnsupportedOperationException();
	}

	public CorridaPremium simularCorridaPremium() {
		throw new UnsupportedOperationException();
	}

	public List<DadosJogador> ranking() {
		throw new UnsupportedOperationException();
	}

	public void jogadorPronto(String aJogadorID) {
		throw new UnsupportedOperationException();
	}

	public void afinarCarro(String aJogadorID, Consumer<Carro> aFunc) {
		throw new UnsupportedOperationException();
	}

	public void novoJogador(String aJogadorID, Carro aCarro, Piloto aPiloto) {
		throw new UnsupportedOperationException();
	}

	public boolean estaoJogadoresProntos() {
		throw new UnsupportedOperationException();
	}

	public boolean temProxCorrida() {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._campeonato != null ) {
			lHashCode += this._campeonato.hashCode();
		}
		if ( this._jogadorAtivoMap != null ) {
			lHashCode += this._jogadorAtivoMap.hashCode();
		}
		if ( this._listOrdPos != null ) {
			lHashCode += this._listOrdPos.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CampeonatoAtivo) {
			CampeonatoAtivo lCampeonatoAtivoObject = (CampeonatoAtivo) aObject;
			boolean lEquals = true;
			lEquals &= this._nCorridaAtual == lCampeonatoAtivoObject._nCorridaAtual;
			lEquals &= ((this._campeonato == lCampeonatoAtivoObject._campeonato)
				|| (this._campeonato != null && this._campeonato.equals(lCampeonatoAtivoObject._campeonato)));
			lEquals &= ((this._jogadorAtivoMap == lCampeonatoAtivoObject._jogadorAtivoMap)
				|| (this._jogadorAtivoMap != null && this._jogadorAtivoMap.equals(lCampeonatoAtivoObject._jogadorAtivoMap)));
			lEquals &= ((this._listOrdPos == lCampeonatoAtivoObject._listOrdPos)
				|| (this._listOrdPos != null && this._listOrdPos.equals(lCampeonatoAtivoObject._listOrdPos)));
			return lEquals;
		}
		return false;
	}
}