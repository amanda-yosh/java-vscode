package Slides.exCalculadora;

public class Calculadora {

    private static double memoria=0;

    public static void somar(double num) {
        memoria += num;
    }

    public static void subtrair(double num) {
        memoria -= num;
    }

    public static void multiplicar(double num) {
        memoria *= num;
    }

    public static void dividir(double num) {
        memoria /= num;
    }

    public static void clear(){
        memoria = 0;
    }
    
    public static double getMemoria(){
        return memoria;
    }
}
