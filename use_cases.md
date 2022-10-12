# Use Cases

- ### Requisitos

    - Campeonato(s)
    - Adição de circuito(s)
    - Adição de carro(s)
    - Adição de piloto(s)
    - Registo num campeonato
    - Alteração de afinação
    - Começo da corrida

- ### Atores

    - Jogador
    - Administrador

---

## Campeonato(s)

### Descrição:
- Administrador efetua ações relativas a campeonato(s).

### Cenários:
1. O Artur faz login como administrador, vai à opção campeonato e adiciona um capeonato à lista de campeonatos disponíveis. Começa por lhe dar o nome "CampeUMnato". De seguida, escolhe os circuitos "Gualtar Campus", "Sta Tecla Bairro" e "Azurém Campus" da lista de circuitos disponíveis. Depois de consultar a lista de campeonatos actualmente disponíveis para jogar, decide adicionar o "CampeUMnato à mesma, pelo que este fica imediatamente disponível para ser jogado.

### Pré-condição:
- Ser administrador
- Existência de circuitos

### Pós-condição:
- Novo campeonato adicionado ao jogo

### Fluxo normal:
1. Administrador faz login
2. Jogo valida acesso e apresenta menu inicial
3. Admin seleciona campeonato
4. Jogo apresenta lista de campeonatos e as opções criar campeonato, adicionar ou remover campeonato à lista de disponíveis ou voltar ao menu inicial
5. Administrador escolhe criar campeonato ou cancelar
6. Jogo pergunta pelo nome do campeonato ou se quer cancelar
7. Administrador fornece nome
8. Jogo mostra menu para pesquisa e selecionamento de circuitos ou para cancelamento
9. Admin escolhe circuito(s) a adicionar
10. Jogo guarda novo campeonato e questiona se quer voltar ao menu anterior ou criar outro campeonato
11. Administrador escolhe voltar ao menu inicial
12. Jogo apresenta menu campeonato

### Fluxo de exceção (1):
2.1. Jogo avisa sobre login inválido

### Fluxo alternativo (2):
4.1. Administrador escolhe voltar ao menu inicial
4.2. Jogo apresenta menu inicial

### Fluxo alternativo (3):
4.1 Administrador escolhe adicionar campeonato
4.2 Jogo vai para o menu de adicionar campeonato (especificado abaixo)

### Fluxo alternativo (4):
4.1 Administrador escolhe remover campeonato
4.2 Jogo vai para o menu de adicionar campeonato (especificado abaixo)

### Fluxo alternativo (5):
6.1. Administrador escolhe cancelar
6.2. Jogo apresenta menu campeonato

### Fluxo alternativo (6):
10.1. Administrador escolhe criar outro campeonato
10.2. Regressa a 6

---

## Adição de um campeonato à lista de campeonatos disponíveis

### Descrição:
- Administrador adiciona campeonatos disponiveis a ser jogados pelos jogadores

### Cenários:
1. O Artur após ter criado o "CampeUMnato" decide adicioná-lo à lista de campeonatos disponíveis.
2. O João verifica que existem campeonatos criados que não estão na lista de campeonatos disponíveis e decide adicioná-los.

### Pré-condição:
- Ser administrador
- Existência de campeonatos indisponíveis

### Pós-condição:
- Novo campeonato disponível aos jogadores

### Fluxo normal:
1. Administrador faz login
2. Jogo valida acesso e apresenta menu inicial
3. Administrador seleciona campeonato
4. Jogo apresenta lista de campeonatos e as opções criar campeonato, adicionar ou remover campeonato à lista de disponíveis ou voltar ao menu inicial
5. Administrador seleciona adição de campeonato(s)
6. Jogo apresenta campeonatos indisponíveis na lista e pergunta por uma seleção ou se quer voltar
7. Administrador seleciona um campeonato
8. Jogo torna campeonato disponível e volta ao menu campeonato
 
