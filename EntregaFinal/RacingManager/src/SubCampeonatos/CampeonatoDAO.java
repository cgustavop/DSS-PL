package SubCampeonatos;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CampeonatoDAO implements Map<String,Campeonato> {

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
	public Campeonato get(Object key) {
		return null;
	}

	@Override
	public Campeonato put(String key, Campeonato value) {
		return null;
	}

	@Override
	public Campeonato remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends Campeonato> m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set<String> keySet() {
		return null;
	}

	@Override
	public Collection<Campeonato> values() {
		return null;
	}

	@Override
	public Set<Entry<String, Campeonato>> entrySet() {
		return null;
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