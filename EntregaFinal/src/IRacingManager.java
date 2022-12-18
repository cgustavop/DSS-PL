package EntregaFinal.src;

import java.util.List;
import java.util.function.Consumer;

import EntregaFinal.src.SubContas.*;
import EntregaFinal.src.SubCampeonatos.*;
import EntregaFinal.src.SubCarros.*;
import EntregaFinal.src.SubPilotos.*;
import EntregaFinal.src.SubSimulação.*;

/**
 * IRacingManager
 */
public interface IRacingManager{

    // Contas
    
    boolean nomeDisponivel(String aNome);

	void registarConta(String aNome, String aPassword, userType aType);

	boolean validarConta(String aNome, String aPassword);

	userType autenticarConta(String aNome);

	void atribuirPontos(String aNome, Integer aPontos);

    // Campeonatos

    Boolean nomeCampeonatoDisponivel(String aNome);

	Boolean nomeCircuitoDisponivel(String aNome);

	void registarCircuito(Circuito aCircuito);

	List<Circuito> circuitosExistentes();

	void registarCampeonato(Campeonato aCampeonato);

	List<Campeonato> campeonatosIndisponiveis();

	void disponibilizarCampeonato(Campeonato aCampeonato);

	List<Campeonato> campeonatosDisponiveis();

	void indisponibilizarCampeonato(Campeonato aCampeonato);

	Integer calcularRetas(Integer aNrCurvas, Integer aNrChicanes);

    // Carros

    boolean categoriaValida(String aC);

	boolean fiabilidadeValida(int aF);

	void registarCarro(Carro aCarro);

	boolean cilindradaValida(int aCilindrada, String aCategoria);

    // Pilotos

    boolean nomePilotoDisponivel(String aNome);

	boolean niveisPericiaValidos(float aCts, float aSva);

	void registarPiloto(Piloto aPiloto);
    
    // Simulação

    void registarJogador(Campeonato aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto);

	void jogadorPronto(Campeonato aCampeonato, String aJogadorID);

	CorridaBase simularCorridaBase(Campeonato aCampeonato);

	CorridaPremium simularCorridaPremium(Campeonato aCampeonato);

	List<DadosJogador> ranking(Campeonato aCampeonato);

	void afinarCarro(Campeonato aCampeonato, String aJogadorID, Consumer<Carro> aFunc);

	boolean temProxCorrida(Campeonato aCampeonato);
}