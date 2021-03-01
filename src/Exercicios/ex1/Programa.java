package Exercicios.ex1;

public class Programa {
    public static void main(String[] args) {

        Agenda minhaAgenda = new Agenda();
        minhaAgenda.tamanhoAgenda(2);

        minhaAgenda.adicionarContato(pessoa);

        // Contato pessoa1 = new Contato();
        // pessoa1.setContato("Amanda", "Rio de Janeiro", "22 99932-4232");
        // pessoa1.getContato();

        // Contato pessoa2 = new Contato();
        // pessoa1.setContato("João", "Rio das Ostras", "22 42342-4232");
        // pessoa1.getContato();

        // Contato pessoa3 = new Contato();
        // pessoa1.setContato("Erika", "Rio de Janeiro", "22 54312-4232");
        // pessoa1.getContato();

        minhaAgenda.listagem();

        minhaAgenda.removerContato(pessoa2);

    }
}
