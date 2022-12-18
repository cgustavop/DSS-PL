package EntregaFinal.src.SubCampeonatos;

import java.util.List;

public class SubCampeonatosFacade implements ISubCampeonatos {
	private CampeonatoDAO _campeonatos;
	private CircuitoDAO _circuitos;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._campeonatos != null ) {
			lHashCode += this._campeonatos.hashCode();
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
		} else if (aObject instanceof SubCampeonatosFacade) {
			SubCampeonatosFacade lSubCampeonatosFacadeObject = (SubCampeonatosFacade) aObject;
			boolean lEquals = true;
			lEquals &= ((this._campeonatos == lSubCampeonatosFacadeObject._campeonatos)
				|| (this._campeonatos != null && this._campeonatos.equals(lSubCampeonatosFacadeObject._campeonatos)));
			lEquals &= ((this._circuitos == lSubCampeonatosFacadeObject._circuitos)
				|| (this._circuitos != null && this._circuitos.equals(lSubCampeonatosFacadeObject._circuitos)));
			return lEquals;
		}
		return false;
	}

	public Boolean nomeCampeonatoDisponivel(String aNome) {
		throw new UnsupportedOperationException();
	}

	public Boolean nomeCircuitoDisponivel(String aNome) {
		throw new UnsupportedOperationException();
	}

	public void registarCircuito(Circuito aCircuito) {
		throw new UnsupportedOperationException();
	}

	public List<Circuito> circuitosExistentes() {
		throw new UnsupportedOperationException();
	}

	public void registarCampeonato(Campeonato aCampeonato) {
		throw new UnsupportedOperationException();
	}

	public List<Campeonato> campeonatosIndisponiveis() {
		throw new UnsupportedOperationException();
	}

	public void disponibilizarCampeonato(Campeonato aCampeonato) {
		throw new UnsupportedOperationException();
	}

	public List<Campeonato> campeonatosDisponiveis() {
		throw new UnsupportedOperationException();
	}

	public void indisponibilizarCampeonato(Campeonato aCampeonato) {
		throw new UnsupportedOperationException();
	}

	public Integer calcularRetas(Integer aNrCurvas, Integer aNrChicanes) {
		throw new UnsupportedOperationException();
	}
}