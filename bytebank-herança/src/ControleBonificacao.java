
public class ControleBonificacao {

    private double soma;

    public void registra(funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}