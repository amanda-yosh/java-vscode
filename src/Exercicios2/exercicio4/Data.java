package Exercicios2.exercicio4;

public class Data {
    
    private int dia;
    private int diasAno;
    private int mes;
    private int ano;
    private String mesExtenso;

    // DD/MM/AAAA
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Agosto 08, 2017
    public Data(String mesExtenso, int dia, int ano) {
        this.mesExtenso = mesExtenso;
        this.dia = dia;
        this.ano = ano;
    }

    // DDD AAAA
    public Data(int diasAno, int ano) {
        this.diasAno = diasAno;
        this.ano = ano;
    }

    // private int dia;
    // private int diasAno;
    // private int mes;
    // private int ano;
    // private String mesExtenso;
    void getData() {
        if (this.mesExtenso == null & this.diasAno == 0) {
            System.out.println(dia + "/" + mes + "/" + ano);
        }
        if (mes == 0 & diasAno == 0) {
            System.out.println(mesExtenso + " " + dia + ", " + ano);
        }
        if (dia == 0 & mes == 0 & mesExtenso == null){
            System.out.println(diasAno + " " + ano);
        }
    }


}
