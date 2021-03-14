package MainPessoa;

import Pessoa.Cliente;
import Pessoa.Funcionario;
import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Amanda");
        cliente.atualizarContato("Avenida São Salvador", "22999882299", "exemplo@gmail.com");
        cliente.atualizaPontosFidelidade(80);
        cliente.imprimePessoa();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("George");
        funcionario.atualizarContato("Rua", "33445566", "dom@dom.com");
        funcionario.imprimePessoa();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.atualizarContato("Rua", "tel", "email");
        pessoa.imprimePessoa();
    }
}
