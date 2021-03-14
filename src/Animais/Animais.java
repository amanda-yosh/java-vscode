package Animais;

public class Animais {
    protected String imagem;
    protected String comida;
    protected int nivelFome;
    protected int localizacaoX;
    protected int localizacaoY;

    // public Animais() {
    //     this("", "", 0, 0, 0); //este construtor chama o construtor abaixo e passa esses parametros como base
    // }

    public Animais(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY) {
        this.imagem = imagem;
        this.comida = comida;
        this.nivelFome = nivelFome;
        this.localizacaoX = localizacaoX;
        this.localizacaoY = localizacaoY;
    }

    public void fazerRuido() {
        System.out.println("Ruído de um animal genérico");
    }

    public void comer() {
        System.out.println("Estou comendo");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    public void comer(String comida, int qtdComida) {
        System.out.println("Estou comendo " + qtdComida + " de " + comida);
    }

    public void dormir() {
        System.out.println("ZZzzzzZZzzz");
    }

    public void circular() {
        System.out.println("Estou circulando");
    }
}
