package EntregaFinal.src.SubSimulacao;

import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;

import java.util.List;
import java.util.function.Consumer;

public interface ISubSimulacao {

	public void registarJogador(Campeonato aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto);

	public void jogadorPronto(Campeonato aCampeonato, String aJogadorID);

	public CorridaBase simularCorridaBase(Campeonato aCampeonato);

	public CorridaPremium simularCorridaPremium(Campeonato aCampeonato);

	public List<DadosJogador> ranking(Campeonato aCampeonato);

	public void afinarCarro(Campeonato aCampeonato, String aJogadorID, Consumer<Carro> aFunc);

	public boolean temProxCorrida(Campeonato aCampeonato);

}