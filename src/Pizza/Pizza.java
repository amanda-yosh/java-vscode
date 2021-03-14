package Pizza;

public class Pizza {
    

    private PizzaStatus status;

    public boolean podeSerEntregue() {
        if (this.getStatus() == PizzaStatus.PRONTA) {
            return true;
        }
        return false;
    }

    public PizzaStatus getStatus() {
        return this.status;
    }
}
