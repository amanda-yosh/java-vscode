package Exercicios.ex7;

public class Pedido {

    private int pedido;
    private String clienteNome;
    private int itens; //lista de produtos
    private String pagamento;

    void setPedido(String clienteNome) {
        this.pedido = pedido++;
        this.clienteNome = clienteNome;
    }
    
    // private final Pagamento pagamento;
    // public enum Pagamento {
    //     DINHEIRO, CARTAO, CHEQUE
    // }

    public void pagamentoTipo(String tipo) {
        switch (tipo) {
            case "dinheiro":
                this.pagamento = tipo;
                break;
            case "cheque":
                this.pagamento = tipo;
                break;
            case "cartão":
                this.pagamento = tipo;
                break;
        }
    }

    void imprimirResumoPedido() {
        System.out.println(this.pedido + this.clienteNome +);
    }
}
