package EntregaFinal.src.SubSimulação;

import EntregaFinal.src.SubCarros.SubCarroFacade;
import EntregaFinal.src.SubPilotos.SubPilotoFacade;

public class DadosJogador {
	private String _jogadorID;
	public SubCarroFacade _carro;
	public SubPilotoFacade _piloto;

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