package Slides.exCarro;

public class carro {
    public static Carrito teste(int val){
        val++;
        return new Carrito(val);
    }

    public static void main(String[] args) {
        Carrito fusca = new Carrito(10);
        Carrito ferrari = teste(10);
        
        System.out.println("Velocidade fusca:" + fusca.getVelocidade());
        System.out.println("Velocidade ferrari:" + ferrari.getVelocidade());
        
        // int valor = 10;

        // teste(valor, fusca);

        // System.out.println("Valor:" + valor);
    }
}
