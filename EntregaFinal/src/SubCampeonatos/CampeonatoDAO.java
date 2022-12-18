package EntregaFinal.src.SubCampeonatos;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CampeonatoDAO implements Map<String,Campeonato> {

	private Map<String,Campeonato> _campeonatos = new HashMap<>();

	public Map<String, Campeonato> get_campeonatos() {
		return this._campeonatos;
	}

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
		if(isEmpty()) return 0;
		// FIXME: count in db
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(this._campeonatos.isEmpty()) return true;
		// FIXME: check in db
		return true;
	}

	@Override
	public boolean containsKey(Object key) {
		if(this._campeonatos.containsKey(key)) return true;
		// FIXME: check in db
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		if(this._campeonatos.containsValue(value)) return true;
		// FIXME: check in db
		return false;
	}

	@Override
	public Campeonato get(Object key) {
		if(this._campeonatos.containsKey(key)) return this._campeonatos.get(key);
		Campeonato c = new Campeonato();
		// FIXME: get from db
		return c;
	}

	@Override
	public Campeonato put(String key, Campeonato value) {
		this._campeonatos.put(key, value);
		//FIXME: inset into db
		return value;
	}

	@Override
	public Campeonato remove(Object key) {
		this._campeonatos.remove(key);
		//FIXME: remove from db
		return get(key);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Campeonato> m) {
		for(String s:m.keySet()){
			put(s,m.get(s));
		}
	}

	@Override
	public void clear() {
		this._campeonatos.clear();
		//FIXME: clear db
	}

	@Override
	public Set<String> keySet() {
		//FIXME: check db
		return this._campeonatos.keySet();
	}

	@Override
	public Collection<Campeonato> values() {
		//FIXME: check db
		return this._campeonatos.values();
	}

	@Override
	public Set<Entry<String, Campeonato>> entrySet() {
		//FIXME: check db
		return this._campeonatos.entrySet();
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CampeonatoDAO) {
			CampeonatoDAO lCampeonatoDAOObject = (CampeonatoDAO) aObject;
			for(Campeonato c : lCampeonatoDAOObject.getCampeonatosDisponiveis()){
				if(!getCampeonatosDisponiveis().contains(c)) return false;
			}
			for(Campeonato c : lCampeonatoDAOObject.getCampeonatosIndisponiveis()){
				if(!getCampeonatosIndisponiveis().contains(c)) return false;
			}
		}
		return true;
	}
}