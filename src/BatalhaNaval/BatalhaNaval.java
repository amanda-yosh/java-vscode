package BatalhaNaval;

import java.util.ArrayList;
import java.util.Random;

public class BatalhaNaval {
    
    private char[] batalha = new char[10]; //vetor char ocupando as 10 posições
    //private int[] localizacao = new int[3]; //onde meu barco estará localizado
    private ArrayList<Integer> localizacao = new ArrayList<Integer>(); //aceitaria sem especificar o tipo <o tipo esta aqui dentro>
    private int numAcertos = 0; //barco afunda quando acerto as 3 posições

    //construtor
    public BatalhaNaval() {
        Random r = new Random();
        int posInicial = r.nextInt(8); //não quero que meu vetor inicialize nas duas ultimas casas
        // localizacao[0] = posInicial;
        // localizacao[1] = posInicial + 1;
        // localizacao[2] = posInicial + 2;
        localizacao.add(posInicial);
        localizacao.add(posInicial + 1);
        localizacao.add(posInicial + 2);
        System.out.println(posInicial); //imprimir a posicao só pra saber onde ele está
        this.inicializaBatalha(); //impressão do jogo
    }

    //batalha é um vetor char de tamanho 10
    public void inicializaBatalha() {
        for (int i = 1; i < this.batalha.length; i++) {
            this.batalha[i] = 'O';
        }
    }

    //não ficou muito claro
    public void verificaPalpite(Integer palpite) {
        //percorrendo o vetor localização
        // for (int local: this.localizacao) { //minha variavel local vai receber o conteúdo do meu vetor localizacao no índice
        //     if (palpite == local) {
        //         this.batalha[palpite] = 'X';
        //         numAcertos++;
        //         break;
        //     } else {
        //         this.batalha[palpite] = '~';
        //     }
        // }
        if (localizacao.contains(palpite)) {
            this.batalha[palpite] = 'X';
            numAcertos++;
            localizacao.remove(palpite);
        } else {
            this.batalha[palpite] = '~';
        }
    }

    public void imprimeBatalha() {
        for (char celula: this.batalha) {
            System.out.println(" | " + celula);
        }
        System.out.println(" |");
    }

    public boolean ehFimDeJogo() {
        return numAcertos == 3;
    }
}
