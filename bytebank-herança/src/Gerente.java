//Gerente é um Funcionario, Gerente herda da classe Funcionario

public class Gerente extends FuncionarioAutenticavel {

    public double getBonificacao() {
        return super.getBonificacao() + super.salario;
    }
}
