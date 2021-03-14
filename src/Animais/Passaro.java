package Animais;

public class Passaro extends Ave{

    public Passaro(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY); //sobrecarga do meu construtor
    }
    
    @Override
    public void fazerRuido() {
        System.out.println("piu piu");
    }
}
