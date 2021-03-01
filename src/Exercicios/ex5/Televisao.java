package Exercicios.ex5;

public class Televisao {

    private boolean estado;
    private boolean modo;
    private int volume;
    private int canal;

    public void ligarDesligar() {
        if (this.estado == true) {
            this.estado = false;
        } else {
            this.estado = true;
        }
    }
    public void getEstado() {
        if (this.estado == true) {
            System.out.println("TV ligada");
        } else {
            System.out.println("TV desligada");
        }
    }

    public void silenciarDessilenciar() {
        if (this.modo == true) {
            this.modo = false;
        } else {
            this.modo = true;
        }
    }
    public void getModo() {
        if (this.modo == true) {
            System.out.println("Silencioso: ON");
        } else {
            System.out.println("Silencioso: OFF");
        }
    }

    public void Volume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        }
        else {
            System.out.println("Volume inválido");
        }
    }

    public void getVolume() {
        System.out.println(this.volume);
    }

    public void Canal(int canal) {
        if (canal >= 0 && canal <= 99) {
            this.canal = canal;
        }
        else {
            System.out.println("Canal inválido");
        }
    }
    public void mudarCanal(int canal) {
        this.canal = canal;
    }
    public void upCanal() {
        this.canal++;
    }
    public void downCanal() {
        this.canal--;
    }
    public void getCanal() {
        System.out.println(this.canal);
    }
}
