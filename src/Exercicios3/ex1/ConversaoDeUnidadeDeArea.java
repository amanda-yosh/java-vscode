package Exercicios3.ex1;

public class ConversaoDeUnidadeDeArea {

    private Double area;

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    //1 metro quadrado = 10.76 pés quadrados
    public static Double metroPraPes(Double area) {
        Double conversao = 0.0;
        conversao = area * 10.76;
        area = conversao;
        return area;
    }

    //1 pé quadrado = 929 centímetros quadrados
    public static Double pesPraCentimetros(Double area) {
        Double conversao = 0.0;
        conversao = area * 926.0;
        area = conversao;
        return area;
    }

    //1 centímetros quadrados = 0.0000000000386 milha quadrada 
    public static Double centimetroPraMilha(Double area) {
        Double conversao = 0.0;
        conversao = area * 0.0000000000386;
        area = conversao;
        return area;
        }

    //1 milha quadrada = 640 acres
    public static Double milhaPraAcres(Double area) {
        Double conversao = 0.0;
        conversao = area * 640.0;
        area = conversao;
        return area;
    }

    //1 acre = 43.560 pés quadrados 
    public static Double acrePraPes(Double area) {
        Double conversao = 0.0;
        conversao = area * 43560.0;
        area = conversao;
        return area;
    }
}
