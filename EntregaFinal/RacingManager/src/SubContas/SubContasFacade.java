package SubContas;

public class SubContasFacade implements ISubContas {
	private ContasDAO _contas;

	@Override
	public boolean nomeDisponivel(String aNome) {
		return false;
	}

	@Override
	public void registarConta(String aNome, String aPassword, userType aType) {

	}

	@Override
	public boolean validarConta(String aNome, String aPassword) {
		return false;
	}

	@Override
	public userType autenticarConta(String aNome) {
		return null;
	}

	@Override
	public void atribuirPontos(String aNome, Integer aPontos) {

	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._contas != null ) {
			lHashCode += this._contas.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof SubContasFacade) {
			SubContasFacade lSubContasFacadeObject = (SubContasFacade) aObject;
			boolean lEquals = true;
			lEquals &= ((this._contas == lSubContasFacadeObject._contas)
				|| (this._contas != null && this._contas.equals(lSubContasFacadeObject._contas)));
			return lEquals;
		}
		return false;
	}
}