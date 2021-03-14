package Pessoa;

public class Funcionario extends Pessoa{
    
    private String dataAdmissao;

    public void promover() {
        System.out.println("Promover funcionário");
    }
    
    public void aposentar() {
        System.out.println("Aposentar funcionário");
    }
}
