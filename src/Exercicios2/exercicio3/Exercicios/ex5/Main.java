package Exercicios2.exercicio3.Exercicios.ex5;

public class Main {
    public static void main(String[] args) {
        Televisao minhaTV = new Televisao();

        minhaTV.Canal(102);
        minhaTV.Canal(30);
        minhaTV.getCanal();

        minhaTV.upCanal();
        minhaTV.upCanal();
        minhaTV.downCanal();
        minhaTV.getCanal();

        minhaTV.getEstado();
        minhaTV.ligarDesligar();
        minhaTV.getEstado();

        minhaTV.getModo();
        minhaTV.silenciarDessilenciar();
        minhaTV.getModo();

        minhaTV.Volume(30);

        minhaTV.getEstado();
    }
}
