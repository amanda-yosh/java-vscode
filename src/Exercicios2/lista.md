## Exercícios - Construtores, Pacotes e Encapsulamento

# [2,5 pontos] 1 - Para cada uma das situações a seguir, implemente a classe Carro.
Obs: é suficiente colocar a assinatura dos métodos (eles não precisam ser implementados)
    Sistema de uma locadora de carros
    Sistema de uma revendedora de carros
    Sistema de uma oficina mecânica
    Sistema do DETRAN

Exemplo de resposta esperada, considerando uma classe Cachorro

```java
    public class Cachorro {

        private String nome;
        private int idade;

        public String latir(){}

        public void comer(String comida){}
        /*não precisa getters e setters */
    }
```

# [2,5 pontos] 2 - Em um sistema acadêmico, há as classes Aluno, Professor, Disciplina, Turma e Inscrição. Implemente essas classes com possíveis atributos e defina em qual classes os métodos a seguir deveriam ser implementados (informe apenas a assinatura do método na classe correspondente):
    Exibição do histórico do aluno -> Inscrição
    Cálculo da média do aluno em uma turma -> Inscrição
    Obtenção do horário de uma aula -> Turma
    Descrição da ementa de uma disciplina -> Disciplina
    Cálculo do CR de um aluno -> Inscrição

# [2,5 pontos] 3 - Refaça os exercícios da aula anterior, criando construtores necessários e adicionado os modificadores de acesso para métodos e atributos das classes criadas. Crie os getters e setters necessários para essas classes.

# [2,5 pontos] 4 -   Crie uma classe Data com as seguintes capacidades:
    Gerar saída da data em múltiplos formatos, como: DD/MM/AAAA; Agosto 08, 2017; DDD AAAA;
    Utilize construtores sobrecarregados para criar objetos Data inicializados com datas no formato definido em cima.
    No primeiro caso, o construtor deve receber 3 valores inteiros.
    No segundo caso, deve receber uma String e 2 valores inteiros.
    No terceiro caso deve receber 2 valores inteiros, o primeiro representando o número de dias no ano.
    Faça uma classe principal que implemente o método main que deverá instanciar 2 objetos de cada formato e depois imprimir cada um deles.
