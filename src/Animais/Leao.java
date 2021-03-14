package Animais;

public class Leao extends Felino {

    public Leao(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY); //sobrecarga do meu construtor
    }
    
    @Override
    public void fazerRuido() {
        System.out.println("roar");
    }
}
