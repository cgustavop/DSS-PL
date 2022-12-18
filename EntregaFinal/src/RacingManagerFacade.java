package EntregaFinal.src;

import java.util.List;
import java.util.function.Consumer;

import EntregaFinal.src.SubContas.*;
import EntregaFinal.src.SubCampeonatos.*;
import EntregaFinal.src.SubCarros.*;
import EntregaFinal.src.SubPilotos.*;
import EntregaFinal.src.SubSimulação.*;

public class RacingManagerFacade implements IRacingManager{
    
    public RacingManagerFacade(){

    }

    // Contas
    
    public boolean nomeDisponivel(String aNome){}

	public void registarConta(String aNome, String aPassword, userType aType){}

	public boolean validarConta(String aNome, String aPassword){}

	public userType autenticarConta(String aNome){}

	public void atribuirPontos(String aNome, Integer aPontos){}

    // Campeonatos

    public Boolean nomeCampeonatoDisponivel(String aNome){}

	public Boolean nomeCircuitoDisponivel(String aNome){}

	public void registarCircuito(Circuito aCircuito){}

	public List<Circuito> circuitosExistentes(){}

	public void registarCampeonato(Campeonato aCampeonato){}

	public List<Campeonato> campeonatosIndisponiveis(){}

	public void disponibilizarCampeonato(Campeonato aCampeonato){}

	public List<Campeonato> campeonatosDisponiveis(){}

	public void indisponibilizarCampeonato(Campeonato aCampeonato){}

	public Integer calcularRetas(Integer aNrCurvas, Integer aNrChicanes){}

    // Carros

    public boolean categoriaValida(String aC){}

	public boolean fiabilidadeValida(int aF){}

	public void registarCarro(Carro aCarro){}

	boolean cilindradaValida(int aCilindrada, String aCategoria){}

    // Pilotos

    public boolean nomePilotoDisponivel(String aNome){}

	public boolean niveisPericiaValidos(float aCts, float aSva){}

	public void registarPiloto(Piloto aPiloto){}
    
    // Simulação

    public void registarJogador(Campeonato aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto){}

	public void jogadorPronto(Campeonato aCampeonato, String aJogadorID){}

	public CorridaBase simularCorridaBase(Campeonato aCampeonato){}

	public CorridaPremium simularCorridaPremium(Campeonato aCampeonato){}

	public List<DadosJogador> ranking(Campeonato aCampeonato){}

	public void afinarCarro(Campeonato aCampeonato, String aJogadorID, Consumer<Carro> aFunc){}

	public boolean temProxCorrida(Campeonato aCampeonato){}
}
