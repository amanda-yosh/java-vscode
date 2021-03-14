6. Dê um exemplo de instância para cada classe identificada.  

# Classe Ataque {
    private int precisão;
    private int potência;
    private int qtdUso; //quantidade de vezes que o ataque foi utilizado, pois existe limite
}

# Classe Pokemon extends Ataque{
    private String dono;
    private String imagem;
    private String dataDeCaptura;
    private int experiencia;

    //Stats
    private static hP;
    private static attack;
    private static defense;
    private static specialAttack;
    private static specialDefense;
    private static speed;

    public void atacar() {
        //o ataque deve ser aprendido
        ataque para ferir o adversario() {
            stats--;
        }
        ataque que dependendo do tipo() {
            fortalece {stats++;}
            enfraquece {stats--;}
        }
        ataque que impõe condições negativas() {
            //dependerá do tipo de pokemon
            adormecer, envenenar, congelar, queimar, paralisar, confundir;
        }
    }
    public void habilidade() {
        anularDano() {}
        modificarStatsDoAdversario() {}
        imporCondicaoAoAdversario() {}
    }

    public static void evoluir() {
        if (experiencia >= valor) {
            private static final hP++;
            private static final attack++;
            private static final defense++;
            private static final specialAttack++;
            private static final specialDefense++;
            private static final speed++;
        }
    }
}

# Classe PokemonFogo extends Pokemon {
    //Stats com valores fixos
    private static final hP;
    private static final attack;
    private static final defense;
    private static final specialAttack;
    private static final specialDefense;
    private static final speed;

    public static void evoluir() {
        this.imagem = imagem;
        this.tamanho = tamanho;
        this.peso = peso;
        this.nome = nome;
    }
}

# Classe PokemonEletrico extends Pokemon {
    //Stats com valores fixos
    private static final hP;
    private static final attack;
    private static final defense;
    private static final specialAttack;
    private static final specialDefense;
    private static final speed;

    public static void evoluir() {
                this.imagem = imagem;
        this.tamanho = tamanho;
        this.peso = peso;
        this.nome = nome;
    }
}

# Classe PokemonAgua extends Pokemon {
    //Stats com valores fixos
    private static final hP;
    private static final attack;
    private static final defense;
    private static final specialAttack;
    private static final specialDefense;
    private static final speed;

    public static void evoluir() {
        this.imagem = imagem;
        this.tamanho = tamanho;
        this.peso = peso;
        this.nome = nome;
    }
}