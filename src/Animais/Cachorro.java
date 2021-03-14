package Animais;

public class Cachorro extends Animais{

    public Cachorro(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY); //sobrecarga do meu construtor
    }
    
    @Override
    public void fazerRuido() {
        System.out.println("au au");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("carne")) {
            System.out.println("Adoro carne");
        } else {
            System.out.println("Não quero comer");
        }
    }
}
