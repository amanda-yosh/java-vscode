package Exercicios2.exercicio1;

class Motor	{
    int	potencia;
    String	tipo;
}

public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private int qtdPortas;
    private int ano;
    private int kmRodados;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor = new Motor(); //quando chamarem uma referencia ao objeto Carro haverá uma nova referencia ao objeto motor.

    public Carro(String marca, String modelo, String cor, int qtdPortas, int ano, int kmRodados) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdPortas = qtdPortas;
        this.ano = ano;
        this.kmRodados = kmRodados; //como fazer uma funcao para km rodados?
    }

    String getCarro() {
        return ("Marca: " + this.marca + "\nModelo:" + this.modelo + "\nCor: " + this.cor + "\nQuantidade de portas: " + this.qtdPortas + "\nAno: " + this.ano + "\nKm rodados: " + this.kmRodados);
    }

    //liga o carro
    void liga() {
        System.out.println("O carro está ligado");
    }

    //acelera uma certa quantidade
    void acelerar(double quantidade) {
        double aux = this.velocidadeAtual + quantidade;
        if (aux <= this.velocidadeMaxima) {
            System.out.println("Velocidade atual: " + aux);	
        } else {
            System.out.println("Carro na velocidade máxima: " + velocidadeMaxima);
        }
    }

    //desacelera uma certa quantidade
    void desacelerar(double quantidade) {
        double aux = this.velocidadeAtual - quantidade;
        if (aux >= 0) {
            System.out.println("Velocidade atual: " + aux);	
        } else {
            System.out.println("Carro está parado");
        }
    }

    //devolve a marcha do carro
    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return	-1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }
}
