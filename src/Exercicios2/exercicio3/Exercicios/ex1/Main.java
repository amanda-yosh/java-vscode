package Exercicios2.exercicio3.Exercicios.ex1;

public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda("Meus contatos do Trabalho", "Amada Maria");

        minhaAgenda.addContato("João", "Rua das Borboletas", "2299999999");
        minhaAgenda.addContato("Joana", "Rua das Tapiocas", "2287654329");
        minhaAgenda.addContato("Tainá", "Avenida das Américas", "2299993344");

        minhaAgenda.getContato();

        minhaAgenda.removerContato(1);

        minhaAgenda.getContato();
    }
}
