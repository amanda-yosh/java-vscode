package Exercicios2.exercicio3.Exercicios.ex6;

public class Jogo {
    public static void main(String args[]) {

        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);
        List<Carta> deck = Carta.novoBaralho();
        deck.baralhoEmbaralhado();

        for (int i = 0; i < numHands; i++)
            System.out.println(deal(deck, cardsPerHand));

    }

    public static ArrayList<Carta> deal(List<Carta> deck, int n) {
        int deckSize = deck.size();
        List<Carta> handView = deck.subList(deckSize-n, deckSize);
        ArrayList<Carta> hand = new ArrayList<Carta>(handView);
        handView.clear();
        return hand;
   }
}
