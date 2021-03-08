package Exercicios2.exercicio4;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data("Setembro", 18, 2016);
        Data data2 = new Data("Agosto", 21, 1997);
        Data data3 = new Data(18, 03, 2007);
        Data data4 = new Data(15, 01, 2000);
        Data data5 = new Data(365, 2000);
        Data data6 = new Data(365, 2006);

        data1.getData();
        System.out.println("-----------------");
        data2.getData();
        System.out.println("-----------------");
        data3.getData();
        System.out.println("-----------------");
        data4.getData();
        System.out.println("-----------------");
        data5.getData();
        System.out.println("-----------------");
        data6.getData();
    }
    
}
