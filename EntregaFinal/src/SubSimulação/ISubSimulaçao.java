package EntregaFinal.src.SubSimulação;

import java.util.List;
import java.util.function.Consumer;

public interface ISubSimulaçao {

	public void registarJogador(Campeonato aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto);

	public void jogadorPronto(Campeonato aCampeonato, String aJogadorID);

	public CorridaBase simularCorridaBase(Campeonato aCampeonato);

	public CorridaPremium simularCorridaPremium(Campeonato aCampeonato);

	public List<DadosJogador> ranking(Campeonato aCampeonato);

	public void afinarCarro(Campeonato aCampeonato, String aJogadorID, Consumer<Carro> aFunc);

	public boolean temProxCorrida(Campeonato aCampeonato);

}