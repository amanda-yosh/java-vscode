package Exercicios.ex7;

public class Item {

    private static int tamanhoLista;

    //vetor de produtos
    Produto listaItens[] = new Produto[tamanhoLista];
    Produto precoItens[] = new Produto[tamanhoLista];

    public void listarItens(Produto produto, String nome, double preco, int qtd) {
        for (int i = 1; i <= tamanhoLista; i++) {
            listaItens[i].setProduto(nome, preco, qtd);
        }
    }

    public void getlistaItens() {
        for (int i = 1; i <= tamanhoLista; i++) {
            System.out.println(listaItens[i].getProduto());
        }
    }
    
}
