package Exercicios2.exercicio3.Exercicios.ex7;

public class Main {
    public static void main(String[] args) {
        Produto cereal = new Produto("cereal", 18.90, 20);
        Produto leite = new Produto("leite", 3.49, 10);
        Produto cafe = new Produto("cafe", 10.0, 2);
        Produto pao = new Produto("pão de forma", 8.49, 3);

        Pedido meuPedido = new Pedido(1, "Amanda", Pagamento.CARTAO);

        meuPedido.addItem(cereal, 2);
        meuPedido.addItem(leite, 3);
        meuPedido.addItem(cafe, 2);
        meuPedido.addItem(pao, 1);

        meuPedido.getTotal();

        meuPedido.imprimirResumoPedido();
    }
}
