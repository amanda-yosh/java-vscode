package Animais;

public class Felino extends Animais {

    public Felino(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY); //sobrecarga do meu construtor
    }
    
    @Override
    public void comer(String comida) {
        if (comida.equals("carne")) {
            System.out.println("Como carne");
        } else {
            System.out.println("Não quero comer");
        }
    }
}
