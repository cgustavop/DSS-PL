package EntregaFinal.src.SubSimulacao;

import EntregaFinal.src.SubCarros.SubCarroFacade;
import EntregaFinal.src.SubPilotos.SubPilotoFacade;

public class DadosJogador {
	private String _jogadorID;
	public SubCarroFacade _carro;
	public SubPilotoFacade _piloto;

	public void set_jogadorID(String _jogadorID) {
		this._jogadorID = _jogadorID;
	}

	public String get_jogadorID() {
		return _jogadorID;
	}

	public void set_carro(SubCarroFacade _carro) {
		this._carro = _carro;
	}

	public void set_piloto(SubPilotoFacade _piloto) {
		this._piloto = _piloto;
	}

	public SubCarroFacade get_carro() {
		return _carro;
	}

	public SubPilotoFacade get_piloto() {
		return _piloto;
	}
	
	public int hashCode() {
		int lHashCode = 0;
		if ( this._jogadorID != null ) {
			lHashCode += this._jogadorID.hashCode();
		}
		if ( this._carro != null ) {
			lHashCode += this._carro.hashCode();
		}
		if ( this._piloto != null ) {
			lHashCode += this._piloto.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof DadosJogador) {
			DadosJogador lDadosJogadorObject = (DadosJogador) aObject;
			boolean lEquals = true;
			lEquals &= ((this._jogadorID == lDadosJogadorObject._jogadorID)
				|| (this._jogadorID != null && this._jogadorID.equals(lDadosJogadorObject._jogadorID)));
			lEquals &= ((this._carro == lDadosJogadorObject._carro)
				|| (this._carro != null && this._carro.equals(lDadosJogadorObject._carro)));
			lEquals &= ((this._piloto == lDadosJogadorObject._piloto)
				|| (this._piloto != null && this._piloto.equals(lDadosJogadorObject._piloto)));
			return lEquals;
		}
		return false;
	}
}