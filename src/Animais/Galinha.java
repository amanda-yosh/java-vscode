package Animais;

public class Galinha extends Ave{

    public Galinha(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY); //sobrecarga do meu construtor
    }
    
    @Override
    public void fazerRuido() {
        System.out.println("co co ri có");
    }
}
