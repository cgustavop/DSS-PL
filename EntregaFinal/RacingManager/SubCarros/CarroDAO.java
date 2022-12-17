import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CarroDAO implements Map<String,Carro> {

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
	public Carro get(Object key) {
		return null;
	}

	@Override
	public Carro put(String key, Carro value) {
		return null;
	}

	@Override
	public Carro remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends Carro> m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set<String> keySet() {
		return null;
	}

	@Override
	public Collection<Carro> values() {
		return null;
	}

	@Override
	public Set<Entry<String, Carro>> entrySet() {
		return null;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CarroDAO) {
			CarroDAO lCarroDAOObject = (CarroDAO) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}
}