import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class CampeonatoAtivoDAO implements MapCampeonatoAtivo{

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
		} else if (aObject instanceof CampeonatoAtivoDAO) {
			CampeonatoAtivoDAO lCampeonatoAtivoDAOObject = (CampeonatoAtivoDAO) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}
}