/*
 *  DISCLAIMER: Este código foi criado para discussão e edição durante as aulas práticas de DSS, representando
 *  uma solução em construção. Como tal, não deverá ser visto como uma solução canónica, ou mesmo acabada.
 *  É disponibilizado para auxiliar o processo de estudo. Os alunos são encorajados a testar adequadamente o
 *  código fornecido e a procurar soluções alternativas, à medida que forem adquirindo mais conhecimentos.
 */
package EntregaFinal.RacingManager.UI;

import EntregaFinal.RacingManager.*;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextUI {
    // O model tem a 'lógica de negócio'.
    private ITurmasFacade model;

    // Menus da aplicação
    private Menu menu;

    // Scanner para leitura
    private Scanner scin;

    /**
     * Construtor.
     *
     * Cria os menus e a camada de negócio.
     */
    public TextUI() {
        // Criar o menu
        // TODO: WORK ON MENUS IF YOU ARE USER/ADMIN/GESTOR
        this.menu = new Menu(new String[]{
                "Registar",
                "Login",
                "Adicionar Circuito",
                "Adicionar Campeonato",
                "Adicionar Carro",
                "Adicionar Piloto",
                "Disponibilizar Campeonato",
                "Indisponibilizar Campeonato",
                "Listar Campeonatos Disponíveis",
                "Listar Campeonatos Indisponíveis",
                "Jogar"
        });
        this.menu.setHandler(1, this::registar); //TODO:
        this.menu.setHandler(2, this::login); //TODO:
        this.menu.setHandler(3, this::adicionarCircuito); //TODO:
        this.menu.setHandler(4, this::adicionarCampeonato); //TODO:
        this.menu.setHandler(5, this::adicionarCarro); //TODO:
        this.menu.setHandler(6, this::adicionarPiloto); //TODO:
        this.menu.setHandler(7, this::disponibilizarCampeonato); //TODO:
        this.menu.setHandler(8, this::indisponibilizarCampeonato); //TODO:
        this.menu.setHandler(9, this::listCampeonatosDisponiveis); //TODO:
        this.menu.setHandler(10, this::listCampeonatosIndisponiveis); //TODO:
        this.menu.setHandler(11, this::play); //TODO:

        this.model = new TurmasFacade();
        scin = new Scanner(System.in);
    }

    /**
     * Executa o menu principal e invoca o método correspondente à opção seleccionada.
     */
    public void run() {
        this.menu.run();
        System.out.println("Até breve!...");
    }

    // Métodos auxiliares
    private void register(){}
    private void login(){}
    private void adicionarCircuito(){}
    private void adicionarCampeonato(){}
    private void adicionarCarro(){}
    private void adicionarPiloto(){}
    private void disponibilizarCampeonato(){}
    private void indisponibilizarCampeonato(){}
    private void listCampeonatosDisponiveis(){}
    private void listCampeonatosIndisponiveis(){}
    private void play(){}


    // NOTE: JUST EXAMPLE
    private void trataAdicionarAluno() {
        // Dar pré-condição ficha 9 "setPreCondition"
        try {
            System.out.println("Número da novo aluno: ");
            String num = scin.nextLine();
            if (!this.model.existeAluno(num)) {
                System.out.println("Nome da novo aluno: ");
                String nome = scin.nextLine();
                System.out.println("Email da novo aluno: ");
                String email = scin.nextLine();
                this.model.adicionaAluno(new Aluno(num, nome, email));
                System.out.println("Aluno adicionado");
            } else {
                System.out.println("Esse número de aluno já existe!");
            }
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    
}