### Fluxo de exceção (1):
2.1. Jogo avisa sobre login inválido

### Fluxo alternativo (2):
5.1. Administrador escolhe voltar ao menu incial
5.2. Jogo apresenta menu inicial

### Fluxo alternativo (3):
5.1. Administrador escolhe criar campeonato
5.2. Jogo apresenta menu criar campeonato (especificado acima)

### Fluxo alternativo (4):
5.1. Administrador escolhe remover campeonato
5.2. Jogo apresenta menu remover campeonato (especificado abaixo)

### Fluxo alternativo (5):
7.1. Administrador escolhe voltar ao menu campeonato
7.2. Jogo apresenta menu campeonato

---

## Remoção de campeonato(s) da lista de campeonatos disponíveis

### Descrição:
- Administrador remove campeonato(s) disponiveis a ser jogados pelos jogadores

### Cenários:
1. O Alberto reparou que existiam dois campeonatos com os mesmos circuitos mas diferentes nomes, o "CampeUMnato" e o "CampEInato" então decidiu remover da lista de campeonatos disponíveis o "CampeUMnato".
2. A Maria achou que o "CampeUMnato" tinha circuitos muito difíceis então decidiu remover dos campeonatos disponíveis o único campeonato.

### Pré-condição:
- Ser administrador
- Existência de campeonatos disponíveis

### Pós-condição:
- Novo campeonato indisponível aos jogadores

### Fluxo normal:
1. Administrador faz login
2. Jogo valida acesso e apresenta menu inicial
3. Administrador seleciona campeonato
4. Jogo apresenta lista de campeonatos e as opções criar campeonato, adicionar ou remover campeonato à lista de disponíveis ou voltar ao menu inicial
5. Administrador seleciona remoção de campeonato(s) disponíveis
6. Jogo apresenta campeonatos disponíveis e pergunta por uma seleção ou se quer voltar
7. Administrador seleciona um campeonato
8. Jogo torna campeonato indisponível e volta ao menu campeonato

### Fluxo de exceção (1):
2.1. Jogo avisa sobre login inválido

### Fluxo de exceção (2):
4.1. Administrador escolhe voltar ao menu inicial
4.2. Jogo apresenta menu inicial

### Fluxo de exceção (3):
4.1. Administrador escolhe criar campeonata
4.2. Jogo apresenta menu criar campeonato (especificado acima)

### Fluxo de exceção (4):
4.1. Administrador escolhe adicionar campeonato
4.2. Jogo apresenta menu adicionar campeonato (especificado acima)

### Fluxo alternativo (3):
6.1. Administrador escolhe voltar
6.2. Jogo apresenta menu campeonato

---

## Adição de Circuitos

### Descrição:
- Administrador adiciona um circuito ao jogo, indicando o tamanho, curvas e chicanes, o grau de ultrapassagem dos segmentos e o nº de voltas

### Cenários:
1. O José faz login no jogo como administrador e opta por adicionar um novo circuito. Indica como nome do novo circuito a adicionar “Gualtar Campus”. De seguida, indica que o mesmo tem 2Km, 9 curvas e 1 chicane. Com essa informação, o sistema calcula que o circuito tem 10 rectas e apresenta a lista de curvas e rectas de modo a que o José indique o grau de dificuldade de ultrapassagem (GDU) em cada uma. Para as rectas 1 e 6, e curvas 2 e 3, indica um GDU de possível. Para as rectas 4, 5, 7 e 8, e curvas 4, 5, 7 e 8, indica um GDU de impossível. Para os restantes, indica um GDU de difícil. Finalmente, regista o circuito, indicando que cada corrida deverá ter 10 voltas. O circuito passa a estar disponível para integrar campeonatos.

### Pré-condição:
- Ser administrador
- PC funcional com programa a correr

### Pós-condição:
- Novo circuito adicionado ao jogo

