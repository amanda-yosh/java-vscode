package Pessoa;

public class Cliente extends Pessoa {

    private Integer pontosFidelidade = 0;

    public void atualizaPontosFidelidade(Integer pontos) {
        this.pontosFidelidade += pontos;
    }

    @Override //sobreescrever
    public void imprimePessoa() {
        super.imprimePessoa();
        System.out.println("Pontos de fidelidade: " + this.pontosFidelidade);
    }
}
