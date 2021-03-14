package Exercicios3.ex8;

//8. Dica: o cabeçalho da classe deve ser public class Par<F, S > (?)

public class Par {
    
    private char F;
    private char S;

    public Par(String valor) {
        this.F = valor.charAt(0);
        this.S = valor.charAt(1);
    }

    public char getF() {
        return F;
    }

    public char getS() {
        return S;
    }

    public void setS(char s) {
        this.S = s;
    }

    public void setF(char f) {
        this.F = f;
    }

    public void imprimir() {
        System.out.println(this.F + "|" + this.S);
    }
}
