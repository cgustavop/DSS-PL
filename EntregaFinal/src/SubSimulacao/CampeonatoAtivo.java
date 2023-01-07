package EntregaFinal.src.SubSimulacao;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCampeonatos.Circuito;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;
import EntregaFinal.src.data.JogadorAtivoDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CampeonatoAtivo {
	private static int idCount = 0;
	private int id;
	private int _nCorridaAtual = 0;
	private Campeonato _campeonato;
	private JogadorAtivoDAO _jogadorAtivoMap;
	private List<List<DadosJogador>> _listOrdPos = new ArrayList<>();
	private List<Circuito> circuitosList = new ArrayList<>();

	public CampeonatoAtivo(Campeonato camp){
		this._campeonato = camp;
		this._jogadorAtivoMap = JogadorAtivoDAO.getInstance();
		this.id = idCount++;
	}

	public CampeonatoAtivo(Campeonato camp, int id, int nCorridaAtual, List<List<DadosJogador>> posList, List<Circuito> circuitosList){
		this._campeonato = camp;
		this._jogadorAtivoMap = JogadorAtivoDAO.getInstance();
		this.id = id;
		this._nCorridaAtual = nCorridaAtual;
		this._listOrdPos = posList;
		this.circuitosList = circuitosList;
	}

	public Campeonato get_campeonato() {
		return _campeonato;
	}

	public int get_nCorridaAtual() {
		return _nCorridaAtual;
	}

	public List<List<DadosJogador>> getCorridaMap(){
		return this._listOrdPos;
	}

	public List<Circuito> getCircuitoMap(){
		return this.circuitosList;
	}

	public void set_campeonato(Campeonato _campeonato) {
		this._campeonato = _campeonato;
	}

	public void set_nCorridaAtual(int _nCorridaAtual) {
		this._nCorridaAtual = _nCorridaAtual;
	}

	public CorridaBase simularCorridaBase() {
		// TODO:
		boolean pronto = estaoJogadoresProntos();
		boolean pCorrida = temProxCorrida();
		if(pronto && pCorrida) return new CorridaBase();
		throw new IllegalArgumentException();
	}

	public CorridaPremium simularCorridaPremium() {
		// TODO:
		boolean pronto = estaoJogadoresProntos();
		boolean pCorrida = temProxCorrida();
		if(pronto && pCorrida) return new CorridaPremium();
		throw new IllegalArgumentException();
	}

	public List<DadosJogador> ranking() {
		List<DadosJogador> jogadores = new ArrayList<>();
		for(JogadorAtivo j : this._jogadorAtivoMap.values()){
				jogadores.add(j.get_dados());
		}
		return jogadores;
	}

	public void jogadorPronto(String aJogadorID) {
		JogadorAtivo j = this._jogadorAtivoMap.get(aJogadorID);
		j.set_pronto(true);
		this._jogadorAtivoMap.put(aJogadorID, j);
	}

	public void afinarCarro(String aJogadorID, Carro aFunc){
		JogadorAtivo j = this._jogadorAtivoMap.get(aJogadorID);
		try{
			if(j.get_nAfinaçoes() - 1<0){ return; }
			else{
				j.set_nAfinaçoes(j.get_nAfinaçoes() - 1); 
				j.get_dados().set_carro(aFunc);
				this._jogadorAtivoMap.put(aJogadorID, j);

			}
		} catch(NullPointerException e){e.printStackTrace();}
		this._jogadorAtivoMap.put(aJogadorID, this._jogadorAtivoMap.get(aJogadorID));
	}

	public void novoJogador(String aJogadorID, String aCarro, String aPiloto) {
		JogadorAtivo j = new JogadorAtivo(aJogadorID,aCarro,aPiloto,this._campeonato.get_circuitos().size(), id);
		this._jogadorAtivoMap.put(aJogadorID,j);
	}	

	public boolean estaoJogadoresProntos() {
		List<JogadorAtivo> js = new ArrayList<>(this._jogadorAtivoMap.values());
		for(JogadorAtivo j : js){
			if(!j.get_pronto()) return false;
		}
		return true;
	}

	public boolean temProxCorrida() {
		return this._campeonato.get_nr_circuitos() > this._nCorridaAtual;
	}

	public int getId(){
		return this.id;
	}

	public int hashCode() {
		int lHashCode = 0;
		if ( this._campeonato != null ) {
			lHashCode += this._campeonato.hashCode();
		}
		if ( this._jogadorAtivoMap != null ) {
			lHashCode += this._jogadorAtivoMap.hashCode();
		}
		if ( this._listOrdPos != null ) {
			lHashCode += this._listOrdPos.hashCode();
		}
		if ( lHashCode == 0 ) {
			lHashCode = super.hashCode();
		}
		return lHashCode;
	}

	public boolean equals(Object aObject) {
		if (this == aObject) {
			return true;
		} else if (aObject instanceof CampeonatoAtivo) {
			CampeonatoAtivo lCampeonatoAtivoObject = (CampeonatoAtivo) aObject;
			boolean lEquals = true;
			lEquals &= this._nCorridaAtual == lCampeonatoAtivoObject._nCorridaAtual;
			lEquals &= ((this._campeonato == lCampeonatoAtivoObject._campeonato)
				|| (this._campeonato != null && this._campeonato.equals(lCampeonatoAtivoObject._campeonato)));
			lEquals &= ((this._jogadorAtivoMap == lCampeonatoAtivoObject._jogadorAtivoMap)
				|| (this._jogadorAtivoMap != null && this._jogadorAtivoMap.equals(lCampeonatoAtivoObject._jogadorAtivoMap)));
			lEquals &= ((this._listOrdPos == lCampeonatoAtivoObject._listOrdPos)
				|| (this._listOrdPos != null && this._listOrdPos.equals(lCampeonatoAtivoObject._listOrdPos)));
			return lEquals;
		}
		return false;
	}
}