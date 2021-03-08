package Exercicios2.exercicio1;

import Cliente.CategoriaCNH;
import Cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Locadora carrosNobres = new Locadora("Carros Nobres");

        carrosNobres.addCarro("Fiat", "Uno", "Cinza", 4, 2012, 30000);
        carrosNobres.addCarro("Fiat", "Cronos", "Cinza", 4, 2008, 20000);
        carrosNobres.addCarro("Fiat", "Argos", "Vermelho", 4, 2002, 300000);

        System.out.println(CategoriaCNH.A);
        carrosNobres.addCliente("Amanda", "Rua dos Bobos", CategoriaCNH.B);

        System.out.println(carrosNobres.getQtdCarros());

        carrosNobres.getListaCarros();

  
    }
}
