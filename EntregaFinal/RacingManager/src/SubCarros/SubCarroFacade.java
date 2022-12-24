package SubCarros;

public class SubCarroFacade implements ISubCarro {
	private CarroDAO _carros;

	@Override
	public boolean categoriaValida(String aC) {
		return false;
	}

	@Override
	public boolean fiabilidadeValida(int aF) {
		return false;
	}

	@Override
	public void registarCarro(Carro aCarro) {

	}

	@Override
	public boolean cilindradaValida(int aCilindrada, String aCategoria) {
		return false;
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._carros != null ) {
			lHashCode += this._carros.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof SubCarroFacade) {
			SubCarroFacade lSubCarroFacadeObject = (SubCarroFacade) aObject;
			boolean lEquals = true;
			lEquals &= ((this._carros == lSubCarroFacadeObject._carros)
				|| (this._carros != null && this._carros.equals(lSubCarroFacadeObject._carros)));
			return lEquals;
		}
		return false;
	}
}