package Exercicios2.exercicio3.Exercicios.ex4;

//import Exercicios.ex3.Porta;

public class Main {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Verde");

        minhaCasa.pintar("Amarelo");
        minhaCasa.getCor();

        minhaCasa.addPorta("Azul", 2, 0.77, 0.27);
        minhaCasa.addPorta("Amarela", 2, 0.77, 0.27);
        minhaCasa.addPorta("Branca", 2, 2, 0.27);

        minhaCasa.portas[1].abrir();
        minhaCasa.quantasPortasEstaoAbertas();
    }
}
