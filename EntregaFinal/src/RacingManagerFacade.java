package EntregaFinal.src;

import java.util.List;
import java.util.function.Consumer;

import EntregaFinal.src.SubContas.*;
import EntregaFinal.src.SubCampeonatos.*;
import EntregaFinal.src.SubCarros.*;
import EntregaFinal.src.SubPilotos.*;
import EntregaFinal.src.SubSimulação.*;

public class RacingManagerFacade implements IRacingManager{
    
	private ISubContas contasFacade;
	private ISubCampeonatos campeonatosFacade;
	private ISubCarro carroFacade;
	private ISubPiloto pilotoFacade;
	private ISubSimulaçao simulacaoFacade;

    public RacingManagerFacade(){
		this.contasFacade = new SubContasFacade();
		this.campeonatosFacade = new SubCampeonatosFacade();
		this.carroFacade = new SubCarroFacade();
		this.pilotoFacade = new SubPilotoFacade();
		this.simulacaoFacade = new SubSimulaçao();
	}

    // Contas
    
    public boolean nomeDisponivel(String aNome){return this.contasFacade.nomeDisponivel(aNome);}

	public void registarConta(String aNome, String aPassword, userType aType){this.contasFacade.registarConta(aNome, aPassword, aType);}

	public boolean validarConta(String aNome, String aPassword){return this.contasFacade.validarConta(aNome, aPassword);}

	public userType autenticarConta(String aNome){return this.contasFacade.autenticarConta(aNome);}

	public void atribuirPontos(String aNome, Integer aPontos){this.contasFacade.atribuirPontos(aNome, aPontos);}

    // Campeonatos

    public Boolean nomeCampeonatoDisponivel(String aNome){return this.campeonatosFacade.nomeCampeonatoDisponivel(aNome);}

	public Boolean nomeCircuitoDisponivel(String aNome){return this.campeonatosFacade.nomeCircuitoDisponivel(aNome);}

	public void registarCircuito(Circuito aCircuito){this.campeonatosFacade.registarCircuito(aCircuito);}

	public List<Circuito> circuitosExistentes(){return this.campeonatosFacade.circuitosExistentes();}

	public void registarCampeonato(Campeonato aCampeonato){this.campeonatosFacade.registarCampeonato(aCampeonato);}

	public List<Campeonato> campeonatosIndisponiveis(){return this.campeonatosFacade.campeonatosIndisponiveis();}

	public void disponibilizarCampeonato(Campeonato aCampeonato){this.campeonatosFacade.disponibilizarCampeonato(aCampeonato);}

	public List<Campeonato> campeonatosDisponiveis(){return this.campeonatosFacade.campeonatosDisponiveis();}

	public void indisponibilizarCampeonato(Campeonato aCampeonato){this.campeonatosFacade.indisponibilizarCampeonato(aCampeonato);}

	public Integer calcularRetas(Integer aNrCurvas, Integer aNrChicanes){return this.campeonatosFacade.calcularRetas(aNrCurvas, aNrChicanes);}

    // Carros

    public boolean categoriaValida(String aC){return this.carroFacade.categoriaValida(aC);}

	public boolean fiabilidadeValida(int aF){return this.carroFacade.fiabilidadeValida(aF);}

	public void registarCarro(Carro aCarro){this.carroFacade.registarCarro(aCarro);}

	public boolean cilindradaValida(int aCilindrada, String aCategoria){return this.carroFacade.cilindradaValida(aCilindrada, aCategoria);}

    // Pilotos

    public boolean nomePilotoDisponivel(String aNome){return this.pilotoFacade.nomePilotoDisponivel(aNome);}

	public boolean niveisPericiaValidos(float aCts, float aSva){return this.pilotoFacade.niveisPericiaValidos(aCts, aSva);}

	public void registarPiloto(Piloto aPiloto){this.pilotoFacade.registarPiloto(aPiloto);}
    
    // Simulação

    public void registarJogador(Campeonato aCampeonato, String aJogadorID, Carro aCarro, Piloto aPiloto){this.simulacaoFacade.registarJogador(aCampeonato, aJogadorID, aCarro, aPiloto);}

	public void jogadorPronto(Campeonato aCampeonato, String aJogadorID){this.simulacaoFacade.jogadorPronto(aCampeonato, aJogadorID);}

	public CorridaBase simularCorridaBase(Campeonato aCampeonato){return this.simulacaoFacade.simularCorridaBase(aCampeonato);}

	public CorridaPremium simularCorridaPremium(Campeonato aCampeonato){return this.simulacaoFacade.simularCorridaPremium(aCampeonato);}

	public List<DadosJogador> ranking(Campeonato aCampeonato){return this.simulacaoFacade.ranking(aCampeonato);}

	public void afinarCarro(Campeonato aCampeonato, String aJogadorID, Consumer<Carro> aFunc){this.simulacaoFacade.afinarCarro(aCampeonato, aJogadorID, aFunc);}

	public boolean temProxCorrida(Campeonato aCampeonato){return this.simulacaoFacade.temProxCorrida(aCampeonato);}
}
