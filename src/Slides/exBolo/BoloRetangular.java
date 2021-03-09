package Slides.exBolo;

public class BoloRetangular {
    private float peso;
    private String sabor;
    private String cobertura;
    private static int numBolos; //para contar o número de instancias criadas
    private static final int TEMPO_FORNO = 40; // static final significa que estou declarando uma constante

    // construtor
    public BoloRetangular(float peso, String sabor, String cobertura) {
        this.peso = peso;
        this.sabor = sabor;
        this.cobertura = cobertura;
        numBolos++;
        //BoloRetangular.tempo = tempoAssar;
    }

    public BoloRetangular() {
        numBolos++;
    }

    public float getPeso() {
        return peso;
    }

    public String getSabor() {
        return this.sabor;
    }

    public String getCobertura() {
        return this.cobertura;
    }

    public static int getNumBolos() {
        return numBolos;
    }

    void decorar() {
        System.out.println("Bolo decorado!");
    }

    float comer(float pesoComido) {
        peso = peso - pesoComido;
        return peso;
    }

    // uso do método static (que pertence a classe como um todo)
    public void assar(int tempoAssar) {
        if (Math.abs(tempoAssar * Math.PI) < TEMPO_FORNO) {
            System.out.println("Bolo ainda está cru!");
        }
        if (tempoAssar == TEMPO_FORNO) {
            System.out.println("Bolo está no ponto!");
        }
        if (tempoAssar == (TEMPO_FORNO + 10)) {
            System.out.println("Bolo está queimando");
        } else {
            System.out.println("Bolo queimado!");
        }
    }
}
