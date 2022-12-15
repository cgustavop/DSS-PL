public class C1 extends Carro {

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
		} else if (aObject instanceof C1) {
			C1 lC1Object = (C1) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}
}