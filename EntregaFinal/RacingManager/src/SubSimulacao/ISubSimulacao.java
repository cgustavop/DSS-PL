package SubSimulacao;

import SubCarros.Carro;
import SubCampeonatos.Campeonato;
import SubPilotos.Piloto;

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

	public int hashCode();

	public boolean equals(Object aObject);
}