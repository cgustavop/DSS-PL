import java.util.*;
import java.util.function.Consumer;
public class CampeonatoAtivoDAO implements Map<Campeonato,CampeonatoAtivo> {


	public int hashCode() {
		int lHashCode = 0;
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public CampeonatoAtivo get(Object key) {
		return null;
	}

	@Override
	public CampeonatoAtivo put(Campeonato key, CampeonatoAtivo value) {
		return null;
	}

	@Override
	public CampeonatoAtivo remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends Campeonato, ? extends CampeonatoAtivo> m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set<Campeonato> keySet() {
		return null;
	}

	@Override
	public Collection<CampeonatoAtivo> values() {
		return null;
	}

	@Override
	public Set<Entry<Campeonato, CampeonatoAtivo>> entrySet() {
		return null;
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