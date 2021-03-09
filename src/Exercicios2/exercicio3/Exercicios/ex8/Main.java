package Exercicios2.exercicio3.Exercicios.ex8;

public class Main {
    public static void main(String[] args) {
        Celular meuAndroid = new Celular();

        meuAndroid.nivelDeCarga();

        for (int i = 0; i < 10; i++) {
            meuAndroid.enviarMensagem();
        }

        meuAndroid.nivelDeCarga();

        meuAndroid.ligacaoInicio();
        //meuAndroid.façaAlgoQueDemore(2000000650);
        meuAndroid.ligacaoFim(300);
        meuAndroid.nivelDeCarga();
    }
}
