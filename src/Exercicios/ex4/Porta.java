package Exercicios.ex4;

public class Porta {

    private boolean estado;
    
    public void abrir() {
        this.estado = true;
    }

    public void fechar() {
        this.estado = false;
    }
}
