package Apostila;

public class TestDuasContas {
    public	static	void	main(String[]	args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.saldo = 1000;

        Conta meuSonho;
        meuSonho = new Conta();
        meuSonho.saldo = 1500000;

        minhaConta.deposita(100);
        meuSonho.saca(50000);

        System.out.println(minhaConta.saldo + meuSonho.saldo);
    }
}
