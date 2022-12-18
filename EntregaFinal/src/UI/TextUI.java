package EntregaFinal.src.UI;

import java.util.List;
import java.util.Scanner;

import EntregaFinal.src.*;

// Needed imports once diagrams were chosen to be like this
import EntregaFinal.src.SubContas.userType;
import EntregaFinal.src.SubCampeonatos.Campeonato;
import EntregaFinal.src.SubCampeonatos.Circuito;
import EntregaFinal.src.SubCarros.Carro;
import EntregaFinal.src.SubPilotos.Piloto;

public class TextUI {
    private IRacingManager model;

    // Menus da aplicação
    private Menu main_menu;
    private Menu creation_menu;

    // Scanner para leitura
    private Scanner scin;

    /**
     * Construtor.
     *
     * Cria os menus e a camada de negócio.
     */
    public TextUI() {
        // Criar os menus
        this.main_menu = new Menu(new String[]{
            "Login",
            "Registar",
            "Jogar"
        });

        this.main_menu.setHandler(1, this::login);
        this.main_menu.setHandler(2, this::register);
        this.main_menu.setHandler(3, this::play);

        this.creation_menu = new Menu(new String[]{
                "Adicionar Circuito",
                "Adicionar Campeonato",
                "Adicionar Carro",
                "Adicionar Piloto",
                "Disponibilizar Campeonato",
                "Indisponibilizar Campeonato",
                "Listar Campeonatos Disponíveis",
                "Listar Campeonatos Indisponíveis",
        });

        this.creation_menu.setHandler(1, this::adicionarCircuito);
        this.creation_menu.setHandler(2, this::criarCampeonato);
        this.creation_menu.setHandler(3, this::adicionarCarro);
        this.creation_menu.setHandler(4, this::adicionarPiloto);
        this.creation_menu.setHandler(5, this::disponibilizarCampeonato);
        this.creation_menu.setHandler(6, this::indisponibilizarCampeonato);
        this.creation_menu.setHandler(7, this::voltarMenu);

        this.model = new RacingManagerFacade();

        scin = new Scanner(System.in);
    }

    /**
     * Executa o menu principal e invoca o método correspondente à opção seleccionada.
     */
    public void run() {
        this.main_menu.run();
        System.out.println("Até breve!...");
    }

    // Métodos auxiliares
    private void register(){
        // admin's account register is made directly in the database
        try{
            System.out.println("Bem vindo ao centro de registo!");
            System.out.println("Insira o desejado nome de utilizador");
            String name = this.scin.nextLine();
            if (this.model.nomeDisponivel(name)){
                System.out.println("Nome válido!");
                System.out.println("Insira uma palavra-passe!");
                String password = this.scin.nextLine();
                Integer type = 0;
                while(type == 0){
                    System.out.println("Jogador Normal -> 1");
                    System.out.println("Jogador Premium -> 2");
                    type = this.scin.nextInt();
                    if (type!=1 || type!=2) System.out.println("Opção Inválida! Tente Novamente...");
                }
                if(type == 1)  this.model.registarConta(name,password,userType.JogadorBase);
                else this.model.registarConta(name,password,userType.JogadorPremium);   
            } else{
                System.out.println("Esse nome de utilizador já existe!");
            }
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void login(){
        // for player and admin accounts'
        try{
            System.out.println("Bem vindo ao centro de autenticação");
            System.out.println("Insira o seu nome de utilizador");
            String name = this.scin.nextLine();
            if(!this.model.nomeDisponivel(name)){
                while(true){
                    System.out.println("Insira a sua palavra passe");
                    String password = this.scin.nextLine();
                    if(this.model.validarConta(name, password)){
                        userType tipo = this.model.autenticarConta(name);
                        if(tipo == userType.Administrador) this.creation_menu.run();
                        else{
                            //FIXME: It is suppose to do something?
                        }
                        break;
                    } else{
                        System.out.println("Palavra passe incorreta, tente novamente!\n");
                    }
                }  
            } else{
                System.out.println("Não há nenhuma conta com esse nome de utilizador!");
            }
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void adicionarCircuito(){
        try{
            System.out.println("Bem vindo à adição de circuitos!");
            System.out.println("Insira o nome do circuito!");
            String name = this.scin.nextLine();
            if(this.model.nomeCircuitoDisponivel(name)){
                System.out.println("Defina o número de curvas!");
                Integer curves = this.scin.nextInt();
                System.out.println("Defina o número de chicanes!");
                Integer chicanes = this.scin.nextInt();
                System.out.println("Defina o número de voltas!");
                Integer laps = this.scin.nextInt();
                this.model.registarCircuito(new Circuito(name,curves,chicanes,laps)); 
                System.out.println("Circuito adicionado com sucesso!");
            }
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void criarCampeonato(){
        try{
            System.out.println("Bem vindo à criação de campeonatos!");
            System.out.println("Insira o nome pretendido para o campeonato!");
            String name = this.scin.nextLine();
            if(this.model.nomeCampeonatoDisponivel(name)){
                List<Circuito> circuitos = this.model.circuitosExistentes();
                int max_nr_circuitos = circuitos.size();
                System.out.println("Escolha o número de circuitos que pretende ter em " + name + " sendo que existem " + max_nr_circuitos + " circuitos");
                Integer nr_circuitos = this.scin.nextInt();
                int i = 0;
                Campeonato campeonato = new Campeonato(name,false);
                while(i<nr_circuitos){
                    int dimension = campeonato.getCircuitos().size();
                    System.out.println(circuitos.toString());
                    String option = this.scin.nextLine();
                    for(Circuito c:circuitos){
                        if(c.getNome().equals(option)){
                            campeonato.addCircuito(option);
                            break;
                        }
                    }
                    if(campeonato.getCircuitos().size()>dimension) i++;
                    else System.out.println("Nome de circuito inexistente!");       
                }
            }
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void adicionarCarro(){
        try{

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void adicionarPiloto(){
        try{

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void disponibilizarCampeonato(){
        try{

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void indisponibilizarCampeonato(){
        try{

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void voltarMenu(){
        try{

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void play(){
        try{

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }  
}
