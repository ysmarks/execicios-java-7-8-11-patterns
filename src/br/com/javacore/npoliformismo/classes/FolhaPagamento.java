package br.com.javacore.npoliformismo.classes;

public class FolhaPagamento {

    public void relatorioPagamento(Funcionario funcionario) {
        System.out.println("--------------Relatorio pagamento vendedor--------------");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
    }
}
