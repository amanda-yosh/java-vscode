package Exercicios3.ex7;

public enum DiaDaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;

    public static Boolean ehDiaUtil(DiaDaSemana dia) {
        if (dia == DiaDaSemana.DOMINGO || dia == DiaDaSemana.SABADO) {
            return false;
        }
        else {
            return true;
        }
    }
}
