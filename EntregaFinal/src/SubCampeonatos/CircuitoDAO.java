package EntregaFinal.src.SubCampeonatos;

import java.util.*;

public class CircuitoDAO implements Map<String,Circuito> {

	private HashMap<String,Circuito> _circuitos = new HashMap<>();

	public int hashCode() {
		int lHashCode = 0;
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	@Override
	public int size() {
		if(isEmpty()) return 0;
		// FIXME: count in db
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(this._circuitos.isEmpty()) return true;
		// FIXME: check in db
		return true;
	}

	@Override
	public boolean containsKey(Object key) {
		if(this._circuitos.containsKey(key)) return true;
		// FIXME: check in db
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		if(this._circuitos.containsValue(value)) return true;
		// FIXME: check in db
		return false;
	}

	@Override
	public Circuito get(Object key) {
		if(this._circuitos.containsKey(key)) return this._circuitos.get(key);
		Circuito c = new Circuito();
		// FIXME: get from db
		return c;
	}

	@Override
	public Circuito put(String key, Circuito value) {
		this._circuitos.put(key, value);
		//FIXME: inset into db
		return value;
	}

	@Override
	public Circuito remove(Object key) {
		this._circuitos.remove(key);
		//FIXME: remove from db
		return get(key);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Circuito> m) {
		for(String s:m.keySet()){
			put(s,m.get(s));
		}
	}

	@Override
	public void clear() {
		this._circuitos.clear();
		//FIXME: clear db
	}

	@Override
	public Set<String> keySet() {
		//FIXME: check db
		return this._circuitos.keySet();
	}

	@Override
	public Collection<Circuito> values() {
		//FIXME: check db
		return this._circuitos.values();
	}

	@Override
	public Set<Entry<String, Circuito>> entrySet() {
		//FIXME: check db
		return this._circuitos.entrySet();
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CircuitoDAO) {
			CircuitoDAO lCircuitoDAOObject = (CircuitoDAO) aObject;
			for(Entry<String, Circuito> c : lCircuitoDAOObject.entrySet()){
				if(!this.entrySet().contains(c)) return false;
			}
		}
		return true;
	}
}