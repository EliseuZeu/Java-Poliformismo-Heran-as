
public class Sistemainterno {
    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel g) {
        boolean autenticou = g.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entra no sistema");
        } else {
            System.out.println("Nao pode entra no sistema");
        }
    }
}