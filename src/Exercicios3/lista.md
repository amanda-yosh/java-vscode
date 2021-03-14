# Exercícios - Atributos e métodos estáticos
# Herança e Polimorfismo
# Classes Genéricas e aninhadas e enumerações

1. Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das unidades de área segundo a lista abaixo.
1 metro quadrado = 10.76 pés quadrados
1 pé quadrado = 929 centímetros quadrados
1 milha quadrada = 640 acres
1 acre = 43.560 pés quadrados 

2. A área de um campo de futebol é de 8.250 metros quadrados. Usando a classe ConversaoDeUnidadesDeArea, escreva um programa em Java que mostre qual é a área de um campo de futebol em pés quadrados, acres e centímetros quadrados. Escreva métodos adicionais para a classe  ConversaoDeUnidadesDeArea, se necessário.

3. Faça um programa para representar a árvore genealógica de uma família. Para tal, crie uma classe Pessoa que permita indicar, além de nome e idade, o pai e a mãe. Tenha em mente que pai e mãe também são do tipo Pessoa. 

4. Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo. Use herança e polimorfismo.

5. Faça um programa de agenda que permita guardar dois tipos de contato: pessoa física e pessoa jurídica. Para pessoa física, guarde o nome, o CPF, o endereço e a data de aniversário. Para pessoa jurídica, guarde a razão social, o CNPJ, o endereço e o faturamento. Permita tanto listar todos os contatos da agenda quanto buscar um contato específico pelo seu CPF, se for pessoa física, ou pelo CNPJ, se for pessoa jurídica. Use herança e polimorfismo.

6. No enunciado abaixo, identifique possíveis classes de objetos, seus atributos e métodos, usando o mecanismo de herança. Dê um exemplo de instância para cada classe identificada.  


“Pokémons são criaturas que os seres humanos capturam e treinam para lutarem uns contra os outros como um esporte. Os Pokémons podem ser de diversos tipos como, por exemplo, Fogo, Elétrico, Água, etc. 

Cada Pokémon pode aprender diversos ataques que são utilizados para ferir o adversário; outros que fortalecem ataques de um tipo ou que enfraquecem os adversários, diminuindo seus stats; e outros que impõem condições negativas (adormecer, envenenar, congelar, queimar, paralisar, confundir). Os ataques possuem precisão, potência e uma quantidade de vezes que podem ser utilizados. Cada Pokémon tem sua habilidade que provoca mudanças nas batalhas ou fora delas. Existem habilidades que podem anular o dano de um ataque, provocar mudanças nos stats do Pokémon ou impor uma condição ao Pokémon na batalha. Cada Pokémon possui seis stats: HP (Hit Points), Atk (Attack), Def (Defense), Sp. Atk (Special Attack), Sp. Def (Special Defense) e Spd (Speed). Os Pokémons possuem valores fixos que determinam seus stats e todos os Pokémons do mesmo tipo possuem o mesmo valor de base em cada stats. Um Pokémon pode evoluir, ou seja, mudar de forma, acompanhado de uma melhora em seus stats.  Evolução em Pokémon pode ocorrer por diversas razões, sendo que a mais comum se dá por acúmulo de experiência em batalhas (aumentando o seu nível).  Quando um Pokémon evolui, ele troca de aparência, tamanho, peso, nome, stats e pode aprender ataques e habilidades que a sua forma anterior não aprenderia.”.

7. Crie uma enumeração DiaDaSemana com sete valores entre DOMINGO e SABADO. Adicione um método ehDiaUtil() à classe DiaDaSemana que retorna true se o valor em que for chamado estiver entre SEGUNDA e SEXTA e false, caso contrário.
 
8. Escreva uma classe genérica Par que tem dois parâmetros de tipo - F e S - cada um representando o tipo do primeiro e segundo elemento do par, respectivamente. Adicione os métos get e set ao primeiro e ao segundo elemento do par (Dica: o cabeçalho da classe deve ser public class Par<F, S >)

9. Defina uma classe que contenha um método genérico capaz de efetuar a soma das área de arrays contendo apenas objetos dos tipos apresentados no exercício 1.
