package br.com.javacore.zztdesignpattern.factorymethod;

 public class PessoaFactory {

    public Pessoa getPessoa(String nome, String sexo) {

        if(sexo.equals("M")) {
            return new Homem(nome);
        }
        if (sexo.equals("F")) {
            return new Mulher(nome);
        }
        return null;
    }
}
