package MainAnimais;

import java.util.ArrayList;

import Animais.Animais;
import Animais.Cachorro;
import Animais.Galinha;
import Animais.Gato;
import Animais.Leao;
import Animais.Passaro;
import Animais.Pato;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animais> animais = new ArrayList<Animais>();
        animais.add(new Cachorro("cao.png", null, 0, 0, 0));
        animais.add(new Gato("gato.png", null, 0, 0, 0));
        animais.add(new Galinha("galinha.png", null, 0, 0, 0));
        animais.add(new Pato("pato.png", null, 0, 0, 0));
        animais.add(new Leao("leoa.png", null, 0, 0, 0));
        animais.add(new Passaro("passaro.png", null, 0, 0, 0));

        for (Animais animal: animais) {
            animal.fazerRuido(); //polimorfismo dinamico (em tempo de execução)
            animal.comer("milho");
        }

        //polimorfismo estático (em tempo de execução)
    //     Animais a = new Animais();
    //     a.comer();
    //     a.comer("carne");
    //     a.comer("milho", 3);
    }
}
