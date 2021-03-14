package Exercicios3.ex5;

public class Pessoa {

    private String nomeOuRazaoSocial;
    private String CPFouCNPJ;
    private String endereco;
    
    public Pessoa(String nome, String CPFouCNPJ, String endereco) {
        this.nomeOuRazaoSocial = nome;
        this.CPFouCNPJ = CPFouCNPJ;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCPFouCNPJ() {
        return CPFouCNPJ;
    }

    public String getNomeOuRazaoSocial() {
        return nomeOuRazaoSocial;
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nomeOuRazaoSocial);
        System.out.println("CPF ou CNPJ: " + this.CPFouCNPJ);
        System.out.println("Endereço: " + this.endereco);
    }
}