### Fluxo normal:
1. Administrador faz login
2. Jogo valida acesso e apresenta menu inicial
3. Administrador seleciona criação de circuito
4. Jogo pergunta qual o nome do circuito ou se quer cancelar
5. Administrador fornece nome
6. Jogo pergunta pelo tamanho em km e pelo nº de curvas e chicanes e pelos seus respetivos GDUs ou se quer cancelar
8. Administrador fornece tamanho em km e nº de curvas e chicanes com os seus respetivos GDUs
9. Jogo pergunta nº de voltas ou se quer cancelar
10. Administrador especifica nº de voltas
11. Jogo regista novo circuito e questiona se quer voltar ao menu inicial ou adicionar outro circuito
12. Administrador escolhe voltar ao menu inicial
13. Jogo apresenta menu inicial

### Fluxo de exceção (1):
2.1. Jogo avisa sobre login inválido

### Fluxo alternativo (2):
4.1. Administrador escolhe cancelar
4.2. Jogo apresenta menu inicial

### Fluxo alternativo (3):
8.1. Administrador escolhe cancelar
8.2. Jogo apresenta menu inicial

### Fluxo alternativo (4):
12.1. Administrador escolhe criar outro circuito
12.2. Regressa a 4

---

## Adição de Carros

### Descrição:
- Administrador adiciona um carro ao jogo, indicando categoria, marca, modelo, cilindrada, potências do(s) motor(es) e o perfil aerodinâmico

### Cenários:
1. O José faz login no jogo como administrador e opta por adicionar um novo carro. Começa por consultar as categorias disponíveis nesta versão do jogo ("C1", "C2", "GT", "SC", talvez categorias a ser adicionadas futuramente). O José opta pela categoria “C2” e, de seguida, indica a marca e modelo do carro: um Ferrari 488 GTE. O José sabe que a cilindrada é de 3902cm3 e a potência do motor de combustão de 661CV e fornece esses valores. Uma vez que o carro não é híbrido, não há lugar à indicação da potência do motor eléctrico. Finalmente, escolhe o perfil aerodinâmico do carro (PAC). Considerando as características do mesmo indica um valor de 0.21 e termina o registo do carro, que fica disponível para ser utilizado em jogos.

### Pré-condição:
- Ser administrador
- PC funcional com programa a correr

### Pós-condição:
- Novo carro adicionado ao jogo

### Fluxo normal:
1. Administrador faz login
2. Jogo valida acesso e apresenta menu inicial
3. Administrador seleciona criação de carros
4. Jogo apresenta uma lista de caregorias disponíveis na atual versão do jogo e pergunta se quer cancelar
5. Administrador seleciona uma categoria
6. Jogo pergunta pela marca e modelo do carro ou se quer cancelar
7. Administrador fornece marca e modelo
8. Jogo questiona pela cilindrada e potência do motor de combustão ou se quer cancelar
9. Administrador especifica cilindrada e potência do motor de combustão
10. Jogo pergunta se o carro é híbrido, se sim indicar potência ou se quer cancelar
11. Administrador indica potência se o carro for híbrido
12. Jogo pergunta pelo perfil aerodinâmico do carro ou se quer cancelar
13. Administrador indica PAC
14. Jogo regista novo carro e questiona se quer voltar ao menu inicial ou adicionar outro carro
15. Administrador escolhe voltar ao menu inicial
16. Jogo apresenta menu inicial

### Fluxo de exceção (1):
2.1. Jogo avisa sobre login inválido

### Fluxo alternativo (2):
5.1. Administrador escolhe cancelar
5.2. Jogo apresenta menu inicial

### Fluxo alternativo (3):
7.1. Administrador escolhe cancelar
7.2. Jogo apresenta menu inicial

### Fluxo alternativo (4):
9.1. Administrador escolhe cancelar
9.2. Jogo apresenta menu inicial

### Fluxo alternativo (5):
11.1. Administrador escolhe cancelar
11.2. Jogo apresenta menu inicial

