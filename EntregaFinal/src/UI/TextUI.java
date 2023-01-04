package EntregaFinal.src.UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import EntregaFinal.src.IRacingManager;
import EntregaFinal.src.RacingManagerFacade;

// Needed imports once diagrams were chosen to be like this
import EntregaFinal.src.SubCarros.*;
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
    private String last;
    private Map<String,Boolean> logged_in = new HashMap<>();

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
            "Jogar",
            "Menu Administrador"
        });

        this.main_menu.setHandler(1, this::login);
        this.main_menu.setHandler(2, this::register);
        this.main_menu.setHandler(3, this::play);
        this.main_menu.setHandler(4, this::menuadmin);

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
                if(type == 1) this.model.registarConta(name,password,userType.JogadorBase);
                else{ 
                    this.model.registarConta(name,password,userType.JogadorPremium); 
                    this.logged_in.put(name, true);
                } 
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
                        last = name;
                        this.logged_in.put(name, true);
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

    private void menuadmin(){
        try{
            if(this.logged_in.get(last)==true){
                this.creation_menu.run();
            } else {
                System.out.println("Não está logado como administrador, ou não é um administrador!");
            }
        } catch(Exception e){
            e.printStackTrace();
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
                    int dimension = campeonato.get_circuitos().size();
                    System.out.println(circuitos.toString());
                    String option = this.scin.nextLine();
                    for(Circuito c:circuitos){
                        if(c.get_nome().equals(option)){
                            campeonato.addCircuito(option);
                            break;
                        }
                    }
                    if(campeonato.get_circuitos().size()>dimension) i++;
                    else System.out.println("Nome de circuito inexistente!");       
                }
                this.model.registarCampeonato(campeonato);
                System.out.println("Campeonato criado com sucesso!");
            }
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void adicionarCarro(){
        try{
            System.out.println("Bem vindo à adição de carros!");
            System.out.println("Insira o marca do carro a adicionar!");
            String marca = this.scin.nextLine();
            System.out.println("Insira um modelo de " + marca + "!");
            String model = this.scin.nextLine();
            System.out.println("Insira a potência de " + marca + " " + model + "!");
            Integer power = this.scin.nextInt();
            String categoria;
            while(true){
                System.out.println("Insira a categoria que pretende inserir " + marca + " " + model + "!");
                categoria = this.scin.nextLine();
                if(this.model.categoriaValida(categoria)) break;
                else System.out.println("Categoria inválida, tente novamente...");
            }
            System.out.println("Insira a cilindrade de " + marca + " " + model + "!");
            Integer cilindrada = this.scin.nextInt();
            if(this.model.cilindradaValida(cilindrada, categoria)){
                System.out.println("Insira a fiabilidade de " + marca + " " + model + "!");
                Integer fiabilidade = this.scin.nextInt();
                if(this.model.fiabilidadeValida(fiabilidade)){
                    String c = categoria.toUpperCase();
                    if(c != "SC"){
                        System.out.println("O carro é híbrido? Y/n");
                        String hibrido = this.scin.nextLine();
                        hibrido.toLowerCase();
                        if(hibrido == "y"){
                            System.out.println("Insira a potẽncia do motor elétrico de " + marca + " " + model + "!");
                            Integer motor = this.scin.nextInt();
                            switch(c){
                                case "C1H":
                                    this.model.registarCarro(new C1H(marca,model,power,cilindrada,fiabilidade,motor));
                                case "C2H":
                                    this.model.registarCarro(new C2H(marca,model,power,cilindrada,fiabilidade,motor));
                                case "GTH":
                                    this.model.registarCarro(new GTH(marca,model,power,cilindrada,fiabilidade,motor));

                            }
                        }else{
                            switch(c){
                                case "C1":
                                    this.model.registarCarro(new C1(marca,model,power,cilindrada,fiabilidade));
                                case "C2":
                                    this.model.registarCarro(new C2(marca,model,power,cilindrada,fiabilidade));
                                case "GT":
                                    this.model.registarCarro(new GT(marca,model,power,cilindrada,fiabilidade));
                            }
                        }

                    } else {this.model.registarCarro(new SC(marca,model,power,cilindrada,fiabilidade));}
                    System.out.println("Carro adicionado com sucesso!");
                }

            }

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void adicionarPiloto(){
        try{
            System.out.println("Bem vindo à adição de pilotos!");
            System.out.println("Insira o nome do piloto a adicionar!");
            String name = this.scin.nextLine();
            if(this.model.nomePilotoDisponivel(name)){
                System.out.println("Insira os níveis de perícia!");
                System.out.println("Chuva vs. Tempo Seco (0<=x<=1)");
                Float cts = this.scin.nextFloat();
                System.out.println("Segurança vs. Agressividade (0<=x<=1)");
                Float sva = this.scin.nextFloat();
                this.model.registarPiloto(new Piloto(name,cts,sva)); 
                System.out.println("Piloto adicionado com sucesso!");
            }
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void disponibilizarCampeonato(){
        try{
            System.out.println("Insira o nome do campeonato que pretende disponibilizar!");
            List<String> campeonatos = new ArrayList<>();
            for(Campeonato c: this.model.campeonatosIndisponiveis()){
                campeonatos.add(c.get_nome());
            }
            System.out.println(campeonatos.toString());
            String name = this.scin.nextLine();
            while(true){
                if(campeonatos.contains(name)){
                    for(Campeonato c:this.model.campeonatosIndisponiveis()){
                        if(c.get_nome().equals(name)) this.model.disponibilizarCampeonato(c);
                    }
                    break;
                } else System.out.println("Nome inválido, tente novamente...");
            }
            System.out.println("Campeonato " + name + " disponibilizado com sucesso!");
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void indisponibilizarCampeonato(){
        try{
            System.out.println("Insira o nome do campeonato que pretende indisponibilizar!");
            List<String> campeonatos = new ArrayList<>();
            for(Campeonato c: this.model.campeonatosDisponiveis()){
                campeonatos.add(c.get_nome());
            }
            System.out.println(campeonatos.toString());
            String name = this.scin.nextLine();
            while(true){
                if(campeonatos.contains(name)){
                    for(Campeonato c:this.model.campeonatosDisponiveis()){
                        if(c.get_nome().equals(name)) this.model.indisponibilizarCampeonato(c);
                    }
                    break;
                } else System.out.println("Nome inválido, tente novamente...");
            }
            System.out.println("Campeonato " + name + " indiponibilizado com sucesso!");
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void voltarMenu(){
        try{
            System.out.println("Voltando ao menu principal, saíndo de modo administrador...");
            this.main_menu.run();
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void play(){
        try{
            // TODO: To be implemented
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }  
}
