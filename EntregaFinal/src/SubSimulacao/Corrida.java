package EntregaFinal.src.SubSimulacao;

import java.util.HashMap;
import java.util.Map;

import EntregaFinal.src.SubCampeonatos.Circuito;
import EntregaFinal.src.SubCampeonatos.SubCampeonatosFacade;

public abstract class Corrida {
	private Circuito circuito;
	private SubCampeonatosFacade _circuito;
	private Map<String,DadosJogador> _dadosJogador = new HashMap<>();

	public DadosJogador getDadosJogador(String aJogadorID) {
		return this._dadosJogador.get(aJogadorID);
	}
	
	public SubCampeonatosFacade get_circuito() {
		return _circuito;
	}

	public Map<String, DadosJogador> get_dadosJogador() {
		return _dadosJogador;
	}

	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}

	public void set_circuito(SubCampeonatosFacade _circuito) {
		this._circuito = _circuito;
	}

	public void set_dadosJogador(Map<String, DadosJogador> _dadosJogador) {
		this._dadosJogador = _dadosJogador;
	}

	public void run() {

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