### Fluxo alternativo (6):
13.1. Administrador escolhe cancelar
13.2. Jogo apresenta menu inicial

### Fluxo alternativo (7):
15.1. Administrador escolhe criar outro circuito
15.2. Regressa a 4

---

## Adição de Pilotos

### Descrição:
- Administrador adiciona um piloto ao jogo, indicando nome e níveis de perícia

### Cenários:
1. O José faz login no jogo como administrador e decide adicionar um novo piloto. Começa por indicar que o nome será “Battery Voltar” e, de seguida, os seus níveis de perícia. No critério “Chuva vs. Tempo Seco” (CTS), indicou um valor de 0.6, indicando um ligeiro melhor desempenho em tempo seco. No critério “Segurança vs. Agressividade” (SVA), indicou um valor de 0.4, indicando que o piloto tende a arriscar pouco (logo terá alguma maior dificuldade em ultrapassar, mas menor probabilidade de se despistar). Finalmente, regista o piloto, que fica disponível.

### Pré-condição:
- Ser administrador
- PC funcional com programa a correr

### Pós-condição:
- Novo piloto adicionado ao jogo

### Fluxo normal:
1. Administrador faz login
2. Jogo valida acesso e apresenta menu inicial
3. Administrador seleciona criação de pilotos
4. Jogo pergunta qual é o nome do piloto ou se quer cancelar
5. Administrador indica o nome pretendido
6. Jogo questiona qual os seus níveis de perícia no critério de CTS ("Chuva vs. Tempo Seco") e SVA ("Segurança vs Agressividade") dentro da escala pré-fornecida ou se quer cancelar
7. Administrador indica os níveis de perícia em ambos os critérios
8. Jogo regista novo piloto e questiona se quer voltar ao menu inicial ou adicionar outro piloto
9. Administrador escolhe voltar ao menu inicial
10. Jogo apresenta menu inicial

### Fluxo de exceção (1):
2.1. Jogo avisa sobre login inválido

### Fluxo alternativo (2):
5.1. Administrador escolhe cancelar
5.2. Jogo apresenta menu inicial

### Fluxo alternativo (3):
7.1. Administrador escolhe cancelar
7.2. Jogo apresenta menu inicial

### Fluxo alternativo (7):
9.1. Administrador escolhe criar outro circuito
9.2. Regressa a 4

---

## Configurar Campeonato

### Descrição:
- Jogador joga sozinho ou com outros jogadores, escolhendo campeonato, carro e piloto

### Cenários:
1. O Francisco e três amigos resolver jogar um campeonato de Racing Manager. O Francisco faz login como jogador, escolhe um campeonato e avalia os circuitos que o compõem. Como a maioria são circuitos rápidos, decide participar com um Ferrari 488 GTE (um carro da categoria C2). Escolhe como piloto Battery Voltas, por considerar ser um piloto equilibrado em termos de desempenho. Após inscrever-se, cada um dos amigos escolhe também o seu carro e piloto.

### Pré-condição:
- PC funcional com programa a correr

### Pós-condição:
- Campeonato configurado

### Fluxo normal:
1. Jogador faz, ou não, login (administradores podem jogar como administrador também)
2. Jogo valida acesso e demonstra uma lista de campeonatos disponíveis ou se quer voltar ao menu inicial
3. Jogador seleciona campeonato
4. Jogo demonstra carros disponíveis para correr no campeonato e pergunta se quer voltar atrás
5. Jogador seleciona carro
6. Jogo demonstra o conjunto de pilotos disponíveis possíveis e pergunta se quer voltar atrás
7. Jogador seleciona piloto pretendido
8. Jogador espera que outros jogadores selecionem os seus respetivos carros e pilotos

### Fluxo de exceção (1):
2.1. Jogo avisa sobre login inválido

### Fluxo alternativo (2):
3.1. Jogador escolhe voltar ao menu inicial
3.2. Jogo apresenta menu inicial

