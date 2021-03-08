package Exercicios2.exercicio3.exVendas;

import Cliente.Cliente;

public class Caixa {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Amanda", "Rua dos Bobos");
        Produto acucar = new Produto("Açúcar", (float) 5.69);
        Produto macarrao = new Produto("Macarrão", 3);
        Produto feijao = new Produto("Feijão", (float) 5.49);

        Pedido meuPedido = new Pedido(cliente);
        meuPedido.addItem(acucar, 3);
        meuPedido.addItem(macarrao, 2);
        meuPedido.addItem(feijao, 6);

        System.out.println("Total do pedido: " + meuPedido.getTotal());
    }
}
