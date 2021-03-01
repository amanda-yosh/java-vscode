package Exercicios.ex6;

public class Baralho {
    
    private static final List<Carta> protoDeck = new ArrayList<Card>();

    // Initialize prototype deck
    static {
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                protoDeck.add(new Card(rank, suit));
    }

    public static ArrayList<Card> newDeck() {
        return new ArrayList<Card>(protoDeck); // Return copy of prototype deck
    }


    // String[] tamanho = new String[52];


    
    // switch (naipe) {
    //     case ("ouros"):
    //         this.naipe = "ouros";
    //         break;
    //     case ("paus"):
    //         this.naipe = "paus";
    //         break;
    //     case ("espadas"):
    //         this.naipe = "espadas";
    //         break;
    //     case ("copas"):
    //         this.naipe = "copas";
    //         break;
    // }

    // switch (valor) {
    //     case "ás":
    //         this.valor = "ás";
    //         break;
    //     case "valete":
    //         this.valor = "valete";
    //         break;
    //     case "dama":
    //         this.valor = "dama";
    //         break;
    //     case "rei":
    //         this.valor = "rei";
    //         break;
    //     case "2":
    //         this.valor = "2";
    //         break;
    //     case "3":
    //         this.valor = "3";
    //         break;
    //     case "4":
    //         this.valor = "4";
    //         break;
    //     case "5":
    //         this.valor = "5";
    //         break;
    //     case "6":
    //         this.valor = "6";
    //         break;
    //     case "7":
    //         this.valor = "7";
    //         break;
    //     case "8":
    //         this.valor = "8";
    //         break;
    //     case "9":
    //         this.valor = "9";
    //         break;
    // }
}
