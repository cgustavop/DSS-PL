public class C2 extends Carro {

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
		} else if (aObject instanceof C2) {
			C2 lC2Object = (C2) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}
}