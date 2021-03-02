package Apostila;

public class TesteConta {
    public static void main(String[] args) {

        Conta c1 = new Conta();

        Data data = new Data(); // ligação!
        c1.dataAbertura = data;

        c1.recuperaDadosParaImpressaoData(data);

        data.setData(01, 05, 2000);

        c1.recuperaDadosParaImpressaoData(data);


        // Conta c1 = new Conta();
        // c1.nomeTitular = "Danilo";
        // c1.saldo = 100;

        // Conta c2 = new Conta();
        // c2.nomeTitular = "Danilo";
        // c2.saldo = 100;

        // if (c1 == c2) {
        // System.out.println("iguais");
        // } else {
        // System.out.println("diferentes");
        // }

        // Conta c3 = new Conta();
        // c3 = c1;

        // if (c3 == c1) {
        // System.out.println("iguais");
        // } else {
        // System.out.println("diferentes");
        // }

        // Conta minhaConta;
        // minhaConta = new Conta();

        // minhaConta.nomeTitular = "Duke";
        // minhaConta.saldo = 1000.0;

        // minhaConta.sacar(200);

        // minhaConta.depositar(500);

        // minhaConta.calculaRendimento();

        // minhaConta.recuperaDadosParaImpressao();

        // minhaConta.saldo = 1000;
        // boolean consegui = minhaConta.sacaValidacao(2000);
        // if (consegui) {
        // System.out.println("Consegui sacar");
        // } else {
        // System.out.println("Não consegui sacar");
        // }

        // Conta c1 = new Conta();
        // c1.depositar(100);
        // Conta c2 = c1; // linha importante!
        // c2.depositar(200);
        // System.out.println(c1.saldo);
        // System.out.println(c2.saldo);
    }
}
