package Exercicios2.exercicio3.Exercicios.ex6;

public enum Valor {
    AS("ás"),
    VALETE("J"),
    DAMA("Q"),
    REI("K"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9");

    private String valor; //propriedade

    //construtor privado que inicia a propriedade valor
    Valor(String valor) {
        this.valor = valor;
    }

    //método getter
    public String getValor() {
        return valor;
    }
}

//Para atribuir um desses valores a uma variável podemos fazer como no código abaixo:
//Naipe naipe = Naipe.AS;

//construtor de uma enum é sempre privado e não pode ser invocado diretamente
//criar setters para as propriedades de um enum vai contra sua característica de ser imutável