package EntregaFinal.src.SubSimulacao;

import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;

public class JogadorAtivo{
	private Boolean _pronto;
	private int _nAfinaçoes;
	private String _idCampeonato;
	private DadosJogador _dados; 

	public JogadorAtivo(String Id, Carro carro, Piloto aPiloto, Integer nAfin, String camp){
		this._pronto = false;
		this._nAfinaçoes = nAfin;
		this._idCampeonato = camp;
		this._dados = new DadosJogador(Id, carro, aPiloto);
	}
	
	public DadosJogador get_dados() {
		return _dados;
	}

	public int get_nAfinaçoes() {
		return _nAfinaçoes;
	}

	public Boolean get_pronto() {
		return _pronto;
	}

	public void set_dados(DadosJogador _dados) {
		this._dados = _dados;
	}

	public void set_nAfinaçoes(int _nAfinaçoes) {
		this._nAfinaçoes = _nAfinaçoes;
	}

	public void set_pronto(Boolean _pronto) {
		this._pronto = _pronto;
	}

	public String get_idCampeonato() {
		return _idCampeonato;
	}

	public void set_idCampeonato(String _idCampeonato) {
		this._idCampeonato = _idCampeonato;
	}
	
	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof JogadorAtivo) {
			JogadorAtivo lJogadorAtivoObject = (JogadorAtivo) aObject;
			boolean lEquals = true;
			lEquals &= ((this._pronto == lJogadorAtivoObject._pronto)
				|| (this._pronto != null && this._pronto.equals(lJogadorAtivoObject._pronto)));
			lEquals &= this._nAfinaçoes == lJogadorAtivoObject._nAfinaçoes;
			lEquals &= ((this._dados == lJogadorAtivoObject._dados)
				|| (this._dados != null && this._dados.equals(lJogadorAtivoObject._dados)));
			return lEquals;
		}
		return false;
	}
}