package Exercicios2.exercicio3.Exercicios.ex3;

public class Main {
    
    public static void main(String[] args) {

        Porta portaFrente = new Porta("branca", 1.60, 0.70, 0.2);

        portaFrente.abrir();
        portaFrente.estaAberta();

        portaFrente.fechar();
        portaFrente.estaAberta();

        portaFrente.pintar("vermelha");
        portaFrente.getCor();

        portaFrente.pintar("vinho");
        portaFrente.getCor();

        portaFrente.dimensionar(1.80, 0.60, 0.02);
        portaFrente.getDimensao();
    }
}
