package EntregaFinal.src.data;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.sql.*;

import EntregaFinal.src.SubSimulacao.JogadorAtivo;

public class JogadorAtivoDAO implements Map<String,JogadorAtivo> {

	private static JogadorAtivoDAO singleton = null;

	private JogadorAtivoDAO(){
		try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {
            conn.setAutoCommit(false);

            String sql = "CREATE TABLE IF NOT EXISTS dados_jogador (" +
                "DadosJogadorId int NOT NULL PRIMARY KEY AUTO_INCREMENT," +
                "CampeonatoAtivoId int NOT NULL," +
                "JogadorId varchar(45) NOT NULL," +
                "CarroId varchar(45) NOT NULL," +
                "PilotoId varchar(45) NOT NULL," +
                "FOREIGN KEY (CarroId) REFERENCES carros(ID)," +
                "FOREIGN KEY (PilotoId) REFERENCES pilotos(Nome)," +
                "FOREIGN KEY (CampeonatoAtivoId) REFERENCES campeonatos_ativos(CampeonatoAtivoId));";

            stm.execute(sql);

            sql = "CREATE TABLE IF NOT EXISTS jogador_ativo (" +
                "CampeonatoAtivoId int NOT NULL," +
                "JogadorId varchar(45) NOT NULL," +
                "Pronto boolean DEFAULT false," + 
                "NrAfinacoes int DEFAULT 0," + 
                "FOREIGN KEY (JogadorId,CampeonatoAtivoId) REFERENCES dados_jogador(JogadorId,CampeonatoAtivoId)," +
                "PRIMARY KEY(JogadorId, CampeonatoAtivoId));";

            stm.execute(sql);

            conn.commit();
        } catch (SQLException e) {
            // Erro a criar tabela...
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
	}

	public static JogadorAtivoDAO getInstance() {
        if (JogadorAtivoDAO.singleton == null) {
            JogadorAtivoDAO.singleton = new JogadorAtivoDAO();
        }
        return JogadorAtivoDAO.singleton;
    }

	@Override
	public int size() {
		int i = 0;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT count(*) FROM jogadores_ativos")) {
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
                     stm.executeQuery("SELECT Nome FROM jogadores_ativos WHERE Nome='"+key.toString()+"'")) {
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
		JogadorAtivo a = (JogadorAtivo) value;
        return this.containsKey(a.get_dados().get_jogadorID());
	}

	@Override
	public JogadorAtivo get(Object key) {
		JogadorAtivo a = null;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT * FROM jogadores_ativos WHERE Nome='"+key+"'")) {
            if (rs.next()) {  // A chave existe na tabela
                a = new JogadorAtivo(rs.getString(""),
                        rs.getString(""),
                        rs.getString(""),
                        Integer.parseInt(rs.getString("")));
            }
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return a;
	}

	@Override
	public JogadorAtivo put(String key, JogadorAtivo value) {
		JogadorAtivo res = null;
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()) {
            try(PreparedStatement pstm = conn.prepareStatement("INSERT INTO jogadores_ativos(Nome,Nr_circuitos,Disponibilidade)" + "VALUES (?,?,?)")) {
                pstm.setString(1,value.get_nome());
                pstm.setString(2,String.valueOf(value.get_nr_circuitos()));
                pstm.setString(3,String.valueOf(value.get_disponibilidade()));
                pstm.execute();
            }
        } catch (SQLException e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return res;
	}

	@Override
	public JogadorAtivo remove(Object key) {
		JogadorAtivo a = this.get(key);
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement()){
            // apagar o JogadorAtivo
            stm.executeUpdate("DELETE FROM jogadores_ativos WHERE Num='"+key+"'");
        } catch (Exception e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return a;
	}

	@Override
	public void putAll(Map<? extends String, ? extends JogadorAtivo> m) {
		for(JogadorAtivo a : m.values()) {
            this.put(a.get_dados().get_jogadorID(), a);
        }
	}

	@Override
	public void clear() {
		try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
		Statement stm = conn.createStatement()) {
	   stm.executeUpdate("UPDATE jogadores_ativos SET JogadoresAtivo=NULL");
	   stm.executeUpdate("TRUNCATE jogadores_ativos");
   } catch (SQLException e) {
	   // Database error!
	   e.printStackTrace();
	   throw new NullPointerException(e.getMessage());
   }
	}

	@Override
	public Set<String> keySet() {
		Set<String> res = new HashSet<>();
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT Nome FROM jogadores_ativos")) { // ResultSet com os nomes de todos os campeonatos
             while (rs.next()) {
                String idt = rs.getString("Nome"); // Obtemos um nome de jogador do ResultSet
                res.add(idt);                                 // Adiciona o jogador ao resultado.
            }
        } catch (Exception e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return res;
	}

	@Override
	public Collection<JogadorAtivo> values() {
		Collection<JogadorAtivo> res = new HashSet<>();
        try (Connection conn = DriverManager.getConnection(DAOconfig.URL, DAOconfig.USERNAME, DAOconfig.PASSWORD);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT Nome FROM campeonatos")) { // ResultSet com os nomes de todos os campeonatos
            while (rs.next()) {
                String idt = rs.getString("Nome"); // Obtemos um nome de campeonato do ResultSet
                JogadorAtivo a = this.get(idt);                    // Utilizamos o get para construir os campeonatos
                res.add(a);                                 // Adiciona o campeonato ao resultado.
            }
        } catch (Exception e) {
            // Database error!
            e.printStackTrace();
            throw new NullPointerException(e.getMessage());
        }
        return res;
	}

	@Override
	public Set<Entry<String, JogadorAtivo>> entrySet() {
		throw new NullPointerException("public Set<Map.Entry<String,JogadorAtivo>> entrySet() not implemented!");
	}
}