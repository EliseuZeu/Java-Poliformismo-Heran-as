
public class TesteReferencias {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Carlos");
        String nome = g1.getNome();

        System.out.println(nome);
    }
}