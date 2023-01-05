package EntregaFinal.src.data;

import java.util.*;
import java.sql.*;

import EntregaFinal.src.SubSimulacao.CampeonatoAtivo;
public class CampeonatoAtivoDAO implements Map<Integer,CampeonatoAtivo> {

	private static CampeonatoAtivoDAO singleton = null;

	private CampeonatoAtivoDAO(){
		try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS campeonatos_ativos (" +
                    "Nome varchar(45) NOT NULL PRIMARY KEY," +
                    "Nr_circuitos int DEFAULT 0," +
                    "Disponibilidade boolean DEFAULT false)";
            stm.executeUpdate(sql);
        } catch (SQLException e) {
            // Erro a criar tabela...
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
	}

	public static CampeonatoAtivoDAO getInstance() {
        if (CampeonatoAtivoDAO.singleton == null) {
            CampeonatoAtivoDAO.singleton = new CampeonatoAtivoDAO();
        }
        return CampeonatoAtivoDAO.singleton;
    }

	@Override
	public int size() {
		int i = 0;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT count(*) FROM campeonatos_ativos")) {
            if(rs.next()) {
                i = rs.getInt(1);
            }
        }
        catch (Exception e) {
            // Erro a criar tabela...
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return i;
	}

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	@Override
	public boolean containsKey(Object key) {
		boolean r;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs =
                     stm.executeQuery("SELECT Nome FROM campeonatos_ativos WHERE Nome='"+key.toString()+"'")) {
             r = rs.next();
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
		return r;
	}

	@Override
	public boolean containsValue(Object value) {
		CampeonatoAtivo a = (CampeonatoAtivo) value;
        for(CampeonatoAtivo as: values()){
            if(as.equals(a)) return true; 
        }
        return false;
	}

	@Override
	public CampeonatoAtivo get(Object key) {
		CampeonatoAtivo a = null;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT * FROM campeonatos_ativos WHERE Nome='"+key+"'")) {
            if (rs.next()) {  // A chave existe na tabela
                a = null;//new CampeonatoAtivo(rs.getString("Nome"),
                            //Integer.parseInt(rs.getString("Nr_circuitos")),
                        //Boolean.parseBoolean(rs.getString("Disponibilidade")));
            }
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return a;
	}

	@Override
	public CampeonatoAtivo put(Integer key, CampeonatoAtivo value) {
		CampeonatoAtivo res = null;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {
            try(PreparedStatement pstm = conn.prepareStatement("INSERT INTO campeonatos_ativos(Nome,Nr_circuitos,Disponibilidade)" + "VALUES (?,?,?)")) {
                //pstm.setString(1,value.get_nome());
                //pstm.setString(2,String.valueOf(value.get_nr_circuitos()));
                //pstm.setString(3,String.valueOf(value.get_disponibilidade()));  
				//pstm.execute();
            }
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return res;
	}

	@Override
	public CampeonatoAtivo remove(Object key) {
		CampeonatoAtivo a = this.get(key);
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()){
            // apagar o campeonato_ativo
            stm.executeUpdate("DELETE FROM campeonatos_ativos WHERE Num='"+key+"'");
        } catch (Exception e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return a;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends CampeonatoAtivo> m) {
		for(CampeonatoAtivo a : m.values()) {
            this.put(a.getId(), a);
        }
	}

	@Override
	public void clear() {
		try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {
            stm.executeUpdate("UPDATE campeonatos_ativos SET CampeonatoAtivo=NULL");
            stm.executeUpdate("TRUNCATE campeonatos_ativos");
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
	}

	@Override
	public Set<Integer> keySet() {
		Set<Integer> res = new HashSet<>();
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT Nome FROM campeonatos_ativos")) { // ResultSet com os nomes de todos os campeonatos
             while (rs.next()) {
                Integer idt = Integer.parseInt(rs.getString("Nome")); // Obtemos um nome de campeonato do ResultSet
                                   // Utilizamos o get para construir os campeonatos
                res.add(idt);                                 // Adiciona o campeonato ao resultado.
            }
        } catch (Exception e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return res;
	}

	@Override
	public Collection<CampeonatoAtivo> values() {
		Collection<CampeonatoAtivo> res = new HashSet<>();
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT Id FROM campeonatos_ativos")) { // ResultSet com os nomes de todos os campeonatos_ativos
            while (rs.next()) {
                Integer idt = Integer.parseInt(rs.getString("Id")); // Obtemos um nome de campeonato_ativo do ResultSet
                CampeonatoAtivo a = this.get(idt);                    // Utilizamos o get para construir os campeonatos_ativos
                res.add(a);                                 // Adiciona o campeonato_ativo ao resultado.
            }
        } catch (Exception e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return res;
	}

	@Override
	public Set<Entry<Integer, CampeonatoAtivo>> entrySet() {
		throw new NullPointerException("public Set<Map.Entry<Integer,CampeonatoAtivo>> entrySet() not implemented!");
	}
}