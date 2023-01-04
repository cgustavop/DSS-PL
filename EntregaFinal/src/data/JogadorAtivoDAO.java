package EntregaFinal.src.data;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import EntregaFinal.src.SubSimulacao.JogadorAtivo;

public class JogadorAtivoDAO implements Map<String,JogadorAtivo> {

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
	public JogadorAtivo get(Object key) {
		return null;
	}

	@Override
	public JogadorAtivo put(String key, JogadorAtivo value) {
		return null;
	}

	@Override
	public JogadorAtivo remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends JogadorAtivo> m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set<String> keySet() {
		return null;
	}

	@Override
	public Collection<JogadorAtivo> values() {
		return null;
	}

	@Override
	public Set<Entry<String, JogadorAtivo>> entrySet() {
		return null;
	}
}