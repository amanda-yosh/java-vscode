package Exercicios.ex3;

public class Programa {
    
    public static void main(String[] args) {

        Porta portaFrente = new Porta();

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
