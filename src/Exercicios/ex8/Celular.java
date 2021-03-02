package Exercicios.ex8;

public class Celular {
    Bateria bateriaMeuCelular = new Bateria();

    long tempoInicial;
    long tempo;

    void enviarMensagem() {
        if (bateriaMeuCelular.nivelCarga > 0) {
            bateriaMeuCelular.nivelCarga--;
        } else {
            System.out.println("Celular descarregado");
        }

    }

    void ligacaoInicio() {
        if (bateriaMeuCelular.nivelCarga > 0) {
            System.out.println("Ligacao iniciada");
            // tempoInicial = System.currentTimeMillis();
        } else {
            System.out.println("Celular descarregado");
        }
    }

    // void façaAlgoQueDemore(int ligacaoTempoSegundos) {
    // if (bateriaMeuCelular.nivelCarga < (ligacaoTempoSegundos/5)) {
    // System.out.println("Celular descarregou durante chamada");
    // } else {
    // bateriaMeuCelular.nivelCarga -= (ligacaoTempoSegundos/5);
    // }
    // }

    void ligacaoFim(int tempoDeLigacao) {
        // tempo = System.currentTimeMillis() - tempoInicial;
        bateriaMeuCelular.nivelCarga -= (tempoDeLigacao / 5);
        if (bateriaMeuCelular.nivelCarga < (tempoDeLigacao / 5)) {
            System.out.println("Celular descarregou durante chamada");
        } else {
            bateriaMeuCelular.nivelCarga -= (tempoDeLigacao / 5);
            System.out.println("Chamada finalizada");
        }
    }

    void nivelDeCarga() {
        System.out.println(bateriaMeuCelular.nivelCarga + "%");
    }
}
