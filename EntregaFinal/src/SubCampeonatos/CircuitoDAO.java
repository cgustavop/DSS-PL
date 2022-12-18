package EntregaFinal.src.SubCampeonatos;

import java.util.*;

public class CircuitoDAO implements Map<String,Circuito> {

	private HashMap<String,Circuito> circuitos = new HashMap<>();

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
	public Circuito get(Object key) {
		return null;
	}

	@Override
	public Circuito put(String key, Circuito value) {
		return null;
	}

	@Override
	public Circuito remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends Circuito> m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set<String> keySet() {
		return null;
	}

	@Override
	public Collection<Circuito> values() {
		return null;
	}

	@Override
	public Set<Entry<String, Circuito>> entrySet() {
		return null;
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