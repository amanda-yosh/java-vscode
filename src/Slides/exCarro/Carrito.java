package Slides.exCarro;

public class Carrito {
    private int velocidade;
    private static int qtd = 0;
    
    public Carrito (int vel) {
        this.velocidade = vel;
        this.qtd++;
    }
    public void acelera() {
        this.velocidade++;
    }
    public void freia() {
        this.velocidade--;
    }   
    
    public int getVelocidade(){
        return this.velocidade; 
    }

    public int getQuantidade(){
        return this.qtd;
    }

    public static void buzina(){
        System.out.println("honk honk");
    }
}
