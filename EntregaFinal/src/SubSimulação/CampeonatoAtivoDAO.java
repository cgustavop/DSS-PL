package EntregaFinal.src.SubSimulação;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.function.Consumer;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.data.DAOconfig;
public class CampeonatoAtivoDAO implements Map<Integer,CampeonatoAtivo> {
	private static CampeonatoAtivoDAO dao = null;

	private CampeonatoAtivoDAO(){
		try(Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.USERNAME);
			Statement stm = conn.createStatement();){
			
			conn.setAutoCommit(false); // TODO mudar diagrama e dps continuar isto
			String sql = "CREATE TABLE IF NOT EXISTS posicoes (";
			sql = "CREATE TABLE IF NOT EXISTS campeonatosAtivos (" +
					"foreign key(campeonatos) references campeonatos(Nome) NOT NULL PRIMARY KEY," +
					"nCorridaAtual int(4) DEFAULT 0";

			sql = "CREATE TABLE IF NOT EXISTS posicoesCampeonatosAtivosJoin (";
			stm.executeUpdate(sql);

			conn.commit();
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public static CampeonatoAtivoDAO getInstance(){
		if(dao == null)
			dao = new CampeonatoAtivoDAO();
		
		return dao;
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
		} else if (aObject instanceof CampeonatoAtivoDAO) {
			CampeonatoAtivoDAO lCampeonatoAtivoDAOObject = (CampeonatoAtivoDAO) aObject;
			boolean lEquals = true;
			return lEquals;
		}
		return false;
	}

	@Override
	public CampeonatoAtivo put(Integer arg0, CampeonatoAtivo arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends CampeonatoAtivo> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Entry<Integer, CampeonatoAtivo>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CampeonatoAtivo get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CampeonatoAtivo remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<CampeonatoAtivo> values() {
		// TODO Auto-generated method stub
		return null;
	}
}