package SubCarros;

public class GTH extends GT implements Hibrido {
	private int _motor_eletrico;

	@Override
	public int getPotenciaMotorEletrico() {
		return 0;
	}

	@Override
	public void setPotenciaMotorEletrico(int potencia) {

	}

	public int hashCode() {
		int lHashCode = 0;
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof GTH) {
			GTH lGTHObject = (GTH) aObject;
			boolean lEquals = true;
			lEquals &= this._motor_eletrico == lGTHObject._motor_eletrico;
			return lEquals;
		}
		return false;
	}
}