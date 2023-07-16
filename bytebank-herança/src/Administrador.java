public class Administrador extends funcionario implements Autenticavel {

    private AutenticacaoOpcional autenticador;

    public Administrador() {
        AutenticacaoOpcional autenticador = new AutenticacaoOpcional();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}