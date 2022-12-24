package SubContas;

public class Conta {
	private String _nome;
	private String _password;
	private userType _type;
	private Integer _pontos;

	public int hashCode() {
		int lHashCode = 0;
		if ( this._nome != null ) {
			lHashCode += this._nome.hashCode();
		}
		if ( this._password != null ) {
			lHashCode += this._password.hashCode();
		}
		if ( this._type != null ) {
			lHashCode += this._type.hashCode();
		}
		if ( this._pontos != null ) {
			lHashCode += this._pontos.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof Conta) {
			Conta lContaObject = (Conta) aObject;
			boolean lEquals = true;
			lEquals &= ((this._nome == lContaObject._nome)
				|| (this._nome != null && this._nome.equals(lContaObject._nome)));
			lEquals &= ((this._password == lContaObject._password)
				|| (this._password != null && this._password.equals(lContaObject._password)));
			lEquals &= ((this._type == lContaObject._type)
				|| (this._type != null && this._type.equals(lContaObject._type)));
			lEquals &= ((this._pontos == lContaObject._pontos)
				|| (this._pontos != null && this._pontos.equals(lContaObject._pontos)));
			return lEquals;
		}
		return false;
	}
}