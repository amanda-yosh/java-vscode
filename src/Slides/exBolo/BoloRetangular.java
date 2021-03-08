package Slides.exBolo;

public class BoloRetangular {
    private float peso;
    private String sabor;
    private String cobertura;

    //construtor
    BoloRetangular(float peso, String sabor, String cobertura) {
        this.peso = peso;
        this.setSabor(sabor);
        this.setCobertura(cobertura);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    public String getSabor() {
        return sabor;
    }

    // public void setSabor(String sabor) {
    //     this.sabor = sabor;
    // }

    public String getCobertura() {
        return cobertura;
    }

    // public void setCobertura(String cobertura) {
    //     this.cobertura = cobertura;
    // }

    void decorar() {
        System.out.println("Bolo decorado!");
    }

    float comer(float pesoComido) {
        peso = peso - pesoComido;
        return peso;
    }

}