### Fluxo alternativo (3):
5.1. Jogador escolhe voltar atrás
5.2. Regressa a 2

### Fluxo alternativo (4):
7.1. Jogador escolhe voltar atrás
7.2. Regressa a 4

---

## Configurar Corrida(s)

### Descrição:
- Jogador configura o carro para a corrida

### Cenários:
1. As condições da primeira corrida são apresentadas: o circuito é o “Gualtar Campus” e a situação meteorológica é de tempo seco (a outra possibilidade seria chuva). O Francisco sabe que cada um dos jogadores deve alterar a afinação do carro. Após a afinação a seu gosto, o Francisco escolhe pneus macios, o que permite ter melhor desempenho no início da corrida, à custa do desempenho no final. Dos três modos de funcionamento do motor (conservador, normal ou agressivo), o Francisco escolhe o agressivo, aumentado o desempenho do carro à custa de maior probabilidade de o motor ter uma avaria.

### Pré-condição:
- Campeonato configurado

### Pós-condição:
- Corrida(s) configurada(s)

### Fluxo normal:
1. Jogador escolhe fazer afinações ao seu carro
2. Jogo apresenta o conjunto de afinações possíveis (repartido no use case abaixo)
3. Jogador faz afinações
4. Jogo demonstra pneus a escolher para a corrida
5. Jogador escolhe o tipo de pneu que pretende
6. Jogo pergunta qual o tipo de motor
7. Jogador escolhe o tipo de motor
8. Jogador espera que os outros jogadores terminem a sua configuração

---

## Alteração de Afinação

### Descrição:
- Jogador afina o carro para a corrida

### Cenários:
1. O Francisco decide alterar a afinação (possível por se tratar de um C2) e aumenta a downforce de 0.5 (valor neutro) para 0.7.

### Pré-condição:
- Inicio da configuração da corrida

### Pós-condição:
- Afinção alterada

### Fluxo normal:
1. Jogador decidiu alterar as afinações do seu carro
2. Jogo avisa que só pode efeturar X (nº voltas - 1) afinações
3. Jogo disponibiliza as afinações possíveis
4. Jogador altera afinações
5. Jogo altera afinações e volta ao menu de configuração de corrida(s)

---

## Simulação de Corrida(s)

### Descrição:
- Jogo simula a corrida

### Cenários:
1. O Francisco tem a versão base do jogo, os cálculos são feitos em função das posições relativas dos carro, em cada ponto relevante do circuito (recta/curva/chicane).
2. A Sara optou por um carro da categoria C1, híbrido, com downforce mínima, modo de motor agressivo, pneus macios e um piloto com SVA alto. Assim, durante a primeira volta consegue fazer uma ultrapassagem na curva 74. No entanto, na sétima volta, ao tentar uma ultrapassagem na chicane, acaba por sair de pista e ficar na última posição. Os pneus já não estavam em bom estado e acabou por não conseguir ultrapassar ninguém até ao final da corrida. Terminou em terceiro lugar pois o Manuel despistou-se na curva 1 durante a última volta. Nesta corrida nenhum carro sofreu uma avaria.
3. O Asdrubal tem a versão premium do jogo, logo os cálculos são efetuado às posições relativas, posições esssas que desta vez são atualizadas em tempo real.

### Pré-condição:
- Corrida configurada

### Pós-condição:
- Corrida simulada

### Fluxo normal:
1. Jogador seleciona iniciar corrida
2. Jogo inicia e simula a corrida
3. Jogo simula a corrida
4. Após cada segmento (curva/reta/chicane) o jogo atualiza situações do mesmo
5. Jogo indica posições após cada volta
6. Jogo apresenta reultados no fim da corrida
7. Jogo atribui pontos aos cadastrados, por posições e categorias somando para corridas futuras no mesmo campeonato
8. Jogo simula próximas corridas até serem feitas todas as existentes do campeonato
9. Jogo demonstra os rankings e volta ao menu inicial


