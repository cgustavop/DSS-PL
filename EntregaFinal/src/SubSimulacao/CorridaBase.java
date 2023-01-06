package EntregaFinal.src.SubSimulacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import EntregaFinal.src.SubCampeonatos.Circuito;
import EntregaFinal.src.SubCampeonatos.SubCampeonatosFacade;

public class CorridaBase extends Corrida {
	public List<EstadoBase> _listaEstados = new ArrayList<EstadoBase>();

	public CorridaBase() {
	}

	public List<EstadoBase> getListaEstados() {
		//TODO:
		throw new UnsupportedOperationException();
	}	

	@Override
	public DadosJogador getDadosJogador(String aJogadorID) {
		return super.getDadosJogador(aJogadorID);
	}

	@Override
	public SubCampeonatosFacade get_circuito() {
		return super.get_circuito();
	}

	@Override
	public Circuito getCircuito() {
		return super.getCircuito();
	}

	@Override
	public void setCircuito(Circuito circuito) {
		super.setCircuito(circuito);
	}

	@Override
	public Map<String, DadosJogador> get_dadosJogador() {
		return super.get_dadosJogador();
	}
	
	@Override
	public void set_dadosJogador(Map<String, DadosJogador> _dadosJogador) {
		super.set_dadosJogador(_dadosJogador);
	}

	public List<EstadoBase> get_listaEstados() {
		return _listaEstados;
	}

	public void set_listaEstados(ArrayList<EstadoBase> _listaEstados) {
		this._listaEstados = _listaEstados;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CorridaBase) {
			CorridaBase lCorridaBaseObject = (CorridaBase) aObject;
			boolean lEquals = true;
			lEquals &= ((this._listaEstados == lCorridaBaseObject._listaEstados)
				|| (this._listaEstados != null && this._listaEstados.equals(lCorridaBaseObject._listaEstados)));
			return lEquals;
		}
		return false;
	}
}