import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ContasDAO implements Map<String,Conta> {

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
	public Conta get(Object key) {
		return null;
	}

	@Override
	public Conta put(String key, Conta value) {
		return null;
	}

	@Override
	public Conta remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends Conta> m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set<String> keySet() {
		return null;
	}

	@Override
	public Collection<Conta> values() {
		return null;
	}

	@Override
	public Set<Entry<String, Conta>> entrySet() {
		return null;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof ContasDAO) {
			ContasDAO lContasDAOObject = (ContasDAO) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}
}