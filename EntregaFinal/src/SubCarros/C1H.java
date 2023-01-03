package EntregaFinal.src.SubCarros;

public class C1H extends C1 implements Hibrido {
	private int _motor_eletrico;

	@Override
	public int getPotenciaMotorEletrico() {
		return _motor_eletrico;
	}

	@Override
	public void setPotenciaMotorEletrico(int potencia) {
		this._motor_eletrico = potencia;
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
		} else if (aObject instanceof C1H) {
			C1H lC1HObject = (C1H) aObject;
			boolean lEquals = true;
			lEquals &= this._motor_eletrico == lC1HObject._motor_eletrico;
			return lEquals;
		}
		return false;
	}
}