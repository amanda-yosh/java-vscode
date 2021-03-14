package Exercicios3.ex5;

public class PessoaJuridica extends Pessoa {

    private Double faturamento;

    public PessoaJuridica(String nome, String CNPJ, String endereco, Double faturamento) {
        super(nome, CNPJ, endereco);
        this.faturamento = faturamento;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNomeOuRazaoSocial());
        System.out.println("CPF ou CNPJ: " + getCPFouCNPJ());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Faturamento: " + this.faturamento);
    }
}
