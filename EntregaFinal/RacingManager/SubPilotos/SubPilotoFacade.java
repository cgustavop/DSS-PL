public class SubPilotoFacade implements ISubPiloto {
	private PilotoDAO _pilotos;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._pilotos != null ) {
			lHashCode += this._pilotos.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof SubPilotoFacade) {
			SubPilotoFacade lSubPilotoFacadeObject = (SubPilotoFacade) aObject;
			boolean lEquals = true;
			lEquals &= ((this._pilotos == lSubPilotoFacadeObject._pilotos)
				|| (this._pilotos != null && this._pilotos.equals(lSubPilotoFacadeObject._pilotos)));
			return lEquals;
		}
		return false;
	}

	public boolean nomePilotoDisponivel(String aNome) {
		throw new UnsupportedOperationException();
	}

	public boolean niveisPericiaValidos(float aCts, float aSva) {
		throw new UnsupportedOperationException();
	}

	public void registarPiloto(Piloto aPiloto) {
		throw new UnsupportedOperationException();
	}
}