public class Gerente extends funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        setSalario(300.00);
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {

        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

}