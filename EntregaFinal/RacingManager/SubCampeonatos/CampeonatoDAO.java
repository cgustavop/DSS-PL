import java.util.List;


public class CampeonatoDAO implements MapCampeonato {

	public List<Campeonato> getCampeonatosDisponiveis() {
		throw new UnsupportedOperationException();
	}

	public List<Campeonato> getCampeonatosIndisponiveis() {
		throw new UnsupportedOperationException();
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
		} else if (aObject instanceof CampeonatoDAO) {
			CampeonatoDAO lCampeonatoDAOObject = (CampeonatoDAO) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}
}