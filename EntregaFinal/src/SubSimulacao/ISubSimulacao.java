package EntregaFinal.src.SubSimulacao;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;

public interface ISubSimulacao {

	public void registarJogador(int aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto);

	public void jogadorPronto(int aCampeonato, String aJogadorID);

	public CorridaBase simularCorridaBase(int aCampeonato);

	public CorridaPremium simularCorridaPremium(int aCampeonato);

	public List<DadosJogador> ranking(int aCampeonato);

	public void afinarCarro(int aCampeonato, String aJogadorID, Consumer<Carro> aFunc);

	public boolean temProxCorrida(int aCampeonato);

	public int comecarCampeonato(Campeonato campeonato);

	public Map<Campeonato, List<Integer>> buscarCampeonatosEmProgresso();

}