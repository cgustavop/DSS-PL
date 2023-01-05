package EntregaFinal.src.SubSimulacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import EntregaFinal.src.SubCampeonatos.Circuito;
import EntregaFinal.src.SubCampeonatos.SubCampeonatosFacade;

public class CorridaPremium extends Corrida {
	public List<EstadoPremium> _listaEstados = new ArrayList<EstadoPremium>();

	public List<EstadoPremium> getListaEstados() {
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
	public void set_circuito(SubCampeonatosFacade _circuito) {
		super.set_circuito(_circuito);
	}

	public void set_listaEstados(ArrayList<EstadoPremium> _listaEstados) {
		this._listaEstados = _listaEstados;
	}

	@Override
	public Map<String, DadosJogador> get_dadosJogador() {
		// TODO Auto-generated method stub
		return super.get_dadosJogador();
	}

	@Override
	public Circuito getCircuito() {
		// TODO Auto-generated method stub
		return super.getCircuito();
	}

	@Override
	public void setCircuito(Circuito circuito) {
		// TODO Auto-generated method stub
		super.setCircuito(circuito);
	}

	@Override
	public void set_dadosJogador(Map<String, DadosJogador> _dadosJogador) {
		// TODO Auto-generated method stub
		super.set_dadosJogador(_dadosJogador);
	}

	public List<EstadoPremium> get_listaEstados() {
		return _listaEstados;
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._listaEstados != null ) {
			lHashCode += this._listaEstados.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CorridaPremium) {
			CorridaPremium lCorridaPremiumObject = (CorridaPremium) aObject;
			boolean lEquals = true;
			lEquals &= ((this._listaEstados == lCorridaPremiumObject._listaEstados)
				|| (this._listaEstados != null && this._listaEstados.equals(lCorridaPremiumObject._listaEstados)));
			return lEquals;
		}
		return false;
	}
}