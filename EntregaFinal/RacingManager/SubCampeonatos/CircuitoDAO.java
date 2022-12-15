import java.util.List;

public class CircuitoDAO implements MapCircuito {

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
		} else if (aObject instanceof CircuitoDAO) {
			CircuitoDAO lCircuitoDAOObject = (CircuitoDAO) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}
}