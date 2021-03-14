package Exercicios3.ex5;

public class PessoaFisica extends Pessoa {

    private String dataDeAniversario;

    public PessoaFisica(String nome, String CPF, String endereco, String dataDeAniversario){
        super(nome, CPF, endereco);
        this.dataDeAniversario = dataDeAniversario;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNomeOuRazaoSocial());
        System.out.println("CPF ou CNPJ: " + getCPFouCNPJ());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data de aniversário: " + this.dataDeAniversario);
    }
}
