package EntregaFinal.src.SubCampeonatos;

import java.util.ArrayList;
import java.util.List;

public class SubCampeonatosFacade implements ISubCampeonatos {
	private CampeonatoDAO _campeonatos;
	private CircuitoDAO _circuitos;

	public Boolean nomeCampeonatoDisponivel(String aNome) {
		return this._campeonatos.containsKey(aNome);
	}

	public Boolean nomeCircuitoDisponivel(String aNome) {
		return this._circuitos.containsKey(aNome);
	}

	public void registarCircuito(Circuito aCircuito) {
		this._circuitos.put(aCircuito.get_nome(),aCircuito);
	}

	public List<Circuito> circuitosExistentes() {
		return new ArrayList<>(this._circuitos.values());
	}

	public void registarCampeonato(Campeonato aCampeonato) {
		this._campeonatos.put(aCampeonato.get_nome(),aCampeonato);
	}

	public List<Campeonato> campeonatosIndisponiveis() {
		return this._campeonatos.getCampeonatosIndisponiveis();
	}

	public void disponibilizarCampeonato(Campeonato aCampeonato) {
		aCampeonato.set_disponibilidade(true);
		this._campeonatos.put(aCampeonato.get_nome(), aCampeonato);
	}

	public List<Campeonato> campeonatosDisponiveis() {
		return this._campeonatos.getCampeonatosDisponiveis();
	}

	public void indisponibilizarCampeonato(Campeonato aCampeonato) {
		aCampeonato.set_disponibilidade(false);
		this._campeonatos.put(aCampeonato.get_nome(), aCampeonato);
	}

	public Integer calcularRetas(Integer aNrCurvas, Integer aNrChicanes) {
		return aNrChicanes + aNrCurvas;
	}
}