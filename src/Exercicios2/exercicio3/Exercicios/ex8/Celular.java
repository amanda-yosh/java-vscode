package Exercicios2.exercicio3.Exercicios.ex8;

public class Celular {

    private long tempoInicial;
    private long tempo;
    private Bateria bateriaMeuCelular = new Bateria();

    void enviarMensagem() {
        if (bateriaMeuCelular.getNivelCarga() > 0) {
            bateriaMeuCelular.getNivelCarga() = bateriaMeuCelular.getNivelCarga() - 1;
        } else {
            System.out.println("Celular descarregado");
        }

    }

    void ligacaoInicio() {
        if (bateriaMeuCelular.getNivelCarga() > 0) {
            System.out.println("Ligacao iniciada");
            // tempoInicial = System.currentTimeMillis();
        } else {
            System.out.println("Celular descarregado");
        }
    }

    // void façaAlgoQueDemore(int ligacaoTempoSegundos) {
    // if (bateriaMeuCelular.getNivelCarga() < (ligacaoTempoSegundos/5)) {
    // System.out.println("Celular descarregou durante chamada");
    // } else {
    // bateriaMeuCelular.getNivelCarga() -= (ligacaoTempoSegundos/5);
    // }
    // }

    void ligacaoFim(int tempoDeLigacao) {
        // tempo = System.currentTimeMillis() - tempoInicial;
        bateriaMeuCelular.getNivelCarga() -= (tempoDeLigacao / 5);
        if (bateriaMeuCelular.getNivelCarga() < (tempoDeLigacao / 5)) {
            System.out.println("Celular descarregou durante chamada");
        } else {
            bateriaMeuCelular.getNivelCarga() -= (tempoDeLigacao / 5);
            System.out.println("Chamada finalizada");
        }
    }

    void nivelDeCarga() {
        System.out.println(bateriaMeuCelular.getNivelCarga() + "%");
    }
}
