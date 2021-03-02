package Exercicios.ex7;

public class Supermercado {
    public static void main(String[] args) {
        Produto cereal = new Produto();
        Produto leite = new Produto();
        Produto cafe = new Produto();
        Produto pao = new Produto();

        // cereal.setProduto("cereal", 18.90, 20);
        // leite.setProduto("leite", 3.49, 10);
        // cafe.setProduto("cafe", 10, 2);
        // pao.setProduto("pão de forma", 8.49, 3);

        Item meusItens = new Item();

        meusItens.listarItens(cereal, "cereal", 8.99, 2);
        meusItens.getlistaItens(produto);

    }
}
