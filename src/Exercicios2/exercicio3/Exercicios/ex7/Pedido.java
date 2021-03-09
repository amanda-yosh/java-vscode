package Exercicios2.exercicio3.Exercicios.ex7;

public class Pedido {

    private int identificacaoPedido;
    private String clienteNome;
    private Item[] itens = new Item[100];
    private Pagamento pagamento;
    private int qtdDeItens = 0;

    public Pedido(int identificacaoPedido, String clienteNome, Pagamento pagamento) {
        this.identificacaoPedido = identificacaoPedido;
        this.clienteNome = clienteNome;
        this.pagamento = pagamento;
    }

    public float getTotal() {
        float total = 0;
        for (int i=0; i<qtdDeItens; i++) {
            total += itens[i].getSubTotal();
        }
        return total;
    }

    public void addItem(Produto produto, int quantidade) {
        Item item = new Item(); //criando instancia da classe item
        item.produto = produto;
        item.quantidade = quantidade;
        itens[qtdDeItens] = item;
        qtdDeItens++;
    }

    public void imprimirResumoPedido() {
        System.out.println("Número do pedido: " + this.identificacaoPedido);
        System.out.println("Comprador: " + this.clienteNome);
        System.out.println("Forma de pagamento: " + this.pagamento);
        // for (int i = 1; i <= qtdDeItens; i++) {
        //    System.out.println(itens[i].getProduto());
        // }
    }
}
