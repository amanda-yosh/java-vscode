package Animais;

public class Pato extends Ave{

    public Pato(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY); //sobrecarga do meu construtor
    }
    
    @Override
    public void fazerRuido() {
        System.out.println("quá quá");
    }
}
