package Slides.exBolo;

public class Principal {
    public static void main(String[] args) {
        BoloRetangular boloDeCoco = new BoloRetangular(3, "coco", "morango");

        boloDeCoco.comer(1);
        imprimir(boloDeCoco);
        boloDeCoco.decorar();
        
        System.out.println("--------------------");
        BoloRetangular boloMorango = new BoloRetangular(3, "morango", "morango");
        imprimir(boloMorango);

        System.out.println("--------------------");
        boloMorango = boloDeCoco;
        imprimir(boloDeCoco);
        imprimir(boloMorango);

        // System.out.println("--------------------");
        // boloMorango = null;
        // imprimir(boloMorango);
        // // Uma variavel é nula quando ainda nao foi instanciada, ou seja, ainda nao “virou” um objeto. Ex: Objeto x; // x=Null x = new Objeto(); // x deixa de ser null e vira um objeto do tipo Objeto

        System.out.println("--------------------");
        boloDeCoco.setPeso(-2);
    }

    static void imprimir(BoloRetangular bolo) {
        System.out.println("Peso: " + bolo.getPeso() + "\nSabor: " + bolo.getSabor() + "\nCobertura: " + bolo.getCobertura());
    }
}
