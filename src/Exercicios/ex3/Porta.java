package Exercicios.ex3;

public class Porta {

    private String cor;
    private double altura;
    private double comprimento;
    private double espessura;
    private boolean estado;

    public void getDimensao() {
        System.out.println(this.altura + " x " + this.comprimento + " x " + this.espessura);
    }

    public void dimensionar(double altura, double comprimento, double espessura) {
        this.altura = altura;
        this.comprimento = comprimento;
        this.espessura = espessura;
    }

    public void getCor() {
        System.out.println("A cor da porta é " + this.cor);
    }
    
    public void abrir() {
        this.estado = true;
    }

    public void fechar() {
        this.estado = false;
    }

    public void pintar(String tinta) {
        this.cor = tinta;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void estaAberta() {
        if (estado == true) {
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada");
        }
    }
}
