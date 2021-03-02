package Apostila;

public class Conta {
    String nomeTitular;
    String agencia;
    Data dataAbertura; // String dataAbertura;
    int numero;
    private double saldo;

    // Cliente titular = new Cliente(); //quando chamarem uma nova conta, haverá um novo cliente para ela

    void sacar(double qtd) {
        if (qtd < this.saldo) {
            this.saldo -= qtd;
        } else {
            System.err.println("Saldo insuficiente");
        }
    }

    void depositar(double qtd) {
        this.saldo += qtd;
    }

    void calculaRendimento() {
        System.out.println("Rendimento: " + this.saldo * 0.1); // devolve saldo multiplicado por 0.1
    }

    void recuperaDadosParaImpressao() {
        System.out.println("Titula: " + this.nomeTitular + "\nAgencia: " + this.agencia + "\nData de abertura: "
                + this.dataAbertura + "\nNúmero conta: " + this.numero + "\nSaldo: " + this.saldo);
    }

    void recuperaDadosParaImpressaoData(Data data) {
        System.out.println("Data: " + data.dia + "/" + data.mes + "/" + data.ano);
        // String dados = "\nTitular:	" + this.nomeTitular;
        // dados += "\nDia:	" + this.dataAbertura.dia;
        // dados += "\nMês:	" + this.dataAbertura.mes;
        // dados += "\nAno:	" + this.dataAbertura.ano;
        // return dados;
    }

    // boolean sacaValidacao(double valor) {
    // if (this.saldo < valor) {
    // return false;
    // }
    // else {
    // this.saldo = this.saldo - valor;
    // return true;
    // }
    // }

    // void transferePara(Conta destino, double valor) {
    // this.saldo = this.saldo - valor;
    // destino.saldo = destino.saldo + valor;
    // }

    // boolean transfereValidacao(Conta destino, double valor) {
    // boolean retirou = this.saca(valor);
    // if (retirou == false) {
    // // não deu pra sacar!
    // return false;
    // } else {
    // destino.deposita(valor);
    // return true;
    // }
    // }
}
