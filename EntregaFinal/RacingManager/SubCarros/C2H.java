public class C2H extends C2 implements Hibrido {
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
		} else if (aObject instanceof C2H) {
			C2H lC2HObject = (C2H) aObject;
			boolean lEquals = true;
			lEquals &= this._motor_eletrico == lC2HObject._motor_eletrico;
			return lEquals;
		}
		return false;
	}
}