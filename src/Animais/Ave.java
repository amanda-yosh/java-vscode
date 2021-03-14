package Animais;

public class Ave extends Animais{

    public Ave(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY); //sobrecarga do meu construtor
    }
    
    @Override
    public void circular() {
        System.out.println("Estou voando");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("carne")) {
            System.out.println("Não quero comer");
        } else {
            super.comer(comida);
        }
    }
}
